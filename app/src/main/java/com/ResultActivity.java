package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.examole.quizit.R;

public class ResultActivity extends AppCompatActivity {

    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1 = (TextView) findViewById(R.id.textView4);
        t1 = (TextView) findViewById(R.id.textView5);
        t1 = (TextView) findViewById(R.id.textView6);

        Intent i=getIntent();

        String questions = i.getStringExtra("total");
        String correct = i.getStringExtra("correct");
        String wrong = i.getStringExtra("incorrect");

        t1.setText(questions);
        t2.setText(correct);
        t3.setText(wrong);
    }
}