
package Ejercicio1;

public class Moto extends Vehiculo {
    private int capacidad;
    private int peso; 
    private double costo;
    
    public Moto(String marc,int mod,int Añ,String col,int CantPuer,int cap, int pes,double cos){
        super(marc,mod,Añ,col,CantPuer);
        capacidad = cap;
        peso = pes;
        costo = cos;
        
        
        
        
    }
    public int getCapacidad(){
        return capacidad;
    }
    public int getPeso(){
        return peso;
    }
    public double getCosto(){
        return costo;
    }
    public void Encender(){
        System.out.println("Estoy encendiendo");
        
    }
    public void Frenar(){
        System.out.println("Estoy frenando ");
    }
    @Override
    public void ImprimirDatos(){
        System.out.println("La marca es "+getMarca());
        System.out.println("El modelo es "+getModelo());
        System.out.println("El año es "+getAño());
        System.out.println("La cantidad de puertas es: "+getCantPuer());
        System.out.println("La capacidad es: "+capacidad);
        System.out.println("El peso es: "+peso);
        System.out.println("El costo es: "+costo);
        
    }
    
}
