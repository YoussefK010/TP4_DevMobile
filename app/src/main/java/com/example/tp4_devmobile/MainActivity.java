package com.example.tp4_devmobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText EditNom;
    private EditText EditPrenom;
    private EditText EditMail;
    private Button Envoyer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditNom=findViewById(R.id.EditNom);
        EditPrenom=findViewById(R.id.EditPrenom);
        EditMail=findViewById(R.id.EditMail);
        Envoyer=findViewById(R.id.Envoyer);
        Envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom =EditNom.getText().toString();
                String prenom=EditPrenom.getText().toString();
                String mail=EditMail.getText().toString();
                Intent myIntent=new Intent(MainActivity.this, Activity_welcome.class);
                myIntent.putExtra("name",nom);
                myIntent.putExtra("lastname",prenom);
                myIntent.putExtra("mymail",mail);
                startActivity(myIntent);
            }
        });
    }
}