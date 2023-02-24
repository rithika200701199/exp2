package com.example.gui_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increment=findViewById<Button>(R.id.check_in)
        val counter=findViewById<TextView>(R.id.counter)
        val decrement=findViewById<Button>(R.id.Check_out)
        val reset=findViewById<Button>(R.id.reset)

        increment.setOnClickListener {

            //counter.text=getString(R.string.count)
            var count_value=counter.text.toString()
            var num=count_value.toInt()
            num=num+1
            counter.text=num.toString()



        }

        decrement.setOnClickListener {
            var count_value=counter.text.toString()
            var num=count_value.toInt()

            if(num==0){
                val toast= Toast.makeText(this,"Counter Already 0!!", Toast.LENGTH_LONG).show()
            }
            else{
                num=num-1
                counter.text=num.toString()
            }



        }

        reset.setOnClickListener {
            counter.text="0"
        }
    }


}
