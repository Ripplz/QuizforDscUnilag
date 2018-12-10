package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class QuestionNine extends AppCompatActivity {
    ToggleButton tog_nine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_nine);
        tog_nine = findViewById(R.id.tog_nine);
    }

    public void next(View v) {
        if (tog_nine.isChecked()) {
//            ++score;
            TextView text = findViewById(R.id.msg_nine);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_nine);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        Intent i = new Intent(this, QuestionTen.class);
        startActivity(i);
    }

    public void previous(View v) {
        Intent i = new Intent(this, QuestionEight.class);
        startActivity(i);
    }
}
