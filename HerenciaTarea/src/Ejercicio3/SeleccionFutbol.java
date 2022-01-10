package Ejercicio3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thania
 */
public class SeleccionFutbol {
    private int Id;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    
    
    //Constructor 
    public SeleccionFutbol(int id,String nom,String ap,int ed){
        Id = id;
        Nombre = nom;
        Apellidos = ap;
        Edad = ed;
      
    }
    public int getId(){
        return Id;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellidos(){
        return Apellidos;
    }
    public int getEdad(){
        return Edad;
    }
    public void Viajar(){
        System.out.println("Estoy viajando");
    }
    public void Concentrarse(){
        System.out.println("Estoy concentrado");
    }
    public void Entrenamiento(){
        System.out.println("Estoy entrenando");
    }
    public void PartidoFutbol(){
        System.out.println("Estoy en un partido");
    }
    public void ImprimirDatos(){
        System.out.println("El id es: "+Id);
        System.out.println("El nombre es: "+Nombre);
        System.out.println("Los apellidos es: "+Apellidos);
        System.out.println("La edad es: "+Edad);
       
    }
            
    
}
