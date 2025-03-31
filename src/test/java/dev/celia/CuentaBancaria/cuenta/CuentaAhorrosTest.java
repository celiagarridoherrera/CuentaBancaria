package dev.celia.CuentaBancaria.cuenta;

public class CuentaAhorrosTest {

    @Test
    void testCrearCuentaInactiva(){
        CuentaAhorros cuenta = new CuentaAhorros(9000.0f, 0.04f);
        assertFalse(cuenta.isActiva());
    }

    @Test
    void testCuentaInactivaNoPuedeConsignar(){
        CuentaAhorros cuenta = new CuentaAhorros(9000.0f, 0.04f);
        cuenta.consignar(1000.0f);
        assertEquals(9000.0f, cuenta.getSaldo(), 0.001);
    }

}
