package Ejercicio2;


public class Celular_Nuevo extends Celular {
    private int Precio_Venta;
    private int Fecha_Ingreso;
    
    public Celular_Nuevo(String mar,String mod,int PrecVen, int FechIng){
        super(mar,mod);
        Precio_Venta = PrecVen;
        Fecha_Ingreso = FechIng;
        
        
    }
    public int getPrecioVenta(){
        return Precio_Venta;
    }
    public int getFechaIngreso(){
        return Fecha_Ingreso;
        
    }
    @Override
    public void ImprimirDatos(){
        System.out.println("La marca es: "+getMarca());
        System.out.println("El modelo es: "+getModelo());
        System.out.println("El precio de venta es: "+Precio_Venta);
        System.out.println("La fecha de ingreso es: "+Fecha_Ingreso);
        
  
    
    


    }
}
