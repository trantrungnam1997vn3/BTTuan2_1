package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnChuyenDoi;
    private EditText textNamAmLich, textNamDuongLich;

    public final String[] can = new String[]{"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
    public final String[] chi = new String[]{"Thân", "Dậu", "Tất", "Hợi", "Tý", "Sửu", "Dần", "Mẹo", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân ", "Dậu", "Tuất", "Hợi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chuyenDoi(View view) {
        textNamDuongLich = (EditText) findViewById(R.id.textNamDuongLich);
        int namDuongLich = Integer.parseInt(textNamDuongLich.getText().toString());

        textNamAmLich = (EditText) findViewById(R.id.textNamAmLich);
        textNamAmLich.setText(TimCan(namDuongLich) + " " + TimChi(namDuongLich));
    }

    public String TimCan(int nam) {
        int namCan = nam % 10;
        return can[namCan];
    }

    public String TimChi(int nam) {
        int namChi = nam % 12;
        return chi[namChi];
    }
}
