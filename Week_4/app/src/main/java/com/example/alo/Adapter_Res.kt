package com.example.alo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter_Res  : ListAdapter<Info_Res, Adapter_Res.ResViewHolder>(ResDiffUlti()){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResViewHolder {

        return ResViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ResViewHolder, position: Int) {
        val Res = getItem(position)
        holder.binData(Res)
    }

    class ResDiffUlti : DiffUtil.ItemCallback<Info_Res>(){
        override fun areItemsTheSame(oldItem: Info_Res, newItem: Info_Res): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Info_Res, newItem: Info_Res): Boolean {
            return oldItem==newItem
        }

    }





    class ResViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        companion object{
            fun from(parent: ViewGroup): ResViewHolder{
                var layoutInflater= LayoutInflater.from(parent.context)
                var view= layoutInflater.inflate(R.layout.item_view_res,parent,false)
                return ResViewHolder(view)
            }
        }
        fun binData(res: Info_Res ){
            val tvTitle= itemView.findViewById<TextView>(R.id.tv_title)
            val tvDescription= itemView.findViewById<TextView>(R.id.tv_description)
            val tvAvatar= itemView.findViewById<ImageView>(R.id.tv_avatar)
            tvTitle.text= res.name
            tvDescription.text=res.address



            Glide.with(itemView.context)
                .load(res.link)
                .into(tvAvatar)



        }

    }



}