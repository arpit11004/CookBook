package com.example.foodreciepe;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class StarterPage extends Activity{
    private Spinner spinner;
    private static final String[] items = {"Kakori Kababs", "Chilli Chicken", "Paneer Tikka",
                                           "Cheese Balls", "Chicken Wings", "French Fries"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starter_page);

        spinner = (Spinner) findViewById(R.id.starter_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(adapter);


    }

    @Override
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


    public void getStarterRecipe(View view){
        Button button=findViewById(R.id.get_starter);
        String item=spinner.getSelectedItem().toString();

                Intent intent=new Intent(this, Recipe.class);
                intent.putExtra("item", item);
                startActivity(intent);
            }



}
