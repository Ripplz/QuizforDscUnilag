package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class QuestionTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
    }

    public void next(View v) {
        CheckBox ansTwoA = findViewById(R.id.ansTwoA);
        CheckBox ansTwoB = findViewById(R.id.ansTwoB);
        CheckBox ansTwoC = findViewById(R.id.ansTwoC);
        Boolean ansTwoABool = ansTwoA.isChecked();
        Boolean ansTwoBBool = ansTwoB.isChecked();
        Boolean ansTwoCBool = ansTwoC.isChecked();
        if (ansTwoABool && ansTwoBBool && !ansTwoCBool) {
            //++score;
            TextView text = findViewById(R.id.msg_two);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_two);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        Intent i = new Intent(this, QuestionThree.class);
        startActivity(i);
    }

    public void previous(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
