
package com.chotadon.ai

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.rgb(15, 15, 20))
        }

        val title = TextView(this).apply {
            text = "CHOTA DON AI"
            textSize = 30f
            setTextColor(Color.rgb(255, 190, 60))
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "Assistant is running"
            textSize = 16f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setPadding(0, 24, 0, 0)
        }

        layout.addView(title)
        layout.addView(status)
        setContentView(layout)
    }
}
