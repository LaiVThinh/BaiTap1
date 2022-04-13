package com.example.alo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel_Login : ViewModel() {


    private var _errorSignIn: MutableLiveData<String> = MutableLiveData()
    val errorSignIn: LiveData<String>
        get() = _errorSignIn

    private var _successSignIn: MutableLiveData<Boolean> = MutableLiveData()
    val successSignIn: LiveData<Boolean>
        get() = _successSignIn



    fun isLogInSuccess(email: String, password: String) {
        _successSignIn.postValue(false)
        _errorSignIn.postValue(null)

        if (email != Datastore.Data().email) {
            _errorSignIn.postValue("Wrong email")
            return
        }

        if (password != Datastore.Data().password) {
            _errorSignIn.postValue("Wrong password")
            return
        }

        return _successSignIn.postValue(true)
    }
}
class Viewmodel_Signup: ViewModel() {
    //    fun checkEmailandPassWord(email:String,password:String): Boolean {
//        val isEmailValid = validata.isEmailValid(email)
//        val isPassWordValid = validata.isPassWordInvalid(password)
//        return isEmailValid && isPassWordValid
    private var _errorSignUp: MutableLiveData<String> = MutableLiveData()
    val errorSignUp : LiveData<String>
        get() = _errorSignUp

    private var _successSignUp: MutableLiveData<Boolean> = MutableLiveData()
    val successSignup : LiveData<Boolean>
        get() = _successSignUp

    fun checkAccountValid(name: String,email: String, password: String)
    {
        val isEmailvalid=validata.isEmailValid(email)
        val isPassValid=validata.isPassWordInvalid(password)
        _successSignUp.postValue(false)


        if (!isEmailvalid)
        {
            _errorSignUp.postValue("Wrong Email")
            return
        }
        if (!isPassValid)
        {
            _errorSignUp.postValue("Wrong password")
            return
        }

        return _successSignUp.postValue(true)

    }



}