package com.softtek.presentacion;

import com.softtek.modelo.ejercicio8.Calculadora;
import com.softtek.modelo.ejercicio7.Producto;
import com.softtek.persistencia.ejercicio8.DivisionEntreCeroException;
import com.softtek.persistencia.ejercicio7.ProductoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Ejercicio7
        //ejercicio7();

        ejercicio8();
    }

    public static void ejercicio7(){
        try {
            Producto producto1 = new Producto("1", "Silla", 15.99, "Ikea", "Silla de madera");
            Producto producto2 = new Producto();
            System.out.println(producto1.comprobar());
            System.out.println(producto2.comprobar());
        } catch (ProductoException e) {
            System.out.println("-------------");
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void ejercicio8(){
        double n1, n2;
        try{
            Calculadora calc = new Calculadora();
            System.out.print("Operacion que desea realizar\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n> ");
            String opcion = input.nextLine();

            switch (opcion){
                case "1":
                    System.out.print("Numero 1: ");
                    n1 = input.nextDouble();
                    System.out.print("Numero 2: ");
                    n2 = input.nextDouble();
                    System.out.println(calc.sumar(n1, n2));
                case "2":
                    System.out.print("Numero 1: ");
                    n1 = input.nextDouble();
                    System.out.print("Numero 2: ");
                    n2 = input.nextDouble();
                    System.out.println(calc.restar(n1, n2));
                case "3":
                    System.out.print("Numero 1: ");
                    n1 = input.nextDouble();
                    System.out.print("Numero 2: ");
                    n2 = input.nextDouble();
                    System.out.println(calc.multiplicar(n1, n2));
                case "4":
                    System.out.print("Numero 1: ");
                    n1 = input.nextDouble();
                    System.out.print("Numero 2: ");
                    n2 = input.nextDouble();
                    System.out.println(calc.dividir(n1, n2));
            }
        } catch (InputMismatchException | DivisionEntreCeroException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
