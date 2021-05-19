package com.uvg.intent_operaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var outputText:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        outputText=findViewById(R.id.txtResultado)
    }

    fun irCalculadora(view: View?) {
        val siguiente = Intent(this, Operaciones_Aritmeticas::class.java)
        startActivityForResult(siguiente,1)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == RESULT_OK){
            if(requestCode == 1){
                val bundle = data?.extras
                if(bundle!=null){
                    val text = bundle.getString("Resultado de la operación es: ")
                    outputText!!.text = text


                }


            }
        }
    }
    
}