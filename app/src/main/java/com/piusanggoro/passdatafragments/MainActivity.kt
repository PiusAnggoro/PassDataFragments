package com.piusanggoro.passdatafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), PassData {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = Fragment1()
        supportFragmentManager.beginTransaction().replace(R.id.id_activity, fragment1).commit()
    }

    override fun passDataCom(editext_input: String) {
        val bundle = Bundle()
        bundle.putString("input_txt",editext_input)

        val fragment2 = Fragment2()
        fragment2.arguments = bundle

        val transaction = this.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.id_activity, fragment2)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }
}
