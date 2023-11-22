package com.example.tukang_in;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context context;

    String [] servicesName;
    int[] servicesImage;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] servicesName, int[] servicesImage){
        this.context = context;
        this.servicesName = servicesName;
        this.servicesImage = servicesImage;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return servicesName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            convertView = inflater.inflate(R.layout.grid_services,null);
        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.service_name);

        imageView.setImageResource(servicesImage[position]);
        textView.setText(servicesName[position]);

        return convertView;
    }
}
