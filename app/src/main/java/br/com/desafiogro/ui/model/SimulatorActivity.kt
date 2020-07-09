package br.com.desafiogro.ui.model

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.desafiogro.R
import kotlinx.android.synthetic.main.activity_simulador.*
import java.util.*


class SimulatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulador)

        btn_simular.setOnClickListener{
            if (editNumber_investir.text.toString().length === 0) {
                editNumber_guardar.text.get(0)
            }
            if (editNumber_guardar.text.toString().length === 0) {
                editNumber_investir.text.get(0)
            }
            val num1 = editNumber_investir.text.toString().toInt()
            val num2  = editNumber_guardar.text.toString().toInt()
            var rate : Double = 4.25
            val sum =  (num1 * num2 ) /252 * rate
            textView_resultado.text = "Resultado:" + sum.toString()
            Toast.makeText(this, "Resultado" + textView_resultado.text, Toast.LENGTH_LONG).show()
        }



    }



}
