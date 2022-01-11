import qwertyu.MyGirlIsSh;
public class Principal {

    
    public static void main(String[] args) {
        
        MyGirlIsSh Vi = new MyGirlIsSh();
        Telefono Tel = new Telefono();
        System.out.println("\tTipo de sevicio\n Inicio\n Negocio \n Expansion");
        String menu = Vi.ValidarCadena("Seleccione: ");
        menu = menu.toUpperCase();
        double megas = Tel.Tipo(menu);
        Tel.Total(megas);
        System.out.println("El Iva es: " + Tel.Total(megas));
    }
    }
    

