package com.auliamnaufal.sovone.data

data class Post(
	val name: String?,
	val profileImage: Int,
	val postImage: Int,
	val caption: String?,
	val location: String?,
	val likedUser: String?,
	val likedOther: String?
)