package com.vvit.fundamentals;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class KeyboardDialPhone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard_dial_phone);

        // TODO: Find the editText_main view and assign it to editText.

        // TODO : If view is found, set the listener for editText.
    }

    /**
     * Creates a string (phoneNum) for the phone number to dial,
     * and performs an implicit intent to dial the number.
     */
    private void dialNumber() {
        if (ActivityCompat.checkSelfPermission(KeyboardDialPhone.this.getApplicationContext(), Manifest.permission.CALL_PHONE) ==
                PackageManager.PERMISSION_GRANTED) {
            // TODO: Find the editText_main view.
            // TODO: If the editText field is not null,
            // TODO: concatenate "tel: " with the phone number string.

            // TODO: Log the concatenated phone number for dialing.


            // TODO: Specify the intent.


            // TODO: Set the data for the intent as the phone number.


            // TODO: start the activity with the intent.


        }

    }
}