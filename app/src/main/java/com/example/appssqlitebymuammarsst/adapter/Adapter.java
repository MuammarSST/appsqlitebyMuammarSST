package com.example.appssqlitebymuammarsst.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.appssqlitebymuammarsst.R;
import com.example.appssqlitebymuammarsst.model.Data;

import java.util.List;

public class Adapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> items;


    public Adapter (Activity activity, List<Data> items){
        this.activity = activity;
        this.items = items;
    }

    public int getCount(){
        return items.size();
    }

    public Object getItem(int location){
        return items.get(location);
    }

    public long getItemId(int position){
        return position;
    }

    public View getView(int position, View converView, ViewGroup parent){
        if(inflater==null)
            inflater=(LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (converView==null)
            converView=inflater.inflate(R.layout.list_row,null);
        TextView id=(TextView) converView.findViewById(R.id.id);
        TextView name=(TextView) converView.findViewById(R.id.name);
        TextView address=(TextView) converView.findViewById(R.id.address);
        Data data=items.get(position);
        id.setText(data.getId());
        name.setText(data.getName());
        address.setText(data.getAddress());

        return converView;
    }






}
