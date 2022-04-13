package com.example.alo

class validata {
    companion object{
        fun isEmailValid(email:String):Boolean{
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }
        fun isPassWordInvalid(password: String):Boolean{
            return password.length >=8 && password.length<=12
        }


    }
}