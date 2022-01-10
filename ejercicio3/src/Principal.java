import qwertyu.MyGirlIsSh;
public class Principal {

   
    public static void main(String[] args) {
        Persona sc = new Persona ();
        MyGirlIsSh vec = new MyGirlIsSh();
        System.out.println("El nombre de la persona es: "+sc.getNombre());
        sc.setNombre();
        System.out.println("El anio de nacimiento "+sc.getAnioNacimiento());
        sc.setAnioNacimiento();
        System.out.println("El anio actual es: "+sc.anioA);
        System.out.println("El curp de la persona es: "+sc.getCurp());
        sc.setCurp();
        
        int Edad = sc.calcularEdad(sc.anioA, sc.getAnioNacimiento());
        double IMS = sc.calcularIMC(sc.peso, sc.estatura);
        
        System.out.println("Edad: "+Edad);
        System.out.println("IMS: "+IMS);
    }
    
}
