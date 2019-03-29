    package com.example.evaluacionlabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

    public class SecondActivity extends AppCompatActivity {

    private TextView mTextView, mTextView2, mTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent mIntent = getIntent();

        mTextView = findViewById(R.id.user1);
        mTextView2 = findViewById(R.id.user2);
        mTextView3 = findViewById(R.id.user3);


        if(mIntent!=null){

            String name = mIntent.getStringExtra("name");
            String email = mIntent.getStringExtra("email");
            String cont = mIntent.getStringExtra("total");

            mTextView.setText(name);
            mTextView2.setText(email);
            mTextView3.setText(cont);

        }


    }
}
