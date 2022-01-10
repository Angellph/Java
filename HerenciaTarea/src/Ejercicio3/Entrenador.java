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
public class Entrenador extends SeleccionFutbol{
    private int idFederacion;
    
    //Constructor
    public Entrenador(int id,String nom,String ap,int ed,int idF){
        super(id,nom,ap,ed);
        idFederacion = idF;
        
        
    }
    public int getIdFederacion(){
        return idFederacion;
    }
    public void PlanificarEntrenamiento(){
        System.out.println("Vamos a entrenar");
    }
    @Override
    public void ImprimirDatos(){
        System.out.println("El id es: "+getId());
        System.out.println("El nombre es: "+getNombre());
        System.out.println("Los apellidos es: "+getApellidos());
        System.out.println("La edad es: "+getEdad());
        System.out.println("La id de federacion es: "+idFederacion);
       
    
    }
    
}
