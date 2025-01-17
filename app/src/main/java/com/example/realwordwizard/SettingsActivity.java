package com.example.realwordwizard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.settings), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void launchGame(View v){
        Intent i = new Intent(this, GameActivity.class);
        finish();
        startActivity(i);
    }

    public void launchMain(View v){
        Intent i = new Intent(this, MainActivity.class);
        finish();
        startActivity(i);
    }

    public void launchShop(View v){
        Toast.makeText(SettingsActivity.this,"not yet unlocked!", Toast.LENGTH_SHORT).show();
    }

    public void notUnlocked(View v)
    {
        Toast.makeText(SettingsActivity.this,"not yet unlocked!", Toast.LENGTH_SHORT).show();
    }

}
