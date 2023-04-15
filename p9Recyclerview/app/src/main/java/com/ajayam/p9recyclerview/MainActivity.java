package com.ajayam.p9recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContent);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.a1, "A", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a2, "B", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a3, "C", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a4, "D", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a5, "E", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a6, "F", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a7, "G", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a8, "H", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a9, "I", "7717788236" ));
        arrContacts.add(new ContactModel(R.drawable.a10, "J", "7717788236" ));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        RecyclerView.setAdapter(adapter);




    }
}