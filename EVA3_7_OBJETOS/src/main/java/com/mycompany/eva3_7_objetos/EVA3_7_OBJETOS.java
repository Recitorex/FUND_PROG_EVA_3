/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_objetos;

/**
 *
 * @author Alberto
 */
public class EVA3_7_OBJETOS {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Juan";
        perso1.appellido = "Perez";
        perso1.edad = 10;
        imprimirPersonas(perso1);
        Persona perso2 = new Persona();
        System.out.println(perso2);
        perso2.nombre = "Pedro";
        perso2.appellido = "Paramo";
        perso2.edad= 70;
        imprimirPersonas(perso2);
        
    }
    public static void imprimirPersonas(Persona perso){
        System.out.println("Direccion: " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.appellido);
        System.out.println("Edad:" + perso.edad) ;
    
    }
}
// definen una platilla para crear objetos
// crean un nuevo tipo de dato 
class Persona {
  String nombre;
  String appellido;
  int edad;
}
