package com.example.foodreciepe;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Dessert extends AppCompatActivity {

    private Spinner spinner;
    private static final String[] dessert_items = {"Apple Crumb Pie", "Strawberry Chia Pudding",
            "Jaggery Panna Cotta", "Trio of Mousse", "Chocolate Blueberry Torte"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        spinner = (Spinner) findViewById(R.id.dessert_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, dessert_items);
        spinner.setAdapter(adapter);
    }

    protected void onStart() {
        super.onStart();

    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();

    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();

    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();

    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();

    }


    public void getDessertRecipe(View view){
        Button button=findViewById(R.id.get_dessert);
        String item=spinner.getSelectedItem().toString();

        Intent intent=new Intent(this, Recipe.class);
        intent.putExtra("item", item);
        startActivity(intent);
    }
}
