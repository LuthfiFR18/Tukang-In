package com.example.tukang_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tukang_in.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    private boolean isPasswordMismatch = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListener();
    }

    private void setListener(){
        binding.txtmasuk.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), loginActivity.class));
        });
        binding.btnDaftar1.setOnClickListener(v -> {
            register();
        });

    }

    private void register() {
        String password = binding.regisPass.getText().toString();
        String confirmPassword = binding.ConfirmPass.getText().toString();
        TextView passwordMatchText = binding.passwordMatchText;


        if (!password.isEmpty() && password.length() > 4) {
            if (password.equals(confirmPassword)) {

                isPasswordMismatch = false;
                passwordMatchText.setText("Password sesuai");
                passwordMatchText.setTextColor(getResources().getColor(R.color.black));

            } else {
                isPasswordMismatch = true;
                passwordMatchText.setText("Password tidak sesuai");
                passwordMatchText.setTextColor(getResources().getColor(R.color.red));
               // startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        }
        else {
            // Password is empty or less than 6 characters
            passwordMatchText.setText("Password setidaknya 5 huruf");
            passwordMatchText.setTextColor(getResources().getColor(R.color.red));
        }
    }


}