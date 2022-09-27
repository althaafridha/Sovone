package com.auliamnaufal.sovone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.auliamnaufal.sovone.data.Status
import com.auliamnaufal.sovone.databinding.RowItemStatusBinding
import com.bumptech.glide.Glide

class StatusAdapter(private val listStatus: ArrayList<Status>) :
	RecyclerView.Adapter<StatusAdapter.MyViewHolder>() {
	inner class MyViewHolder(val binding: RowItemStatusBinding) :
		RecyclerView.ViewHolder(binding.root)

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
		RowItemStatusBinding.inflate(LayoutInflater.from(parent.context), parent, false)
	)

	override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
		holder.binding.apply {
			with(listStatus[position]) {
				txtName.text = name
				Glide.with(imgStatus.context).load(img).into(imgStatus)
			}
		}
	}

	override fun getItemCount() = listStatus.size
}