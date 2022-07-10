package com.milyasarmans.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText aPertama, aKedua;
    TextView hPenjumlahan, hPengurangan, hPembagian, hPerkalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aPertama =(EditText) findViewById(R.id.angkaPertama);
        aKedua = (EditText) findViewById(R.id.angkaKedua);
        hPenjumlahan = (TextView) findViewById(R.id.hasilPenjumlahan);
        hPengurangan = (TextView) findViewById(R.id.hasilPengurangan);
        hPembagian = (TextView) findViewById(R.id.hasilPembagian);
        hPerkalian = (TextView) findViewById(R.id.hasilPerkalian);
    }

    public void Hitung(View view) {
        int angka1 = Integer.parseInt(aPertama.getText().toString());
        int angka2 = Integer.parseInt(aKedua.getText().toString());
        Integer penjumlahan = angka1 + angka2;
        hPenjumlahan.setText(penjumlahan.toString());
        Integer perkalian = angka1 * angka2;
        hPerkalian.setText(perkalian.toString());
        Integer pengurangan = angka1 - angka2;
        hPengurangan.setText(pengurangan.toString());
        Integer pembagian = angka1 / angka2;
        hPembagian.setText(pembagian.toString());
    }
}