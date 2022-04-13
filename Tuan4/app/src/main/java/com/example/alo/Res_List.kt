//package com.example.alo
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.databinding.DataBindingUtil
//import androidx.lifecycle.ViewModelProvider
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.alo.databinding.ResListBinding
//
//class ResList : AppCompatActivity() {
//    private lateinit var binding_ResList: ResListBinding
//    private lateinit var viewModel:Viewmodel_ResList
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding_ResList = DataBindingUtil.setContentView(this, R.layout.res_list)
//        viewModel = ViewModelProvider(this).get(Viewmodel_ResList::class.java)
//
//        val dataSet = Datastore.getDataRes()
//        val adapter = Adapter_Res(dataSet)
//        val layoutManager = LinearLayoutManager(this)
//        binding_ResList.rvRes.layoutManager = layoutManager
//        binding_ResList.rvRes.adapter = adapter
//
//
//
//
//    }
//}