package com.example.android.databaseworking;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by prashant on 23/4/17.
 */

public class GroupDatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "GroupsManager";
    private static final String TABLE_GROUP = "Group";
    // Group Table Columns names
    private static final String KEY_NAME = "name";
    private static final String KEY_LOCATION = "location";

    public GroupDatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_GROUP_TABLE = "CREATE TABLE " + TABLE_GROUP + "("+
                KEY_NAME + " TEXT,"               + KEY_LOCATION + " TEXT" + ")";
        db.execSQL(CREATE_GROUP_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GROUP);
        // Create tables again
        onCreate(db);
    }


}
