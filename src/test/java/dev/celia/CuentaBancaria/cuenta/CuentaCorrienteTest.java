package dev.celia.CuentaBancaria.cuenta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {

    @Test
    void testRetirarMasDelSaldoSobregiro(){
        CuentaCorriente cuenta = new CuentaCorriente(1000.0f, 0.03f);
        cuenta.retirar(1500.0f);
        assertEquals(0.0f, cuenta.getSaldo(), 0.001);
        assertEquals(500.0f, cuenta.getSobregiro(), 0.001);
    }

    @Test
    void testConsignarDisminuyeSobregiro(){
        CuentaCorriente cuenta = new CuentaCorriente(1000.0f, 0.03f);
        cuenta.retirar(1200.0f);
        cuenta.consignar(500.0f);
        assertEquals(300.0f, cuenta.getSaldo(), 0.001);
        assertEquals(0.0f, cuenta.getSobregiro(), 0.001);
    }

    @Test
    void testImprimirDatos(){
        CuentaCorriente cuenta = new CuentaCorriente(1000.0f, 0.03f);
        cuenta.consignar(1200.0f);
        cuenta.retirar(300.0f);

        String datos = cuenta.imprimir();
        assertTrue(datos.contains("Saldo:"));
        assertTrue(datos.contains("Sobregiro:"));
    }
}
