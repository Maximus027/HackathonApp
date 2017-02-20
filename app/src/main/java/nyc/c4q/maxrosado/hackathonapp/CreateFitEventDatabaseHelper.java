package nyc.c4q.maxrosado.hackathonapp;

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
    private static final int DATABASE_VERSION = 1;

    //making this class a Singleton class - only capable of having a single instance
    private static CreateFitEventDatabaseHelper instance;

    //get our single instance, sychronized so that multiple threads will be blocked if one is using this method
    public static synchronized CreateFitEventDatabaseHelper getInstance(Context context) {
        if (instance == null) {
            instance = new CreateFitEventDatabaseHelper(context.getApplicationContext());
        }
        return instance;
    }

    //create a private constructor so that we can't instantiate a new EventsDatabaseHelper outside this class
    private CreateFitEventDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    static {
        //register our models (tables in our database)
        //cupboard().register(DatabaseEvents.class);
        //cupboard().register(DatabasePlace.class);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // this will ensure that all tables are created
        cupboard().withDatabase(db).createTables();
        // add indexes and other database tweaks in this method if you want
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this will upgrade tables, adding columns and new tables.
        // Note that existing columns will not be converted
        cupboard().withDatabase(db).upgradeTables();
        // do migration work if you have an alteration to make to your schema here
    }

}

