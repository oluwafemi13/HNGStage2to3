package com.example.android.hngstage2to3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button =findViewById(R.id.button)

        button.setOnClickListener(){
            addName(it)
        }


    }

    private fun addName(view: View){
        val editText:EditText = findViewById(R.id.editText)
        val textView:TextView = findViewById(R.id.textView)

        textView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        textView.visibility = View.VISIBLE
    }
}