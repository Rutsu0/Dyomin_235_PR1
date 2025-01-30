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

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public static TextView textViewA, textViewB;
    public static EditText numA, numB;

    public void otvet2(View v) {
        numA = findViewById(R.id.numA);
        numB = findViewById(R.id.numB);
        textViewA = findViewById(R.id.textViewA);
        textViewB = findViewById(R.id.textViewB);

        String numAText = numA.getText().toString();
        String numBText = numB.getText().toString();

        int number1 = Integer.parseInt(numAText);
        int number2 = Integer.parseInt(numBText);

        int perv = number2;
        int vtor = number1;

        textViewA.setText(String.valueOf(perv));
        textViewB.setText(String.valueOf(vtor));

    }


    public void thirdView(View v) {
        Intent intent = new Intent(this, thirdActivity.class);
        startActivity(intent);
    }
}