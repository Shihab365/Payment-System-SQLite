package com.sqlitepaysystem.bel.sqlite_paysystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<Rech_storage> arrayList;

    CustomAdapter(Context context,ArrayList<Rech_storage> arrayList)
    {
        this.context=context;
        this.arrayList=arrayList;
    }

    @Override
    public int getCount() {
        return this.arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.custom_listview,parent,false);
        }
        TextView mobText=(TextView)convertView.findViewById(R.id.subject_id);
        TextView amtText=(TextView)convertView.findViewById(R.id.money_id);
        TextView dateText=(TextView)convertView.findViewById(R.id.cdate_id);
        TextView timeText=(TextView)convertView.findViewById(R.id.ctime_id);

        Rech_storage rech_storage=arrayList.get(position);

        mobText.setText(rech_storage.getViewMobile());
        amtText.setText(rech_storage.getViewAmount());
        dateText.setText(rech_storage.getViewDate());
        timeText.setText(rech_storage.getViewTime());
        return convertView;
    }
}
