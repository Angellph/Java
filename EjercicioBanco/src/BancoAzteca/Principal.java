package BancoAzteca;
import qwertyu.MyGirlIsSh;

public class Principal {

    public static void main(String[] args) {
        CuentaBancaria cuentita = new CuentaBancaria ();
        MyGirlIsSh sc = new MyGirlIsSh();
        float retirar = 0, depositar = 0;
        int cuentaB = 0, c = 0;
        String nombreC, tipoCta;
        
      
        cuentaB = sc.ValidarInt("Digite su numero de cuenta: ");
        cuentita.setNoCuenta(cuentaB);
        nombreC = sc.ValidarCadena("Nombre del cliente: ");
        cuentita.setNombre(nombreC);
        tipoCta = sc.ValidarCadena("Tipo de cuenta:  \n Debito \n Empresario \n Seleccione: ");  
        cuentita.setTipoCuenta(tipoCta);
       do{
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
               
        String menu = sc.ValidarCadena("¿Que accion desea realizar? \nRetirar \n Depositar\n Consultar saldo \t Seleccione:");
        menu = menu.toUpperCase();
        if(menu.equals("RETIRAR")==true){
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            retirar = sc.ValidarFloat("¿Cuanto dinero desea retirar? ");
            if(retirar<=cuentita.getSaldo()){
                cuentita.RetirarSaldo(cuentita.getSaldo(), retirar);
            }
            if(retirar>cuentita.getSaldo()){
                System.out.println("No cuenta con saldo suficiente");
                System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }
            
            
        }
        if (menu.equals("DEPOSITAR")==true){
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            depositar = sc.ValidarFloat("Digite el numero de deposito: ");
            cuentita.DepositarSaldo(cuentita.getSaldo(), depositar);
          
           
        }
         System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            cuentita.ConsultarSaldo();
        if(menu.equals("CONSULTAR SALDO")== true){
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");//System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Cuenta: "+cuentita.getNoCuenta());
            System.out.println("Nombre cliente: "+cuentita.getNombre());
            System.out.println("Saldo: "+cuentita.getSaldo());
            System.out.println("Tipo cuenta: "+cuentita.getTipoCuenta());
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
             c =sc.ValidarInt("¿Desea pagar otro recibo?    1: Si / 2: No");   
        
      
      }while(c == 1);
    }
}
//retirar saldo actual, saldo a tetirar y devolver el saldo acutalizado
              //  deposito saldo actual, saldo a ingresar y devolver el saldo actualizado; 
           //System.out.println("Cuenta: "+cuentita.getNoCuenta());
// System.out.println("Nombre cliente: "+cuentita.getNombre());
           
//cuentita.setNoCuenta(cuentaB);
//            System.out.println("Saldo: "+cuentita.getSaldo());
//            System.out.println("Tipo cuenta: "+cuentita.getTipoCuenta());
