
public class Perro extends Animal {
    private String habitad;
    private String nombre;
    
    //Constructor
    public Perro(float pes,float longi,String esp,String col,String hab,String nom){
        super(pes,longi,esp,col);
        habitad = hab;
        nombre = nom;
        
    }
    public String getHabitad(){
        return habitad;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public void Desplazar(){
       System.out.println("Estoy corriendo");
       
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
        System.out.println("El nombre es: "+nombre);
        
    }
}
