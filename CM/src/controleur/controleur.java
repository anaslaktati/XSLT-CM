package controleur;


import Vue.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author anas
 */
public class controleur {
    
    private Menu vue;
    
    public controleur(Menu vue) {
        this.vue = vue;
        this.vue.setControleur(this);
        // préparer l'état iniitial de la vue
        
    }
    
    public void AfficherMenu(){
        getVue().setVisible(true);
    }
    
    public void quitter() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "XSLT-CM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
//            getVue().dispose();
            System.exit(0);
        }
    }
    
    public Menu getVue() {
        return vue;
    }

    public void setVue(Menu vue) {
        this.vue = vue;
    }
    
    
}
