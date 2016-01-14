package Test;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
 
	/*
	 *  @auteur sakoba adams
	 *  faire retourner une image
	 *
	 */
public class FlipImage extends JFrame implements ActionListener
 {
 	JButton btnSelect, btnBascul;
 	private BufferedImage image;
 	public FlipImage()
 	{
 		// Configuration de JFrame
 		setTitle("Manipulation des image");
 		setLayout(new BorderLayout());
 		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 350);
		setVisible(true);
 
		btnSelect=new JButton("Sélectionner une image");
		btnBascul=new JButton("Enregistrer une image");
		btnBascul.addActionListener(this);
		btnSelect.addActionListener(this);
		JPanel pnl=new JPanel();
		pnl.add(btnSelect);
		pnl.add(btnBascul);
		add(pnl,java.awt.BorderLayout.NORTH);		
 	}
 	// Ecrire les codes de deux boutons
 	public void actionPerformed(ActionEvent evt) 	{
 		if(evt.getSource()==btnSelect)
 		{
 				JFileChooser choix=new JFileChooser();
        		int op=choix.showOpenDialog(null);
        		if(op==0){
		      		try{
 
                                        Image img = ImageIO.read(new File(choix.getSelectedFile().getPath()));
                                        image = new BufferedImage(img.getWidth(null), img.getHeight(null),
                                         BufferedImage.TYPE_INT_ARGB);
                                        image.getGraphics().drawImage(img, 0, 0, null);
                                                add(new JComponent()
                                        {
                                        public void paintComponent(Graphics g)
                                        {
                                        if (image != null) g.drawImage(image, 0, 0, null);
                                        }
                                        });
                                        invalidate();  
                                        validate();

                                }catch(Exception err) {
                                        JOptionPane.showMessageDialog(null,err);
                                }        			

        		}
 		}
 		 else if(evt.getSource()==btnBascul)
 		{
    		 BufferedImage bi = image;
                 JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File("/home/me/Documents"));
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int retrival = chooser.showSaveDialog(null);
    
        String path = chooser.getSelectedFile().getAbsolutePath() ;
                 File outputfile = new File(path+"/saved.png");
                     try {	
                         ImageIO.write(bi, "png", outputfile);
                     } catch (IOException ex) {
                         Logger.getLogger(FlipImage.class.getName()).log(Level.SEVERE, null, ex);
                     }
 		}
 	}
  public static void main(String[] argv) throws Exception 
  	{
 
    new FlipImage();
 
   }
}