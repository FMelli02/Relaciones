/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones.enumeraciones.Juego;
import relaciones.enumeraciones.Jugador;
import relaciones.enumeraciones.RevolverDeAgua;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador>jugadores = new ArrayList();
        System.out.print("Ingrese la cantidad de jugadores (Entre 1 y 6): ");
        int cant=leer.nextInt();
        if (cant>6 || cant<1) {
            cant=6;
        }
        int cont=0;

        do {
            cont++;
            System.out.println("Ingrese el nombre del jugador "+ cont);
            String cad = leer.next();
            Jugador j = new Jugador(cont,cad);
            jugadores.add(j);
        }while (cont!=cant);

        RevolverDeAgua r = new RevolverDeAgua();
        r.llenarRevolver();

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, r);
        juego.ronda();
    }
}