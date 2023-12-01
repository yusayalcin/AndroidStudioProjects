package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);

        final EditText in1 = (EditText)  findViewById(R.id.input1);
        final EditText in2 = (EditText)  findViewById(R.id.input2);

        final TextView out = (TextView)  findViewById(R.id.out);

        button.setOnClickListener(view -> {
            String strInput = in1.getText().toString();
            String numInput = in2.getText().toString();

            int num;

            try {
                num =  Integer.parseInt(numInput);
            }catch (NumberFormatException e){
                out.setText(R.string.in2_error);
                return;
            }

            SuffixCalculator sc = new SuffixCalculator(strInput, num);

            try {
                out.setText("Output is: " + sc.eval());
            }catch (Exception e){
                out.setText(e.getMessage());
            }
        });
    }
}