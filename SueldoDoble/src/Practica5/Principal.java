package Practica5;
import qwertyu.MyGirlIsSh;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomEmp;
        int hrsTra;
        double couHr;
        
        Empleado8 sc = new Empleado8();
        MyGirlIsSh rec = new MyGirlIsSh();
        nomEmp = rec.ValidarCadena("Escriba el nombre del empleado");
        hrsTra = rec.ValidarInt("Escriba el numero de horas trabajadas");
        couHr = rec.ValidarDouble("Escriba la couta por hora");
        
        sc.establecerNombreEmp(nomEmp);
        sc.establecerHorasTrab(hrsTra);
        sc.establecerCuotaHora(couHr);
        sc.CalcularSueldo();
        
        
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("El nombre del empleado es: "+sc.obtenerNombreEmp());
        System.out.println("Su sueldo es de: "+sc.obtenerSueldo()+" pesos");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - -");
        
    }
    
}

    
    

