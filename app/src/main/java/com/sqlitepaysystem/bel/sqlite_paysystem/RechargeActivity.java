package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RechargeActivity extends AppCompatActivity {

    CardView gpCard,robiCard,airtelCard,banglalinkCard,teletalkCard,skittoCard;
    Dialog mDialog;
    Button cButton;
    private EditText editNum,editAmt;
    String currentDate,currentTime;
    SQLiteHelper2 sqLiteHelper2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Mobile recharge");

        //Back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sqLiteHelper2=new SQLiteHelper2(this);
        mDialog=new Dialog(this);

        gpCard=(CardView)findViewById(R.id.card_gp_id);
        robiCard=(CardView)findViewById(R.id.card_robi_id);
        airtelCard=(CardView)findViewById(R.id.card_airtel_id);
        banglalinkCard=(CardView)findViewById(R.id.card_bang_id);
        teletalkCard=(CardView)findViewById(R.id.card_tel_id);
        skittoCard=(CardView)findViewById(R.id.card_skitto_id);

        gpCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog.setContentView(R.layout.popup_dialog);
                cButton=(Button)mDialog.findViewById(R.id.confirm_button_id);
                editNum=(EditText) mDialog.findViewById(R.id.mobilenumber_id);
                editAmt=(EditText) mDialog.findViewById(R.id.rech_amount_id);
                cButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempNum=editNum.getText().toString();
                        String tempAmt=editAmt.getText().toString();
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());

                        long rowID=sqLiteHelper2.payAmount(tempNum,tempAmt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Success", Toast.LENGTH_SHORT).show();
                            editNum.setText("");
                            editAmt.setText("");
                            mDialog.dismiss();
                        }
                    }
                });
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        robiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.setContentView(R.layout.popup_dialog);
                cButton=(Button)mDialog.findViewById(R.id.confirm_button_id);
                editNum=(EditText) mDialog.findViewById(R.id.mobilenumber_id);
                editAmt=(EditText) mDialog.findViewById(R.id.rech_amount_id);
                cButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempNum=editNum.getText().toString();
                        String tempAmt=editAmt.getText().toString();
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());
                        long rowID=sqLiteHelper2.payAmount(tempNum,tempAmt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Success", Toast.LENGTH_SHORT).show();
                            editNum.setText("");
                            editAmt.setText("");
                            mDialog.dismiss();
                        }
                    }
                });
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        airtelCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.setContentView(R.layout.popup_dialog);
                cButton=(Button)mDialog.findViewById(R.id.confirm_button_id);
                editNum=(EditText) mDialog.findViewById(R.id.mobilenumber_id);
                editAmt=(EditText) mDialog.findViewById(R.id.rech_amount_id);
                cButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempNum=editNum.getText().toString();
                        String tempAmt=editAmt.getText().toString();
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());
                        long rowID=sqLiteHelper2.payAmount(tempNum,tempAmt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Success", Toast.LENGTH_SHORT).show();
                            editNum.setText("");
                            editAmt.setText("");
                            mDialog.dismiss();
                        }
                    }
                });
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        banglalinkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.setContentView(R.layout.popup_dialog);
                cButton=(Button)mDialog.findViewById(R.id.confirm_button_id);
                editNum=(EditText) mDialog.findViewById(R.id.mobilenumber_id);
                editAmt=(EditText) mDialog.findViewById(R.id.rech_amount_id);
                cButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempNum=editNum.getText().toString();
                        String tempAmt=editAmt.getText().toString();
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());
                        long rowID=sqLiteHelper2.payAmount(tempNum,tempAmt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Success", Toast.LENGTH_SHORT).show();
                            editNum.setText("");
                            editAmt.setText("");
                            mDialog.dismiss();
                        }
                    }
                });
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        teletalkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.setContentView(R.layout.popup_dialog);
                cButton=(Button)mDialog.findViewById(R.id.confirm_button_id);
                editNum=(EditText) mDialog.findViewById(R.id.mobilenumber_id);
                editAmt=(EditText) mDialog.findViewById(R.id.rech_amount_id);
                cButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempNum=editNum.getText().toString();
                        String tempAmt=editAmt.getText().toString();
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());
                        long rowID=sqLiteHelper2.payAmount(tempNum,tempAmt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Success", Toast.LENGTH_SHORT).show();
                            editNum.setText("");
                            editAmt.setText("");
                            mDialog.dismiss();
                        }
                    }
                });
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        skittoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.setContentView(R.layout.popup_dialog);
                cButton=(Button)mDialog.findViewById(R.id.confirm_button_id);
                editNum=(EditText) mDialog.findViewById(R.id.mobilenumber_id);
                editAmt=(EditText) mDialog.findViewById(R.id.rech_amount_id);
                cButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempNum=editNum.getText().toString();
                        String tempAmt=editAmt.getText().toString();
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());
                        long rowID=sqLiteHelper2.payAmount(tempNum,tempAmt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(RechargeActivity.this, "Recharge Success", Toast.LENGTH_SHORT).show();
                            editNum.setText("");
                            editAmt.setText("");
                            mDialog.dismiss();
                        }
                    }
                });
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
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
