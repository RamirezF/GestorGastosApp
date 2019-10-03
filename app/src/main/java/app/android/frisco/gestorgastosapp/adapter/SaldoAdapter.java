package app.android.frisco.gestorgastosapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import app.android.frisco.gestorgastosapp.R;
import app.android.frisco.gestorgastosapp.models.Saldo;


public class SaldoAdapter extends RecyclerView.Adapter<SaldoAdapter.ViewHolder> {
    private List<Saldo> saldos;

    public void setSaldos(List<Saldo> saldos){
        this.saldos = saldos;
    }

    public SaldoAdapter(){
        this.saldos = new ArrayList<>();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tipo;
        TextView saldo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tipo=itemView.findViewById(R.id.tipo);
            saldo = itemView.findViewById(R.id.saldo);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {            // Con qué?
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_saldo,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Saldo saldito = this.saldos.get(i);
        Context context = viewHolder.itemView.getContext();
        viewHolder.tipo.setText(saldito.getId());
        viewHolder.saldo.setText(saldito.getAhorro().toString());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

