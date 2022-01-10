package BancoAzteca;


public class CuentaBancaria {
    private int noCuenta;
    private String Nombre;
    private String TipoCuenta;
    private float Saldo = 1600;
    
    public int getNoCuenta ( ){
        return noCuenta;
        
    }
    public String getNombre(){
        return Nombre;
        
    }
    public String getTipoCuenta(){
        return TipoCuenta;
        
    }
    public float getSaldo(){
        return Saldo;
        
    }
    public void setNoCuenta(int cuenta){
         noCuenta =cuenta;
        
    }
    public void setNombre(String nombre){
         Nombre = nombre;
        
    }
    public void setTipoCuenta(String cuenta){
        TipoCuenta = cuenta;
        
    }
    public void setSaldo(float saldo){
        Saldo = saldo;
        
    }
    public float RetirarSaldo (float saldo ,float Retiro){
       Saldo = (float)(saldo - Retiro);
       return Saldo;
    
      
        
    }
    public float DepositarSaldo(float saldo, float Deposito){
        Saldo = saldo + Deposito;
        return Saldo;
        
    }
    public void ConsultarSaldo(){
        System.out.println("Nombre: "+Nombre);
        System.out.println("El saldo es: "+Saldo);
        System.out.println("Numero de cuenta: " +noCuenta);
        System.out.println("Tipo de cuenta: "+TipoCuenta);
        
    }
            
            
            
    
}
