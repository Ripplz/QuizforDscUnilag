package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionTen extends AppCompatActivity {
    RadioButton ans_ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ten);
        ans_ten = findViewById(R.id.ans_ten);
    }

    public void previous(View v) {
        if (ans_ten.isChecked()) {
//            ++score;
            TextView text = findViewById(R.id.msg_ten);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_ten);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        Intent i = new Intent(this, QuestionNine.class);
        startActivity(i);
    }
}
