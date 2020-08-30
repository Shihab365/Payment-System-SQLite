package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView nameText,mobText,userText,passText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Your profile");

        //Back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nameText=(TextView)findViewById(R.id.pro_name_id);
        mobText=(TextView)findViewById(R.id.pro_mobile_id);
        userText=(TextView)findViewById(R.id.pro_username_id);
        passText=(TextView)findViewById(R.id.pro_password_id);

        Bundle b=getIntent().getExtras();
        if(b!=null)
        {
            String pName=(String)b.get("UFN");
            String pMobile=(String)b.get("UMB");
            String pUsername=(String)b.get("USR");
            String pPassword=(String)b.get("UPS");

            nameText.setText(pName);
            mobText.setText(pMobile);
            userText.setText(pUsername);
            passText.setText(pPassword);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
