package Ejercicio3;


public class Masajista extends SeleccionFutbol {
    private String Titulacion;
    private int aniosExperiencia;
    
    //Constructor
    public Masajista(int id,String nom,String ap,int ed,String tit,int anEx){
        super(id,nom,ap,ed);
        Titulacion = tit;
        aniosExperiencia = anEx;
        
        
    }
    public String getTitulacion(){
        return Titulacion;
        
    }
    public int getAniosExperiencia(){
        return aniosExperiencia;
    }
    public void DarMasaje(){
        System.out.println("Estoy dando masaje");
    }
    public void ImprimirDatos(){
        System.out.println("El id es: "+getId());
        System.out.println("El nombre es: "+getNombre());
        System.out.println("Los apellidos es: "+getApellidos());
        System.out.println("La edad es: "+getEdad());
        System.out.println("La titulacion es: "+Titulacion);
        System.out.println("Los anios de experiencia es: "+aniosExperiencia);
       
    }
}
