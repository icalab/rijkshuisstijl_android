package nl.han.ica.icalab.rijkshuisstijl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Activity class for the main rh_menu. Note you need to set your own button click handling code.
 */
public class RHStartScreen extends Activity {


    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.rh_start_screen);

        super.onCreate(savedInstanceState);

        // Set up clicking the menu button. This is the version for a menu in the main layout.
        ImageView menuButton = (ImageView) findViewById(R.id.menuButton);
        if(menuButton != null) {
            menuButton.setOnClickListener(new View.OnClickListener() {
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
            });
        }

    }


}
