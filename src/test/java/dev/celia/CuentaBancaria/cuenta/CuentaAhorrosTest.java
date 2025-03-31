package dev.celia.CuentaBancaria.cuenta;

public class CuentaAhorrosTest {

    @Test
    void testCrearCuentaInactiva(){
        CuentaAhorros cuenta = new CuentaAhorros(9000.0f, 0.04f);
        assertFalse(cuenta.isActiva());
    }

}
