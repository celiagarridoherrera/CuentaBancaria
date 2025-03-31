package dev.celia.CuentaBancaria.cuenta;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void testCuentaInactivaNoPuedeRetirar(){
        CuentaAhorros cuenta = new CuentaAhorros(9000.0f, 0.04f);
        cuenta.retirar(1000.0f);
        assertEquals(9000.0f, cuenta.getSaldo(), 0.001);
    }

    @Test
    void testComisionMensualExtra(){
        CuentaAhorros cuenta = new CuentaAhorros(15000.0f, 0.12f);
        for (int i = 0; i < 6; i++) {
            cuenta.retirar(1000.0f);
        }
        cuenta.calcularComisionMensual();
        assertTrue(cuenta.getSaldo() < 15000.0f);
        assertEquals(2000.0f, cuenta.comisionMensual,0.001);
    }

    @Test
    void testImprimirDatos(){
        CuentaAhorros cuenta = new CuentaAhorros(15000.0f, 0.05f);
        cuenta.consignar(500.0f);
        cuenta.retirar(200.0f);
    

        String datos = cuenta.imprimir();
        assertTrue(datos.contains("Saldo:"));
        assertTrue(datos.contains("Transacciones:"));
    }
}
