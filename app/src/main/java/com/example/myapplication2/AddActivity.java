package com.example.myapplication2;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button addButton;
    private TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add2);

        num1 = (EditText) findViewById(R.id.etNumber1);
        num2 = (EditText) findViewById(R.id.etNumber2);
        addButton = (Button) findViewById(R.id.ansbutton);
        result = (TextView) findViewById(R.id.textViewResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;

                result.setText("Answer : " + String.valueOf(sum));
            }
        });
    }
}