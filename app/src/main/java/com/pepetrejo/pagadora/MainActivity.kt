package com.pepetrejo.pagadora

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.pepetrejo.pagadora.databinding.ActivityMainBinding
import java.net.HttpCookie.parse
import java.util.logging.Level.parse


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCalcular.setOnClickListener {

            val btnCalcular = binding.btnCalcular // este creo que no vale para nada pasarla a variable
            val btnBorrar = binding.btnBorrar
            var pagadora = binding.pagadora.text.toString()


            var in20 = 0
            if (binding.in20.text.isEmpty()) {
                in20 = 0
            } else {
                in20 = binding.in20.text.toString().toInt()}  //pasa el EditText a Int

            var total20 = in20 * 20
            binding.calculo20.text = total20.toDouble().roundDecimal(2) + "€"  // Muestra siempre 2 decimales con esta funcion

            var in10 = 0
            if (binding.in10.text.isEmpty()) {
                in10 = 0
            } else {
                in10 = binding.in10.text.toString().toInt()}  //Muestra la var en el TextView. obliga a pasarlo a String

            var total10 = in10 * 10
            binding.calculo10.text = total10.toDouble().roundDecimal(2) + "€"

            var in1 = 0
            if (binding.in1.text.isEmpty()) {
                in1 = 0
            } else {
                in1 = binding.in1.text.toString().toInt()}

            var total1 = in1 * 1
            binding.calculo1.text = total1.toDouble().roundDecimal(2) + "€"

            var in05 = 0
            if (binding.in05.text.isEmpty()) {
                in05 = 0
            } else {
                in05 = binding.in05.text.toString().toInt()}

            var total05 = in05 * 0.5
            binding.calculo05.text = total05.toDouble().roundDecimal(2) + "€"

            var in01 = 0
            if (binding.in01.text.isEmpty()) {
                in01 = 0
            } else {
                in01 = binding.in01.text.toString().toInt()}

            var total01 = in01 * 0.1
            binding.calculo01.text = total01.toDouble().roundDecimal(2) + "€"
            


            /* Forma anterior que no permitía Empty (campo vacio)
         var in01: Float = binding.in01.text.toString().toFloat()
         var total01 = in01 * 0.10
         binding.calculo01.text = total01.toString() + "0€"
         println(total01)
          */

            var sumatotal = total20 + total10 + total1 + total05 + total01
            binding.sumaTotal.text = sumatotal.toDouble().roundDecimal(2) + "€"
            println(sumatotal)


        }


        binding.btnBorrar.setOnClickListener {

            // Initialize a new instance of
            val builder = AlertDialog.Builder(this@MainActivity)

            // Set the alert dialog title
            builder.setTitle("Borrar datos")

            // Display a message on alert dialog
            builder.setMessage("¿Esta seguro que quiere borrar los datos?")

            // Set a positive button and its click listener on alert dialog
            builder.setPositiveButton("Si") { dialog, which ->
                // Do something when user press the positive button
                Toast.makeText(applicationContext, "Datos borrados", Toast.LENGTH_SHORT).show()

                // Reinicia la app y se borran los datos
                val intent = intent
                finish()
                startActivity(intent)
            }

            // Display a negative button on alert dialog
            builder.setNegativeButton("No") { dialog, which ->
                Toast.makeText(applicationContext, "Cancelado", Toast.LENGTH_SHORT).show()
            }

            // Finally, make the alert dialog using builder
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface
            dialog.show()
        }
    }

        // Funcion que muestra el numero de decimales que le indique con numero.toDouble().roundDecimal(aqui el numero de decimales)
    fun Double.roundDecimal(digit: Int) = "%.${digit}f".format(this)

}