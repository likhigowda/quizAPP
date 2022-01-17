package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView qno;
    TextView ques;
    Button tb;
    Button fb;
    int flag = -1;
    String[] questions = {"Liki lives in Ramanagara", "liki is pursuing MBBS", "liki likes north Indian dishes"};
    int[] answers = {1,0,1};
    int index = 0;
    int marks = 0;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qno = findViewById(R.id.textView);
        ques = findViewById(R.id.textView2);
        tb = findViewById(R.id.button2);
        fb = findViewById(R.id.button3);


        qno.setText(String.valueOf(index+1) + "/" + String.valueOf(questions.length));
        ques.setText(questions[index]);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(answers[index]==1){
                   marks = marks + 1;
               }
               index++;
               if(index<questions.length) {
                   qno.setText(String.valueOf(index + 1) + "/" + String.valueOf(questions.length));
                   ques.setText(questions[index]);
               }
               if(index == questions.length){
                   Toast.makeText(MainActivity.this, "Your score is " + marks + "/" + questions.length, Toast.LENGTH_SHORT).show();
                   index = 0;
                   marks = 0;
                   qno.setText(String.valueOf(index+1) + "/" + String.valueOf(questions.length));
                   ques.setText(questions[index]);
               }

            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answers[index]==0){
                    marks = marks + 1;
                }
                index++;
                if(index<questions.length) {
                    qno.setText(String.valueOf(index + 1) + "/" + String.valueOf(questions.length));
                    ques.setText(questions[index]);
                }
                if(index == questions.length){
                    Toast.makeText(MainActivity.this, "Your score is " + marks + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    index = 0;
                    marks = 0;
                    qno.setText(String.valueOf(index+1) + "/" + String.valueOf(questions.length));
                    ques.setText(questions[index]);
                }
            }
        });

    }
}