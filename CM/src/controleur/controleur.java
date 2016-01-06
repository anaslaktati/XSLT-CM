package controleur;


import Vue.Menu;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import controleur.Message;

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
    
    //Affiche l'interface
    public void AfficherMenu(){
        getVue().setVisible(true);
    }
    
    //Quitter l'application
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
    
    //methode pour sauvegarder le fichier xsl
    public static void save() throws FileNotFoundException, IOException{
        
    
        JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File("/home/me/Documents"));
        int retrival = chooser.showSaveDialog(null);
    
        String mes ;
        mes=Message.getMessage();
        File file=new File(chooser.getSelectedFile()+".xsl");
        DataOutputStream fos = null;

        // On instancie nos objets :
        // fos va écrire dans le nouveau !
       
        fos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        fos.writeBytes(mes);
        file.createNewFile();
        
        fos.close();

    }
    
}
