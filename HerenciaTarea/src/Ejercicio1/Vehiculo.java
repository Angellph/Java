
package Ejercicio1;


public class Vehiculo {
    private String marca;
    private int modelo;
    private int año;
    private String color;
    private int cantidad_puertas;
    
    //Cosntructor
    public Vehiculo(String marc,int mod,int Añ,String col,int CantPuer){
        marca = marc;
        modelo = mod;
        año = Añ;
        color = col;
        cantidad_puertas = CantPuer;
        
    }
    public String getMarca(){
        return marca;
    }
    public int getModelo(){
        return modelo;
    }public int getAño(){
        return año;
    }
    public String getColor(){
        return color;
    }
    public int getCantPuer(){
        return cantidad_puertas;
    }
    public void Arrancar(){
        System.out.println("Estoy arrancando");
    }
    public void Apagar(){
        System.out.println("Estoy apagando");
    }
    public void ImprimirDatos(){
        System.out.println("La marca es "+marca);
        System.out.println("El modelo es "+modelo);
        System.out.println("El año es "+año);
        System.out.println("El color es: "+color);
        System.out.println("La cantidad de puertas es: "+cantidad_puertas);
        
    }
}
