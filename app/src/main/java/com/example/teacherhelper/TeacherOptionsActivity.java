package com.example.teacherhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TeacherOptionsActivity extends AppCompatActivity {
    private Button viva,transport,assignment,marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_options);
        viva= (Button) findViewById(R.id.btnViva);
        transport= (Button) findViewById(R.id.btnTransport);
        assignment= (Button) findViewById(R.id.btnAssignment);
        marks= (Button) findViewById(R.id.btnMarks);

        viva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherOptionsActivity.this, VivaActivity.class);
                startActivity(intent);
            }
        });
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherOptionsActivity.this, VivaActivity.class);
                startActivity(intent);
            }
        });
        assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherOptionsActivity.this, VivaActivity.class);
                startActivity(intent);
            }
        });
        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherOptionsActivity.this, VivaActivity.class);
                startActivity(intent);
            }
        });
    }
}
