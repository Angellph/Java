/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc.bdvisual;

import Controller.ControladorMDB;
import Model.MDB;
import Views.FrmUsers;

/**
 *
 * @author angelhernandez
 */
public class MVCBDVisual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo = new MDB();
        
        FrmUsers objVista = new FrmUsers();
        
        ControladorMDB objController;
        objController = new ControladorMDB(objVista, objModelo);
        objController.iniciar();
        objVista.setVisible(true);
    }
    
}
