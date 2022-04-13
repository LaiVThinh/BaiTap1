package com.example.alo

class validata {
    companion object {
        fun isEmailValid(email: String): Boolean {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }


        fun isPassWordValid(password: String): Boolean {
            if (password.length < 8 || !password.matches(".*[A-Z].*".toRegex())||!password.matches(".*[a-z].*".toRegex())||!password.matches(".*[!@#\$%^&*()].*".toRegex()))
                return false
            return true;

        }
    }
}
