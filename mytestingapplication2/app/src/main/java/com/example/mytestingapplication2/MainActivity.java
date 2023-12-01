package com.example.mytestingapplication2;

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

        final Button mul = (Button) findViewById(R.id.mul);
        final Button div = (Button) findViewById(R.id.div);

        final TextView res = (TextView)  findViewById(R.id.result);
        final EditText op1 = (EditText)  findViewById(R.id.op1);
        final EditText op2 = (EditText)  findViewById(R.id.op2);


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1Chars = op1.getText().toString();
                Integer a = Integer.parseInt(op1Chars);

                String op2Chars = op1.getText().toString();
                Integer b = Integer.parseInt(op2Chars);

                Muler m = new Muler(a,b);
                res.setText(m.eval().toString());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1Chars = op1.getText().toString();
                Integer a = Integer.parseInt(op1Chars);

                String op2Chars = op1.getText().toString();
                Integer b = Integer.parseInt(op2Chars);

                Diver d = new Diver(a,b);
                res.setText(d.eval().toString());
            }
        });
    }
}