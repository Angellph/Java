import qwertyu.MyGirlIsSh;
public class Principal {
    public static void main(String[] args) {
        Recibos sc = new Recibos();
        MyGirlIsSh rec = new MyGirlIsSh();
        String opcion;
        String decision;
       do{
          System.out.println("\t Menu de recibos \n Recibo de luz\n Recibo de agua\nRecibo de telefono");
          opcion = rec.ValidarCadena("Seleccione: ");
          opcion = opcion.toUpperCase();
          seleccionarOpcion(opcion); 
          decision = rec.ValidarCadena("¿Quire revisar otro recibo?");
       }while(decision.equals("si")==true); 
        
       
    }

    private static void seleccionarOpcion(String opcion) {
        MyGirlIsSh rec = new MyGirlIsSh();
        Recibos sc = new Recibos();
        int consumW = 0 ;
        float TotalLuz, TotalConCred, energia = 0, TotalIVA, TotalDAP;
        
         if(opcion.equals("LUZ")==true){
             sc.Nombre = rec.ValidarCadena("Escriba su nombre: ");  
             sc.Domicilio = rec.ValidarCadena("Escriba su domicilio: ");
              int tar = rec.ValidarInt("Ingresa tu tarifa: ");
             sc.Periodo = rec.ValidarCadena("Escribe el periodo de consumo: ");
             sc.lectA = rec.ValidarInt("Escriba la lectura actual: ");
             sc.lectAnt = rec.ValidarInt("Escriba la lectura anterior: ");
             consumW = sc.calcularConsW(sc.lectA, sc.lectAnt);
             energia = sc.CalcularEnergia(consumW);
             TotalConCred = sc.CalcularCostoLuzConCred(energia);
             TotalLuz = sc.CalcularCostoLuz(energia);
           //  TotalIVA = sc.CalcularIVA(energia);
             //TotalDAP = sc.CalcularDAP(energia);
             System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"   );
             System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
             System.out.println("Su nombre es: "+sc.Nombre);
             System.out.println("Su domicilio es: "+sc.Domicilio+" Hgo,Mexico"); 
             System.out.println("Su tarifa es: "+tar);
             System.out.println("El periodo de consumo es: "+sc.Periodo);
             System.out.println("Su consumo de wats es de: "+consumW);
             System.out.println("La energia es de: "+energia);
             System.out.println("IVA: ");//+TotalIVA);
             System.out.println("DAP: ");//+TotalDAP);
             System.out.println("El total del costo de la luz con Credito Aplic. Fac: "+TotalConCred);
             System.out.println("El total del costo de la luz: "+TotalLuz);
             System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
             System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
         }     
        if (opcion.equals("AGUA")==true){
            String uso=rec.ValidarCadena("\n Menu \n Trifa Domestico \n Tarifa Pension\n Tarifa Comercial\n Tarifa INdustrial");
            uso=uso.toUpperCase();
            float lectAc=rec.ValidarFloat("Ingrese la lectura actual de su medidor:");
            float lectA=rec.ValidarFloat("Ingrese la lectura de su medidor:");
            
            int total= (int)(lectA-lectAc);
            sc.CalcularTarifa(uso,total);
            sc.TotalAgua(sc.costoAgua);
        }
        
       
         
        
        if(opcion.equals("TELEFONO")==true){
            sc.Nombre = rec.ValidarCadena("Escriba su nombre: ");  
            sc.Domicilio = rec.ValidarCadena("Escriba su domicilio: ");
            System.out.println("\tPaquetes\nInicio\nComercial\nExpancion v");
            String TipoPqt=rec.ValidarCadena("Ingrese el tipo de paquete a pagar: ");
            TipoPqt=TipoPqt.toUpperCase();
            
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("Su nombre es: "+sc.Nombre);
            System.out.println("Su domicilio es: "+sc.Domicilio);
            System.out.println("Subtotal: "+sc.Calculartelefono(TipoPqt)); 
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            
            
        }    
            
        }     
             
             
         }
        
