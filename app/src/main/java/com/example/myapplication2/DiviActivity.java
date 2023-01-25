package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DiviActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button mulButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divi);

        num1 = (EditText) findViewById(R.id.etNumber1);
        num2 = (EditText) findViewById(R.id.etNumber2);
        mulButton = (Button) findViewById(R.id.ansbutton);
        result = (TextView) findViewById(R.id.textViewResult);

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = Integer.parseInt(num1.getText().toString());
                float number2 = Integer.parseInt(num2.getText().toString());
                float divi = number1 / number2;

                result.setText("Answer : " + String.valueOf(divi));
            }
        });
    }
}