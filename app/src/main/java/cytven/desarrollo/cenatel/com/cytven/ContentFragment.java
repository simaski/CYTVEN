package cytven.desarrollo.cenatel.com.cytven;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Admin on 04-06-2015.
 */
public class ContentFragment extends Fragment {
    //********************Spinner*******************//
    public static Spinner spi_pregunta1;
    public static Spinner spi_pregunta2;
    public static Spinner spi_pregunta3;
    public static Spinner spi_pregunta4;
    public static Spinner spi_pregunta5;
    public static Spinner spi_pregunta6;
    public static Spinner spi_pregunta7;
    public static Spinner spi_pregunta8;
    public static Spinner spi_pregunta9;
    public static Spinner spi_pregunta10;
    public static Spinner spi_pregunta11;
    public static Spinner spi_pregunta12;

    //********************String********************//
    public static String st_spi_pregunta1R;
    public static String st_spi_pregunta2R;
    public static String st_spi_pregunta3R;
    public static String st_spi_pregunta4R;
    public static String st_spi_pregunta5R;
    public static String st_spi_pregunta6R;
    public static String st_spi_pregunta7R;
    public static String st_spi_pregunta8R;
    public static String st_spi_pregunta9R;
    public static String st_spi_pregunta10R;
    public static String st_spi_pregunta11R;
    public static String st_spi_pregunta12R;
    public static String st_et_sugerencia;

    //********************Button*********************//
    public static Button bt_Enviar;
    public static Button bt_Ver;

    //********************EditText*******************//
    public static EditText et_sugerencia;

    //*******************SQlite**********************//
    private SQLite sqlite;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_fragment, container, false);

        et_sugerencia = (EditText) v.findViewById(R.id.et_sugerencias);

        spi_pregunta1 = (Spinner) v.findViewById(R.id.spi_pregunta1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta1.setAdapter(adapter);
        spi_pregunta1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta1R = spi_pregunta1.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta2 = (Spinner) v.findViewById(R.id.spi_pregunta2);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion2, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta2.setAdapter(adapter1);
        spi_pregunta2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta2R = spi_pregunta2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta3 = (Spinner) v.findViewById(R.id.spi_pregunta3);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion1, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta3.setAdapter(adapter2);
        spi_pregunta3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta3R = spi_pregunta3.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta4 = (Spinner) v.findViewById(R.id.spi_pregunta4);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion2, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta4.setAdapter(adapter3);
        spi_pregunta4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta4R = spi_pregunta4.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta5 = (Spinner) v.findViewById(R.id.spi_pregunta5);
        ArrayAdapter adapter4 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion1, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta5.setAdapter(adapter4);
        spi_pregunta5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta5R = spi_pregunta5.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta6 = (Spinner) v.findViewById(R.id.spi_pregunta6);
        ArrayAdapter adapter5 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion1, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta6.setAdapter(adapter5);
        spi_pregunta6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta6R = spi_pregunta6.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta7 = (Spinner) v.findViewById(R.id.spi_pregunta7);
        ArrayAdapter adapter6 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion3, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta7.setAdapter(adapter6);
        spi_pregunta7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta7R = spi_pregunta7.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta8 = (Spinner) v.findViewById(R.id.spi_pregunta8);
        ArrayAdapter adapter7 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion4, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta8.setAdapter(adapter7);
        spi_pregunta8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta8R = spi_pregunta8.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta9 = (Spinner) v.findViewById(R.id.spi_pregunta9);
        ArrayAdapter adapter8 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion5, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta9.setAdapter(adapter8);
        spi_pregunta9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta9R = spi_pregunta9.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta10 = (Spinner) v.findViewById(R.id.spi_pregunta10);
        ArrayAdapter adapter9 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion6, android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta10.setAdapter(adapter9);
        spi_pregunta10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta10R = spi_pregunta10.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta11 = (Spinner) v.findViewById(R.id.spi_pregunta11);
        ArrayAdapter adapter10 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion2, android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta11.setAdapter(adapter10);
        spi_pregunta11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta11R = spi_pregunta11.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spi_pregunta12 = (Spinner) v.findViewById(R.id.spi_pregunta12);
        ArrayAdapter adapter11 = ArrayAdapter.createFromResource(getActivity(), R.array.arr_opcion7, android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spi_pregunta12.setAdapter(adapter11);
        spi_pregunta12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st_spi_pregunta12R = spi_pregunta12.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        bt_Enviar = (Button) v.findViewById(R.id.bt_enviar);
        bt_Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* progressBar = new ProgressDialog(v.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("Subiendo Archivos ...");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBarStatus = 0;*/
//                Toast.makeText(getActivity(), "hola", Toast.LENGTH_SHORT).show();
                /*if (et_funcionario.getText().toString().equals("")) {
                    CamposVacios();
                } else if (et_nombreParticipante.getText().toString().equals("")) {
                    CamposVacios();
                } else {
                    //progressBar.show();
                    et_funcionarioR = et_funcionario.getText().toString();
                    et_fechaCapturaR = et_fechaCaptura.getText().toString();
                    et_ubicacionR = spi_ubicacionR;
                    et_nombreParticpanteR = et_nombreParticipante.getText().toString();
                    et_observacionR = et_observacion.getText().toString();*/

                st_et_sugerencia = et_sugerencia.getText().toString();

                    new MyAsyncTask(getActivity()).execute();


                    sqlite = new SQLite(getActivity());
                    sqlite.abrir();
                    sqlite.addRegistro(st_spi_pregunta1R, st_spi_pregunta2R, st_spi_pregunta3R, st_spi_pregunta4R, st_spi_pregunta5R, st_spi_pregunta6R, st_spi_pregunta7R, st_spi_pregunta8R,
                            st_spi_pregunta9R, st_spi_pregunta10R, st_spi_pregunta11R, st_spi_pregunta12R, st_et_sugerencia);
                    sqlite.cerrar();
                    et_sugerencia.setText("");

               // }
            }
        });

        return v;
    }

    //@SuppressLint("NewApi")
    public class MyAsyncTask extends AsyncTask<String, Void, String> {

        private static final int REGISTRATION_TIMEOUT = 3 * 1000;
        private static final int WAIT_TIMEOUT = 30 * 1000;
        private final HttpClient httpclient = new DefaultHttpClient();

        final HttpParams params = httpclient.getParams();
        HttpResponse response;
        private String content =  null;
        private boolean error = false;

        private Context mContext;
        private int NOTIFICATION_ID = 1;
        private Notification mNotification;
        private NotificationManager mNotificationManager;


        public MyAsyncTask(Context context){

            this.mContext = context;

            //Get the notification manager
            mNotificationManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);

        }


        protected void onPreExecute() {
            //createNotification("Data download is in progress","");
            //pb.setVisibility(View.GONE);
            //progressBar.show();
            Toast.makeText(mContext, "Envio de datos en progreso", Toast.LENGTH_LONG).show();

        }

        protected String doInBackground(String... urls) {

            String URL = null;
			/*String param1 = etNombre.getText().toString();
			String param2 = etClave.getText().toString();*/

            /*for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(50);
                    progressBar.setProgress(i + 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/

            ArrayList<NameValuePair> postValores = new ArrayList<NameValuePair>();
            postValores.add(new BasicNameValuePair("Pregunta1", st_spi_pregunta1R));
            postValores.add(new BasicNameValuePair("Pregunta2", st_spi_pregunta2R));
            postValores.add(new BasicNameValuePair("Pregunta3", st_spi_pregunta3R));
            postValores.add(new BasicNameValuePair("Pregunta4", st_spi_pregunta4R));
            postValores.add(new BasicNameValuePair("Pregunta5", st_spi_pregunta5R));
            postValores.add(new BasicNameValuePair("Pregunta6", st_spi_pregunta6R));
            postValores.add(new BasicNameValuePair("Pregunta7", st_spi_pregunta7R));
            postValores.add(new BasicNameValuePair("Pregunta8", st_spi_pregunta8R));
            postValores.add(new BasicNameValuePair("Pregunta9", st_spi_pregunta9R));
            postValores.add(new BasicNameValuePair("Pregunta10", st_spi_pregunta10R));
            postValores.add(new BasicNameValuePair("Pregunta11", st_spi_pregunta11R));
            postValores.add(new BasicNameValuePair("Pregunta12", st_spi_pregunta12R));
            postValores.add(new BasicNameValuePair("Sugerencia", st_et_sugerencia));


            String respuesta = null;
            try {
                respuesta=CustomHttpClient.executeHttpPost("http://apirest.fii.gob.ve/encuesta/", postValores);
                //respuesta = CustomHttpClient.ejecutaHttpPost("http://cenatelgeo.fii.gob.ve/insertar.php", postValores);
                //res = respuesta.toString();
            } catch (ClientProtocolException e) {
                // TODO Auto-generated catch block
                Log.w("HTTP2:", e);
                content = e.getMessage();
                error = true;
                cancel(true);
            } catch (IOException e) {
                Log.w("HTTP3:",e );
                content = e.getMessage();
                error = true;
                cancel(true);
            }catch (Exception e) {
                Log.w("HTTP4:",e );
                content = e.getMessage();
                error = true;
                cancel(true);
            }


            return content;
        }

        protected void onProgressUpdate(Integer... progress){
            //pb.setProgress(progress[0]);
        }

        protected void onCancelled() {
            //createNotification("Error occured during data download",content);
            //pb.setVisibility(View.GONE);
            //progressBar.dismiss();
            Toast.makeText(mContext, "Error ocurrido durante la transmision de los datos. Por favor revisa tu conexion a Internet..!", Toast.LENGTH_LONG).show();
        }

        protected void onPostExecute(String content) {
            if (error) {
                //createNotification("Data download ended abnormally!",content);
                //pb.setVisibility(View.GONE);
                //progressBar.dismiss();
                Toast.makeText(mContext, "Envio de datos Anormales", Toast.LENGTH_LONG).show();
            } else {
                //createNotification("Data download is complete!","");
                //pb.setVisibility(View.GONE);
                //progressBar.dismiss();
                Toast.makeText(mContext, "Envio de datos Completo!!!!", Toast.LENGTH_LONG).show();
                //tvResultado.setText("Bienvenidos a JavaAndroid");
            }
        }

    }

}
