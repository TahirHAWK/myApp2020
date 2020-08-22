package com.example.teacherhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VivaActivity extends AppCompatActivity {
    EditText Roll, Marks;
    Button SubmitMarks,EditPreviousMark;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viva);

        Roll = findViewById(R.id.etRollst);
        Marks = findViewById(R.id.etMarksST);
        SubmitMarks=(Button)findViewById(R.id.btnSubmitMarks);
        EditPreviousMark=(Button)findViewById(R.id.btnEditPreviousMark);

        SubmitMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           rootNode=FirebaseDatabase.getInstance();
           reference=rootNode.getReference("Viva");

          reference.setValue("First Data storage");
            }
        });
        EditPreviousMark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("value");

                myRef.setValue("Hello, World!");

            }
        });

    }
}
