package edu.nau.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button addItem;
    private Button account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItem = (Button) findViewById(R.id.addItem);
        account = (Button) findViewById(R.id.account);

        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoriesPage();
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccountPreferences();
            }
        });

    }

    public void openCategoriesPage() {
        Intent intent = new Intent(this, Categories.class);
        startActivity(intent);
    }

    public void openAccountPreferences() {
        Intent intent = new Intent(this, AccountPreferences.class);
        startActivity(intent);
    }
}
