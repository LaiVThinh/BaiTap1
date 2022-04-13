package com.example.alo


import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.profile.*


class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val name_view = findViewById<Button>(R.id.name_view)
//        val email_view = findViewById<Button>(R.id.email_view)
//        val phone_view = findViewById<Button>(R.id.phone_view)


        val btn_edit_profile = findViewById<Button>(R.id.button_edit_frofile).setOnClickListener {
            val Edit_profile = LayoutInflater.from(this).inflate(R.layout.profile3, null)
            val mBuilder = AlertDialog.Builder(this).setView(Edit_profile)
            val editProfileDialog = mBuilder.show()

            val name_edit=Edit_profile.findViewById<EditText>(R.id.name_edit)
            name_edit.setText(name_view.text)

            val email_edit=Edit_profile.findViewById<EditText>(R.id.email_edit)
            email_edit.setText(email_view.text)

            val phone_edit=Edit_profile.findViewById<EditText>(R.id.phone_edit)
            phone_edit.setText((phone_edit.text))


            Edit_profile.findViewById<Button>(R.id.btn_ok).setOnClickListener {
                if (name_edit.text.toString() != "" && phone_edit.text.toString() != "" && email_edit.text.toString() != "")
                {
                    name_view.text =name_edit.text.toString().trim()
                    email_view.text =email_edit.text.toString().trim()
                    phone_view.text =phone_edit.text.toString().trim()
                    editProfileDialog.dismiss()
                }
                else
                {
                    Toast.makeText(this, "All field must not be empty", Toast.LENGTH_SHORT).show()
                }




            }


            Edit_profile.findViewById<Button>(R.id.btn_back).setOnClickListener {
                editProfileDialog.dismiss()
            }


        }
    }



}