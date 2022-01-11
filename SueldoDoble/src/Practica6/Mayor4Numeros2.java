
package Practica6;


public class Mayor4Numeros2 {
    int numA;
    int numB;
    int numC;
    int numD;
    int nuMayor;
    
    
    public void EstablecerNumA(int a){
        numA = a;
        
    }
    public void EstablecerNumB(int b){
        numB = b;
        
    }
    public void EstablecerNumC(int c){
        numC = c;
        
    }
    public void EstablecerNumD(int d){
        numD = d;
        
    }
    public void CalcularNuMayor(){
        if((numA > numB) && (numA > numC) && (numA > numD)){
        nuMayor = numA;    
        }
        else{
            if((numB > numC) && (numB > numD)){
                nuMayor = numB;
                
            
        }
            else{
                if(numC > numD){
                    nuMayor = numC;
                    
                }
                else{
                    nuMayor = numD;
                }
            }
            
        }
        
        
        
    }
    public int ObtenerNuMayor(){
        return nuMayor;
    }
  
            
}
