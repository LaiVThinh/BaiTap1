package com.example.alo


import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.alo.databinding.ProfileBinding


class Profile : AppCompatActivity() {


    private lateinit var binding_Profile: ProfileBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding_Profile = DataBindingUtil.setContentView(this, R.layout.profile)

        fun DisplayImfomation() {
            binding_Profile.nameView.text = Datastore.Data_Cus().name
            binding_Profile.emailView.text = Datastore.Data_Cus().email

        }
        DisplayImfomation()


//        val name_view = binding_Profile.nameView
//        val email_view = binding_Profile.emailView
//        val phone_view = binding_Profile.phoneView


//        val btn_edit_profile = findViewById<Button>(R.id.button_edit_frofile).setOnClickListener {
        binding_Profile.buttonEditFrofile.setOnClickListener {

            val Edit_profile = LayoutInflater.from(this).inflate(R.layout.profile3, null)
            val mBuilder = AlertDialog.Builder(this).setView(Edit_profile)
            val editProfileDialog = mBuilder.show()

            val name_edit = Edit_profile.findViewById<EditText>(R.id.name_edit)
            name_edit.setText(binding_Profile.nameView.text)
            val email_edit = Edit_profile.findViewById<EditText>(R.id.email_edit)
            email_edit.setText(binding_Profile.emailView.text)
            val phone_edit = Edit_profile.findViewById<EditText>(R.id.phone_edit)
            phone_edit.setText(binding_Profile.phoneView.text)

            Edit_profile.findViewById<Button>(R.id.btn_back).setOnClickListener {
                editProfileDialog.dismiss()
            }

            Edit_profile.findViewById<Button>(R.id.btn_ok).setOnClickListener {
                if (name_edit.text.toString() != "" && phone_edit.text.toString() != "" && email_edit.text.toString() != "") {


                    Datastore.regisAccount(name_edit.text.toString().trim(), email_edit.text.toString().trim(), email_edit.text.toString().trim(),phone_edit.text.toString().trim())
                    DisplayImfomation()
                    editProfileDialog.dismiss()

                } else {
                    Toast.makeText(this, "All field must not be empty", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


}