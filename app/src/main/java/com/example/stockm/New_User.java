package com.example.stockm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.stockm.data.DbHandler;

public class New_User extends AppCompatActivity {
    Button btnAddData;
    EditText editText7;
    EditText editText8;
    EditText editText9;
    DbHandler myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__user);
        DbHandler myDb = new DbHandler(this);
        EditText editText7=findViewById(R.id.editText7);
        EditText editText8=findViewById(R.id.editText8);
        EditText editText9=findViewById(R.id.editText9);
        Button btnAddData=findViewById(R.id.button6);

    }
    public void addData(View view){

                        DbHandler myDb = new DbHandler(New_User.this);
                        boolean isInserted=myDb.insertData(editText7.getText().toString(),editText8.getText().toString(),editText9.getText().toString());
                        if(isInserted==true)
                            Toast.makeText(New_User.this,"data inserted",Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(New_User.this,"data not inserted",Toast.LENGTH_SHORT).show();


    }
}
