package com.sceyt.axempji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.emojiview.emojiview.AXEmojiManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AXEmojiManager.install(application)

        findViewById<TextView>(R.id.tv).setOnClickListener {
            BottomSheetEmojisFragment({}).show(supportFragmentManager,"dsf")
        }
    }
}