
public class CuentaBancaria {
   
    private int NomCuenta;
    private String Nombre;
    private String TipoCuenta;
    private float Saldo=1600;
    public int getNoCuenta(){
        return NomCuenta;
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
    public void setNoCuenta(int no_cuenta){
        NomCuenta=no_cuenta;
    }
    public void setNombre(String nombre){
        Nombre=nombre;
    }
    public void setTipo(String tipo_c){
        TipoCuenta=tipo_c;
    }
    public void setSaldo(float saldo){
        Saldo=saldo;
    }
    public float Retirar(float  saldo, float Retiro){
         Saldo = (float)(saldo - Retiro);
         return Saldo;
    }
    public float Depositar(float  saldo, float Deposito){
        Saldo=saldo+Deposito;
        return Saldo;
    }
    public void Imprimir(){
        System.out.println("Nombre         "+Nombre);
        System.out.println("Saldo          "+Saldo);
        System.out.println("Numero Cuenta  "+NomCuenta);
        System.out.println("Tipo de cuenta "+TipoCuenta);
    }
}


