package com.example.asrafkaizen.uipractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity{

    private EditText name,email, comments;
    private Spinner course;
    private RatingBar ratingBar;
    private int rating;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        course = (Spinner) findViewById(R.id.coursespinner);
        comments = (EditText) findViewById(R.id.comments);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        Button btnNextScreen = (Button) findViewById(R.id.btnNextScreen);

        //Listening to button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                float rating = ratingBar.getRating();
                //Starting a new Intent
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                //Sending data to another Activity
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("course", course.getSelectedItem().toString());
                intent.putExtra("rating", Float.toString(rating));
                startActivity(intent);
            }
        });

    }
}

/*
RatingBar rate = (RatingBar)findViewById(R.id.R_rate);

//use ratings within event listner code block

float rating = rate.getRating();
 */