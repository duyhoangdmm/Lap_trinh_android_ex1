package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtInput, edtSo;
    TextView txtOutput;
    Button btnXuLy, btnXuLyMang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        edtSo = findViewById(R.id.edtSo);
        btnXuLyMang = findViewById(R.id.btnXuLyMang);

        edtInput = findViewById(R.id.edtInput);
        txtOutput = findViewById(R.id.txtOutput);
        btnXuLy = findViewById(R.id.btnXuLy);

        btnXuLyMang.setOnClickListener(v -> {
            String input = edtSo.getText().toString().trim();

            if (input.isEmpty()) {
                Toast.makeText(this, "Hãy nhập số!", Toast.LENGTH_SHORT).show();
                return;
            }

            String[] parts = input.split(",");
            ArrayList<Integer> arrNumbers = new ArrayList<>();

            for (String p : parts) {
                try {
                    arrNumbers.add(Integer.parseInt(p.trim()));
                } catch (NumberFormatException e) {
                    Toast.makeText(this, "Lỗi: '" + p + "' không phải là số!", Toast.LENGTH_SHORT).show();
                    return;
                }
            }

            for (int num : arrNumbers) {
                if (num % 2 == 0)
                    Log.d("EVEN", String.valueOf(num));
                else
                    Log.d("ODD", String.valueOf(num));
            }

            Toast.makeText(this, "Đã in số chẵn / lẻ vào Logcat", Toast.LENGTH_SHORT).show();
        });



        btnXuLy.setOnClickListener(v -> {
            String s = edtInput.getText().toString().trim();

            if (s.isEmpty()) {
                Toast.makeText(this, "Hãy nhập chuỗi!", Toast.LENGTH_SHORT).show();
                return;
            }

            String[] words = s.split(" ");
            StringBuilder reversed = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }

            String result = reversed.toString().trim().toUpperCase();

            txtOutput.setText(result);

            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }
}
