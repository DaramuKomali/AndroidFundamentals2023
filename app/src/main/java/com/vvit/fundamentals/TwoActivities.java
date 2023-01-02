package com.vvit.fundamentals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TwoActivities extends AppCompatActivity {

    // TODO: Class name for Log tag

    // TODO: Unique tag required for the intent extra

    // TODO: Unique tag for the intent reply


    // TODO: EditText view for the message

    // TODO: TextView for the reply header

    // TODO: TextView for the reply body

    /*TODO: Initializes the activity.
     *
     * @param savedInstanceState The current state data.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_activities);

        // TODO: Initialize all the view variables.

    }

    /*TODO: Handles the onClick for the "Send" button. Gets the value of the main EditText,
     * creates an intent, and launches the second activity with that intent.
     *
     * The return intent from the second activity is onActivityResult().
     *
     * @param view The view (Button) that was clicked.
     */
    public void launchSecondActivity(View view) {

    }

    /*TODO:  Handles the data in the return intent from SecondActivity.
     *
     * @param requestCode Code for the SecondActivity request.
     * @param resultCode Code that comes back from SecondActivity.
     * @param data Intent data sent back from SecondActivity.
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // TODO: Test for the right intent reply.

        // TODO: Test to make sure the intent reply result was good.


        // TODO: Make the reply head visible.


        // TODO: Set the reply and make it visible.


    }
}