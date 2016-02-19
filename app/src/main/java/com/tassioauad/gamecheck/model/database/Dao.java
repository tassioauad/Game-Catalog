package com.tassioauad.gamecheck.model.database;

import android.database.sqlite.SQLiteDatabase;

public class Dao {

    private SQLiteDatabase database;

    public Dao(SQLiteDatabase database) {
        this.database = database;
    }

    public SQLiteDatabase getDatabase() {
        return database;
    }
}
