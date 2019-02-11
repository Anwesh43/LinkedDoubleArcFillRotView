package com.anwesh.uiprojects.linkeddoublearcfillrotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.doublearcfillrotview.DoubleArcFillRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DoubleArcFillRotView.create(this)
    }
}
