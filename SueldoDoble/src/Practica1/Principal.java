package Practica1;

import qwertyu.MyGirlIsSh;
public class Principal {

    
    public static void main(String[] args) {
        String nomEmp;
        int hrsTra;
        double couHr;
        
        Empleado6 sc = new Empleado6();
        MyGirlIsSh rec = new MyGirlIsSh();
        nomEmp = rec.ValidarCadena("Escriba el nombre del empleado");
        hrsTra = rec.ValidarInt("Escriba el numero de horas trabajadas");
        couHr = rec.ValidarDouble("Escriba la couta por hora");
        
        sc.establecerNombreEmp(nomEmp);
        sc.establecerHorasTrab(hrsTra);
        sc.establecerCuotaHora(couHr);
        sc.calcularSueldo();
        
        
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("El nombre del empleado es: "+sc.obtenerNombreEmp());
        System.out.println("Su sueldo es de: "+sc.obtenerSueldo()+" pesos");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - -");
        
    }
    
}
