package com.example.stockm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("dbharry", "Bro you have ");


    }
    public void new_user(View view){
        Intent intent = new Intent(this,New_User.class);
        Toast.makeText(this,"Creating New id",Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }


    public void login(View view){
        Intent intent = new Intent(this, User1.class);
        Toast.makeText(this, "Logging in ...", Toast.LENGTH_SHORT).show();
        startActivity(intent);
        EditText editText=findViewById(R.id.editText);
        EditText editText2=findViewById(R.id.editText2);
        String s=editText.getText().toString();
        String ss=editText2.getText().toString();
        String a="aviral";
        String p="avi@987@";
        if((s.equals(a))&&(ss.equals(p))) {


        }
    }
}
