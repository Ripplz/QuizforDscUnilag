package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);
    }

    public void next(View v) {
        RadioButton ansFour = findViewById(R.id.ans4);
        if (ansFour.isChecked()) {
//            ++score;
            TextView text = findViewById(R.id.msg_four);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_four);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        Intent i = new Intent(this, QuestionFive.class);
        startActivity(i);
    }

    public void previous(View v) {
        Intent i = new Intent(this, QuestionThree.class);
        startActivity(i);
    }
}
