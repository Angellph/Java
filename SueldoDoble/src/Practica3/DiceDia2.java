package Practica3;

 
public class DiceDia2 {
    int numDia;
    String nombreDia;
    
    public void EstablecerNumDia(int num){
        numDia = num;
        
    }
    public void CalcularNombreDia(){
        switch (numDia){
            case 1: nombreDia ="DOMINGO"; break;
            case 2: nombreDia = "LUNES"; break;
            case 3: nombreDia = "MARTES"; break;
            case 4: nombreDia = "MIERCOLES"; break;
            case 5: nombreDia = "JUEVES"; break;
            case 6: nombreDia = "VIERNES"; break;
            case 7: nombreDia = "SABADO"; break;
            default: nombreDia = "NO ESTA EN EL RANGO DEL 1 A 7"; break;
                    
        }
            
                
                
    }
    public String ObtenerNombreDia(){
        return nombreDia;
        
    }
    
}
