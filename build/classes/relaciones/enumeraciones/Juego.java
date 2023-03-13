/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.enumeraciones;

import java.util.ArrayList;

public class Juego {
    //Atributos
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua r;

    //Métodos
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public void ronda() {
        for(Jugador aux : this.jugadores) {
            aux.disparo(this.r);
            if (aux.isMojado()==true) {
                System.out.println("El " + aux.getNombre() + " ha perdido.");
                r.mostrar();
                break;
            }
        }
    }
}
