
public class Persona {
    private String nombre;
    private int anioNac;
    public int anioA;
    private String curp;
    public float peso;
    public float estatura;
    
    public Persona (){
        this.nombre = "Angel";
        this.anioNac = 2003;
        this.anioA = 2019;
        this.curp = "LOH";
        this.peso = 68;
        this.estatura = (float) 1.70;
    }
    public int calcularEdad (int ac, int an){
        int calcularEdad = ac - an;
        return calcularEdad;
        
    }
    public double calcularIMC(float peso, float estatura){
        float imc = peso/(estatura * estatura);
        return imc;
        
    }
    public String getNombre(){
        return nombre;
    }
    public String setNombre(){
        return nombre;
        
    }
    public int getAnioNacimiento(){
        return anioNac;
        
    }
    public int setAnioNacimiento(){
        return anioNac;
    }
    public String getCurp (){
        return curp;
    }
    public String setCurp(){
        return curp;
    }
}
