package com.example.android.quizfordscunilag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    int score = 0;
    int one_ans = 0;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ans = findViewById(R.id.one_ans);
        ans.setText("0");
        Spinner seven = findViewById(R.id.seven);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.seven, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seven.setAdapter(adapter);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }
        });
        seven.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 2)
                    flag = true;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void submit() {
        TextView ans_one = findViewById(R.id.one_ans);
        String ans = ans_one.getText().toString();
        CheckBox ansTwoA = findViewById(R.id.ansTwoA);
        CheckBox ansTwoB = findViewById(R.id.ansTwoB);
        CheckBox ansTwoC = findViewById(R.id.ansTwoC);
        Boolean ansTwoABool = ansTwoA.isChecked();
        Boolean ansTwoBBool = ansTwoB.isChecked();
        Boolean ansTwoCBool = ansTwoC.isChecked();
        RadioButton ansThree = findViewById(R.id.ans3);
        RadioButton ansFour = findViewById(R.id.ans4);
        RadioButton ansFive = findViewById(R.id.ans5);
        ToggleButton tog_six = findViewById(R.id.tog_six);
        ToggleButton tog_eight = findViewById(R.id.tog_eight);
        ToggleButton tog_nine = findViewById(R.id.tog_nine);
        RadioButton ans_ten = findViewById(R.id.ans_ten);
        if (ans.equals("10")) {
            ++score;
            TextView text = findViewById(R.id.msg_one);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_one);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (ansTwoABool && ansTwoBBool && !ansTwoCBool) {
            ++score;
            TextView text = findViewById(R.id.msg_two);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_two);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (ansThree.isChecked()) {
            ++score;
            TextView text = findViewById(R.id.msg_three);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_three);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (ansFour.isChecked()) {
            ++score;
            TextView text = findViewById(R.id.msg_four);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_four);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (ansFive.isChecked()) {
            ++score;
            TextView text = findViewById(R.id.msg_five);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_five);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (tog_six.isChecked()) {
            ++score;
            TextView text = findViewById(R.id.msg_six);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_six);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (flag) {
            ++score;
            TextView text = findViewById(R.id.msg_seven);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_seven);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (tog_eight.isChecked()) {
            ++score;
            TextView text = findViewById(R.id.msg_eight);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_eight);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (tog_nine.isChecked()) {
            ++score;
            TextView text = findViewById(R.id.msg_nine);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_nine);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
        if (ans_ten.isChecked()) {
            ++score;
            TextView text = findViewById(R.id.msg_ten);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
        } else {
            TextView text = findViewById(R.id.msg_ten);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
        }
    }
    public  void reset(View v){
        score = 0;
        TextView one = findViewById(R.id.msg_one);
        TextView two = findViewById(R.id.msg_two);
        TextView three = findViewById(R.id.msg_three);
        TextView four = findViewById(R.id.msg_four);
        TextView five = findViewById(R.id.msg_five);
        TextView six = findViewById(R.id.msg_six);
        TextView seven = findViewById(R.id.msg_seven);
        TextView eight = findViewById(R.id.msg_eight);
        TextView nine = findViewById(R.id.msg_nine);
        TextView ten = findViewById(R.id.msg_ten);
        one.setVisibility(View.GONE);
        two.setVisibility(View.GONE);
        three.setVisibility(View.GONE);
        four.setVisibility(View.GONE);
        five.setVisibility(View.GONE);
        six.setVisibility(View.GONE);
        seven.setVisibility(View.GONE);
        eight.setVisibility(View.GONE);
        nine.setVisibility(View.GONE);
        ten.setVisibility(View.GONE);
    }
    public void add(View v) {
        TextView ans = findViewById(R.id.one_ans);
        ans.setText("" + ++one_ans);
    }

    public void remove(View v) {
        TextView ans = findViewById(R.id.one_ans);
        ans.setText("" + --one_ans);
    }

}
