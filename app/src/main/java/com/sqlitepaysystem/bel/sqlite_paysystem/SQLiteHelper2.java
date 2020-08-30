package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

public class SQLiteHelper2 extends SQLiteOpenHelper {

    private static final String DATABASE_NAME2="Recharge_db";
    private static final String TABLE_NAME2="History_DBS";
    private static final int VERSION_NUMBER2=2;
    private static final String ID="id";
    private static final String MOBILE_NUMBER="mobilenumber";
    private static final String AMOUNT="amount";
    private static final String CURRENT_DATE="currentdata";
    private static final String CURRENT_TIME="currenttime";
    private static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME2+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+MOBILE_NUMBER+" VARCHAR(20), "+AMOUNT+" VARCHAR(10), "+CURRENT_DATE+" VARCHAR(30), "+CURRENT_TIME+" VARCHAR(30));";
    private static final String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME2;
    private static final String SELECT_TABLE2="SELECT * FROM "+TABLE_NAME2;
    private static final String DELETE_TABLE2="DELETE FROM "+TABLE_NAME2;
    private Context context;

    public SQLiteHelper2(Context context) {
        super(context, TABLE_NAME2, null, VERSION_NUMBER2);
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
    public long payAmount(String mobileNum,String moneyAmt,String cDate,String cTime)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(MOBILE_NUMBER,mobileNum);
        contentValues.put(AMOUNT,moneyAmt);
        contentValues.put(CURRENT_DATE,cDate);
        contentValues.put(CURRENT_TIME,cTime);
        long rowID=sqLiteDatabase.insert(TABLE_NAME2,null,contentValues);
        return rowID;
    }
    public ArrayList<Rech_storage> hisView()
    {
        ArrayList<Rech_storage> arrayList=new ArrayList<>();
        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(SELECT_TABLE2,null);
        while(cursor.moveToNext())
        {
            String mobile=cursor.getString(1);
            String amount=cursor.getString(2)+" taka";
            String date=cursor.getString(3);
            String time=cursor.getString(4);

            Rech_storage rech_storage=new Rech_storage(mobile,amount,date,time);
            arrayList.add(rech_storage);
        }
        return arrayList;
    }
    public void deleteData()
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        sqLiteDatabase.execSQL(DELETE_TABLE2);
    }
}
