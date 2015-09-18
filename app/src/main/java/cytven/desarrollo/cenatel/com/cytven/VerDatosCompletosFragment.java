package cytven.desarrollo.cenatel.com.cytven;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 04-06-2015.
 */
public class VerDatosCompletosFragment extends Fragment {
    private TextView textView;
    private SQLite sqlite;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_datoscompletos,container,false);
        ((MainActivity) getActivity()).setVariable(2);


        textView = (TextView) v.findViewById(R.id.txtResultado);
        textView.setText( ""  );
        int j = getArguments().getInt("Key");
        sqlite = new SQLite(getActivity());
        sqlite.abrir();
        Cursor cursor = sqlite.getRegistro(j);
        ArrayList<String> reg = sqlite.getFormatListUniv(cursor);
        textView.setText( reg.get(0)  );
        return v;
    }

}