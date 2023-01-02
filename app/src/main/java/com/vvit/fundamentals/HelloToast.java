package com.vvit.fundamentals;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HelloToast extends AppCompatActivity {
    /* TODO: Create a variable for mCount and initialise with 0 */
    // TODO: Create an instance for TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);
        // TODO: Obtain reference for View by id
    }

    public void showToast(View view) {
        /* TODO: Shows a Toast when the TOAST button is clicked.
         *
         * @param view The view that triggered this onClick handler.
         *             Since a toast always shows on the top,
         *             the passed in view is not used.
         */
    }


    public void countUp(View view) {
        /* TODO: Increment the number in the TextView when the COUNT button is clicked.
         *
         * @param view The view that triggered this onClick handler.
         *             Since the count always appears in the TextView,
         *             the passed in view is not used.
         */
    }
}