package com.example.alo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.alo.databinding.SignUpBinding

class Sign_up : AppCompatActivity() {
    private lateinit var binding_SignUp: SignUpBinding
    private lateinit var viewModel: Viewmodel_Signup


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding_SignUp = DataBindingUtil.setContentView(this,R.layout.sign_up)
        viewModel = ViewModelProvider(this).get(Viewmodel_Signup::class.java)


//        val button_back_signup = findViewById<Button>(R.id.button_back_signup)
        val button_back_signup = binding_SignUp.buttonBackSignup
//        val button_login_signup= findViewById<Button>(R.id.button_login_signup)
        val button_login_signup = binding_SignUp.buttonLoginSignup
        val button_signup =  binding_SignUp.btnSignup

        button_back_signup.setOnClickListener {
            val intent = Intent(this@Sign_up, Welcome::class.java)
            startActivity(intent)
        }
        button_login_signup.setOnClickListener {
            val intent = Intent(this@Sign_up, Login::class.java)


            startActivity(intent)
        }
        button_signup.setOnClickListener {
            val name_signup =binding_SignUp.nameSignup.text.toString().trim()
            val email_signup = binding_SignUp.emailSignup.text.toString().trim()
            val password_signup = binding_SignUp.passwordSignup.text.toString().trim()
            viewModel.checkAccountValid(name_signup, email_signup, password_signup)
//            val intent = Intent (this@Sign_up, Login::class.java)
//            val customer = Customer(name_su ="" , email_su ="" , password_su = "", phone_su =0 )
//
//            val bundle = Bundle()
//            bundle.putParcelable(Constants.KEY_USER, Customer)
//            startActivity(intent)
        }
        handleSignUpError()
        handleSignUpSuccess()

    }
    private fun handleSignUpSuccess() {
        viewModel.successSignup.observe(this) {


            when {
                it -> {
                    Toast.makeText(this, "Succesfully", Toast.LENGTH_SHORT).show()

                    Datastore.regisAccount(binding_SignUp.nameSignup.text.toString().trim(), binding_SignUp.emailSignup.text.toString().trim(), binding_SignUp.passwordSignup.text.toString().trim(),binding_SignUp.passwordSignup.text.toString().trim())
                    val intent = Intent(this, Login::class.java)

                    startActivity(intent)
                }
            }
        }
    }

    private fun handleSignUpError() {
        viewModel.errorSignUp.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }




}


