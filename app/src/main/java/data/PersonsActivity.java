package data;

import android.os.Bundle;
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

public class PersonsActivity {

    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_persons);

        listView = findViewById(R.id.personName);

        ArrayList<String> i = (ArrayList) this.getIntent().getExtras().get("Persons");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, i);

        listView.setAdapter(adapter);

        //Create two classes that extend AsyncTask. One for each database call.
        // I would not normally call AsyncTask for transactions I was not expecting
        // anything back, so feel free to use standard Java Thread for the insert
        new Thread(new Runnable() {
            @Override
            public void run() {
                Person person =new Person();
                person.setName(name);
                labDatabase.personDao().insertPerson(person);
            }
        }) .start();
    }
}
