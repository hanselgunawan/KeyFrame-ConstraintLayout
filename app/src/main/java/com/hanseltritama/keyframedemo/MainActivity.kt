package com.hanseltritama.keyframedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    var isShown:Boolean = false
    private val constraintSetShow: ConstraintSet = ConstraintSet()
    private val constraintSetHide: ConstraintSet = ConstraintSet()
    private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.my_layout)

        constraintSetHide.clone(layout)
        constraintSetShow.clone(this, R.layout.activity_main_second)

    }

    fun handleKeyframe(view: View) {

        TransitionManager.beginDelayedTransition(layout)

        if (isShown) {
            constraintSetHide.applyTo(layout)
        } else {
            constraintSetShow.applyTo(layout)
        }

        isShown = !isShown

    }
}
