package com.example.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var hInicio: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hInicio = System.nanoTime()
        //Imprimimos en la ventana del Logcat
        Log.d("Estado","onCreate")
        val miBotton: Button = findViewById(R.id.my_button)
        miBotton.text="nooooo"
        val mensaje : TextView = findViewById(R.id.my_text)
        mensaje.text="hola"
    }

    override fun onPause() {
        super.onPause()
        val hFinal = System.nanoTime()
        val t: Long = (hFinal - hInicio)/1000000000
        Log.d("Estado","$t")
        val tiempo: TextView = findViewById(R.id.my_time)
        tiempo.text= "La aplicacion se ejecuto $t seg antes de pausarla"

    }


    //PRUEBAS DE LOGCAT
    /**override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "onResume")
    }
    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onStart")
    }

    override fun onPause() {
        super.onPause()
    }**/
}