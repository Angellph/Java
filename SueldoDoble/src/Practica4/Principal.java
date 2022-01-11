package Practica4;

import Practica4.Alumno4;
import qwertyu.MyGirlIsSh;
public class Principal {

   
    public static void main(String[] args) {
        String nombre;
        double c1, c2, c3, c4;
        Alumno4 sc = new Alumno4 ();
        MyGirlIsSh rec = new MyGirlIsSh();
        
        nombre = rec.ValidarCadena("Escribe el nombre del alumno: ");
        c1 = rec.ValidarDouble("Escribe la primera calificacion: ");
        c2 = rec.ValidarDouble("Escribe la segunda calificacion");
        c3 = rec.ValidarDouble("Escribe la tercera calificacion");
        c4 = rec.ValidarDouble("Escribe la cuarta calificacion");
        
        sc.establecerNombreAlum(nombre);
        sc.establecerCalf1(c1);
        sc.establecerCalf2(c2);
        sc.establecerCalf3(c3);
        sc.establecerCalf4(c4);
        sc.CalcularPromedio();
        sc.CalcularObservacion();
        
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("El nombre del alumno es: "+nombre);
        System.out.println("El promedio del alumno es: "+sc.ObtenerPromedio());
        System.out.println("Usted a: "+sc.ObtenerObservacion());
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - -");
        
        
                
        
    }
    
}
