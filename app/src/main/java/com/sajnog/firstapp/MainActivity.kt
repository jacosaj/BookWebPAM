package com.sajnog.firstapp

import android.content.Intent
import android.os.Bundle

import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.info -> {
                val switchActivityIntent = Intent(this, NewActivity::class.java)
                startActivity(switchActivityIntent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        val switchActivityIntent = Intent(this, MainActivity::class.java)
//        startActivity(switchActivityIntent)
//        return true
//    }
}

