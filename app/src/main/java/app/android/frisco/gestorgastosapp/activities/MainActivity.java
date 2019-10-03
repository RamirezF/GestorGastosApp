package app.android.frisco.gestorgastosapp.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import app.android.frisco.gestorgastosapp.R;
import app.android.frisco.gestorgastosapp.repositories.SaldoRepository;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    TextView credito,Ahorro,Efectivo;
    ProgressBar progres;
    ImageView ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab=findViewById(R.id.fab);
        credito=findViewById(R.id.txtCredito);
        Ahorro=findViewById(R.id.txtAhorro);
        Efectivo=findViewById(R.id.txtEfectivo);
        progres=findViewById(R.id.progressBar);
        ver=findViewById(R.id.ver_ahorro);

        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MostrarActivity.class);
                startActivity(intent);
            }
        });


        //progres.setMin(0);
        progres.setProgress(SaldoRepository.id());
        progres.setMax(100);



        Ahorro.setText(Double.toString(SaldoRepository.ahorro()));
        credito.setText(Double.toString(SaldoRepository.credito()));
        Efectivo.setText(Double.toString(SaldoRepository.efectivo()));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                direccionar();
            }
        });
    }
    public void direccionar(){
        Intent intent=new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }
}
