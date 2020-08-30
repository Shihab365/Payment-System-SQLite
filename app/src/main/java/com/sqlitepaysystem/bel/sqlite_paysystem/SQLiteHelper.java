package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="PaySystem_DBS";
    private static final String TABLE_NAME1="SignUp_DBS";
    private static final int VERSION_NUMBER=1;
    private static final String FULL_NAME="fullname";
    private static final String MOBILE="mobile";
    private static final String USERNAME="username";
    private static final String PASSWORD="password";
    private static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME1+"("+FULL_NAME+" VARCHAR(100),"+MOBILE+" VARCHAR(100) PRIMARY KEY,  "+USERNAME+" VARCHAR(100), "+PASSWORD+" VARCHAR(100));";
    private static final String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME1;
    private static final String SELECT_TABLE="SELECT * FROM "+TABLE_NAME1;
    private Context context;

    public SQLiteHelper(Context context) {
        super(context, TABLE_NAME1, null, VERSION_NUMBER);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try{
            db.execSQL(CREATE_TABLE);
        }catch(Exception e)
        {
            Toast.makeText(context, "Exception: "+e, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try{
            db.execSQL(DROP_TABLE);
            onCreate(db);
        }catch(Exception e)
        {
            Toast.makeText(context, "Exception: "+e, Toast.LENGTH_SHORT).show();
        }
    }

    public long userInfo(String name,String mobile,String username,String password)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(FULL_NAME,name);
        contentValues.put(MOBILE,mobile);
        contentValues.put(USERNAME,username);
        contentValues.put(PASSWORD,password);
       long rowID=sqLiteDatabase.insert(TABLE_NAME1,null,contentValues);
       return rowID;
    }
    public Cursor loginInfo()
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(SELECT_TABLE,null);
        return  cursor;
    }
}
