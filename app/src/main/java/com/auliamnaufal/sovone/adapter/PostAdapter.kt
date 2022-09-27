package com.auliamnaufal.sovone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.auliamnaufal.sovone.data.Post
import com.auliamnaufal.sovone.databinding.RowItemPostBinding
import com.bumptech.glide.Glide


class PostAdapter(private val listPost: ArrayList<Post>): RecyclerView.Adapter<PostAdapter.MyViewHolder>() {
	var likedState: Boolean = false


	inner class MyViewHolder(val binding: RowItemPostBinding): RecyclerView.ViewHolder(binding.root)

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
		RowItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
	)

	override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
		holder.binding.apply {
			with(listPost[position]){
				tvProfileName.text = name
				tvProfileLocation.text = location
				tvCaptionHeading.text = name
				tvCaptionContent.text = caption
				txtUserLike.text = likedUser
				txtLikedOthers.text = likedOther


				Glide.with(imgProfile.context).load(profileImage).into(imgProfile)
				Glide.with(ivPostImage.context).load(postImage).into(ivPostImage)
			}
		}
	}

	override fun getItemCount(): Int = listPost.size
}