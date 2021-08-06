package com.konstantin_romashenko.sqllitejava.db;

public class MyConstants
{
    public static final String TABLE_NAME = "my_table";
    public static final String _ID = "_id";
    public static final String TITLE = "title";
    public static final String DISCRIPTION = "description";
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "my_db.db";
    public static final String TABLE_CREATE_STRUCTURE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
             _ID + " INTEGER PRIMARY KEY, " + TITLE + " TEXT, " + DISCRIPTION + " TEXT)";

    public static final String DROP_TABLE = "DROP TABLE IS EXISTS " + TABLE_NAME;
}
