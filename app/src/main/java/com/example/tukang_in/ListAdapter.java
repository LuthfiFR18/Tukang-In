package com.example.tukang_in;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
public class ListAdapter extends ArrayAdapter<ListData> {
    public ListAdapter(@NonNull Context context, ArrayList<ListData> dataArrayList) {
        super(context, R.layout.list_tukang, dataArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListData listData = getItem(position);
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_tukang, parent, false);
        }
        ImageView listImage = view.findViewById(R.id.listImage);
        TextView listName = view.findViewById(R.id.listName);
        TextView listDesc = view.findViewById(R.id.tukangdesc);
        TextView listRating = view.findViewById(R.id.ratingnumber);
        TextView listJarak = view.findViewById(R.id.jarak);
        TextView listAlamat = view.findViewById(R.id.alamat);
        listImage.setImageResource(listData.image);
        listName.setText(listData.tukangname);
        listDesc.setText(listData.tukangdesc);
        listRating.setText(listData.rating);
        listJarak.setText(listData.jarak);
        listAlamat.setText(listData.alamat);
        return view;
    }
}
