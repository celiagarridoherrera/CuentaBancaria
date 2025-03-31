package dev.celia.CuentaBancaria.cuenta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    void testCrearCuentaSaldoyTasaAnualCorrectos(){
        Cuenta cuenta = new Cuenta(5000.0f, 0.05f);
        assertEquals(5000.0f, cuenta.getSaldo(), 0.001);
        assertEquals(0.05f, cuenta.getTasaAnual(), 0.001);
    }

    @Test
    void testConsignarIncrementoSaldoyNumConsignaciones(){
        Cuenta cuenta = new Cuenta(5000.0f, 0.05f);
        cuenta.consignar(1000.0f);
        assertEquals(6000.0f, cuenta.getSaldo(), 0.001);
        assertEquals(1, cuenta.getNumConsignaciones());
    }

}
