package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText userEdit,passEdit;
    private TextView sign_text;
    private Button loginButton;
    SQLiteHelper sqLiteHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        sqLiteHelper=new SQLiteHelper(this);

        userEdit=(EditText)findViewById(R.id.log_username_id);
        passEdit=(EditText)findViewById(R.id.log_password_id);
        loginButton=(Button)findViewById(R.id.login_button_id);
        sign_text=(TextView)findViewById(R.id.signup_text_id);

        sign_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SignUpActivity.class));
            }
        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String eName=userEdit.getText().toString();
                String ePass=passEdit.getText().toString();
                Boolean infoVerify=true;

                Cursor cursor=sqLiteHelper.loginInfo();
                if(cursor.getCount()==0)
                {
                    Toast.makeText(MainActivity.this, "No Data Found", Toast.LENGTH_SHORT).show();
                }
                String uName="", uPass="", uFName="", uMob="";
                while (cursor.moveToNext())
                {
                    uFName=cursor.getString(0);
                    uMob=cursor.getString(1);
                    uName=cursor.getString(2);
                    uPass=cursor.getString(3);

                    if(eName.equals(uName) && ePass.equals(uPass))
                    {
                        Intent intent=new Intent(MainActivity.this,NavigationActivity.class);
                        intent.putExtra("UFN",uFName);
                        intent.putExtra("UMB",uMob);
                        intent.putExtra("USR",uName);
                        intent.putExtra("UPS",uPass);
                        startActivity(intent);
                        infoVerify=false;
                    }
                }
                if(infoVerify)
                {
                    Toast.makeText(MainActivity.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
