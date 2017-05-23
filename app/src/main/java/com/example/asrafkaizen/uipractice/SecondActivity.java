package com.example.asrafkaizen.uipractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.asrafkaizen.uipractice.R;

import org.w3c.dom.Text;

public class SecondActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtEmail = (TextView) findViewById(R.id.txtEmail);
        TextView txtCourse = (TextView) findViewById(R.id.txtCourse);
        TextView txtRating = (TextView) findViewById(R.id.txtRating);
        Button btnClose = (Button) findViewById(R.id.btnClose);

        Intent i = getIntent();
        // Receiving the Data
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        String course = i.getStringExtra("course");
        String rating = i.getStringExtra("rating");
        Log.e("Second Screen", name + "." + email);

        // Displaying Received data
        txtName.setText(name);
        txtEmail.setText(email);
        txtCourse.setText(course);
        txtRating.setText(rating);

        // Binding Click event to Button
        btnClose.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Closing SecondScreen Activity
                finish();
            }
        });

    }
}