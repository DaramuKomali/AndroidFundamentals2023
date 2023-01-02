package com.vvit.fundamentals;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreKeeper extends AppCompatActivity {

    // TODO: Member variables for holding the score

    // TODO: Member variables for the two score TextView elements


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);
        setTitle(R.string.title_name_score_keeper);

        // TODO: Find the TextViews by ID

    }
    public void decreaseScore(View view) {
        /* TODO: Handles the onClick of both the decrement buttons.
         *
         * @param view The button view that was clicked
         */
        // TODO: Get the ID of the button that was clicked.
    }
    public void increaseScore(View view) {
        /* TODO: Handles the onClick of both the increment buttons.
         *
         * @param view The button view that was clicked
         */
        // TODO: Get the ID of the button that was clicked.
    }
}