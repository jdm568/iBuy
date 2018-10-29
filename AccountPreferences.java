package edu.nau.ibuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class AccountPreferences extends AppCompatActivity {
    private Button colorSchemeChoice;
    private Button accountBasics;
    private Button privacySettings;
    private Button reminderSounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_preferences);

        colorSchemeChoice = (Button) findViewById(R.id.colorSchemeChoice);
        accountBasics = (Button) findViewById(R.id.accountBasics);
        privacySettings = (Button) findViewById(R.id.privacySettings);
        reminderSounds = (Button) findViewById(R.id.reminderSounds);

        colorSchemeChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserBasics();
            }
        });

        accountBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserBasics();
            }
        });

        privacySettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserBasics();
            }
        });

        reminderSounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserBasics();
            }
        });
    }

    public void openUserBasics() {
        Intent intent = new Intent(this, UserBasics.class);
        startActivity(intent);
    }
}
