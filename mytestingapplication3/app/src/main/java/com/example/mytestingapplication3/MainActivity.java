package com.example.mytestingapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
                String num1s = in1.getText().toString();
                String num2s = in2.getText().toString();

                int num1, num2;

                try {
                    num1 =  Integer.parseInt(num1s);
                }catch (NumberFormatException e){
                    out.setText(R.string.in1_error);
                    return;
                }

            try {
                num2 =  Integer.parseInt(num2s);
            }catch (NumberFormatException e){
                out.setText(R.string.in2_error);
                return;
            }

            Diver d1 = new Diver(num1, num2);

            try {
                out.setText("Result is: " + d1.eval());
            }catch (Exception e){
                out.setText(e.getMessage());
            }


        });

    }
}