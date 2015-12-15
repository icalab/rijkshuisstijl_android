package nl.han.ica.icalab.rijkshuisstijl;

/**
 * This is the class that wires up the rh_menu fragment buttons. Add your own button handling code.
 */
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class RHMenuFragment extends Fragment {

    private View inflatedView;
    private ViewGroup container;


    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle b)
    {

        this.container = container;

        this.inflatedView = inflater.inflate(
                R.layout.rh_menu_fragment,
                this.container,
                false);

        // Wire up the buttons.

        // The home button.
        ((LinearLayout) this.inflatedView.findViewById(R.id.menu_button_home))
                .setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), RHStartScreen.class);
                        startActivity(intent);
                    }
                });

        // Add handlers for other buttons as needed.
        return this.inflatedView;
    }






}
