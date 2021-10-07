package com.example.kotlin_prac1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hlwBtn.setOnClickListener {
          val messege:String=editTextTextPersonName.text.toString();

//            val  intent=Intent(this,MainActivity2::class.java)
//            intent.putExtra("key",messege)
//            startActivity(intent)
            val intent=Intent();
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,messege)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share to"))
        }

    }
}