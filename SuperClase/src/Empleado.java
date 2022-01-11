
public class Empleado extends Persona {
    private float Sueldo;
    private String RFC;
    private String Puesto;
    
    public Empleado(String nom, String dom, int aN, String curp,float suel,String rfc,String pues){
        super(nom,dom,aN,curp);
        this.Sueldo = suel;
        this.RFC = rfc;
        this.Puesto = pues;
    }
    public float getSueldo(){
        return Sueldo;
    }
    public String getRFC(){
        return RFC;   
    }
    public String getPuesto(){
        return Puesto;
    }
    @Override
     public void ImprimirDatos(){
        System.out.println("El nombre es: "+getNombre());
        System.out.println("El domicilio es: "+getDomicilio());
        System.out.println("El Anio de nacimiento es: "+getAnioNacimiento());
        System.out.println("El curp es: "+getCurp());
        System.out.println("Sueldo: "+Sueldo);
        System.out.println("RFC: "+RFC);
        System.out.println("Puesto: "+Puesto);
        
     }   
}
     
