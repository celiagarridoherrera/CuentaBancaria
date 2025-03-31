package dev.celia.CuentaBancaria.cuenta;

public class Cuenta {
    protected Float saldo;
    protected Integer numConsignaciones = 0;
    protected Integer numRetiros = 0;
    protected Float tasaAnual;
    protected Float comisionMensual = 0.0f;
    public Cuenta(Float saldo, Float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public Float getSaldo() {
        return saldo;
    }
    public Float getTasaAnual() {
        return tasaAnual;
    }

    public void consignar(Float cantidad) {
        saldo += cantidad;
        numConsignaciones++;
    }

    public Integer getNumConsignaciones() {
        return numConsignaciones;
    }
}
