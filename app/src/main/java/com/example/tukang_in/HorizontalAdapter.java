package com.example.tukang_in;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {
    private List<HorizontalNavigationItems> itemList;

    public HorizontalAdapter(List<HorizontalNavigationItems> itemList) {
        this.itemList = itemList;
    }
    public void setItems(List<HorizontalNavigationItems> itemList) {
        this.itemList = itemList;
        notifyDataSetChanged();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        // Define views in your item layout (e.g., TextViews, ImageViews, etc.)

        public ViewHolder(View itemView) {
            super(itemView);

            // Initialize your views here
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
        // Implement methods for creating and binding ViewHolders

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate your item layout here
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Bind your data to the views
        HorizontalNavigationItems currentItem = itemList.get(position);
        holder.imageView.setImageResource(currentItem.getImageResource());
        holder.textView.setText(currentItem.getDescription());
    }

    @Override
    public int getItemCount() {
        // Return the total number of items in your list
        return itemList.size();
    }

}