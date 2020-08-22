package com.example.teacherhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TeacherActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvAttemptsInfo);
        Login=(Button)findViewById(R.id.btnLogin);

        Info.setText("No of Attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }
    private void validate(String userName, String userPassword){
        if(userName.equals("admin") && userPassword.equals("1234")){
            Intent intent=new Intent(TeacherActivity.this, TeacherOptionsActivity.class);
            startActivity(intent);
        }
        else {
            counter--;

            Info.setText("No of Attempts remaining: " + String.valueOf(counter));

            if(counter==0){

                Login.setEnabled(false);
                Intent intent=new Intent(TeacherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }


    }
}
