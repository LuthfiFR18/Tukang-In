package com.example.tukang_in;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.example.tukang_in.databinding.ActivityTukangDetailedBinding;
public class TukangDetailedActivity extends AppCompatActivity {
    ActivityTukangDetailedBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTukangDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("Name");
            String desc = intent.getStringExtra("Deskirpsi");
            String alamat = intent.getStringExtra("Alamat");
            String perkiraanharga = intent.getStringExtra("Perkiraan Harga");
            int rating = intent.getIntExtra("Rating",R.integer.rating);
            int image = intent.getIntExtra("image", R.drawable.bludgotbraindamage);
            binding.detailName.setText(name);
            binding.alamat.setText(alamat);
            binding.detailDesc.setText(desc);
            binding.ratingnumber.setText(rating);
            binding.perkiraanharga.setText(perkiraanharga);
            binding.detailImage.setImageResource(image);
        }
    }
}