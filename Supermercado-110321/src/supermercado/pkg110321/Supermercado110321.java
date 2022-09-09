/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado.pkg110321;

import java.util.Scanner;

/**
 *
 * @author angelhernandez
 */
public class Supermercado110321 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria("12894", 133.3f);
        Sucursal su = new Sucursal("Bodega Aurrera", "Centro", 32, "12894", 133.3f);
        Proveedor proveedor []= new Proveedor[3];
        proveedor[0] = new Proveedor("CV. DE S.A", "Centro", "1827FRE83");
        proveedor[1] = new Proveedor("CV. DE S.A", "Centro", "1827FRE83");
        proveedor[2] = new Proveedor("CV. DE S.A", "Centro", "1827FRE83");
        su.setPro(proveedor);
        
        // Declaración de variables
        int resp = 0, r = 0;
        
        do {
            System.out.println("====================");
            System.out.println("Menu");
            System.out.println("1. Ver datos del proveedor");
            System.out.println("2. Ver datos de la sucursal");
            System.out.println("3. Ver la cuenta bancaria");
            System.out.println("4. Actualizar datos del proveedor");
            System.out.println("5. Actualizar datos de la sucursal");
            System.out.println("6. Actualizar datos de la cuenta bancaria");
            System.out.println("7. Salir");
            System.out.println("Elige.");
            resp = teclado.nextInt();
            
            switch (resp) {
                case 1:
                    System.out.println("====================");
                    System.out.println("Mostrando proveedores");
                    System.out.println(su.getPro()[0].toString());
                    System.out.println(su.getPro()[1].toString());
                    System.out.println(su.getPro()[2].toString());
                    break;
                case 2:
                    System.out.println("====================");
                    System.out.println("Mostrando sucursal");
                    System.out.println(su.toString());
                    break;
                case 3:
                    System.out.println("====================");
                    System.out.println("Mostrando cuenta bancaria");
                    System.out.println(cuenta.toString());
                    break;
                case 4:
                    do {
                        System.out.println("====================");
                        System.out.println("Actualizando proveedor");
                        System.out.println("1.");
                        System.out.println("2.");
                        System.out.println("3.");
                        System.out.println("4. Salir");
                        System.out.println("Elige: ");
                        
                        switch (r) {
                            case 1:
                                System.out.println("====================");
                                System.out.println("Ingresa la razon social");
                                proveedor[0].setRazonSocial(teclado.next());
                                System.out.println("====================");
                                System.out.println("Ingresa la direccion fiscal");
                                proveedor[0].setDireccionFiscal(teclado.next());
                                System.out.println("====================");
                                System.out.println("Ingresa la rfc");
                                proveedor[0].setRfc(teclado.next());
                                break;
                            case 2:
                                System.out.println("====================");
                                System.out.println("Ingresa la razon social");
                                proveedor[1].setRazonSocial(teclado.next());
                                System.out.println("====================");
                                System.out.println("Ingresa la direccion fiscal");
                                proveedor[1].setDireccionFiscal(teclado.next());
                                System.out.println("====================");
                                System.out.println("Ingresa la rfc");
                                proveedor[1].setRfc(teclado.next());
                                break;
                            case 3:
                                System.out.println("====================");
                                System.out.println("Ingresa la razon social");
                                proveedor[2].setRazonSocial(teclado.next());
                                System.out.println("====================");
                                System.out.println("Ingresa la direccion fiscal");
                                proveedor[2].setDireccionFiscal(teclado.next());
                                System.out.println("====================");
                                System.out.println("Ingresa la rfc");
                                proveedor[2].setRfc(teclado.next());
                                break;
                            case 4:
                                System.out.println("====================");
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("====================");
                                System.out.println("Error");
                        }
                    }while(r != 3);
                    break;
                case 5:
                    System.out.println("====================");
                    System.out.println("Actualizando datos de la sucursal");
                    System.out.println("====================");
                    System.out.println("Ingresa el nombre");
                    su.setNombre(teclado.next());
                    System.out.println("====================");
                    System.out.println("Ingresa la direccion");
                    su.setDireccion(teclado.next());
                    System.out.println("====================");
                    System.out.println("Ingresa el numero de empleados");
                    su.setNumEmpleados(teclado.nextInt());
                    break;
                case 6:
                    System.out.println("====================");
                    System.out.println("Actualizando cuenta bancaria");
                    System.out.println("====================");
                    System.out.println("Ingresa la clave");
                    cuenta.setClave(teclado.next());
                    System.out.println("====================");
                    System.out.println("Ingresa el monto");
                    cuenta.setMonto(teclado.nextFloat());
                    break;
                case 7:
                    System.out.println("====================");
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("====================");
                    System.out.println("Error");
            }
         
        } while(resp != 7);
    }
    
}
