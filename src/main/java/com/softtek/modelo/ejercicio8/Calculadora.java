package com.softtek.modelo.ejercicio8;

import com.softtek.persistencia.ejercicio8.DivisionEntreCeroException;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Calculadora implements Operaciones {

    @Override
    public double sumar(double x, double y) {
        return x+y;
    }

    @Override
    public double restar(double x, double y) {
        return x-y;
    }

    @Override
    public double multiplicar(double x, double y) {
        return x*y;
    }

    @Override
    public double dividir(double x, double y) throws DivisionEntreCeroException{
        if(y!=0){
            return x/y;
        } else{
            throw new DivisionEntreCeroException("El divisor es 0");
        }
    }
}
