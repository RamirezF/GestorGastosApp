package app.android.frisco.gestorgastosapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.android.frisco.gestorgastosapp.R;
import app.android.frisco.gestorgastosapp.adapter.SaldoAdapter;
import app.android.frisco.gestorgastosapp.repositories.SaldoRepository;

public class MostrarActivity extends AppCompatActivity {
    private RecyclerView recicler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        recicler=findViewById(R.id.Saldo_list);

        recicler.setLayoutManager(new LinearLayoutManager(this));
        SaldoAdapter adapter=new SaldoAdapter();
        adapter.setSaldos(SaldoRepository.getSaldos());
        recicler.setAdapter(adapter);



    }
}
