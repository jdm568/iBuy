package edu.nau.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {
    private Button food;
    private Button household;
    private Button hygiene;
    private Button other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        food = (Button) findViewById(R.id.foodButton);
        household = (Button) findViewById(R.id.houseHoldButton);
        hygiene = (Button) findViewById(R.id.hygieneButton);
        other = (Button) findViewById(R.id.otherButton);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingBag();
            }
        });

        household.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingBag();
            }
        });

        hygiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingBag();
            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingBag();
            }
        });

    }

    public void openShoppingBag() {
        Intent intent = new Intent(this, ShoppingBag.class);
        startActivity(intent);
    }
}
