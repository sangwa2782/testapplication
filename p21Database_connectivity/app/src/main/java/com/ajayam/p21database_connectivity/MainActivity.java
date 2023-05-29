package com.ajayam.p21database_connectivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.ajayam.p21database_connectivity.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        setContentView(R.layout.activity_main);

        MyDBHelper dbHelper = new MyDBHelper(this);





//for insert data
        dbHelper.addContact("Ajay", "8888888888");
        dbHelper.addContact("Prity", "9999999999");
        dbHelper.addContact("Anju", "4444444444");
        dbHelper.addContact("Anjali", "7777777777");







//for db update
//        ContactModel model = new ContactModel();
//        model.id=1;
//        model.name="Ajay";
//        model.phone_no="1236547896";
//
//        dbHelper.updateContact(model);






//for Delete data

//        dbHelper.DeleteContact(2);




//for display data

//            Log.d("CONTACT_INFO", "NAME: " + arrContacts.get(i).name + ", Phone No: "+ arrContacts.get(i).phone_no );


        binding.btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<ContactModel> arrContacts = dbHelper.fetchContext();

                String data = "";

                for (int i=0; i<arrContacts.size(); i++) {
                    data = data + "\n" + "CONTACT_INFO" + "NAME: " + arrContacts.get(i).name + ", Phone No: "+ arrContacts.get(i).phone_no;
                }
                binding.tvText1.setText(data);


                String value="Hello world";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                i.putExtra("key",value);
                startActivity(i);

            }
        });


    }


}