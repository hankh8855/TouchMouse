package com.touch.trust.touchmouse.data.source.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Han on 2017-04-19.
 */

public class SampleDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME="TouchMouse.db";
    private static final String TEXT_TYPE=" TEXT";
    private static final String COMMA_SEP=",";

    private static final String SQL_CREATE_WEEKLY =
            "CREATE TABLE " + SamplePersistenceContract.SampleEntry.TABLE_NAME + " (" +
                    SamplePersistenceContract.SampleEntry._ID+" PRIMARY KEY, " +
                    SamplePersistenceContract.SampleEntry.COLOUM_NAME_x + TEXT_TYPE + COMMA_SEP +
                    SamplePersistenceContract.SampleEntry.COLOUM_NAME_y + TEXT_TYPE + COMMA_SEP +
                    SamplePersistenceContract.SampleEntry.COLOUM_NAME_act + TEXT_TYPE + COMMA_SEP +
                    SamplePersistenceContract.SampleEntry.COLOUM_NAME_DATE + TEXT_TYPE +
            " )";

    public SampleDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_WEEKLY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
