package com.example.alo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alo.databinding.ResListBinding

class ResList : AppCompatActivity() {
    private lateinit var binding_ResList: ResListBinding
    private lateinit var viewModel:Viewmodel_ResList
    private lateinit var adapter: Adapter_Res
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding_ResList = DataBindingUtil.setContentView(this, R.layout.res_list)
        viewModel = ViewModelProvider(this).get(Viewmodel_ResList::class.java)




        adapter = Adapter_Res()


        binding_ResList.buttonLinear.setOnClickListener {

            val layoutManager = LinearLayoutManager(this)
            binding_ResList.rvRes.layoutManager = layoutManager
            binding_ResList.rvRes.adapter = adapter
            registerDataSetListener()
        }
        val layoutManager = GridLayoutManager(this,2)
        binding_ResList.rvRes.layoutManager = layoutManager
        binding_ResList.rvRes.adapter = adapter
        registerDataSetListener()
        binding_ResList.buttonGrid.setOnClickListener {

            val layoutManager = GridLayoutManager(this,2)
            binding_ResList.rvRes.layoutManager = layoutManager
            binding_ResList.rvRes.adapter = adapter
            registerDataSetListener()


        }




    }

    override fun onStart() {
        super.onStart()
        viewModel.getData()
    }

    private fun registerDataSetListener(){
        viewModel.listOfRes.observe(this){dataSet->
            adapter.submitList(dataSet)

        }
    }
}