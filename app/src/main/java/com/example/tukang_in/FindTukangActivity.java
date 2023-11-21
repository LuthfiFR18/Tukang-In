package com.example.tukang_in;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.example.tukang_in.databinding.ActivityFindTukangBinding;
import java.util.ArrayList;
public class FindTukangActivity extends AppCompatActivity {
    ActivityFindTukangBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindTukangBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int[] imageList = {R.drawable.santaidulugasih, R.drawable.lethimcook, R.drawable.bludgotbraindamage};
        int[] ratingList = {R.string.rating,R.string.rating,R.string.rating};
        int[] jarakList = {R.string.jarak,R.string.jarak,R.string.jarak};
        String[] nameList = {"cnunk","kafka","JtKz"};
        String[] descList = {"Terpercaya","Terpercaya","Terpercaya"};
        String[] alamatList = {"JL.mangga no.8","JL.mangga no.8","JL.mangga no.8"};
        String[] hargaList = {"100.000 - 350.000","100.000 - 350.000","100.000 - 350.000"};
        for (int i = 0; i < imageList.length; i++) {
            listData = new ListData(nameList[i], descList[i],alamatList[i], ratingList[i], imageList[i], jarakList[i]);
            dataArrayList.add(listData);
        }
            listAdapter = new ListAdapter(FindTukangActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(FindTukangActivity.this, TukangDetailedActivity.class);
                intent.putExtra("Name", nameList[i]);
                intent.putExtra("Deskripsi", descList[i]);
                intent.putExtra("Rating", ratingList[i]);
                intent.putExtra("Alamat", alamatList[i]);
                intent.putExtra("image", imageList[i]);
                intent.putExtra("Jarak", jarakList[i]);
                intent.putExtra("Perkiraan Harga", hargaList[i]);
                startActivity(intent);
            }
        });
    }
}