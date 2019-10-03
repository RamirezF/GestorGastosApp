package app.android.frisco.gestorgastosapp.repositories;

import java.util.ArrayList;
import java.util.List;

import app.android.frisco.gestorgastosapp.models.Saldo;

public class SaldoRepository {
    private static List<Saldo> saldos;
    static {
        saldos =new ArrayList<>();
        saldos.add(new Saldo(30,1000.0,1000.0,1000.0));
    }

    public static List<Saldo> getSaldos(){
        return saldos;
    }

    public static void add(int id,double credito, double ahorro, double efectivo){
        saldos.add(new Saldo(id,credito,ahorro,efectivo));
    }
    public static double credito(){
        double credito=0;
        for(int i=0; i<saldos.size();i++){
            credito+=saldos.get(i).getCredito();
        }
        return credito;
    }
    public static double ahorro(){
        double credito=0;
        for(int i=0; i<saldos.size();i++){
            credito+=saldos.get(i).getAhorro();
        }
        return credito;
    }
    public static double efectivo(){
        double credito=0;
        for(int i=0; i<saldos.size();i++){
            credito+=saldos.get(i).getEfectivo();
        }
        return credito;
    }

    public static void menos(int id,double credito, double ahorro, double efectivo){
        double totalcre, totalaho, totalefe;
        totalcre=credito()-credito;
        totalaho=ahorro()-ahorro;
        totalefe=efectivo()-efectivo;
        if(totalaho<0){
            totalaho=0;
        }if(totalcre<0){
            totalcre=0;
        }if(totalefe<0){
            totalefe=0;
        }

        saldos.clear();
        saldos.add(new Saldo(id,totalcre,totalaho,totalefe));
    }

    public static int contar(int ingresos, int egresos){
        int valor=50;

        if(ingresos==1){
            valor=valor+1;
        }if(egresos==1){
            valor=valor-1;
        }
        return valor;
    }
    public static int id(){
        int valor=0;
        for(int i=0; i<saldos.size();i++){
            valor=saldos.get(i).getId();
        }

        return valor;
    }
}
