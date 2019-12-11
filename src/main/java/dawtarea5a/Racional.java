/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawtarea5a;

import java.util.Random;

/**
 *
 * @author adrianpg
 */
public class Racional {

    //Declaración de atributos
    private int numerador;
    private int denominador;

    //Constructor por defecto
    public Racional() {

        this.numerador = 1;
        this.denominador = 1;
    }

    //Constructor parametrizado
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;

        if (denominador == 0) {
            System.out.println("El denominador no es válido.");
            this.denominador = 1;

        } else {
            this.denominador = denominador;
        }

    }

    //Métodos getters
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    //Métodos setters
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (this.denominador == 0) {
            System.out.println("El denominador no es válido.");
            this.denominador = 1;

        } else {
            this.denominador = denominador;
        }
    }

    //Método que imprime por consola el número racional
    public void imprimirConsola() {

        System.out.println("Número Racional: " + getNumerador() + "/" + getDenominador());
    }

    //Método toString
    @Override
    public String toString() {
        return +numerador + "/" + denominador;
    }

    //Método suma
    public void suma(Racional x) {

        if (this.denominador == x.getDenominador()) {
            this.numerador = (this.numerador + x.numerador);

        } else {
            this.numerador = (this.numerador * x.denominador + this.denominador * x.numerador);
            this.denominador = this.denominador * x.denominador;
        }

    }

    //Método resta
    public void resta(Racional x) {

        if (this.denominador == x.getDenominador()) {
            this.numerador = (this.numerador - x.numerador);

        } else {
            this.numerador = (this.numerador * x.denominador - this.denominador * x.numerador);
            this.denominador = this.denominador * x.denominador;
        }
    }

    //Método producto
    public void producto(Racional x) {
        this.numerador = this.numerador * x.numerador;
        this.denominador = this.denominador * x.denominador;
    }

    //Método de clase división
    public static Racional division(Racional x, Racional y) {

        int multiplicacion = x.numerador * y.denominador;
        int multiplicacionb = x.denominador * y.numerador;

        return new Racional(multiplicacion, multiplicacionb);

    }

    //Método de clase igualdad
    public static boolean igualdad(Racional x, Racional y) {

        return x.getNumerador() == y.getDenominador() && x.getDenominador() == y.getNumerador();

    }

    //Método de clase que devuelve un objeto Racional
    public static Racional aleatorio() {

        Random aleatorio = new Random();

        int numerador = aleatorio.nextInt(10);
        int denominador = aleatorio.nextInt(9) + 1;

        return new Racional(numerador, denominador);
    }

}
