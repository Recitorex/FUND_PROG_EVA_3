/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_vvalor_maximo;

/**
 *
 * @author Alberto
 */
public class EVA3_2_vVALOR_MAXIMO {

    public static void main(String[] args) {
      //llammada funcion 
      //utilizae el valor directamente de la funcion
        System.out.println(buscarMaximo(100,200));
        //guardar el valor y usarlo depues
        int resu= buscarMaximo(100,200);
        System.out.println(resu);
        //Llamr a la funcion e ignorar el resultado
        buscarMaximo(100,200);
    }
    public static int buscarMaximo(int val1, int val2){
     
       /* if(val1 > val2)
          return val1;
      else
          return val2;
*/
       int resultado;
               if(val1>val2)
                   resultado=val1;
               else 
                   resultado = val2;
               return resultado;
    }
}
