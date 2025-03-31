package dev.celia.CuentaBancaria.cuenta;

public class CuentaCorriente extends Cuenta {
    private Float sobregiro = 0.0f;

    public CuentaCorriente(Float saldo, Float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void retirar(Float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            } else {
                sobregiro += (cantidad - saldo);
                saldo = 0.0f;
            }
            numRetiros++;
        }

    @Override
    public void consignar(Float cantidad) {
        if (sobregiro > 0.0f) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0.0f;
            } else {
                sobregiro -= cantidad;
                cantidad = 0.0f;
            }
        }
        saldo += cantidad;
        numConsignaciones++;
    }

    @Override
    public String imprimir() {
        int transacciones = numConsignaciones + numRetiros;
        return "Saldo: " + saldo + "\n" +
               "Sobregiro: " + sobregiro + "\n" +
               "Transacciones: " + transacciones + "\n" +
               "Comision Mensual: " + comisionMensual + "\n";
    }

    public float getSobregiro() {
        return sobregiro;
    }

}
