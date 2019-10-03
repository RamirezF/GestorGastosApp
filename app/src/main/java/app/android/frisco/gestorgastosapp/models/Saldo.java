package app.android.frisco.gestorgastosapp.models;

public class Saldo {
    private Integer id;
    private Double credito;
    private Double ahorro;
    private Double efectivo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public Double getAhorro() {
        return ahorro;
    }

    public void setAhorro(Double ahorro) {
        this.ahorro = ahorro;
    }

    public Double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Double efectivo) {
        this.efectivo = efectivo;
    }

    public Saldo(Integer id, Double credito, Double ahorro, Double efectivo) {
        this.id = id;
        this.credito = credito;
        this.ahorro = ahorro;
        this.efectivo = efectivo;
    }
}
