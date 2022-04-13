package com.example.alo

object Datastore{
    lateinit var Data:Info

    fun regisAccount(name: String,
                     email: String,
                     password: String,
                     phone: String) {
        Data = Info(name, email, password, phone )
    }
    fun Data(): Info {
        return Data
    }

}