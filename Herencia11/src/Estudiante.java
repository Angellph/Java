/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thania
 */
public class Estudiante extends Persona {
  
    private float promedio;
    private String matricula;
    private int semestre;

    public Estudiante(String nom, String dom, int aN, String curp, float pro,String matri,int sem) {
        super(nom, dom, aN, curp);
        this.matricula = matri;
        this.promedio = pro;
        this.semestre = sem;
        
        
    }
    public float getPromedio(){
        return promedio;
        
    }
    public String getMatricula(){
        return matricula;
    }
    public int getSemestre(){
        return semestre;
        
    }
    
    @Override
    public void ImprimirDatos(){
        System.out.println("El nombre es: "+getNombre());
        System.out.println("El domicilio es: "+getDomicilio());
        System.out.println("El Anio de nacimiento es: "+getAnioNacimiento());
        System.out.println("El curp es: "+getCurp());
        System.out.println("El promedio es: "+promedio);
        System.out.println("La matricula es: "+matricula);
        System.out.println("El semestre es: "+semestre);
    }
    
    
    
}


