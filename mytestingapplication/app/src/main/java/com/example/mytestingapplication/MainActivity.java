package com.example.mytestingapplication;

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

        final Button b = (Button) findViewById(R.id.button);
        final TextView tv = (TextView)  findViewById(R.id.output);
        final EditText et = (EditText)  findViewById(R.id.input);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = et.getText().toString();
                tv.setText("Input was " + input);
            }
        });
        //et.setText("Change success");

    }
}