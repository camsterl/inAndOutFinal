package com.example.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.inandout.model.Order;

import java.text.DecimalFormat;
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
    DecimalFormat df = new DecimalFormat("#.#");



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
        int cheese = 0, doubleD = 0, frenchF = 0, shake = 0, Small = 0, Medium = 0, Large = 0;

        try {
            cheese = parseInt(cheeseburgers.getText().toString());
        } catch(NumberFormatException e) {}

        try {
         doubleD = parseInt(doubleDouble.getText().toString());
         } catch(NumberFormatException e) {}

        try {
         frenchF = parseInt(frenchFries.getText().toString());
        } catch(NumberFormatException e) {}

        try {
         shake = parseInt(shakes.getText().toString());
        } catch(NumberFormatException e) {}

        try {
         Small =parseInt(small.getText().toString());
        } catch(NumberFormatException e) {}

        try {
         Medium = parseInt(medium.getText().toString());
        } catch(NumberFormatException e) {}

        try {
         Large = parseInt(large.getText().toString());
        } catch(NumberFormatException e) {}

        order.setCheeseburgers(cheese);
        order.setDoubleDouble(doubleD);
        order.setFrenchFries(frenchF);
        order.setShakes(shake);
        order.setSmallDrinks(Small);
        order.setMediumDrinks(Medium);
        order.setLargeDrinks(Large);

        Intent intent = new Intent(this, summaryActivity1.class);


        intent.putExtra("subtotal", currency.format(order.calculateSubtotal()));
        intent.putExtra("tax", currency.format(order.calculateTax()));
        intent.putExtra("total", currency.format(order.calculateTotal()));
        intent.putExtra("items", df.format(order.itemsOrdered()));

        startActivity(intent);

    }

    public void secretMenuSwitch(View v)
    {
        int cheese = 0, doubleD = 0, frenchF = 0, shake = 0, Small = 0, Medium = 0, Large = 0;

        try {
            cheese = parseInt(cheeseburgers.getText().toString());
        } catch(NumberFormatException e) {}

        try {
            doubleD = parseInt(doubleDouble.getText().toString());
        } catch(NumberFormatException e) {}

        try {
            frenchF = parseInt(frenchFries.getText().toString());
        } catch(NumberFormatException e) {}

        try {
            shake = parseInt(shakes.getText().toString());
        } catch(NumberFormatException e) {}

        try {
            Small =parseInt(small.getText().toString());
        } catch(NumberFormatException e) {}

        try {
            Medium = parseInt(medium.getText().toString());
        } catch(NumberFormatException e) {}

        try {
            Large = parseInt(large.getText().toString());
        } catch(NumberFormatException e) {}

        order.setCheeseburgers(cheese);
        order.setDoubleDouble(doubleD);
        order.setFrenchFries(frenchF);
        order.setShakes(shake);
        order.setSmallDrinks(Small);
        order.setMediumDrinks(Medium);
        order.setLargeDrinks(Large);

        Intent intent = new Intent(this, SecretMenu.class);
        intent.putExtra("subtotal", currency.format(order.calculateSubtotal()));
        intent.putExtra("tax", currency.format(order.calculateTax()));
        intent.putExtra("total", currency.format(order.calculateTotal()));
        intent.putExtra("items", df.format(order.itemsOrdered()));
        startActivity(intent);
    }
}
