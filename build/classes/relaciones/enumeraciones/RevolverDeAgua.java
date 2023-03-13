/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.enumeraciones;

public class RevolverDeAgua {
    //Atributos
    private int posicionActual;
    private int posicionAgua;

    //Métodos
    public void llenarRevolver() {
        posicionActual=(int)(Math.random()*5);
        posicionAgua=(int)(Math.random()*5);

    }

    public boolean mojar() {
        return (posicionActual==posicionAgua);
    }

    public void siguienteChorro() {
        posicionActual++;
        if (posicionAgua>6){
            posicionActual=1;
        }
    }

    public void mostrar() {
        System.out.println("Posición actual: "+posicionActual);
        System.out.println("Posición agua: "+posicionAgua);
    }
}
