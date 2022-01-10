package Ejercicio3;

import qwertyu.MyGirlIsSh;
public class Principal {
    static int id;
    static String nom;
    static String ap;
    static int ed;
    static int dor;
    static String dem;
    static int idFed;
    static String tit;
    static int aniosEx;
    public static void main(String[] args) {
        SeleccionFutbol();
        Futbolista();
        Entrenador();
        Masajista();
    }
    public static void Datos(){
        MyGirlIsSh sc = new MyGirlIsSh();
        id = sc.ValidarInt("Digite el id: ");
        nom = sc.ValidarCadena("Digite el nombre: ");
        ap = sc.ValidarCadena("Digite sus apellidos: ");
        ed = sc.ValidarInt("Digite la edad: ");
    }
    public static void SeleccionFutbol(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Seleccion de futbol");
        Datos();
        SeleccionFutbol fut = new SeleccionFutbol(id,nom,ap,ed);
        System.out.println("····················································");
        System.out.println("\n Datos de la seleccion de futbol");
        fut.ImprimirDatos();
        System.out.println("····················································");
        fut.Viajar();
        fut.Concentrarse();
        fut.Entrenamiento();
        fut.PartidoFutbol();
        System.out.println("····················································");   
    }
    public static void Futbolista(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Futbolista");
        Datos();
        dor = sc.ValidarInt("Digite su dorsal: ");
        dem = sc.ValidarCadena("Digite la demarcacion: ");
        Futbolista futb = new Futbolista(id,nom,ap,ed,dor,dem);
        System.out.println("····················································");
        System.out.println("\n Datos del futbolista");
        futb.ImprimirDatos();
        System.out.println("····················································");
        futb.Entrevista();
        System.out.println("····················································");
    }
    public static void Entrenador(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Entrenador");
        Datos();
        idFed = sc.ValidarInt("Digite el id de federacion: ");
        Entrenador ent = new Entrenador(id,nom,ap,ed,idFed);
        System.out.println("····················································");
        System.out.println("\n Datos del entrenador");
        ent.ImprimirDatos();
        System.out.println("····················································");
        ent.PlanificarEntrenamiento();
        System.out.println("····················································");               
    }
    public static void Masajista(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Masajista");
        Datos();
        tit = sc.ValidarCadena("Digite su titulacion: ");
        aniosEx = sc.ValidarInt("Digite los anios de experiencia: ");
        Masajista mas = new Masajista(id,nom,ap,ed,tit,aniosEx);
        System.out.println("····················································");
        System.out.println("\n Datos del masajista");
        mas.ImprimirDatos();
        System.out.println("····················································");
        mas.DarMasaje();
        System.out.println("····················································");
        
    }   
        
    
}
