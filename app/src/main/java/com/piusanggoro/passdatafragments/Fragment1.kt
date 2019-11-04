package com.piusanggoro.passdatafragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_1.view.*

class Fragment1: Fragment() {
    lateinit var comm: PassData

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_1, container, false)
        comm = activity as PassData

        rootView.btn_enter.setOnClickListener {
            comm.passDataCom(rootView.edittext_input.text.toString())
        }

        return rootView
    }
}