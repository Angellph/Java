package Ejercicio2;


public class Celular_Malogrado extends Celular {
    private String Motivo;
    private String Dueño;
    
    //Constructor
    
    public Celular_Malogrado(String mar,String mod,String mot,String due){
        super(mar,mod);
        Motivo = mot;
        Dueño = due;
        
        
    }
    public String getMotivo(){
        return Motivo;
    }
    public String getDueño(){
        return Dueño;
    }
    @Override
    public void ImprimirDatos(){
        System.out.println("La marca es: "+getMarca());
        System.out.println("El modelo es: "+getModelo());
        System.out.println("El motivo es: "+Motivo);
        System.out.println("El dueño es: "+Dueño)
                ;
   
    
    }
    
}
