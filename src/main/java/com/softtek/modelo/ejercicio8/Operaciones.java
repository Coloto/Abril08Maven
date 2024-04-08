package com.softtek.modelo.ejercicio8;

import com.softtek.persistencia.ejercicio8.DivisionEntreCeroException;

public interface Operaciones {
    double sumar(double x, double y);
    double restar(double x, double y);
    double multiplicar(double x, double y);
    double dividir(double x, double y) throws DivisionEntreCeroException;
}
