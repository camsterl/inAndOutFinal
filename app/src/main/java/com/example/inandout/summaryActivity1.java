package com.example.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class summaryActivity1 extends AppCompatActivity {


    private TextView total;
    private TextView subtotal;
    private TextView tax;
    private TextView items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary1);

        total = findViewById(R.id.total);
        subtotal = findViewById(R.id.subtotal);
        tax = findViewById(R.id.tax);
        items = findViewById(R.id.items);




        Intent intent = getIntent();

        total.setText(intent.getStringExtra("total"));
        subtotal.setText(intent.getStringExtra("subtotal"));
        tax.setText(intent.getStringExtra("tax"));
        items.setText(intent.getStringExtra("items"));

    }
    public void closeActivity(View v)
    {
        this.finish();
    }

}
