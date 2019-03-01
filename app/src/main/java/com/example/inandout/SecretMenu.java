package com.example.inandout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.inandout.model.Order;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import static java.lang.Integer.parseInt;

public class SecretMenu extends AppCompatActivity {

    private TextView three;
    private TextView four;
    private TextView hundred;
    private TextView animal;
    private TextView cheeseFries;

    private Order order;

    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());
    DecimalFormat df = new DecimalFormat("#.#");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_menu);

        order = new Order();

        three = findViewById(R.id.threeByThree);
        four = findViewById(R.id.fourByFour);
        hundred = findViewById(R.id.hundred);
        animal = findViewById(R.id.animalFries);
        cheeseFries = findViewById(R.id.cheeseFries);
    }

        public void switchToMain(View v)
        {
            int three2 = 0, four2 = 0, hundred2 = 0, animal2 = 0, cheeseF = 0;

            try {
                three2 = parseInt(three.getText().toString());
            }catch(NumberFormatException e) {}

            try {
                four2 = parseInt(four.getText().toString());
            }catch(NumberFormatException e) {}

            try {
                hundred2 = parseInt(hundred.getText().toString());
            }catch(NumberFormatException e) {}

            try {
                animal2 = parseInt(animal.getText().toString());
            }catch(NumberFormatException e) {}

            try {
                cheeseF = parseInt(cheeseFries.getText().toString());
            }catch(NumberFormatException e) {}


            order.setAnimalFries(animal2);
            order.setThreeByThree(three2);
            order.setFourByFour(four2);
            order.setHundredByHundred(hundred2);
            order.setCheeseFries(cheeseF);

            Intent intent = new Intent(this, summaryActivity1.class);
            intent.putExtra("subtotal", currency.format(order.calculateSubtotal()));
            intent.putExtra("tax", currency.format(order.calculateTax()));
            intent.putExtra("total", currency.format(order.calculateTotal()));
            intent.putExtra("items", df.format(order.itemsOrdered()));
            startActivity(intent);

            }



}
