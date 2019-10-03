package app.android.frisco.gestorgastosapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import app.android.frisco.gestorgastosapp.R;
import app.android.frisco.gestorgastosapp.repositories.SaldoRepository;

public class RegistroActivity extends AppCompatActivity {
    EditText txtMonto;
    RadioButton Ingreso, Egreso;
    Spinner SpUso;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtMonto = findViewById(R.id.txtMonto);
        Ingreso = findViewById(R.id.txtIngreso);
        Egreso = findViewById(R.id.txtEgreso);
        SpUso = findViewById(R.id.SpUso);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registro();
            }
        });
    }
    public void Registro(){
        int spinner;
        spinner=SpUso.getSelectedItemPosition()+1;
        double monto=Double.parseDouble(txtMonto.getText().toString());
        double credito=0, ahorro=0, efectivo=0;
        if(spinner==1){
            credito=monto;
        }else if(spinner==2){
            ahorro=monto;
        }
        else if(spinner == 3){
            efectivo=monto;
        }

        if(Ingreso.isChecked()){
            SaldoRepository.add(SaldoRepository.id()+10,credito,ahorro,efectivo);
        }
        if(Egreso.isChecked()){
            SaldoRepository.menos(SaldoRepository.id()-10,credito,ahorro,efectivo);

        }
        Intent intent=new Intent(RegistroActivity.this , MainActivity.class);
        startActivity(intent);
    }

}
