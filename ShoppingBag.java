package edu.nau.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingBag extends AppCompatActivity {

    private Button addItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_bag);
        addItem = (Button) findViewById(R.id.addItem);

        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoriesPage();
            }
        });

    }

    public void openCategoriesPage() {
        Intent intent = new Intent(this, Categories.class);
        startActivity(intent);
    }
}
