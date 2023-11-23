/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_factorial;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Fcatorial de 5" + calcularFactorial(valor));
        //crear metodo calcularPotencia(int base, int potencial) --> regresa entero 
    }
    public static int calcularpotencial(int base,int valor){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la base ");
        int base = input.nextInt();
        
    
    }
    public static int calcularFactorial(int valor){
        
        int guardar = 1;
        for (int i =1 ; i <= valor; i++) {
            guardar*= i;// guardar es = a guardar *i
            
             }
        return guardar;
    }
}
