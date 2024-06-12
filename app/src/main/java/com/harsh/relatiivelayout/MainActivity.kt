package com.harsh.relatiivelayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var movetonext:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Toast.makeText(this, "on create called", Toast.LENGTH_SHORT).show()
movetonext=findViewById(R.id.movetonext)
      movetonext?.setOnClickListener {
          var intent=Intent(this,MainActivity2::class.java)
          startActivity(intent)
      }


    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "on Resume called", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
Toast.makeText(this,"on start called",Toast.LENGTH_SHORT).show()    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"on start called",Toast.LENGTH_SHORT).show()

    }

    }
