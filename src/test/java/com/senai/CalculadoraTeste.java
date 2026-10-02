package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    @Test 
    void testarSoma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test 
    void testarMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicacao(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    void testarDivisao() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.divisao(6, 2);
        assertEquals(3, resultado);
    }
}
