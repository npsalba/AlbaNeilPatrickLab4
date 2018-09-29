package com.alba.neilpatrick.albaneilpatricklab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        Button buttonNext = (Button) findViewById(R.id.buttonNext);


        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Toasty Message";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.activity_main);
                String message = "Snacky Message";
                int duration = Snackbar.LENGTH_SHORT;

                Snackbar.make(view, message, duration).show();
            }
        });
        Log.d("LAB4", "onCreate() was executed");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LAB4", "onStart() was executed");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LAB4", "onResume() was executed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LAB4", "onPause() was executed");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LAB4", "onStop() was executed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LAB4", "onDestroy() was executed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LAB4", "onRestart() was executed");
    }
}
