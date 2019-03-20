package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Tela3Activity extends AppCompatActivity {

    private TextView txtNumero;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        txtNumero=findViewById(R.id.txt_numero);
        int count = 0;
        atualizarTela();
    }

    public void exibirToast(View view) {
        Toast.makeText(this, "O numero na tela é: "+count, Toast.LENGTH_SHORT).show();
    }

    public void aumentarCount(View view) {
        count+=1;
        atualizarTela();
        //txtNumero.setText("34");
        //Toast.makeText(this, "Testando o Count", Toast.LENGTH_SHORT).show();
    }
    public void atualizarTela(){
        txtNumero.setText(""+count);
    }

}
