package com.example.tp4_devmobile;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_welcome extends AppCompatActivity {
    TextView txtWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txtWelcome=findViewById(R.id.txtWelcome);
        String nom=getIntent().getStringExtra("name");
        String prenom=getIntent().getStringExtra("lastname");
        String mail=getIntent().getStringExtra("mymail");
        String message ="Bienvenue"+nom+" "+prenom+",\n"
                +"c'est la deuxième activité.\n"
                +"vous serez bientot contacté sur : "+mail+" ";
        txtWelcome.setText(message);
    }
}