package controleur;

import javax.xml.transform.Transformer;
import javax.xml.transform.OutputKeys;
import java.io.*;
import static java.io.FileDescriptor.in;
import static java.lang.System.in;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author anas
 */
public class OutPut {
 
    
    
    public void save() throws FileNotFoundException, IOException{
        
    
        String mes ="";
        File file=new File("C:\\Games\\new.xsl");
        DataOutputStream fos = null;

        // On instancie nos objets :
        // fos va écrire dans le nouveau !
       
        fos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        fos.writeBytes(mes);
        file.createNewFile();
        
        fos.close();

    }   
    public String getMessage(){
        String message = null;
        
        
        
        
        return message;
    }
}
