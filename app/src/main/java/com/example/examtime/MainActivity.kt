package com.example.examtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.examtime.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bTime = findViewById<Button>(R.id.btnTime)
        val bExam = findViewById<Button>(R.id.btnSheet)
        val bValidate = findViewById<Button>(R.id.btnValidate)

        bTime.setOnClickListener {
            replace(Clock())
        }

        bExam.setOnClickListener {
            replace(Exam())
        }

        bValidate.setOnClickListener {
            replace(LoginFragment())
        }
    }

    //replace -> replaceFrameWithFragment

    private fun replace(frag: Fragment) {

        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.FrameLayout,frag)
        fragTransaction.commit()
    }
}