package com.aluracursos.conversordemonedas.modelo;

public record Moneda(double conversion_result) {
    @Override
    public double conversion_result() {
        return conversion_result;
    }
}
