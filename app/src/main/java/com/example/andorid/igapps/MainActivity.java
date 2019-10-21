package com.example.andorid.igapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showFollowers(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Followers.class);
        startActivity(intent);
    }

    public void showFollowing(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Followers.class);
        startActivity(intent);
    }

    public void lauchEditProfile(View view) {

    }


}
