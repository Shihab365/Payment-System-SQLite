package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.database.Cursor;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    ListView listView;
    SQLiteHelper2 sqLiteHelper2;
    CustomAdapter customAdapter;
    ArrayList<Rech_storage> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Payment history");

        //Back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sqLiteHelper2=new SQLiteHelper2(this);
        listView=(ListView)findViewById(R.id.listviewid);
        arrayList=new ArrayList<>();

        arrayList=sqLiteHelper2.hisView();
        customAdapter=new CustomAdapter(this,arrayList);
        listView.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.clear_id)
        {
            sqLiteHelper2.deleteData();
            arrayList.clear();
            customAdapter.notifyDataSetChanged();
        }
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
