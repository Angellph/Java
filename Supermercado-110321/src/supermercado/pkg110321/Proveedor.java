/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado.pkg110321;

/**
 *
 * @author angelhernandez
 */
public class Proveedor {
    private String razonSocial;
    private String direccionFiscal;
    private String rfc;

    public Proveedor(String razonSocial, String direccionFiscal, String rfc) {
        this.razonSocial = razonSocial;
        this.direccionFiscal = direccionFiscal;
        this.rfc = rfc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccionFiscal() {
        return direccionFiscal;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setDireccionFiscal(String direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "razonSocial=" + razonSocial + ", direccionFiscal=" + direccionFiscal + ", rfc=" + rfc + '}';
    }
    
}
