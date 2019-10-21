package com.example.andorid.igapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListView extends AppCompatActivity {

    android.widget.ListView simpleList;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        simpleList = (android.widget.ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList);
        simpleList.setAdapter(customAdapter);

    }
}
