package Ejercicio4;


public class Principal {

    public static void main(String[] args) {
        System.out.println("\nAlumno");
        Alumno objAlumno=new Alumno("Angel", "Toscano", "Sonora", 21);
        
        objAlumno.setMatricula("300703");
        objAlumno.mostrarDatos();
        
        System.out.println("________________________________________");
        
        System.out.println("\nProfesor");
        Profesor objProfesor=new Profesor("Guleya", "Gupoi", "Colombia", 30);
            objProfesor.setCedula("ced122wq21");
            objProfesor.mostrarDatos();
        }
    }
    
