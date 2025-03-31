package dev.celia.CuentaBancaria.cuenta;

public class CuentaAhorros extends Cuenta{

    private Boolean activa;

    public CuentaAhorros(Float saldo, Float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = saldo >= 10000.0f;
    }

    @Override
    public void consignar(Float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }

    @Override
    public void retirar(Float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    public void calcularComisionMensual() {
        if (numRetiros > 4) {
            int retirosExtra = numRetiros - 4;
            comisionMensual += retirosExtra * 1000;
        }
        super.calcularInteresMensual();
        this.activa = saldo >= 10000.0f;
    }

    public String imprimir() {
        int transacciones = numConsignaciones + numRetiros;
        return "Saldo: " + saldo + "\n" +
               "Transacciones: " + transacciones + "\n" +
               "Comision Mensual: " + comisionMensual + "\n";
    }

    public Boolean isActiva() {
        return activa;
    }
}

