/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawtarea5a;

/**
 *
 * @author alvaro
 */
public class AppRacional {

    public static void main(String[] args) {

        //Crea dos racionales  con valores z=4/5 y k=3/4.
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);

        //Crea un racional aleatorio.
        //Imprime los tres racionales.
        z.imprimirConsola();
        k.imprimirConsola();
        System.out.println("Número aletorio : " + Racional.aleatorio());

    }
}
