package com.example.mobiletechnologiesmysql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void pelanggan (View View) {
            Intent i = new Intent(MainActivity.this, Pelanggan.class);
            startActivity(i);
    }

        public void barang (View View) {
            Intent i = new Intent(MainActivity.this, Barang.class);
            startActivity(i);
        }

        public void penjualan (View View) {
            Intent i = new Intent(MainActivity.this, Penjualan.class);
            startActivity(i);
        }

        public void laporan (View View) {
            Intent i = new Intent(MainActivity.this, Laporan.class);
            startActivity(i);
        }

}