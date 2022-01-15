package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nomeCompletoEditTex;
    private EditText telefoneEditText;
    private Button salvarButton;
    private Spinner ufSP1;
    private CheckBox selecionadoCB;
    private RadioButton mascufemi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeCompletoEditTex = findViewById(R.id.nomeCompleteET);
        telefoneEditText = findViewById(R.id.telefoneET);
        salvarButton = findViewById(R.id.salvarBt);
        salvarButton.setOnClickListener(this);
        ufSP1 = findViewById(R.id.ufSP);
        selecionadoCB = findViewById(R.id.selecionadoCB);
        mascufemi = findViewById(R.id.masculinoRB);
    }

    @Override
    public void onClick(View view) {
        StringBuilder formulario = new StringBuilder();

        //EditText
        formulario.append(nomeCompletoEditTex.getText().toString());
        formulario.append('\n');

        //Spinner
        formulario.append(((TextView) ufSP1.getSelectedView()).getText());
        formulario.append('\n');

        //CheckBox
        formulario.append(selecionadoCB.isChecked()?"Colocar e-mail na lista" : "Não colocar e-mail na lista");
        formulario.append('\n');

        //RadioButton
        formulario.append(mascufemi.isChecked() ? "Masculino" : "Feminino");
        formulario.append('\n');


        Toast.makeText(this, formulario.toString(), Toast.LENGTH_SHORT).show();

    }
}