package com.example.alo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.profile.view.*
import kotlinx.android.synthetic.main.profile3.view.*


class Profile2 : DialogFragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?




        ): View? {

        var rootView: View = inflater.inflate(R.layout.profile3, container, false)
        val name_edit = rootView.name_edit
        val textView = rootView.name_view
        rootView.btn_back.setOnClickListener {
            dismiss()
        }
        rootView.btn_ok.setOnClickListener {
            dismiss()

        }
        return rootView
    }






}
