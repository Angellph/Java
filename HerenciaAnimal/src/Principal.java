import qwertyu.MyGirlIsSh;
public class Principal {
    static float pes;
    static float longi;
    static String esp;
    static String col;
    static String nom;
    static String hab;

 
    public static void main(String[] args) {
        
            Animal();
            Ave();
            Pez();
            Perro();
        
        
      
    }

    private static void Datos() {
        System.out.println("\n Animal");
        MyGirlIsSh sc = new MyGirlIsSh();
        pes = sc.ValidarFloat("Digite el peso: ");
        longi = sc.ValidarFloat("Digite la longuitud: ");
        esp = sc.ValidarCadena("Digite la especie: ");
        col = sc.ValidarCadena("Digite el color: ");                      
    }
    private static void Animal(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Animal");
        Datos();
        Animal an = new Animal(pes,longi,esp,col);
        System.out.println("....................................................");
        System.out.println("Datos del animal");
        an.ImprimirDatos();
        System.out.println("....................................................");
        an.Desplazar();
        an.Comer();
        System.out.println("....................................................");
        
        

    }
    private static void Ave(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Ave");
        Datos();
        hab = sc.ValidarCadena("Digite el habitad");
        Ave av = new Ave (pes,longi,esp,col,hab);
        System.out.println("....................................................");
        System.out.println("\n Datos del ave");
        av.ImprimirDatos();
        System.out.println("....................................................");
        av.Desplazar();
        av.Comer();
        System.out.println("....................................................");
        
    }
    private static void Pez(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Pez");
        Datos();
        hab = sc.ValidarCadena("Digite el habitad");
        Pez pe = new Pez(pes,longi,esp,col,hab);
        System.out.println("....................................................");
        System.out.println("\n Datos del pez");
        pe.ImprimirDatos();
        System.out.println("....................................................");
        pe.Desplazar();
        pe.Comer();
        System.out.println("....................................................");
    }
    private static void Perro(){
        MyGirlIsSh sc = new MyGirlIsSh();
        System.out.println("\t Perro");
        Datos();
        hab = sc.ValidarCadena("Digite el habitad");
        nom = sc.ValidarCadena("Digite el nombre: ");
        Perro per = new Perro(pes,longi,esp,col,hab,nom);
        System.out.println("...................................................");
        System.out.println("\n Datos del perro");
        per.ImprimirDatos();
        System.out.println("...................................................");
        per.Desplazar();
        per.Comer();
        System.out.println("....................................................");
    }
            
            
            
}
