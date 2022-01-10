
public class Animal {
    private float Peso;
    private float Longuitud;
    private String Especie;
    private String Color;
    
    
    //Constructor
    public Animal(float pes,float longi,String esp,String col){
        Peso = pes;
        Longuitud = longi;
        Especie = esp;
        Color = col;
        
        
    }
    public float getPeso(){
        return Peso;
        
    }
    public float getLonguitud(){
        return Longuitud;
        
    }
    public String getEspecie(){
        return Especie;
        
    }
    public String getColor(){
        return Color;
        
    }
    public void Desplazar(){
        System.out.println("Me desplazo");
    }
    public void Comer(){
        System.out.println("Estoy comiendo un alimento");
    }
    public void ImprimirDatos(){
        System.out.println("El peso es: "+Peso);
        System.out.println("La longuitud es: "+Longuitud);
        System.out.println("La especie es: "+Especie);
        System.out.println("El color es: "+Color);
        
    }
}
