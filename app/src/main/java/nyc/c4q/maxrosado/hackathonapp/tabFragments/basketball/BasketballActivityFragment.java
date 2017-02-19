package nyc.c4q.maxrosado.hackathonapp.tabFragments.basketball;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.maxrosado.hackathonapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BasketballActivityFragment extends Fragment {

    public BasketballActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_basketball, container, false);
    }
}
