package com.example.realwordwizard;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Settings2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.settings2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void launchGame2(View v){
        Intent i = new Intent(this, Game2Activity.class);
        finish();
        startActivity(i);
    }

    public void launchMain2(View v){
        Intent i = new Intent(this, Main2Activity.class);
        finish();
        startActivity(i);

    }

    public void launchShop(View v){
        Toast.makeText(Settings2Activity.this,"not yet unlocked!", Toast.LENGTH_SHORT).show();
    }

    public void notUnlocked(View v)
    {
        Toast.makeText(Settings2Activity.this,"not yet unlocked!", Toast.LENGTH_SHORT).show();
    }

    public void alreadyCompleted(View v){
        Toast.makeText(Settings2Activity.this,"already completed!", Toast.LENGTH_SHORT).show();
    }

}

