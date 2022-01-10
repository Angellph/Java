import qwertyu.MyGirlIsSh;
public class Principal {

   
    public static void main(String[] args) {
        float costo;
        String decision;
        MyGirlIsSh sc = new MyGirlIsSh();
        Llamada rec = new Llamada();
        do{
            rec.NoLlamada = rec.NoLlamada + 1;
            System.out.println("Llamada numero: "+ rec.NoLlamada);
            System.out.println("\t El lugar al que desea llamar \n Canada\n China\n Japon\n Nacional");
            String opcion = sc.ValidarCadena("Seleccione: ");
            rec.CalcularCosto(opcion);
            rec.Duracion = sc.ValidarFloat("Cual es la duracion de su llamada:  ");
            costo = rec.CalcularImporte(rec.Duracion,rec.CalcularCosto(opcion));
            System.out.println("Su importe es: "+costo);
            decision = sc.ValidarCadena("Quiere hacer otra llamada");
            
            
        }while(decision.equals("si")==true);
            
    }
    
}
