package com.example.recycleviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.singleitem.view.*

class AdapterClass(private val arraylist:ArrayList<Data>) : RecyclerView.Adapter<AdapterClass.itemViewHolder>(){

    inner class itemViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val layoutinflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view:View = layoutinflater.inflate(R.layout.singleitem,null)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        holder.itemView.apply {
            textview.text = arraylist[position].name
            imageview.setImageResource(arraylist[position].image)
        }
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }
}