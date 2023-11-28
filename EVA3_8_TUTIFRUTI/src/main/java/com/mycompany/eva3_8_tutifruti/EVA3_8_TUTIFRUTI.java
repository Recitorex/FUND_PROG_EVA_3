/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_tutifruti;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class EVA3_8_TUTIFRUTI {
    final static String Usuario = "TUTTI";
            final static String PASSWORD = "FRUTTI";

    public static void main(String[] args) {
        
        String usu;
            String pwd; 
            
        do{
           ;          
             usu = capturaDatos("Usuario: ");
 pwd = capturaDatos("Contraseña: ") ;
            //preguntar usuario y contraseña
        }while(!validarUsuario(usu, pwd));
        System.out.println("Bienvenido al sistema");
        
    }
    public static boolean validarUsuario(String usuario, String pwd){
       if(usuario.equals(Usuario) && pwd.equals(PASSWORD))
           return true;
       else 
           return false; 
    
    }
    public static String capturaDatos(String mensaje){
    Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
    
    }
}
