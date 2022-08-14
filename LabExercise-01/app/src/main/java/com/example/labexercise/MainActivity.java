package com.example.labexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    Button toastBtn, countBtn;
    TextView mShowCount;
    View  view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastBtn = findViewById(R.id.toast_btn);
        countBtn = findViewById(R.id.count_btn);
        mShowCount = findViewById(R.id.count_text);

        toastBtn.setOnClickListener(
                this::showToast
        );

        countBtn.setOnClickListener(
                this::countUp
        );

    }


    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        showToast(view);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message ,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}