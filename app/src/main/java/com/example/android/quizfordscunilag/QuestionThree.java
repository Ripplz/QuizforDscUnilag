package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);
    }

    public void next(View v) {
        RadioButton ansThree = findViewById(R.id.ans3);
        if (ansThree.isChecked()) {
            //++score;
            TextView text = findViewById(R.id.msg_three);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_three);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        Intent i = new Intent(this, QuestionFour.class);
        startActivity(i);
    }

    public void previous(View v) {
        Intent i = new Intent(this, QuestionTwo.class);
        startActivity(i);
    }
}
