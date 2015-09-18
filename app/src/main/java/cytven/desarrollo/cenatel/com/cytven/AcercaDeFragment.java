package cytven.desarrollo.cenatel.com.cytven;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.v4.app.Fragment;

/**
 * Created by San Casimiro on 10/09/2015.
 */
public class AcercaDeFragment extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.acercade_fragment, container, false);
        ((MainActivity) getActivity()).setVariable(1);

        return v;
    }
}
