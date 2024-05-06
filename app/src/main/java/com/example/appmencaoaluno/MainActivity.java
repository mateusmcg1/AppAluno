package com.example.appmencaoaluno;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome, editTextNota1, editTextTrabalho1, editTextNota2,
    editTextTrabalho2, editTextJornada;

    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadNotas(){
        editTextNome = findViewById(R.id.EditTextNomeAluno);
        editTextNota1 = findViewById(R.id.EditTextNota1);
        editTextTrabalho1 = findViewById(R.id.EditTextTrabalho1);
        editTextNota2 = findViewById(R.id.EditTextNota2);
        editTextTrabalho2 = findViewById(R.id.EditTextTrabalho2);
        editTextJornada = findViewById(R.id.EditTextJornada);
        resultado = findViewById(R.id.TextViewResultado);

    }

    public void core(View view){
        double nota1 = Double.parseDouble(editTextNota1.getText().toString());
        double trabalho1 = Double.parseDouble(editTextTrabalho1.getText().toString());
        double nota2 = Double.parseDouble(editTextNota2.getText().toString());
        double trabalho2 = Double.parseDouble(editTextTrabalho2.getText().toString());
        double jornada = Double.parseDouble(editTextJornada.getText().toString());
        boolean error = validarEntrada(nota1,trabalho1,nota2,trabalho2,jornada);
        if(error){
            resultado.setText("Notas não podem ser menores que 0 ou maiores que 100");
        }
        else {// notas digitadas corretamente

        }
    }

    public boolean validarEntrada(double nota1, double trabalho1,double nota2,
                                  double trabalho2, double jornada){
        if (nota1 < 0.0 || trabalho1 < 0.0 || nota2 < 0.0 || trabalho2 < 0.0 || jornada < 0.0){
            return true;
        }
        if(nota1 > 0.0 || trabalho1 > 0.0 || nota2 > 0.0 || trabalho2 > 0.0 || jornada > 0.0){
            return true;
        }
        return false;
    }
}