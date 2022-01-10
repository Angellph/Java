
package Ejercicio1;


public class Camioneta extends Vehiculo {
    private int capacidad;
    private int tamaño;
    
    //Constructor
    public Camioneta(String marc,int mod,int Añ,String col,int CantPuer,int cap,int tam){
        super(marc,mod,Añ,col,CantPuer);
        capacidad = cap;
        tamaño = tam;
    }
    public int getCapacidad(){
        return capacidad;
                
    }
    public int getTamaño(){
        return tamaño;
    }
    public void Moverse(){
        System.out.println("Estoy moviendo de lugar");
    }
    public void Estacionarse(){
        System.out.println("Estoy estacionando");
    }
    @Override
    public void ImprimirDatos(){
        System.out.println("La marca es "+getMarca());
        System.out.println("El modelo es "+getModelo());
        System.out.println("El año es "+getAño());
        System.out.println("La cantidad de puertas es: "+getCantPuer());
        System.out.println("La capacidad es: "+capacidad);
        System.out.println("El tamaño es: "+tamaño);
        
    }
}
