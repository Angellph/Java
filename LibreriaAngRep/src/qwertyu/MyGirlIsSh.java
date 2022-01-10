
package qwertyu;
import java.util.*;
public class MyGirlIsSh {
    public String ValidarCadena(String texto){
        Scanner reader = new Scanner (System.in);
        String cadena = "";
        try{
            System.out.println(texto);
            cadena = reader.nextLine();
            
        }finally{ 
            for (int i=0; i<cadena.length();i++){
                if(!Character.isLetter(cadena.charAt(i))
                        &&!Character.isSpace(cadena.charAt(i))){
                    System.out.println("\tERROR\n Tipo de datos no valido: "
                    +"\tReescribe");
                    cadena = ValidarCadena (texto);
                    
                }
            }
        }
        return cadena;
        
    }
    public int ValidarInt (String dato){
        int valor = 0;
        Scanner es = new Scanner (System.in);
        do{
            try{
                System.out.println(dato);
                valor = es.nextInt();
            }catch(Exception e){
                System.out.println("\t ERROR\n Tipo de datos no valido");
                valor = ValidarInt(dato);
            }
                
        }while(valor<0);
        return valor;
    }
    public float ValidarFloat (String dato){
         float valor = 0;
        Scanner es = new Scanner (System.in);
        do{
            try{
                System.out.println(dato);
                valor = es.nextFloat();
            }catch(Exception e){
                System.out.println("\t ERROR\n Tipo de datos no valido");
                valor = ValidarFloat(dato);
            }
                
        }while(valor<0);
        return valor;   
    }
    public double ValidarDouble (String dato){
         double valor = 0;
        Scanner es = new Scanner (System.in);
        do{
            try{
                System.out.println(dato);
                valor = es.nextDouble();
            }catch(Exception e){
                System.out.println("\t ERROR\n Tipo de datos no valido");
                valor = ValidarDouble(dato);
            }
                
        }while(valor<0);
        return valor;
        
    }
    public short ValidarShort(String dato){
        Short valor = 0;
        Scanner es = new Scanner (System.in);
        do{
            try{
                System.out.println(dato);
                valor = es.nextShort();
            }catch(Exception e){
                System.out.println("\t ERROR\n Tipo de datos no valido");
                valor = ValidarShort(dato);
            }
                
        }while(valor<0);
        return valor;
    }
    public long ValidarLong (String dato){
        long valor = 0;
        Scanner es = new Scanner (System.in);
        do{
            try{
                System.out.println(dato);
                valor = es.nextLong();
            }catch(Exception e){
                System.out.println("\t ERROR\n Tipo de datos no valido");
                valor = ValidarLong(dato);
            }
                
        }while(valor<0);
        return valor;
    }

    public String toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
