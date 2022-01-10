
public class Llamada {
    public String Lugar;
    public float Duracion;
    public int NoLlamada;
    
    
    public float CalcularCosto(String opcion){
        float Valor  = 0;
        
        if("Japon".equalsIgnoreCase(opcion)==true ){
            Valor = (float ) 13.50;
            System.out.println("Usted por llamar a Japon costara el minuto a: "+Valor);
        }
        if("China".equalsIgnoreCase(opcion)==true ){
            Valor = (float) 12;
            System.out.println("Usted por llamar a China costara el minuto a: "+Valor);
            
        }
        if("Nacional".equalsIgnoreCase(opcion)==true ){
            Valor = (float) 1.5;
            System.out.println("Por llamar a Nacional el costo por minuto es de: "+Valor);
            
        }
        if("Canada".equalsIgnoreCase(opcion)==true ){
            Valor = (float) 5;
            System.out.println("Por llamar a Canada el costo por minuto sera de: "+Valor);
        }
        return Valor;
    }
    float CalcularImporte(float Duracion, float Valor){
        float costo;
        costo = Valor * Duracion;
        return costo;
    }
}
