package com.example.myapplication
import android.database.Observable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
//Nikodem Mikucki
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listaNotatek = arrayListOf<String>("Zakupy: chleb, masło, ser", "Do zrobienia: obiad, umyć podłogi", "weekend: kino, spacer z psem")
        val mojButton : Button = findViewById(R.id.MegaButton)
        val widokListy : ListView = findViewById(R.id.MegaListView)
        val editText : EditText = findViewById(R.id.MegaEditText)
        val adaptacja = ArrayAdapter(this, android.R.layout.simple_list_item_1 ,listaNotatek)
        widokListy.setAdapter(adaptacja)
        mojButton.setOnClickListener {
            listaNotatek.add(editText.text.toString())
            adaptacja.notifyDataSetChanged()
            widokListy.setAdapter(adaptacja)
        }
    }
}