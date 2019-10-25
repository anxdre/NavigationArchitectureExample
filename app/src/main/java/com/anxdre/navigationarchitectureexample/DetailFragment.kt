package com.anxdre.navigationarchitectureexample


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_detail.*

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val nama = requireArguments().getString("nama")
        val alamat = requireArguments().getString("alamat")
        val kota = requireArguments().getString("kota")

        tv_nama_detail.text = nama
        tv_alamat_detail.text = alamat
        tv_kota_detail.text = kota

        activity?.bottom_nav_main?.visibility = View.INVISIBLE
    }
}
