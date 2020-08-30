package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class NavigationActivity extends AppCompatActivity {

    private CardView mobRecharge,utiPayment,payHistory,yourProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        mobRecharge=(CardView)findViewById(R.id.card_recharge_id);
        utiPayment=(CardView)findViewById(R.id.card_utility_id);
        payHistory=(CardView)findViewById(R.id.card_history_id);
        yourProfile=(CardView)findViewById(R.id.card_profile_id);

        Bundle bundle=getIntent().getExtras();

        final String str1=(String)bundle.getString("UFN");
        final String str2=(String)bundle.getString("UMB");
        final String str3=(String)bundle.getString("USR");
        final String str4=(String)bundle.getString("UPS");

        mobRecharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,RechargeActivity.class));
            }
        });
        utiPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,UtilityActivity.class));
            }
        });
        payHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this,HistoryActivity.class));
            }
        });
        yourProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NavigationActivity.this,ProfileActivity.class);
                intent.putExtra("UFN",str1);
                intent.putExtra("UMB",str2);
                intent.putExtra("USR",str3);
                intent.putExtra("UPS",str4);
                startActivity(intent);
            }
        });
    }
}
