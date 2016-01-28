package cm;

import Vue.Menu;
import controleur.controleur;
import javax.swing.UIManager;
//import javax.swing.JOptionPane;

/**
 *
 * @author anas
 */
public class CM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Menu Menu = new Menu();
        controleur ctrl = new controleur(Menu);
        Menu.setControleur(ctrl);
        ctrl.AfficherMenu();

    }

}
