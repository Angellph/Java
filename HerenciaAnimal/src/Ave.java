
public class Ave extends Animal {
    private String habitad;
    
    //Constructor
    
    public Ave(float pes,float longi,String esp,String col,String hab){
        super(pes,longi,esp,col);
        
        habitad = hab;
        
    }
    public String getHabitad(){
        return habitad;
    }
   
    @Override
    public void Desplazar(){
        System.out.println("Estoy vuolando");
        
    }
    @Override
    public void Comer(){
        System.out.println("Estoy comiendo");
    }
    @Override
    public void ImprimirDatos(){
        System.out.println("El peso es: "+getPeso());
        System.out.println("La longuitud es: "+getLonguitud());
        System.out.println("La especie es: "+getEspecie());
        System.out.println("El color es: "+getColor());
        System.out.println("Su habitad es: "+habitad);
        
       
       
    }
            
    
}
