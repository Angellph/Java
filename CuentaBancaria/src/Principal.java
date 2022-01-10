import qwertyu.MyGirlIsSh;
public class Principal {

   
    public static void main(String[] args) {
        CuentaBancaria CB = new CuentaBancaria ();
        MyGirlIsSh sc=new MyGirlIsSh();
        int No_cuenta,c;
        float saldo,retiro,deposito;
        String nombre,tipo_cuenta,conf;
        No_cuenta=sc.ValidarInt("Numero de cuenta: ");
        CB.setNoCuenta(No_cuenta);
        nombre=sc.ValidarCadena("Nombre: ");
        CB.setNombre(nombre);
        tipo_cuenta=sc.ValidarCadena("Tipo de cuenta:\nDebito\nEmpresario"
                + "\n");
        CB.setTipo(tipo_cuenta);
        do{
        System.out.println("--------------------------------------------");
        conf=sc.ValidarCadena("Desea:\nRetirar\nDepositar\nSalir\n");
        if("Retirar".equalsIgnoreCase(conf)){
            retiro=sc.ValidarFloat("Retiro: ");
            if(retiro<=CB.getSaldo()){
            CB.Retirar(CB.getSaldo(), retiro);
            }
            if(retiro>CB.getSaldo()){
                System.out.println("No cuenta con saldo suficiente");
            }
        }
        if("Depositar".equalsIgnoreCase(conf)){
            deposito=sc.ValidarFloat("Deposito: ");
            CB.Depositar(CB.getSaldo(), deposito);
        }
        System.out.println("--------------------------------------------");
        CB.Imprimir();
            c=sc.ValidarInt("Desea Realizar Otra Accion \n1=si\n2=no");
        }while(c==1);
    }
}

    
    

