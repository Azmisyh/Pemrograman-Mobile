package com.example.drakorlist;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.drakorlist.R

class ListDrakorActivity : AppCompatActivity() {
    private val listDrakor = listOf(
        "Taxi Driver",
        "Undercover HighSchool",
        "Study Group",
        "Weak Hero Class",
        "Sweet Home",
        "18 Again",
        "Blooudhound"
    );

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_drakor);

        val listView = findViewById<ListView>(R.id.listViewDrakor);
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listDrakor);
        listView.adapter = adapter;
    }
};
