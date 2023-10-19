package br.ulbra.newapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    Button btnSomar;
    Button btnMulti;
    Button btnDivi;
    Button btnSubtracao;


    TextView txtResultado;
    double v1,v2,soma, multiplicação, divisão, subtração;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.editValor1);
        ed2 = (EditText)findViewById(R.id.editValor2);
        btnSomar = (Button)findViewById(R.id.btnSomar);
        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnDivi =  (Button)findViewById(R.id.btnDivi);
        btnSubtracao = (Button)findViewById(R.id.btnSubtracao);
        txtResultado = (TextView)findViewById(R.id.txtResultado);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                soma = v1 + v2;
                txtResultado.setText("Resultado: "+soma);
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                multiplicação = v1 * v2;

                txtResultado.setText("Resultado: "+ multiplicação);
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                divisão = v1 / v2;

                txtResultado.setText("Resultado: "+ divisão);
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                subtração = v1 - v2;

                txtResultado.setText("Resultado: "+ subtração);
            }
        });

    }
}