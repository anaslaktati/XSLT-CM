package Test;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author anas
 */
public class Main {

    /**
     * @param args the command line arguments
     * the Main tester
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File("/home/me/Documents"));
        int retrival = chooser.showSaveDialog(null);
    
        String mes ="";
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
