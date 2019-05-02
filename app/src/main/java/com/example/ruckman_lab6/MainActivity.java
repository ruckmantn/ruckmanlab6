package com.example.ruckman_lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button list_names;
    Button submit_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labDB = Room.databaseBuilder(this, LabDatabase.class, DATABASE_NAME)
                .build();
    }
    //list_names = findViewById(R.id.list_names);
    list_names.setOnClickListener(new View.OnClickListener() {
        Toast.makeText(MainActivity.this, "list_names", Toast.LENGTH_LONG).show();
    };
    //submit_name = findViewById(R.id.submit_name);
    submit_name.setOnClickListener(new View.OnClickListener() {
        Toast.makeText(MainActivity.this, "submit_name", Toast.LENGTH_LONG).show();
    };
}
