package Ejercicio2;


public class Celular {
    private String Marca;
    private String Modelo;
    
    //Constructor
    public Celular(String mar,String mod){
        Marca = mar;
        Modelo = mod;
        
        
    }
    public String getMarca(){
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public void Llamar(){
        System.out.println("Estoy llamando");
    }
    public void Colgar(){
        System.out.println("Estoy colgando");
    }
    public void ImprimirDatos(){
        System.out.println("La marca es: "+Marca);
        System.out.println("El modelo es: "+Modelo);
        
   
    
    }
    
}
