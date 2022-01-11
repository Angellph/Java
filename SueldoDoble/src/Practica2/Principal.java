package Practica2;

import Practica2.Empleado7;
import qwertyu.MyGirlIsSh;
public class Principal {

   
    public static void main(String[] args) {
        String nomEmp;
        int hrsTra;
        double couHr;
        Empleado7 sc = new Empleado7 ();
        MyGirlIsSh rec = new MyGirlIsSh();
        
        nomEmp = rec.ValidarCadena("Ingresa el nombre del empleado: ");
        hrsTra = rec.ValidarInt("Ingresa el numero de horas trabajadas: ");
        couHr = rec.ValidarDouble("Ingresa la couta por hora: ");
        
        sc.establecerNombreEmp(nomEmp);
        sc.establecerHorasTrab(hrsTra);
        sc.establecerCoutaHora(couHr);
        sc.calcularSueldo();
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("El nombre del empleado es: "+sc.ObtenerNombreEmp());
        System.out.println("Su sueldo es: "+sc.obtenerSueldo());
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }
    
}
