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

    public void retirar(Float cantidad) {
        if (cantidad <= saldo) {
        saldo -= cantidad;
        numRetiros++;
        }
    }
    public Integer getNumRetiros() {
        return numRetiros;
    }

    public Float calcularInteresMensual() {
        float comisionMensual = saldo * (tasaAnual / 12);
        saldo += comisionMensual;
        return saldo;
    }

    public String imprimirEstadoCuenta() {
        return "Saldo: " + saldo + "\n" +
               "Tasa Anual: " + tasaAnual + "\n" +
               "Comision Mensual: " + comisionMensual + "\n" +
               "Numero de Consignaciones: " + numConsignaciones + "\n" +
               "Numero de Retiros: " + numRetiros + "\n";
    }
}
