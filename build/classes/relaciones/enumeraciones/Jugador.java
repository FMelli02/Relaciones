/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.enumeraciones;

import java.util.Scanner;

public class Jugador {
    Scanner leer = new Scanner(System.in);

    //Atributos
    private int id;
    private String nombre;
    private boolean mojado;

    //Constructores
    public Jugador() {

    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre+id;

    }

    //Getter and Setter
    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    //Métodos

    public void disparo(RevolverDeAgua r) {
        if (r.mojar()==true){
            setMojado(true);
        } else {
            setMojado(false);
            r.siguienteChorro();
        }
    }
}
