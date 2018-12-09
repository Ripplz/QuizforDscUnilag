package com.example.android.quizfordscunilag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner seven = findViewById(R.id.seven);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.seven,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seven.setAdapter(adapter);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }
        });
        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
            }
        });
       }
       public void submit(){
           RadioButton ans1 = findViewById(R.id.ans1);
           if(ans1.isChecked())
               Toast.makeText(MainActivity.this,"correct " + ++score,Toast.LENGTH_SHORT).show();
           else
               Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
       }
    }
