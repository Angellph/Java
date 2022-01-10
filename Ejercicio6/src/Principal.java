
import qwertyu.MyGirlIsSh;
public class Principal {
   

    public static void main(String[] args) {
         MyGirlIsSh sc = new MyGirlIsSh();
    String opcion;
    System.out.println("\t Menu\n Trapecio\n Rectangulo\n Circulo\n Cuadrado");
    opcion = sc.ValidarCadena("Seleccione");
    opcion = opcion.toUpperCase();
    seleccionarOpcion(opcion);
    }
    private static void seleccionarOpcion(String opcion){
        MyGirlIsSh sc = new MyGirlIsSh();
        FigurasGemetricas rec = new FigurasGemetricas();
        double area = 0,perimetro = 0;
        if (opcion.equals("TRAPECIO")==true){
            rec.dato1 = (float) sc.ValidarFloat("Escribe la base mayor: ");
            rec.dato2 = (float) sc.ValidarFloat("Escribe la base menor: ");
            rec.dato3 = (float) sc.ValidarFloat("Altura: ");
            area = rec.CalcularArea(rec.dato1,rec.dato2,rec.dato3);
            rec.dato3 = (float ) sc.ValidarFloat("Lado");
            perimetro = rec.CalcularPerimetro(rec.dato1, rec.dato2,rec.dato3);
            
        }
        if (opcion.equals("RECTANGULO")==true){
            rec.dato1 = (float) sc.ValidarFloat("Escribe la base: ");
            rec.dato2 = (float) sc.ValidarFloat("Escribe la altura: ");
            area = rec.CalcularArea(rec.dato1, rec.dato2);
            perimetro = rec.CalcularPerimetro(rec.dato1, rec.dato2);
            
        }
        if (opcion.equals("CIRCULO")==true){
            rec.dato1 = (float) sc.ValidarFloat("Escribe el radio del circulo: ");
            area = rec.CalcularArea(rec.dato1);
            perimetro = rec.CalcularPerimetro(rec.dato1);
            
        }
        if (opcion.equals("CUADRADO")==true){
            rec.dato1 = (float) sc.ValidarFloat("Escribe el lado: ");
            area = rec.CalcularArea((double)rec.dato1);
            perimetro = rec.CalcularPerimetro((double)rec.dato1);
        }
        System.out.println("El area de la figura es: "+area);
        System.out.println("El perimetro de la figura es: "+perimetro);
    }
    
}
