package com.example.alo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.alo.databinding.LoginBinding

class Login : AppCompatActivity() {

//    private lateinit var binding_Login: LoginBinding
    private lateinit var binding_Login: LoginBinding
    private lateinit var viewModel: ViewModel_Login
    private lateinit var viewModel_2: Viewmodel_Signup

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding_Login = DataBindingUtil.setContentView(this, R.layout.login)
        viewModel = ViewModelProvider(this).get(ViewModel_Login::class.java)
        viewModel_2 = ViewModelProvider(this).get(Viewmodel_Signup::class.java)




        binding_Login.buttonLogin.setOnClickListener {
            val loginMail = binding_Login.emailLogin.text.toString().trim()
            val loginPassword = binding_Login.passwordLogin.text.toString().trim()

            viewModel.isLogInSuccess(loginMail, loginPassword)

        }
        binding_Login.buttonBack.setOnClickListener {
            val intent = Intent(this@Login, Welcome::class.java)


            startActivity(intent)
        }
        binding_Login.buttonSignupLogin.setOnClickListener {
            val intent = Intent(this@Login, Sign_up::class.java)
            startActivity(intent)
        }

        handleSignInSuccess()
        handleSignInError()


    }

    private fun handleSignInSuccess() {
        viewModel.successSignIn.observe(this) {
            when {
                it -> {
                    Toast.makeText(this, "Successfully", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, ResList::class.java)
                    startActivity(intent)
                }

            }
        }
    }

    private fun handleSignInError() {
        viewModel.errorSignIn.observe(this) {
            if (it != null) {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

















