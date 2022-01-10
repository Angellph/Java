package Ejercicio1;
import qwertyu.MyGirlIsSh;

public class Principal {
    static String marc;
    static int mod;
    static int Añ;
    static String col;
    static int cantPuer;
    static int cap;
    static int pes;
    static double cos;
    static int tam;

    
    public static void main(String[] args) {
        Vehiculo();
        Moto();
        Camioneta();
       
        
        
    }
    private static void Datos(){
        MyGirlIsSh sc = new MyGirlIsSh();
        marc = sc.ValidarCadena("Digite la marca: ");
        mod = sc.ValidarInt("Digite la modelo: ");
        Añ = sc.ValidarInt("Digite el año: ");
        col = sc.ValidarCadena("Digite el color: ");
        cantPuer = sc.ValidarInt("Digite la cantidad de puertas: ");    
    }
    private static void Vehiculo(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Vehiculo");
        Datos();
        Vehiculo ve = new Vehiculo(marc,mod,Añ,col,cantPuer);
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
        System.out.println("\nDatos del vehiculo");
        ve.ImprimirDatos();
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
        ve.Arrancar();
        ve.Apagar();
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
    }
    private static void Moto(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\tMoto");
        Datos();
        cap = sc.ValidarInt("Digite la capacidad");
        pes = sc.ValidarInt("Digite el peso: ");
        cos = sc.ValidarDouble("Digite el costo: ");
        Moto mot = new Moto(marc,mod,Añ,col,cantPuer,cap,pes,cos);
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
        System.out.println("\n Datos de la moto");
        mot.ImprimirDatos();    
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
        mot.Encender();
        mot.Frenar();
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
    }
    public static void Camioneta(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\tCamioneta");
        Datos();
        cap = sc.ValidarInt("Digite la capacidad: ");
        tam = sc.ValidarInt("Digite el tamaño: ");
        Camioneta cam = new Camioneta(marc,mod,Añ,col,cantPuer,cap,tam);
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
        System.out.println("\n Datos de la camioneta: ");
        cam.ImprimirDatos();
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
        cam.Moverse();
        cam.Estacionarse();
        System.out.println("ºººººººººººººººººººººººººººººººººººººººººººººººººººº");
    }
}
