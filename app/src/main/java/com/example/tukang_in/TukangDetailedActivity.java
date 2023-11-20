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
            String name = intent.getStringExtra("name");
            String desc = intent.getStringExtra("desc");
            String alamat = intent.getStringExtra("alamat");
            int rating = intent.getIntExtra("rating",R.integer.rating);
            int jarak = intent.getIntExtra("jarak", R.integer.jarak);
            int image = intent.getIntExtra("image", R.drawable.bludgotbraindamage);
            binding.detailName.setText(name);
            binding.alamat.setText(alamat);
            binding.detailDesc.setText(desc);
            binding.ratingnumber.setText(rating);
            binding.perkiraanharga.setText("Perkiraan Harga: ");
            binding.detailImage.setImageResource(image);
        }
    }
}