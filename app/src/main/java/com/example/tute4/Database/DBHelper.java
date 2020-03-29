package com.example.tute4.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "UserInfo.db";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DATABASE_NAME , null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_ENTRIES = "CREATE TABLE "+UsersMaster.Users.TABLE_NAME+"("+
                UsersMaster.Users._ID+" INTEGER PRIMARY KEY,"+
                UsersMaster.Users.COLOUMN_NAME_USERNAME +" TEXT,"+
                UsersMaster.Users.COLOUMN_NAME_PASSWORD + " TEXT)";
        //Use the details from the UsersMaster and Users classes we created.specify the primary key from the base coloumns

        db.execSQL(SQL_CREATE_ENTRIES); //This will execute the contents of SQL_CREATE_ENTRIES

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addInfo(String userName, String password){
        //Gets the data repository in write mode
        SQLiteDatabase db = getWritableDatabase();

        //Create a new map of values, where coloumn names the keys
        ContentValues Values = new ContentValues();
        Values.put(UsersMaster.Users.COLOUMN_NAME_USERNAME, userName);
        Values.put(UsersMaster.Users.COLOUMN_NAME_PASSWORD, password);

        long newRowId = db.insert(UsersMaster.Users.TABLE_NAME,null,Values);

    }

    public List reeadAllInfo()
    {
        SQLiteDatabase db = getReadableDatabase();

        //define a projection that specifies which coloumns from the database
        //You will actually use after this query

        String[] projection = {
                UsersMaster.Users._ID,
                UsersMaster.Users.COLOUMN_NAME_USERNAME,
                UsersMaster.Users.COLOUMN_NAME_PASSWORD
        };


    }
}
