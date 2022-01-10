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
public class Futbolista extends SeleccionFutbol {
    private int Dorsal;
    private String Demarcacion;
    
    //Constructor
    public Futbolista(int id,String nom,String ap,int ed,int dor,String dem){
        super(id,nom,ap,ed);
        Dorsal = dor;
        Demarcacion = dem;
        
    }
    public int getDorsal(){
        return Dorsal;
    }
    public String getDemarcacion(){
        return Demarcacion;
    }
    public void Entrevista(){
        System.out.println("Estoy en una entrevista");
    }
    @Override
    public void ImprimirDatos(){
         System.out.println("El id es: "+getId());
        System.out.println("El nombre es: "+getNombre());
        System.out.println("Los apellidos es: "+getApellidos());
        System.out.println("La edad es: "+getEdad());
        System.out.println("El dorsal es: "+Dorsal);
        System.out.println("La demarcacion es: "+Demarcacion);
  
    }
    
}
