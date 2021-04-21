package com.example.hieroglyphs.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hieroglyphs.Main.Category.HistoryActivity;
import com.example.hieroglyphs.Main.Category.LettersActivity;
import com.example.hieroglyphs.Main.Category.NumbersActivity;
import com.example.hieroglyphs.Main.Category.WrietsActivity;
import com.example.hieroglyphs.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mLetters,mNumbers,mWrites,mHistory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mLetters=findViewById(R.id.letters);
        mNumbers=findViewById(R.id.number);
        mWrites=findViewById(R.id.writes);
        mHistory=findViewById(R.id.history);
        mLetters.setOnClickListener(this);
        mNumbers.setOnClickListener(this);
        mWrites.setOnClickListener(this);
        mHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.letters:
                Intent intent = new Intent(MainActivity.this, LettersActivity.class);
                startActivity(intent);
                break;
            case R.id.number:
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
                break;
            case R.id.writes:
                Intent mIntent = new Intent(MainActivity.this, WrietsActivity.class);
                startActivity(mIntent);
                break;
            case R.id.history:
                Intent ii = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(ii);
                break;



        }
    }
}