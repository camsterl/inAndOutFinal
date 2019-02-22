package com.example.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.inandout.model.Order;

import java.text.NumberFormat;
import java.util.Locale;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    private EditText cheeseburgers;
    private EditText doubleDouble;
    private EditText frenchFries;
    private EditText shakes;
    private EditText small;
    private EditText medium;
    private EditText large;
    private Order order;

    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cheeseburgers = findViewById(R.id.cheeseburger);
        doubleDouble = findViewById(R.id.doubledouble);
        frenchFries = findViewById(R.id.fries);
        shakes = findViewById(R.id.shakes);
        small = findViewById(R.id.small);
        medium = findViewById(R.id.medium);
        large = findViewById(R.id.large);

        order = new Order();

    }

    public void switchToOrderSummary(View v)
    {
        int cheese = parseInt(cheeseburgers.getText().toString());
        int doubleD = parseInt(doubleDouble.getText().toString());
        int frenchF = parseInt(frenchFries.getText().toString());
        int shake = parseInt(shakes.getText().toString());
        int Small =parseInt(small.getText().toString());
        int Medium = parseInt(medium.getText().toString());
        int Large = parseInt(large.getText().toString());

        order.setCheeseburgers(cheese);
        order.setDoubleDouble(doubleD);
        order.setFrenchFries(frenchF);
        order.setShakes(shake);
        order.setSmallDrinks(Small);
        order.setMediumDrinks(Medium);
        order.setLargeDrinks(Large);

        Intent intent = new Intent(this, Order.class);


        intent.putExtra("subtotal", currency.format(order.calculateSubtotal()));
        intent.putExtra("tax", currency.format(order.calculateTax()));
        intent.putExtra("total", currency.format(order.calculateTotal()));
        intent.putExtra("items", order.itemsOrdered());

        startActivity(intent);

    }
}
