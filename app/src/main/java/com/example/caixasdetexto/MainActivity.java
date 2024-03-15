package com.example.caixasdetexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar (View view){
        EditText campoNome = findViewById(R.id.editNome);
        TextView textoResultado = findViewById(R.id.editResultado);
        TextInputEditText campoEmail = findViewById(R.id.editEmail);

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText( "Nome: " + nome + "e-mail: " + email) ;
    }
}