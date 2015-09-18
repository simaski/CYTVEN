package cytven.desarrollo.cenatel.com.cytven;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by San Casimiro on 18/09/2015.
 */
public class ContactoFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.contacto_fragment, container, false);
        ((MainActivity) getActivity()).setVariable(1);

        return v;
    }
}
