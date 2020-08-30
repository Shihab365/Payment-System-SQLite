package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private EditText fnameEdit,mobileEdit,usernameEdit,passwordEdit;
    private Button signupButton;
    SQLiteHelper sqLiteHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Sign Up");

        //Back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sqLiteHelper=new SQLiteHelper(this);

        fnameEdit=(EditText)findViewById(R.id.signup_fname_id);
        mobileEdit=(EditText)findViewById(R.id.signup_mobile_id);
        usernameEdit=(EditText)findViewById(R.id.signup_username_id);
        passwordEdit=(EditText)findViewById(R.id.signup_password_id);
        signupButton=(Button)findViewById(R.id.signup_button_id);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=fnameEdit.getText().toString();
                String mobile=mobileEdit.getText().toString();
                String username=usernameEdit.getText().toString();
                String password=passwordEdit.getText().toString();

                if(name.isEmpty() || mobile.isEmpty() || username.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(SignUpActivity.this, "Enter all information", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    long rowID=sqLiteHelper.userInfo(name,mobile,username,password);
                    if(rowID==-1)
                    {
                        Toast.makeText(SignUpActivity.this, "SignUp Failed", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent intent=new Intent(SignUpActivity.this,MainActivity.class);
                        intent.putExtra("FullName",name);
                        intent.putExtra("Mobile",mobile);
                        intent.putExtra("Username",username);
                        intent.putExtra("Password",password);
                        startActivity(intent);
                    }
                }
            }
        });
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
