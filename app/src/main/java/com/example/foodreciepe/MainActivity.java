package com.example.foodreciepe;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {


        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

        }

        /** Called when the activity is about to become visible. */
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

        public void getStarter(android.view.View view){
                Button button=findViewById(R.id.starter);
                button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent=new Intent(view.getContext(), StarterPage.class);
                                startActivity(intent);
                        }
                });
        }
    public void getMainCourse(android.view.View view){
            Button button=findViewById(R.id.mainCourse);
            button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            Intent intent=new Intent(view.getContext(), MainCourse.class);
                            startActivity(intent);
                    }
            });

    }
    public void getDessert(android.view.View view){
            Button button=findViewById(R.id.dessert);
            button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            Intent intent=new Intent(view.getContext(), Dessert.class);
                            startActivity(intent);
                    }
            });


    }
}
