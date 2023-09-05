package com.example.colorpicker

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    var red : Int = 0
    var blue : Int = 0
    var green : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rbFondo : RadioButton = findViewById(R.id.rbFondo)
        val rbFuente : RadioButton = findViewById(R.id.rbFuente)

        val sbRojo : SeekBar = findViewById(R.id.sbRojo)
        val sbVerde : SeekBar = findViewById(R.id.sbVerde)
        val sbAzul : SeekBar = findViewById(R.id.sbAzul)



        val tvMensaje : TextView = findViewById(R.id.tvMensaje)

        sbRojo.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) { //1. x 2. el valor del seekbar 3.

                red = p1
                if (rbFondo.isChecked){
                    tvMensaje.setBackgroundColor(Color.rgb(red,green,blue))
                }

                if (rbFuente.isChecked){
                    tvMensaje.setTextColor(Color.rgb(red, green, blue))
                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

        sbVerde.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) { //1. x 2. el valor del seekbar 3.

                green  = p1
                if (rbFondo.isChecked){
                    tvMensaje.setBackgroundColor(Color.rgb(red,green,blue))
                }

                if (rbFuente.isChecked){
                    tvMensaje.setTextColor(Color.rgb(red, green, blue))
                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

        sbAzul.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) { //1. x 2. el valor del seekbar 3.

                blue  = p1
                if (rbFondo.isChecked){
                    tvMensaje.setBackgroundColor(Color.rgb(red,green,blue))
                }

                if (rbFuente.isChecked){
                    tvMensaje.setTextColor(Color.rgb(red, green, blue))
                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

    }
}
