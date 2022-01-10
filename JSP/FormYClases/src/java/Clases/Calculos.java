/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Calculos {
    private static int resultado;
        public static int medotoSuma(int num1, int num2){
            resultado = num1 + num2;
            return resultado;                                                                                            
        }
        public static int metodoResta(int num1, int num2){
            resultado = num1 - num2;
            return resultado;
        }
        public static int metodoMulti(int num1, int num2){
            resultado = num1 * num2;
            return resultado;
        }    
         public static int metodoDivi(int num1, int num2){
            if(num2 != 0)
            resultado = num1 / num2;
            return resultado;
    }
    
    
    
    
    
    
    
    
}
