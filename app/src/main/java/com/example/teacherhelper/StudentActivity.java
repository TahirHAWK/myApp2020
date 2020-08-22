package com.example.teacherhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    //private TextView Info;
    private Button Login;
    //private int counter=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Name = (EditText)findViewById(R.id.etStudentName);
        Password = (EditText)findViewById(R.id.etStudentPassword);
        //Info = (TextView)findViewById(R.id.tvAttemptsInfo);
        Login=(Button)findViewById(R.id.btnStudentLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }
    private void validate(String userName, String userPassword){
        if(userName.equals("user") && userPassword.equals("1234")){
            Intent intent=new Intent(StudentActivity.this, stVivaActivity.class);
            startActivity(intent);
        }
        else {
            Toast toast = Toast.makeText(StudentActivity.this,"Your Password/name is incorrect. Please check again before submitting",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();


                Login.setEnabled(false);
                Intent intent=new Intent(StudentActivity.this, MainActivity.class);
                startActivity(intent);


        }


    }
}
