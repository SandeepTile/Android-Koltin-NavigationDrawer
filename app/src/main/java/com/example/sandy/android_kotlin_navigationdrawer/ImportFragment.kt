package com.example.sandy.android_kotlin_navigationdrawer

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ImportFragment :Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v=inflater.inflate(R.layout.import_frag,container,false)

        return v
    }
}