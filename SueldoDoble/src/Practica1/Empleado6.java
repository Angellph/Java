
public class Empleado6 {
    public String nombreEmp;
    public int horasTrab;
    public double coutaHora;
    public double sueldo;
    
    
    public void  establecerNombreEmp(String nom){
        nombreEmp = nom;
        
        
        
    }
    public void establecerHorasTrab(int horasTr){
        horasTrab = horasTr;
        
        
    }
    public void establecerCuotaHora(double coutaHr){
        coutaHora = coutaHr;
        
        
        
    }
    public void calcularSueldo(){
        if (horasTrab <= 40){
            sueldo = (double) (horasTrab * coutaHora);
        }
        else{
            sueldo = (double) ((40*coutaHora) + ((horasTrab - 40) * (coutaHora *2)));
        }
            
                
    }
    public String obtenerNombreEmp(){
        return nombreEmp;
        
    }
    public double obtenerSueldo(){
        return (double) sueldo;
        
    }
    
    
    
    
}
