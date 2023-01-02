package com.vvit.fundamentals;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ImplicitIntents extends AppCompatActivity {

    /* TODO: Initializes the activity.
     *
     * @param savedInstanceState The current state data.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);

    }

    /*TODO: Handles the onClick for the "Open Website" button. Gets the URI
     * from the edit text and sends an implicit intent for that URL.
     *
     * @param view The view (Button) that was clicked.
     */
    public void openWebsite(View view) {
        // TODO: Get the URL text.


        // TODO: Parse the URI and create the intent.


        //TODO:  Find an activity to hand the intent and start that activity.
    }

    /*TODO: Handles the onClick for the "Open Location" button. Gets the location
     * text from the edit text and sends an implicit intent for that location.
     *
     * The location text can be any searchable geographic location.
     *
     * @param view The view (Button) that was clicked.
     */
    public void openLocation(View view) {
        // TODO: Get the string indicating a location. Input is not validated; it is passed to the location handler intact.

        // TODO: Parse the location and create the intent.

        // TODO: Find an activity to handle the intent, and start that activity.

    }

    /*TODO:  Handles the onClick for the "Share This Text" button. The
     * implicit intent here is created by the  {@link ShareCompat.IntentBuilder}
     * class. An app chooser appears with the available options for sharing.
     *
     * ShareCompat.IntentBuilder is from the v4 Support Library.
     *
     * @param view The view (Button) that was clicked.
     */
    public void shareText(View view) {

    }
}