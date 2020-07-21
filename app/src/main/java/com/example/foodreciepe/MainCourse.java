package com.example.foodreciepe;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainCourse extends AppCompatActivity {

    private Spinner spinner;
    private static final String[] main_course_items = {"Grilled Veg Pesto Sandwich",
            "Albuquerque Atomic Mushrooms" , "Clotted Cottage Cheese Croquettes" , "Kalmi Kebab",
            "Oyster Lamb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_course);

        spinner = (Spinner) findViewById(R.id.main_course_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, main_course_items);
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


    public void getMainCourseRecipe(View view){
        Button button=findViewById(R.id.get_main_course);
        String item=spinner.getSelectedItem().toString();

        Intent intent=new Intent(this, Recipe.class);
        intent.putExtra("item", item);
        startActivity(intent);
    }
}
