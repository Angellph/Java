
public class Recibos {
    
    
    public String Nombre;
    public int lectA;
    public int lectAnt;
    public String Domicilio;
    public String Periodo;
    public float costoAgua;
    
    //Recibo de la luz
    public float CalcularEnergia(int consumoDeW){
        double  ener1 = 0.809,  ener2 = 0.976, ener3 = 2.859, KwB = 150, KwIn = 130;
        int KwEx = (int) (consumoDeW - (KwB + KwIn));
        
        float energia =(float) ((float) (KwB * ener1)+(KwIn * ener2)+(KwEx * ener3));
       
        return (float)energia;
        
      
    
   
    }
    public int calcularConsW(int lectA, int lectAnt){
        int consumT = (int)(lectA - lectAnt );
        return consumT;
        
    

    }
    public void CalcularIVA (float energi){
        float IVA = (float) (energi * 0.16);
        
    }
    public void  CalcularDAP (float energi){
        float DAP = (float) (energi * 0.05);
       
                
    }
   
    public float CalcularCostoLuzConCred(float energi){
       float IVA = (float) (energi * 0.16);
       float DAP = (float) (energi * 0.05);
       float CreditoAplFac = (float) (32.00);
       float CostoTotal = (float)(energi + IVA + DAP + CreditoAplFac);
       return CostoTotal;
       
    }
    public float CalcularCostoLuz(float energi){
        float IVA = (float) (energi * 0.16);
        float DAP = (float) (energi * 0.05);
        float CreditoAplFac = (float) (32.00);
        float CostoTotal = (float) (energi + IVA + DAP); // - CreditoAplFac);
        return CostoTotal;
        
    }
    // Recibo de Agua 
    public void CalcularTarifa (String uso,int consumoAgua){
        
        if (uso.equals("DOMESTICO")==true){
            costoAgua =(float) (consumoAgua * 97);
            System.out.println("Usted pagara sin:"+costoAgua);
        }
        if(uso.equals("PENSION")==true){
            costoAgua =  (float) (consumoAgua * 98.50);
            System.out.println("Usted pagara sin:"+costoAgua);
        }
        if(uso.equals("COMERCIAL")== true){
            costoAgua = (float) (consumoAgua * 253.50);
           System.out.println("Usted pagara sin:"+costoAgua);
        }
        if(uso.equals("INDUSTRIAL")==true){
            costoAgua = (float) (consumoAgua* 409.7);
            System.out.println("Usted pagara sin:"+costoAgua);        
        }
        
    }
    public float TotalAgua(float costoAgua ){
        float Total =(float)(costoAgua *.16);
        float sub =Total+costoAgua;
        System.out.println("IVA"+Total);
        System.out.println("En Total Pagara"+sub);
        return Total;
    }
    
    
    //Recibo del telefono

   public float Calculartelefono (String PqtBasico){
       double Paqueteapagar=0;
       double CostoaPagar=0;
       if(PqtBasico.equals("INICIO")==true){
           Paqueteapagar = 328.44;
       }
       if (PqtBasico.equals("COMERCIAL")==true){
           Paqueteapagar = 429.25;
       }
       if (PqtBasico.equals("EXPANCION")==true){
           Paqueteapagar= 548.98;
           
       }
       return (float) Paqueteapagar;
      
   }
    
    
   
     
}