import qwertyu.MyGirlIsSh;

public class Telefono {
    
    public double Tipo(String menu){
       MyGirlIsSh  Vi = new MyGirlIsSh();
        double tCondu = 0; 
        int megas = 0;
        if(menu.equals("INICIO") == true){
            double tarifa = Vi.ValidarDouble("Tarifa incio: ");
            tCondu = tarifa;
            System.out.println("Su Plan Le Costara 399 al mes");
        }
        if(menu.equals("NEGOCIO") == true){
            double tarifa = Vi.ValidarDouble("Tarifa negocio: ");
            megas = Vi.ValidarInt("Escribe el numero de megas que su paquete le proporciona: ");
            if(megas < 30){
                System.out.println("El monto a pagar es de 549 al mes");
            }
            if(megas < 100){
                System.out.println("El monto a pagar es de 799 al mes");
            }
            
        }
        if(menu.equals("EXPANSION") == true){
            double tarifa = Vi.ValidarDouble("Tarifa expansion: ");
            megas = Vi.ValidarInt("Escribe el numero de megas que su paquete le proporcione: ");
            if(megas < 150){
                System.out.println("El monto a pagar es de 1499 al mes");
            }
            if(megas < 200){
                System.out.println("El monto a pagar es de 1789 al mes");
           
            }
            
            
        }
        return megas;
    }
  
    public double Total(double megas){
        double iva=0, Total;
        iva =(megas/100)*.16;
        return iva;
    }
}


    

