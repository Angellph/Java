package Practica6;
import qwertyu.MyGirlIsSh;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1, n2, n3, n4 = 0;
        int decision;
        Mayor4Numeros2 sc = new Mayor4Numeros2();
        MyGirlIsSh rec = new MyGirlIsSh();
      do{
        n1 = rec.ValidarFloat("Ingresa el valor del primero numero: ");
        n2 = rec.ValidarFloat("Ingresa el valor del segundo numero: ");
        n3 = rec.ValidarFloat("Ingresa el valor del tercer numero: ");
        n4 = rec.ValidarFloat("Ingrese el valor del cuarto numero: ");
        
        sc.EstablecerNumA((int) n1);
        sc.EstablecerNumB((int) n2);
        sc.EstablecerNumC((int) n3);
        sc.EstablecerNumD((int) n4);
        sc.CalcularNuMayor();
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("El numero mayor es: "+sc.ObtenerNuMayor());
        decision = rec.ValidarInt("¿Quiere repetir el proceso?   1:Si / 2:No");
        
      }while(decision ==1);
       
      
        
        
 
    }
    
}
