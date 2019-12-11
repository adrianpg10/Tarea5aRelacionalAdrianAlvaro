/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawtarea5a;

/**
 *
 * @author adrianpg
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {

        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;

        if (this.denominador == 0) {
            System.out.println("El denominador no es válido.");
            this.denominador = 1;

        } else {
            this.denominador = denominador;
        }

    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

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

    public void imprimirConsola() {

        System.out.println("Número Racional: " + getNumerador() + "/" + getDenominador());
    }

    @Override
    public String toString() {
        return +numerador + "/" + denominador;
    }

    public void suma(Racional x) {

        if (this.denominador == x.getDenominador()) {
            this.numerador = (this.numerador + x.numerador);

        } else {
            this.numerador = (this.numerador * x.denominador + this.denominador * x.numerador);
            this.denominador = this.denominador * x.denominador;
        }

    }

    public void resta(Racional x) {

        if (this.denominador == x.getDenominador()) {
            this.numerador = (this.numerador - x.numerador);

        } else {
            this.numerador = (this.numerador * x.denominador - this.denominador * x.numerador);
            this.denominador = this.denominador * x.denominador;
        }
    }
}
