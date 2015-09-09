package cytven.desarrollo.cenatel.com.cytven;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    public static final String N_BD = "BD_app_presidencia";
    public static final int VERSION_BD = 1;
    public static final String N_TABLA = "Tabla_Cytven";
    public static final String ID_FILA = "id";
    public static final String Pregunta1 = "pregunta1";
    public static final String Pregunta2 = "pregunta2";
    public static final String Pregunta3 = "pregunta3";
    public static final String Pregunta4 = "pregunta4";
    public static final String Pregunta5 = "pregunta5";
    public static final String Pregunta6 = "pregunta6";
    public static final String Pregunta7 = "pregunta7";
    public static final String Pregunta8 = "pregunta8";
    public static final String Pregunta9 = "pregunta9";
    public static final String Pregunta10 = "pregunta10";
    public static final String Pregunta11 = "pregunta11";
    public static final String Pregunta12 = "pregunta12";
    public static final String Sugerencia = "sugerencia";


    private final String sql = "CREATE TABLE " + N_TABLA +
            "(" +
            ID_FILA + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            Pregunta1 + " TEXT NOT NULL, " +
            Pregunta2 + " TEXT NOT NULL, " +
            Pregunta3 + " TEXT NOT NULL, " +
            Pregunta4 + " TEXT NOT NULL, " +
            Pregunta5 + " TEXT NOT NULL, " +
            Pregunta6 + " TEXT NOT NULL, " +
            Pregunta7 + " TEXT NOT NULL, " +
            Pregunta8 + " TEXT NOT NULL, " +
            Pregunta9 + " TEXT NOT NULL, " +
            Pregunta10 + " TEXT NOT NULL, " +
            Pregunta11 + " TEXT NOT NULL, " +
            Pregunta12 + " TEXT NOT NULL, " +
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