package edu.nau.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListOfFood extends AppCompatActivity {
    private Button account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_food);

        account = (Button) findViewById(R.id.account);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccountPreferences();
            }
        });
    }

    public void openAccountPreferences() {
        Intent intent = new Intent(this, AccountPreferences.class);
        startActivity(intent);
    }
}
