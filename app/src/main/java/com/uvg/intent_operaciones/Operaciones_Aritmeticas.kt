package com.uvg.intent_operaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Operaciones_Aritmeticas : AppCompatActivity() {
    var userInput1:EditText?=null
    var userInput2:EditText?=null
    var addButton:Button?=null
    var subButton:Button?=null
    var mulButton:Button?=null
    var divButton:Button?=null

    var txtView:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operaciones_aritmeticas)

        userInput1=findViewById(R.id.user_input1)
        userInput2=findViewById(R.id.user_input2)
        addButton=findViewById(R.id.btnAdd)
        subButton=findViewById(R.id.btnSub)
        mulButton=findViewById(R.id.btnMultiplicar)
        divButton=findViewById(R.id.btnDiv)
        txtView = findViewById(R.id.txtResultado);


        addButton!!.setOnClickListener{
            val input_1: EditText? = userInput1 as EditText?
            val numero_1: String = input_1?.text.toString()
            val valor_1:Float =numero_1.toFloat()
            val input_2: EditText? = userInput2 as EditText?
            val numero_2: String = input_2?.text.toString()
            val valor_2:Float = numero_2.toFloat()
            val suma: Float = valor_1 + valor_2
            val resultado: String = suma.toString()

            val intent: Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("Resultado de la operación es: ",resultado)
            setResult(RESULT_OK,intent)
            finish()

        }
        subButton!!.setOnClickListener{
            val input_1: EditText? = userInput1 as EditText?
            val numero_1: String = input_1?.text.toString()
            val valor_1:Float =numero_1.toFloat()
            val input_2: EditText? = userInput2 as EditText?
            val numero_2: String = input_2?.text.toString()
            val valor_2:Float = numero_2.toFloat()
            val resta: Float = valor_1 - valor_2
            val resultado: String = resta.toString()

            val intent: Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("Resultado de la operación es: ",resultado)
            setResult(RESULT_OK,intent)
            finish()
        }
        divButton!!.setOnClickListener{
            val input_1: EditText? = userInput1 as EditText?
            val numero_1: String = input_1?.text.toString()
            val valor_1:Float =numero_1.toFloat()
            val input_2: EditText? = userInput2 as EditText?
            val numero_2: String = input_2?.text.toString()
            val valor_2:Float = numero_2.toFloat()
            val división: Float = valor_1 / valor_2
            val resultado: String = división.toString()

            val intent: Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("Resultado de la operación es: ",resultado)
            setResult(RESULT_OK,intent)
            finish()

        }
        mulButton!!.setOnClickListener{
            val input_1: EditText? = userInput1 as EditText?
            val numero_1: String = input_1?.text.toString()
            val valor_1:Float =numero_1.toFloat()
            val input_2: EditText? = userInput2 as EditText?
            val numero_2: String = input_2?.text.toString()
            val valor_2:Float = numero_2.toFloat()
            val multiplicación: Float = valor_1 * valor_2
            val resultado: String = multiplicación.toString()

            val intent: Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("Resultado de la operación es: ",resultado)
            setResult(RESULT_OK,intent)
            finish()

        }


    }
    fun irPrincipal(view: View?) {
        val siguiente = Intent(this, MainActivity::class.java)
        startActivity(siguiente)

    }
}