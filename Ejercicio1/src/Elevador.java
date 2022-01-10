
public class Elevador {
    private int CapacidadMaxPersonas;
    public int pesoMaximo;
    
   //constructor
    public  Elevador(int pm, int c){
        pesoMaximo = pm;
        CapacidadMaxPersonas = c;
        
    }
    public void abrirPuertas(){
        System.out.println("Estoy abriendo puertas");
        
    }
    public void cerrarPuertas (){
        System.out.println("Estoy cerrando puertas");
        
    }
    public int subirPiso (int pisoactual){
        int nuevoPiso = pisoactual + 1;
        return nuevoPiso;
        
    }
    public int bajarPiso (int pisoactual){
        int nuevopiso = pisoactual - 1;
        return nuevopiso;
    }
    public int getPesoMaximo(){
        return pesoMaximo;
    }
    public int getCapacidadMaxPersonas(){
        return CapacidadMaxPersonas;
    }
    public void setPesoMaximo(int pm){
       pesoMaximo = pm;
    }
    public void setCapacidadMaxPersona(int c){
        CapacidadMaxPersonas = c;
    }
    
}
