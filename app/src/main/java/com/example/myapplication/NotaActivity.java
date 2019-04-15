package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NotaActivity extends AppCompatActivity {
    EditText nota1, nota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);
        nota1=findViewById(R.id.nota1_edit);
        nota2=findViewById(R.id.nota2_edit);
    }

    public void verSituacao(View view) {
    }

    public void limpar(View view) {-
    }
}
