
public class Persona {
     private String Nombre;
    private String Domicilio;
    private int AnioNac;
    private String Curp;
    
    //Constructor
    public Persona(String nom, String dom, int aN, String curp){
        Nombre = nom;
        this.Domicilio = dom;
        this.AnioNac = aN;
        this.Curp = curp;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getDomicilio(){
        return Domicilio;
    }
    public int getAnioNacimiento(){
        return AnioNac;
    }
    public String getCurp(){
        return Curp;
    }
    public String setNombre(){
        return Nombre;
    }
    public void ImprimirDatos(){
        System.out.println("El nombre es: "+Nombre);
        System.out.println("El domicilio es: "+Domicilio);
        System.out.println("El Anio de nacimiento es: "+AnioNac);
        System.out.println("El curp es: "+Curp);
        
        
    }   
}
