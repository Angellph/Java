package Ejercicio4;


import Ejercicio4.Persona;


public final class Alumno extends Persona {
    
      private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Alumno(String nombre, String apellido, String domicilio, int edad){
        super(nombre, apellido, domicilio, edad);
        
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellidos: "+getApellidos());
        System.out.println("Domicilio: "+getDomicilio());
        System.out.println("Edad: "+getEdad());
        System.out.println("Matricula: "+getMatricula());
    }
    
  
    
    
    
}
