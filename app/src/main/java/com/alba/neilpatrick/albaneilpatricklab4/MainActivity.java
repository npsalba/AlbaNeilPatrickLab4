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
            public void onClick(View view) {
                String message = "Toasty Message";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
                Log.d("LIFECYCLE", "toast message shown");
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.activity_main);
                String message = "Snacky Message";
                int duration = Snackbar.LENGTH_SHORT;

                Snackbar.make(view, message, duration).show();
                Log.d("LIFECYCLE", "snackbar message shown");
            }
        });
    }
}
