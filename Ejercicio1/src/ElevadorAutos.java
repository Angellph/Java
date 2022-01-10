/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thania
 */
public class ElevadorAutos extends Elevador {
    
    //Constructor
    public ElevadorAutos(int pm, int c){
        super(pm,c);
    }
    private int CapacidadAutos;
    
    
    public void ProporcionarGasolina(){
        System.out.println("Estoy proporcionando gasolina");
    }
    public int GetCapacidadAutos(){
        return CapacidadAutos;
        
    }
    public void SetCapacidadAutos(int ca){
        CapacidadAutos = ca;
        
    }
}
