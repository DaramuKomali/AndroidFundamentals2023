package com.vvit.fundamentals;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2 extends AppCompatActivity {
    // TODO: Unique tag for the intent reply.

    // TODO: EditText for the reply.


    /*TODO:  Initializes the activity.
     *
     * @param savedInstanceState The current state data
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        // TODO: Initialize view variables.


        // TODO: Get the intent that launched this activity, and the message in the intent extra.


        // TODO: Put that message into the text_message TextView
    }

    /*TODO:  Handles the onClick for the "Reply" button. Gets the message from the
     * second EditText, creates an intent, and returns that message back to
     * the main activity.
     *
     * @param view The view (Button) that was clicked.
     */
    public void returnReply(View view) {
        // TODO: Get the reply message from the edit text.

        // TODO: Create a new intent for the reply, add the reply message to it
        // as an extra, set the intent result, and close the activity.

    }
}