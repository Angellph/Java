package Practica5;

public class Empleado8 {
    
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
    public void CalcularSueldo(){
        if(horasTrab <= 40){
            sueldo = horasTrab * coutaHora;
        }
        else{
            if(horasTrab <=50){
                sueldo =(40 * coutaHora) + (horasTrab - 40) * (coutaHora * 2); 
            }
            else{
                sueldo = (40 * coutaHora) + (10 * coutaHora * 2) + (horasTrab - 50) * (coutaHora * 3);
            }
            
        }
        
    }
     public String obtenerNombreEmp(){
        return nombreEmp;
        
    }
    public double obtenerSueldo(){
        return (double) sueldo;
    }
        
            
        
        
    
    
}
