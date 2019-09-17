package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnConvertF, btnConvertC, btnClear;
    private EditText celsius, fahrenheit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConvertF = findViewById(R.id.btnConvertF);
        btnConvertF.setOnClickListener(this);

        btnConvertC = findViewById(R.id.btnConvertC);
        btnConvertC.setOnClickListener(this);

        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {



        switch (view.getId()) {
            case R.id.btnConvertF: {
                celsius = (EditText) findViewById(R.id.celsius);
                float valueC = Float.parseFloat( celsius.getText().toString());
                fahrenheit = (EditText) findViewById(R.id.fahrenheit);
                fahrenheit.setText(valueC * 9/5 + 32 + "");
                break;
            }
            case R.id.btnConvertC: {
                fahrenheit = (EditText) findViewById(R.id.fahrenheit);
                float valueF = Float.parseFloat(fahrenheit.getText().toString());
                celsius = (EditText) findViewById(R.id.celsius);
                celsius.setText((valueF - 32) * 5/9 + "");
                break;
            }
            case R.id.btnClear: {
                fahrenheit = (EditText) findViewById(R.id.fahrenheit);
                celsius = (EditText) findViewById(R.id.celsius);
                celsius.setText("");
                fahrenheit.setText("");
                break;
            }
            default:
                break;
        }
    }
}
