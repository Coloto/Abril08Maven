package com.softtek.persistencia;

public class DivisionEntreCeroException extends Exception{
    public DivisionEntreCeroException(String mensaje){
        super(mensaje);
    }
}
