package Practica3;

import qwertyu.MyGirlIsSh;
public class Principal {

   
    public static void main(String[] args) {
        int nDia;
        DiceDia2 sc = new DiceDia2 ();
        MyGirlIsSh rec = new MyGirlIsSh ();
        nDia = rec.ValidarInt("Ingresa el numero de dia");
        sc.EstablecerNumDia(nDia);
         sc.CalcularNombreDia();

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("El dia es: "+sc.ObtenerNombreDia());
        


    }
    
}
