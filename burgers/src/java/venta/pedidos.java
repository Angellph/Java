/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

public class pedidos {
    private static int costo;
        public static int des(int edad, int precio, String llevar){
            if(edad >=5 && edad <= 12){
                costo = (int) (precio - (precio * 0.30));
            }   
            if(edad > 12 && edad <= 18){
                costo = (int) (precio - (precio * 0.25));
            }
            if(edad > 18 && edad <= 40){
                costo = (int) (precio - (precio * .30));
            }
            if(edad > 40 && edad <= 100){
                costo = precio;
            }
            if("Si".equals(llevar)){
                costo = (int)(costo * 1.3);
            }
            if("No".equals(llevar)){
                costo = costo;
            }
            return costo;
        }
        private static int precio;
            public static int tam(String ham){
                if("Chica".equals(ham)){
                    precio = 100;
                }
                if("Mediana".equals(ham)){
                    precio = 150;
                }
                if("Grande".equals(ham)){
                    precio = 180;
                }
                return precio;
            }
}










































