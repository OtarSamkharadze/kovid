package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var Btn: Button
    private lateinit var ki1: CheckBox
    private lateinit var ara1: CheckBox
    private lateinit var ki2: CheckBox
    private lateinit var ara2: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn = findViewById(R.id.Btn)
        ki1 = findViewById(R.id.ki1)
        ara1 = findViewById(R.id.ara1)
        ki2 = findViewById(R.id.ki2)
        ara2 = findViewById(R.id.ara2)

        fun Check() {
            ki1.setOnClickListener() {
                if (ara1.isChecked) {
                    ara1.toggle()
                }
            }
            ara1.setOnClickListener() {
                if (ki1.isChecked) {
                    ki1.toggle()
                }
            }
            ki2.setOnClickListener() {
                if (ara2.isChecked) {
                    ara2.toggle()
                }
            }
            ara2.setOnClickListener() {
                if (ki2.isChecked) {
                    ki2.toggle()
                }
            }


        }
        Check()

        fun uncheck() {
            if (ki1.isChecked) {
                ki1.toggle()
            }
            if (ki2.isChecked) {
                ki2.toggle()
            }
            if (ara1.isChecked) {
                ara1.toggle()
            }
            if (ara2.isChecked) {
                ara2.toggle()
            }
            Btn.setOnClickListener() {
                Toast.makeText(applicationContext, "გაიგზავნა", Toast.LENGTH_SHORT).show()


            }


        }
        uncheck()


    }

}
