package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater  = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView : TextView = findViewById(R.id.textView)
        val Lay:ConstraintLayout = findViewById(R.id.bb)
        when (item.itemId){
            R.id.action1 -> {
                textView.text = "Вы выбрали пункт 1!"
                Lay.setBackgroundColor(resources.getColor(R.color.white))
            }
            R.id.action2 -> {
                textView.text = "Вы выбрали пункт 2!"
                Lay.setBackgroundColor(resources.getColor(R.color.blue))
            }
            R.id.action3 -> {
                textView.text = "Вы выбрали пункт 3!"
                Lay.setBackgroundColor(resources.getColor(R.color.red))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}