package com.example.dyomin_android;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class thirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public static TextView textViewC;
    public static EditText numF;

    public void otvet3(View v) {
        numF = findViewById(R.id.numF);
        textViewC = findViewById(R.id.textViewC);

        String numFText = numF.getText().toString();

        double numberF = Integer.parseInt(numFText);

        double uzF = (numberF - 32)*5/9;


        textViewC.setText(String.valueOf(uzF));
    }

}