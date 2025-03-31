package dev.celia.CuentaBancaria.cuenta;

import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    void testCrearCuentaSaldoyTasaAnualCorrectos(){
        Cuenta cuenta = new Cuenta(5000.0f, 0.05f);
        assertEquals(5000.0f, cuenta.getSaldo(), 0.001);
        assertEquals(0.05f, cuenta.getTasaAnual(), 0.001);
    }

}
