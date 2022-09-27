package com.auliamnaufal.sovone.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.auliamnaufal.sovone.R
import com.auliamnaufal.sovone.adapter.PostAdapter
import com.auliamnaufal.sovone.adapter.StatusAdapter
import com.auliamnaufal.sovone.data.PostData
import com.auliamnaufal.sovone.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
	private var _binding: FragmentHomeBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		// Inflate the layout for this fragment
		_binding = FragmentHomeBinding.inflate(inflater, container, false)

		binding.rvHome.apply {
			setHasFixedSize(true)

			layoutManager = LinearLayoutManager(activity)
			adapter = PostAdapter(PostData.listPost)

		}
		binding.rvStatus.apply {
			setHasFixedSize(true)

			val lManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
			layoutManager = lManager
			adapter = StatusAdapter(PostData.listStatus)
		}
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val btnUpload: ImageButton = view.findViewById(R.id.btn_upload)
		val btnMessage: ImageButton = view.findViewById(R.id.btn_message)

		btnUpload.setOnClickListener {
			Toast.makeText(activity,"Upload Is Not Available",Toast.LENGTH_SHORT).show()
		}

		btnMessage.setOnClickListener {
			Toast.makeText(activity,"Message Is Not Available",Toast.LENGTH_SHORT).show()
		}
	}
}