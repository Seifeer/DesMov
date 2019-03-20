package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tela3Activity extends AppCompatActivity {

    private TextView txtNumero;
    private int count;
    private EditText editIncremento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        //Definir valor da variavel procurando pelo id da view
        txtNumero=findViewById(R.id.txt_numero);
        editIncremento=findViewById(R.id.edit_incremento);

        count=0;
        editIncremento.setText("1");

        atualizarTela();
    }

    public void exibirToast(View view) {
        //Mensagem no balaozinho
        Toast.makeText(this, "O numero na tela é: "+count, Toast.LENGTH_SHORT).show();
    }

    public void aumentarCount(View view) {
        int incremento= Integer.parseInt(editIncremento.getText().toString());

        count+=incremento;
        atualizarTela();
        //txtNumero.setText("34");
        //Toast.makeText(this, "Testando o Count", Toast.LENGTH_SHORT).show();
    }
    public void atualizarTela(){
        txtNumero.setText(""+count);

        //Definir o background de acordo com o count
        if (count%2==0){
            txtNumero.setBackgroundColor(Color.rgb(255,0,0));
        }else{
            txtNumero.setBackgroundColor(Color.rgb(0,0,255));
        }
    }

}
