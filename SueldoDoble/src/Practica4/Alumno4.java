package Practica4;


public class Alumno4 {
    String nombreAlum;
    double calf1;
    double calf2;
    double calf3;
    double calf4;
    double promedio ;
    String Observacion;
    
    public void establecerNombreAlum(String nom){
        nombreAlum = nom;
        
    }
    public void establecerCalf1(double cal1){
        calf1 = cal1;
        
    }
    public void establecerCalf2(double cal2){
        calf2 = cal2;
        
    }
    public void establecerCalf3(double cal3){
        calf3 = cal3;
        
    }
    public void establecerCalf4(double cal4){
        calf4 = cal4;
        
    }
    public void CalcularPromedio(){
        promedio = (calf1 + calf2+ calf3 + calf4) / 4;
     
    }
    public void CalcularObservacion(){
        if(promedio >= 6.0){
            Observacion = "Aprobado";
            
        }
        else{
            Observacion = "Reprobado";
        }
    }
    public String ObtenerNombreAlum(){
        return nombreAlum;
        
    }
    public double ObtenerPromedio(){
        return promedio;
    }
    public String ObtenerObservacion(){
        return Observacion;
    }
}
