package com.vvit.fundamentals;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DroidCafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid_cafe);
        setTitle(R.string.title_name_droid_cafe);
        // TODO: Create a toolbar and fab
    }

    /* TODO: Inflates the menu, and adds items to the action bar if it is present.
     *
     * @param menu Menu to inflate.
     * @return Returns true if the menu inflated.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    /* TODO: Handles app bar item clicks.
     *
     * @param item Item clicked.
     * @return True if one of the defined items was clicked.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    /* TODO:  Shows a message that the donut image was clicked.
     */
    public void showDonutOrder(View view) {

    }

    /* TODO: Shows a message that the ice cream sandwich image was clicked.
     */
    public void showIceCreamOrder(View view) {

    }

    /* TODO: Shows a message that the froyo image was clicked.
     */
    public void showFroyoOrder(View view) {


    }
}