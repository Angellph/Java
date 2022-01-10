package Ejercicio4;


import Ejercicio4.Persona;


public class Profesor extends Persona{
    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Profesor(String nombre, String apellidos, String domicilio, int edad){
          super(nombre, apellidos, domicilio,edad);
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellidos: "+getApellidos());
        System.out.println("Domicilio: "+getDomicilio());
        System.out.println("Edad: "+getEdad());
        System.out.println("Cedula: "+getCedula());
        
    }
}
