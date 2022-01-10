/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
public class calcular {   
    private static int pago;
        public static int AMayor(int AMayor){
            pago = (AMayor * 75)/100;
            return pago;
        }
        public static int ninos(int boys){
            pago = (boys * 75)/100;
            return pago;
        }
        public  static int Miss(int maestro){
            pago = (maestro * 25)/100;
            return pago;
        }        
}

