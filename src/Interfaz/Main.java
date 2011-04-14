/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import javax.swing.UIManager;


public class Main {
   
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            PantallaInicial inicial = new PantallaInicial();
            inicial.setVisible(true);
         }
        catch (Exception e)
         {
       System.out.println("An Exception occured: "+ e);
        }
    }

}

