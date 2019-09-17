package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputHovaTen, inputCmnd, inputThongTinBoSung;
    private CheckBox checkboxDocbao, checkboxDocSach, checkboxCoding;
    private RadioGroup radioGroupBangCap;
    private Button btnSend;
    private RadioButton radioTrungCap, radioCaoDang, radioDaiHoc;
    private String bangCap;
    private List<Person> persons = new ArrayList<Person>();
    private List<String> soThich = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend = findViewById(R.id.btnSend);

        radioTrungCap = findViewById(R.id.radioTrungCap);
        radioCaoDang = findViewById(R.id.radioCaoDang);
        radioDaiHoc = findViewById(R.id.radioDaiHoc);

        checkboxDocbao = findViewById(R.id.checkboxDocbao);
        checkboxDocSach = findViewById(R.id.checkboxDocsach);
        checkboxCoding = findViewById(R.id.checkboxCoding);

        radioGroupBangCap = findViewById(R.id.radioGroupBangcap);

        radioGroupBangCap.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioTrungCap.isChecked()) {
                    Toast.makeText(getBaseContext(), "Trung Cấp", Toast.LENGTH_SHORT).show();
                    bangCap = "Trung Cấp";
                }
                if (radioCaoDang.isChecked()) {
                    Toast.makeText(getBaseContext(), "Cao Đẳng", Toast.LENGTH_SHORT).show();
                    bangCap = "Cao Đẳng";
                }
                if (radioDaiHoc.isChecked()) {
                    Toast.makeText(getBaseContext(), "Đại học", Toast.LENGTH_SHORT).show();
                    bangCap = "Đại Học";
                }
            }
        });

        btnSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        inputCmnd = findViewById(R.id.inputCmnd);
        String cmnd = inputCmnd.getText().toString();
        inputHovaTen = findViewById(R.id.inputHovaTen);
        String hoVaTen = inputHovaTen.getText().toString();
        inputThongTinBoSung = findViewById(R.id.inputThongTinBoSung);
        String thongTinBoSung = inputThongTinBoSung.getText().toString();

        switch (view.getId()) {
            case (R.id.btnSend): {
                if (hoVaTen.length() < 3) {
                    Toast.makeText(this, "Ho va ten khong hop le", Toast.LENGTH_SHORT).show();
                    break;
                }

                if (cmnd.length() != 9) {
                    Toast.makeText(this, "CMND khong hop le", Toast.LENGTH_SHORT).show();
                    break;
                }

                Toast.makeText(this, soThich.size() + "", Toast.LENGTH_SHORT).show();

                if(soThich.size() < 1) {
                    Toast.makeText(this, "Vui long chon so thich", Toast.LENGTH_SHORT).show();
                    break;
                }

                Person person = new Person(hoVaTen, cmnd, bangCap, soThich.toString(), thongTinBoSung);
                persons.add(person);
                Toast.makeText(this, person.toString(), Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

    public void onCheckedListener(View view) {

        switch (view.getId()) {
            case R.id.checkboxDocbao: {
                if (checkboxDocbao.isChecked() == false) {
                    soThich.remove(soThich.indexOf("Đọc báo"));
                    break;
                }
                soThich.add("Đọc báo");
                break;
            }
            case R.id.checkboxDocsach: {
                if (checkboxDocSach.isChecked() == false) {
                    soThich.remove(soThich.indexOf("Đọc sách"));
                    break;
                }
                soThich.add( "Đọc sách");
                break;
            }
            case R.id.checkboxCoding: {
                if (checkboxCoding.isChecked() == false) {
                    soThich.remove(soThich.indexOf("Coding"));
                    break;
                }
                soThich.add( "Coding");
                break;
            }
        }
    }
}
