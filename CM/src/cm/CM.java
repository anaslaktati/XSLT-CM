package cm;

import Vue.Menu;
import com.sun.prism.paint.Color;
import controleur.controleur;
import java.awt.Dimension;
import javax.swing.LookAndFeel;
import javax.swing.UIDefaults;
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
            LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
            UIDefaults defaults = lookAndFeel.getDefaults();
            defaults.put("ScrollBar.minimumThumbSize", new Dimension(30, 30));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Menu Menu = new Menu();
        controleur ctrl = new controleur(Menu);
        Menu.setControleur(ctrl);
        ctrl.AfficherMenu();

    }

}
