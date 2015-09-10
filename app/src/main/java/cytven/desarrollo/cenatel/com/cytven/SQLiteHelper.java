package cytven.desarrollo.cenatel.com.cytven;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    public static final String N_BD = "app_presidencia";
    public static final int VERSION_BD = 1;
    public static final String N_TABLA = "apprest_encuesta";
    public static final String ID_FILA = "id";
    public static final String pregunta1 = "pregunta1";
    public static final String pregunta2 = "pregunta2";
    public static final String pregunta3 = "pregunta3";
    public static final String pregunta4 = "pregunta4";
    public static final String pregunta5 = "pregunta5";
    public static final String pregunta6 = "pregunta6";
    public static final String pregunta7 = "pregunta7";
    public static final String pregunta8 = "pregunta8";
    public static final String pregunta9 = "pregunta9";
    public static final String pregunta10 = "pregunta10";
    public static final String pregunta11 = "pregunta11";
    public static final String pregunta12 = "pregunta12";
    public static final String Sugerencia = "sugerencia";


    private final String sql = "CREATE TABLE " + N_TABLA +
            "(" +
            ID_FILA + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            pregunta1 + " TEXT NOT NULL, " +
            pregunta2 + " TEXT NOT NULL, " +
            pregunta3 + " TEXT NOT NULL, " +
            pregunta4 + " TEXT NOT NULL, " +
            pregunta5 + " TEXT NOT NULL, " +
            pregunta6 + " TEXT NOT NULL, " +
            pregunta7 + " TEXT NOT NULL, " +
            pregunta8 + " TEXT NOT NULL, " +
            pregunta9 + " TEXT NOT NULL, " +
            pregunta10 + " TEXT NOT NULL, " +
            pregunta11 + " TEXT NOT NULL, " +
            pregunta12 + " TEXT NOT NULL, " +
            Sugerencia + " TEXT NOT NULL" + " )";

    /**
     * Constructor de clase
     * */
    public SQLiteHelper(Context context) {
        super( context, N_BD, null, VERSION_BD );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL( sql );
    }

    @Override
    public void onUpgrade( SQLiteDatabase db,  int oldVersion, int newVersion ) {
        if ( newVersion > oldVersion )
        {
            //elimina tabla
            db.execSQL( "DROP TABLE IF EXISTS " + N_TABLA );
            //y luego creamos la nueva tabla
            db.execSQL( sql );
        }
    }

}