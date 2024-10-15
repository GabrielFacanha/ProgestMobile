package com.example.progest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView cadastrarbtn = findViewById(R.id.criarconta);
        TextView esquecisenhabtn = findViewById(R.id.esquecisenha);
        Button entrarbtn = findViewById(R.id.btnentrar);


        cadastrarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LoginActivity.this, CadastroUsuarioActivity.class);
                        startActivity(it);
            }
        });

       entrarbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent it = new Intent(LoginActivity.this, TelaPrincipalActivity.class);
               startActivity(it);
           }
       });




    }// fim onCreate
}// fim classe