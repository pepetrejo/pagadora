package com.pepetrejo.pagadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var in20 = findViewById<View>(R.id.in20) as EditText
        var in10 = findViewById<View>(R.id.in10) as EditText
        var in1 = findViewById<View>(R.id.in1) as EditText
        var in05 = findViewById<View>(R.id.in05) as EditText
        var in01 = findViewById<View>(R.id.in01) as EditText
        val btnCalcular = findViewById<View>(R.id.btnCalcular) as Button
        val btnBorrar = findViewById<View>(R.id.btnBorrar) as Button
        var pagadora = findViewById<View>(R.id.pagadora) as EditText

        var total20 = findViewById<View>(R.id.calculo20) as TextView
        var total10 = findViewById<View>(R.id.calculo10) as TextView
        var total1 = findViewById<View>(R.id.calculo1) as TextView
        var total05 = findViewById<View>(R.id.calculo05) as TextView
        var total01 = findViewById<View>(R.id.calculo01) as TextView
        var suma = findViewById<View>(R.id.sumaTotal) as TextView





        btnCalcular.setOnClickListener {
            var por20 = (in20.text.toString().toInt() * 20).toString()
            total20.text = por20 + "€"

            var por10 = (in10.text.toString().toInt() * 10).toString()
            total10.text = por10 + "€"

            var por1 = (in1.text.toString().toInt() * 1).toString()
            total1.text = por1 + "€"

            var por05 = (in05.text.toString().toFloat() * 0.5f).toString()
            total05.text = por05 + "€"

            var por01 = (in01.text.toString().toFloat() * 0.1f).toString()
            total01.text = por01 +"€"

            var sumando: String = (por20.toFloat() + por10.toFloat() + por1.toFloat() + por05.toFloat() + por01.toFloat()).toString()
            println(sumando)
            suma.text = sumando + "€"

        }

        btnBorrar.setOnClickListener {

            val intent = intent
            finish()
            startActivity(intent)
        }



    }







}