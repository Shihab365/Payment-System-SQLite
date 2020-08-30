package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.app.Dialog;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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

public class UtilityActivity extends AppCompatActivity {

    CardView infCard,lubCard,dorjCard,easyCard,sopCard,agrCard;
    Dialog mDialog;
    EditText editAmount;
    Button buttonPay;
    String currentDate,currentTime;
    SQLiteHelper2 sqLiteHelper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utility);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Utility payment");

        //Back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sqLiteHelper2=new SQLiteHelper2(this);
        mDialog=new Dialog(this);

        infCard=(CardView)findViewById(R.id.card_infinity_id);
        lubCard=(CardView)findViewById(R.id.card_lubnan_id);
        dorjCard=(CardView)findViewById(R.id.card_dorjibari_id);
        easyCard=(CardView)findViewById(R.id.card_easy_id);
        sopCard=(CardView)findViewById(R.id.card_sopno_id);
        agrCard=(CardView)findViewById(R.id.card_agora_id);

        infCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog.setContentView(R.layout.pop_dialog2);
                editAmount=(EditText)mDialog.findViewById(R.id.pay_amount_id);
                buttonPay=(Button) mDialog.findViewById(R.id.pay_confirm_button_id);
                buttonPay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempAmnt=editAmount.getText().toString();
                        String tempBrand="Infinity";
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());

                        long rowID=sqLiteHelper2.payAmount(tempBrand,tempAmnt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Success", Toast.LENGTH_SHORT).show();
                            editAmount.setText("");
                            mDialog.dismiss();
                        }
                    }
                });

                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();

            }
        });
        lubCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog.setContentView(R.layout.pop_dialog2);
                editAmount=(EditText)mDialog.findViewById(R.id.pay_amount_id);
                buttonPay=(Button) mDialog.findViewById(R.id.pay_confirm_button_id);
                buttonPay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempAmnt=editAmount.getText().toString();
                        String tempBrand="Lubnan";
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());

                        long rowID=sqLiteHelper2.payAmount(tempBrand,tempAmnt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Success", Toast.LENGTH_SHORT).show();
                            editAmount.setText("");
                            mDialog.dismiss();
                        }
                    }
                });

                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        dorjCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog.setContentView(R.layout.pop_dialog2);
                editAmount=(EditText)mDialog.findViewById(R.id.pay_amount_id);
                buttonPay=(Button) mDialog.findViewById(R.id.pay_confirm_button_id);
                buttonPay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempAmnt=editAmount.getText().toString();
                        String tempBrand="Dorjibari";
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());

                        long rowID=sqLiteHelper2.payAmount(tempBrand,tempAmnt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Success", Toast.LENGTH_SHORT).show();
                            editAmount.setText("");
                            mDialog.dismiss();
                        }
                    }
                });

                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        easyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog.setContentView(R.layout.pop_dialog2);
                editAmount=(EditText)mDialog.findViewById(R.id.pay_amount_id);
                buttonPay=(Button) mDialog.findViewById(R.id.pay_confirm_button_id);
                buttonPay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempAmnt=editAmount.getText().toString();
                        String tempBrand="Easy";
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());

                        long rowID=sqLiteHelper2.payAmount(tempBrand,tempAmnt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Success", Toast.LENGTH_SHORT).show();
                            editAmount.setText("");
                            mDialog.dismiss();
                        }
                    }
                });

                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        sopCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog.setContentView(R.layout.pop_dialog2);
                editAmount=(EditText)mDialog.findViewById(R.id.pay_amount_id);
                buttonPay=(Button) mDialog.findViewById(R.id.pay_confirm_button_id);
                buttonPay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempAmnt=editAmount.getText().toString();
                        String tempBrand="Shwapno";
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());

                        long rowID=sqLiteHelper2.payAmount(tempBrand,tempAmnt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Success", Toast.LENGTH_SHORT).show();
                            editAmount.setText("");
                            mDialog.dismiss();
                        }
                    }
                });

                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });
        agrCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog.setContentView(R.layout.pop_dialog2);
                editAmount=(EditText)mDialog.findViewById(R.id.pay_amount_id);
                buttonPay=(Button) mDialog.findViewById(R.id.pay_confirm_button_id);
                buttonPay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tempAmnt=editAmount.getText().toString();
                        String tempBrand="Agora";
                        Calendar calendar=Calendar.getInstance();
                        SimpleDateFormat currentdate=new SimpleDateFormat("MMM dd,yyyy");
                        SimpleDateFormat currenttime=new SimpleDateFormat("hh:mm:ss aa");
                        currentDate=currentdate.format(calendar.getTime());
                        currentTime=currenttime.format(calendar.getTime());

                        long rowID=sqLiteHelper2.payAmount(tempBrand,tempAmnt,currentDate,currentTime);
                        if(rowID==-1)
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Failed", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            Toast.makeText(UtilityActivity.this, "Payment Success", Toast.LENGTH_SHORT).show();
                            editAmount.setText("");
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
