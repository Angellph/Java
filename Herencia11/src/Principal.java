import qwertyu.MyGirlIsSh;
public class Principal {
    static String nom;
    static String dom;
    static int aN;
    static String curp;
    static float pro;
    static String matri;
    static int sem;
    static float suel;
    static String rfc;
    static String pues;
    public static void main(String[] args) {
        MyGirlIsSh sc = new MyGirlIsSh();
        int decision;
        String opcion;
        do{
            System.out.println("\tMenu\n 1.Persona\n 2.Estudiante\n 3.Empleado");
            opcion = sc.ValidarCadena("Seleccione: ");
            opcion = opcion.toUpperCase();
            seleccionarOpcion(opcion);
            decision = sc.ValidarInt("¿quieres hacer de nuevo el procedimiento?    1:si/ 2: no");
          }while(decision==1);
    }
    private static void LecturaDeDatos() {
        MyGirlIsSh sc = new MyGirlIsSh();
         nom = sc.ValidarCadena("Digite su nombre: ");
         dom = sc.ValidarCadena("Digite su domicilio: ");
         aN = sc.ValidarInt("Digite su anio de nacimiento: ");
         curp = sc.ValidarCadena("Digite su curp");   
    }
    private static void seleccionarOpcion(String opcion) {
        MyGirlIsSh sc = new MyGirlIsSh();
      
        //Persona
        if(opcion.equals("PERSONA")){
        System.out.println("\t Persona");
        LecturaDeDatos();
        Persona per = new Persona(nom, dom,aN,curp);
        System.out.println("....................................................");
        System.out.println("Datos de la persona");
        per.ImprimirDatos();
        System.out.println("....................................................");
            
        }
        
        //Estudiante      
        if(opcion.equals("ESTUDIANTE")){
             System.out.println("\t Estudiante: ");
        LecturaDeDatos();
        pro = sc.ValidarFloat("Digite su promedio: ");
        matri = sc.ValidarCadena("Digite su matricula: ");
        sem = sc.ValidarInt("Digite su semestre: ");
        Estudiante est = new Estudiante(nom,dom,aN,curp,pro,matri,sem);
        System.out.println("....................................................");
        System.out.println("\n Datos del estudiante: ");
        est.ImprimirDatos();
        System.out.println("....................................................");
        
        }
       
        //Empleado
        if(opcion.equals("EMPLEADO")){
        System.out.println("\t Empleado: ");
        LecturaDeDatos();
        suel = sc.ValidarFloat("Digite su sueldo: ");
        rfc = sc.ValidarCadena("Digite su RFC: ");
        pues = sc.ValidarCadena("Digite su puesto en su trabajo: ");
        Empleado em = new Empleado(nom,dom,aN,curp,suel,rfc,pues);
        System.out.println("....................................................");
        System.out.println("\n Datos del empleado: ");
        em.ImprimirDatos();
        System.out.println("....................................................");
        }
        
    }
    
}