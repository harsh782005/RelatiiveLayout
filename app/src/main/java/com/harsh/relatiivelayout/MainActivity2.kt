package com.harsh.relatiivelayout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        var btnNumber : Button?= null
        var btnAdd : Button?= null
        var btnSub : Button?= null
        var btnMul : Button?= null
        var btnDiv : Button?= null
        var number = 0;

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

       }
        btnNumber = findViewById(R.id.btnNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnMinus)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        btnAdd?.setOnClickListener {
            number+=2
            btnNumber?.setText(number.toString())
        }
        btnSub?.setOnClickListener {
            number-=2
            btnNumber?.setText(number.toString())
        }
        btnDiv?.setOnClickListener {
            number/=2
            btnDiv?.setText(number.toString())
        }
        btnMul?.setOnClickListener {
            number*=2
            btnMul?.setText(number.toString())
        }


        }
    



    }






