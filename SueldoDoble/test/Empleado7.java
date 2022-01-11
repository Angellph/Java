
public class Empleado7 {
    public String nombreEmp;
    int horasTrab;
    double coutaHora;
    double sueldo;
    
    
    public void establecerNombreEmp(String nom){
        nombreEmp = nom;
    }
    public void establecerHorasTrab(int horasTr){
        horasTrab = horasTr;
        
    }
    public void establecerCoutaHora(double coutaHr){
        coutaHora = coutaHr;
    }
    public void calcularSueldo(){
        sueldo = horasTrab * coutaHora;
        if(horasTrab > 40){
            sueldo = sueldo + (sueldo * 0.05);
        }

        
        
    }
    public String ObtenerNombreEmp(){
        return nombreEmp;
        
    }
    public double obtenerSueldo(){
        return sueldo;
    }
    
}
