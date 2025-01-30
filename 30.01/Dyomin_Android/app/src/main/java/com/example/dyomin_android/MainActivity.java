package com.example.dyomin_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public static TextView textView1, textView2, textView3, textView4;
    public static EditText num1, num2;

    public void otvet(View v) {
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        String num1Text = num1.getText().toString();
        String num2Text = num2.getText().toString();

        int number1 = Integer.parseInt(num1Text);
        int number2 = Integer.parseInt(num2Text);

        int sum = number1 + number2;
        int raz = number1 - number2;
        int proz = number1 * number2;
        double chas = Math.pow(number1,2) / Math.pow(number2,2);

        textView1.setText(String.valueOf(sum));
        textView2.setText(String.valueOf(raz));
        textView3.setText(String.valueOf(proz));
        textView4.setText(String.valueOf(chas));
    }

    public void SecondView(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}