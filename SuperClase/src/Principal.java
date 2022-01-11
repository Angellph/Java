import qwertyu.MyGirlIsSh;
public class Principal {

 
    public static void main(String[] args) {
        //Persona
       MyGirlIsSh sc = new MyGirlIsSh();
       
       
       Persona per = new Persona("Angel","Actopna",2003,"LOH");
       System.out.println("\n Persona");
       per.ImprimirDatos();
       
       //Alumno
       Estudiante alumno = new Estudiante("Pancho","Actopan",2000,"Lopez", (float) 8.9,"123456789",3);
        System.out.println("\n Estudiante");
       alumno.ImprimirDatos();
       
       //Empleado
       Empleado em = new Empleado("Angel","Actopan",2003,"LOH",1900,"JWJQF","Vendedor");
        System.out.println("\nEmpleado");
       em.ImprimirDatos();
       
    }
    
}
