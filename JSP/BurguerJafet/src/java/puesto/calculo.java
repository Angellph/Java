/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puesto;

public class calculo {
        public static double PRECIO=0;
    public static double calculo(int edad, String tamaño, String dom){
          if("chica".equals(tamaño)){
            PRECIO=100;
        }
        if("mediana".equals(tamaño)){
            PRECIO=150;
        }
        if("grande".equals(tamaño)){
            PRECIO=180;
        }
        
        if((edad>=5)&&(edad<=12)){
          PRECIO=PRECIO-(PRECIO*0.30);  
        }
        if((edad>=13)&&(edad<=17)){
          PRECIO=PRECIO-(PRECIO*0.25);  
        }
        if((edad>=18)&&(edad<=40)){
          PRECIO=PRECIO-(PRECIO*0.20);  
        }
        
        if ("si".equals(dom)){
           PRECIO=PRECIO+(PRECIO*0.30); 
        }
        return PRECIO;
    }

}
