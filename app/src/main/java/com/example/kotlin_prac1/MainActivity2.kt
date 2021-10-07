package com.example.kotlin_prac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle: Bundle? =intent.extras;
        val msg=bundle!!.getString("key")
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
        textView2.setText(msg)

    }
}