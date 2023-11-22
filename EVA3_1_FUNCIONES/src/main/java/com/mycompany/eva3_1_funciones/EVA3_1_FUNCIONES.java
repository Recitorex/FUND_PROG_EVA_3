/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_funciones;



/**
 *
 * @author Alberto
 */
public class EVA3_1_FUNCIONES {

    public static void main(String[] args) { 
       //Llamada a funcion o procedimiento
        imprimirMensaje("Hola mundo!!", 5);     
    }
    
   public static void imprimirMensaje(String mensaje, int cant){
       for (int i = 0; i < cant; i++) {
           System.out.println(mensaje);
           
       } 
       System.out.println(mensaje);
   }
}
