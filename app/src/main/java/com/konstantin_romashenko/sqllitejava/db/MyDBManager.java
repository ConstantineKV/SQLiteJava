package com.konstantin_romashenko.sqllitejava.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class MyDBManager
{
    private Context context;
    private MyDBHelper myDBHelper;
    private SQLiteDatabase db;

    public MyDBManager(Context context)
    {
        this.context = context;
        myDBHelper = new MyDBHelper(context);
    }
    public void openDB()
    {
        db = myDBHelper.getWritableDatabase();
    }

    public void insertToDB(String title, String discription)
    {
        ContentValues cv = new ContentValues();
        cv.put(MyConstants.TITLE, title);
        cv.put(MyConstants.DISCRIPTION, discription);
        db.insert(MyConstants.TABLE_NAME, null, cv);
    }

    public List<String> getFromDB()
    {
        List<String> tempList = new ArrayList<>();
        Cursor cursor = db.query(MyConstants.TABLE_NAME, null, null, null,
                null, null, null);
        while(cursor.moveToNext())
        {
            String title = cursor.getString(cursor.getColumnIndex(MyConstants.TITLE));
            tempList.add(title);

        }
        cursor.close();
        return tempList;
    }

    public void closeDB()
    {
        myDBHelper.close();
    }
}
