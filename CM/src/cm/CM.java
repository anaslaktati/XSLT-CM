package cm;

import Vue.Menu;
import controleur.controleur;
import javax.swing.JOptionPane;
/**
 *
 * @author anas
 */
public class CM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Menu Menu = new Menu();
    controleur ctrl = new controleur(Menu);
    Menu.setControleur(ctrl);
    ctrl.AfficherMenu();
    
    }
    
}
