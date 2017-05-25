package com.example.rob.final_v10;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Rob on 5/23/17.
 */

public class Feedback extends Activity {

    Button sendEmail;
    EditText msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        sendEmail = (Button) findViewById(R.id.button5);
        sendEmail.setOnClickListener(new  View.OnClickListener() {

            @Override
            public void onClick(View v) {
                msg = (EditText) findViewById(R.id.editText7);
                String message = msg.getText().toString();
                sendEmail(message);
            }
        });
    }

    protected void sendEmail(String message)
    {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "Rsenini6644@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
        emailIntent.putExtra(Intent.EXTRA_TEXT, message);
        emailIntent.setType("message/rfc822");
        try
        {
            startActivity(emailIntent);
        }
        catch (ActivityNotFoundException e)
        {
            Toast err = Toast.makeText(Feedback.this, "No Email Client Found on this device", Toast.LENGTH_LONG);
            err.show();
        }

    }


    
}

