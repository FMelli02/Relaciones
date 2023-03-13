/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import java.util.Scanner;
import relaciones.enumeraciones.Perro;
import relaciones.enumeraciones.Persona;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        Persona h1 = new Persona();
        Persona h2 = new Persona();
        System.out.println("Creación persona 1");
        System.out.print("\nIngrese el nombre de la persona: ");
        h1.setNombre(leer.next());
        System.out.print("Ingrese el apellido de la persona: ");
        h1.setApellido(leer.next());
        System.out.print("Ingrese el DNI: ");
        h1.setDocumento(leer.nextInt());
        System.out.print("Ingrese la edad: ");
        h1.setEdad(leer.nextInt());
        
        System.out.println("\nCreacion perro 1");
        System.out.print("\nIngrese el nombre del perro: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese la raza: ");
        p1.setRaza(leer.next());
        System.out.print("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        System.out.print("Ingrese el tamaño en metros: ");
        p1.setTamaño(leer.nextFloat());
        
        h1.setPerro(p1);
        
        System.out.println("Creación persona 2");
        System.out.print("\nIngrese el nombre de la persona: ");
        h2.setNombre(leer.next());
        System.out.print("Ingrese el apellido de la persona: ");
        h2.setApellido(leer.next());
        System.out.print("Ingrese el DNI: ");
        h2.setDocumento(leer.nextInt());
        System.out.print("Ingrese la edad: ");
        h2.setEdad(leer.nextInt());
        
        System.out.println("");
        
        System.out.println("\nCreacion perro 2");
        System.out.print("\nIngrese el nombre del perro: ");
        p2.setNombre(leer.next());
        System.out.print("Ingrese la raza: ");
        p2.setRaza(leer.next());
        System.out.print("Ingrese la edad: ");
        p2.setEdad(leer.nextInt());
        System.out.print("Ingrese el tamaño en metros: ");
        p2.setTamaño(leer.nextFloat());
        
        h2.setPerro(p2);
        
        System.out.println("");
        System.out.println(h1.toString());
        System.out.println("");
        System.out.println(h2.toString());
        
    }
}
