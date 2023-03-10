package com.example.constraintrelative_layout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class RelativeLayout extends AppCompatActivity {

    //list widget yg akan dikenakan aski
    EditText Name, Age,Comment;
    Button send;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        //connect komponen
        Name = (EditText)findViewById(R.id.inputName);
        Age = (EditText)findViewById(R.id.inputAge);
        Comment = (EditText)findViewById(R.id.inputComment);
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelativeLayout.this,MainActivity.class);

                intent.putExtra("Name",Name.getText().toString());
                intent.putExtra("Age",Age.getText().toString());
                intent.putExtra("Comment",Comment.getText().toString());
                startActivity(intent);
            }
        });
    }
}