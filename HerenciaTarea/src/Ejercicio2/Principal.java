package Ejercicio2;

import qwertyu.MyGirlIsSh;
public class Principal {
    static String mar;
    static String mod;
    static int PrecioVen;
    static int FechaIng;
    static String Mot;
    static String Due;
    public static void main(String[] args) {
        Celular();
        CelularNuevo();
        CelularMalogrado();
        
    }
    private static void Datos(){
        MyGirlIsSh sc = new MyGirlIsSh();
        mar = sc.ValidarCadena("Digite la marca del celular: ");
        mod = sc.ValidarCadena("Digite el modelo del celular: ");
        
    }
    private static void Celular(){
        System.out.println("\t Celular");
        Datos();
        Celular cel = new Celular(mar,mod);
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println("\n Datos del celular");
        cel.ImprimirDatos();
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        cel.Llamar();
        cel.Colgar();
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
    private static void CelularNuevo(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Celular Nuevo");
        Datos();
        PrecioVen = sc.ValidarInt("Digite el precio de venta del celular: ");
        FechaIng = sc.ValidarInt("Digite la fecha de ingreso: ");
        Celular_Nuevo ceN = new Celular_Nuevo(mar,mod,PrecioVen,FechaIng);
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println("\n Datos del celular nuevo: ");
        ceN.ImprimirDatos();
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
    private static void CelularMalogrado(){
        MyGirlIsSh sc = new MyGirlIsSh ();
        System.out.println("\t Celular Malogrado");
        Datos();
        Mot = sc.ValidarCadena("Digite el motivo: ");
        Due = sc.ValidarCadena("Digite el dueño: ");
        Celular_Malogrado celMal = new Celular_Malogrado(mar,mod,Mot,Due);
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println("\n Datos del celular malogrado");
        celMal.ImprimirDatos();
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        
    }
}
