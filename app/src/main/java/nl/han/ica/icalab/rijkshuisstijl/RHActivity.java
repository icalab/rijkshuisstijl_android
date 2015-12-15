package nl.han.ica.icalab.rijkshuisstijl;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

/**
 * Base class for activities that implement a Rijkshuisstijl look. Takes care of things like styling the action bar and loading the rh_menu.
 */
public class RHActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rh_wrapper);

        // Set up clicking the rh_menu button. This is the version for a rh_menu in the main layout.
        ImageView menuButton = (ImageView) findViewById(R.id.menuButton);
        if(menuButton != null) {
            menuButton.setOnClickListener(this.getOnClickListener());
        }

        // Set up the action bar.
        ActionBar actionBar = getActionBar();
        if(actionBar != null) {
            // We're going to use our own layout.
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setDisplayOptions(actionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setDisplayShowTitleEnabled(false);
            View actionBarView = LayoutInflater.from(this).inflate(R.layout.rh_actionbar, null);
            actionBarView.findViewById(R.id.menuButton).setOnClickListener(this.getOnClickListener());
            actionBar.setCustomView(actionBarView);
        }
    }

    /**
     * Return an on click listener for showing / hiding the rh_menu.
     * @return the on click listener for showing / hiding the rh_menu.
     */
    private View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View menu = findViewById(R.id.menu);
                if (menu == null) {
                    return;
                }
                if (menu.getVisibility() == View.GONE) {
                    menu.setVisibility(View.VISIBLE);
                    menu.bringToFront();
                } else if (menu.getVisibility() == View.VISIBLE) {
                    menu.setVisibility(View.GONE);
                }
            }
        };

    }

    /**
     * Handle clicking the home button.
     */
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(this.getClass().toString(), "An item is selected! " + item.toString() + " aka " + item.getItemId());
        switch(item.getItemId()) {

            case android.R.id.home:
                // Show the rh_menu.
                View menu = findViewById(R.id.menu);
                if(menu == null) {
                    Log.d(this.getClass().toString(), "No rh_menu!");
                    return false;
                }
                if(menu.getVisibility() == View.GONE) {
                    menu.setVisibility(View.VISIBLE);
                    menu.bringToFront();
                }
                else if(menu.getVisibility() == View.VISIBLE) {
                    menu.setVisibility(View.GONE);
                }
                return true;
        }
        return false;
    }

}