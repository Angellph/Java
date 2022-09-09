/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado.pkg110321;

/**
 *
 * @author angelhernandez
 */
public class CuentaBancaria {
    private String clave;
    private float monto;

    public CuentaBancaria(String clave, float monto) {
        this.clave = clave;
        this.monto = monto;
    }

    public String getClave() {
        return clave;
    }

    public float getMonto() {
        return monto;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "Clave=" + clave + ", Monto=" + monto + '}';
    }
    
}
