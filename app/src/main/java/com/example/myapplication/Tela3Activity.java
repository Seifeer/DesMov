package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Tela3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }

    public void exibirToast(View view) {
        Toast.makeText(this, "Testando o Toast", Toast.LENGTH_SHORT).show();
    }

    public void aumentarCount(View view) {
        Toast.makeText(this, "Testando o Count", Toast.LENGTH_SHORT).show();
    }
}
