/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado.pkg110321;

/**
 *
 * @author angelhernandez
 */
public class Sucursal {
    private String nombre;
    private String direccion;
    private int numEmpleados;
    private CuentaBancaria cuenta;
    private Proveedor [] pro;

    public Sucursal(String nombre, String direccion, int numEmpleados, String clave, float monto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numEmpleados = numEmpleados;
        this.cuenta = new CuentaBancaria(clave, monto);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public Proveedor[] getPro() {
        return pro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void setPro(Proveedor[] pro) {
        this.pro = pro;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombre=" + nombre + ", direccion=" + direccion + ", numEmpleados=" + numEmpleados + ", cuenta=" + cuenta + ", pro=" + pro + '}';
    }
    
}
