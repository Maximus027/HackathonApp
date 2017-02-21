package nyc.c4q.maxrosado.hackathonapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static nl.qbusict.cupboard.CupboardFactory.cupboard;

/**
 * Created by tarynking on 2/19/17.
 */

public class CreateFitEventDatabaseHelper extends SQLiteOpenHelper {

    //create constant values for our database name and version number
    private static final String DATABASE_NAME = "fitnessActivity.db";
    private static final String TABLE_NAME = "CREATE GAME";
    private static final int DATABASE_VERSION = 1;
    public static final String COL_1 = "NAME";
    public static final String COL_2 = "DATE";
    public static final String COL_3 = "TIME";
    public static final String COL_4 = "SKILL";

    private static CreateFitEventDatabaseHelper instance;

    public static synchronized CreateFitEventDatabaseHelper getInstance(Context context) {
        if (instance == null) {
            instance = new CreateFitEventDatabaseHelper(context.getApplicationContext());
        }
        return instance;
    }

    public CreateFitEventDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table" + TABLE_NAME + "(NAME TEXT, DATE INTEGER,TIME INTEGER, SKILL TEXT)");
        db.execSQL("DROP TABLE IF IT EXISTS " + TABLE_NAME);
        onCreate(db);
        // cupboard().withDatabase(db).createTables();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this will upgrade tables, adding columns and new tables.
        // Note that existing columns will not be converted
        cupboard().withDatabase(db).upgradeTables();
    }

    public boolean insertData(String name, int date, int time, String skill) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, name);
        contentValues.put(COL_2, date);
        contentValues.put(COL_3, time);
        contentValues.put(COL_4, skill);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }


}

