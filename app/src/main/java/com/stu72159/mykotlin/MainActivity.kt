package com.stu72159.mykotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btn_add: Button
    lateinit var btn_sub: Button
    lateinit var btn_div: Button
    lateinit var btn_mlt: Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btn_add = findViewById(R.id.btn_add)
        btn_sub = findViewById(R.id.btn_sub)
        btn_div = findViewById(R.id.btn_div)
        btn_mlt = findViewById(R.id.btn_mlt)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        tvResult = findViewById(R.id.tv_result)

        btn_add.setOnClickListener(this)
        btn_sub.setOnClickListener(this)
        btn_div.setOnClickListener(this)
        btn_mlt.setOnClickListener(this)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add -> {
                result =a+b
            }
            R.id.btn_sub -> {
                result =a-b
            }
            R.id.btn_div -> {
                result =a/b
            }
            R.id.btn_mlt -> {
                result =a*b
            }
        }
        tvResult.text = result.toString()
    }
}