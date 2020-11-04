package com.example.stockm.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import com.example.stockm.params.Params;


public class DbHandler extends SQLiteOpenHelper {
    public DbHandler(Context context){
        super(context, "Stocks",null, Params.DB_VERSION);
    }


     //Creating the table in database
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("dbharry", "Bro you have////// ");
        String create="CREATE TABLE "+ Params.TABLE_NAME+"("+Params.KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+Params. KEY_NAME
                +" TEXT,"+Params.KEY_PASSWORD+" TEXT"+Params.KEY_PHONE+"TEXT"+")";
        db.execSQL(create);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean insertData(String name,String password,String phone_number){
        SQLiteDatabase sqdb= this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Params.KEY_NAME,name);
        contentValues.put(Params.KEY_PASSWORD,password);
        contentValues.put(Params.KEY_PHONE,phone_number);
        long result= sqdb.insert(Params.TABLE_NAME,null,contentValues);
        if(result==-1)

            return false;
        else
            return true;
    }
}
