package Vue;

import controleur.controleur;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author anas
 */
public class Menu extends javax.swing.JFrame {

    private controleur controleur;
    private Color c = Color.BLACK;
    private Color sc = Color.BLACK;
    private Color TDM = Color.BLACK;
    private Color cMainTitle = Color.BLACK;
    private Color cTitleChapter = Color.BLACK;
    private Color cTitle1 = Color.BLACK;
    private Color cTitle2 = Color.BLACK;
    private Color cTitle3 = Color.BLACK;
    private Color cTitle4 = Color.BLACK;
    private Color cTitle5 = Color.BLACK;
    private Color cTitle6 = Color.BLACK;
    private Color cBorderOut = Color.BLACK;
    private Color cBorderIn = Color.BLACK;
    private JTabbedPane JTabbedPane1;

    /**
     * Creates new form Menu
     * Create new icon
     */
    public Menu() {
        initComponents();
        setIcon();    
    }
    
    //Create a color panel
    public Color getC() {
        return c;
    }
    
    public Color getcMainTitle() {
        return cMainTitle;
    }
    
    public Color getcTitleChapter() {
        return cTitleChapter;
    }

    public Color getcTitle1() {
        return cTitle1;
    }

    public Color getcTitle2() {
        return cTitle2;
    }

    public Color getcTitle3() {
        return cTitle3;
    }

    public Color getcTitle4() {
        return cTitle4;
    }

    public Color getcTitle5() {
        return cTitle5;
    }

    public Color getcTitle6() {
        return cTitle6;
    }

    public Color getcBorderOut() {
        return cBorderOut;
    }

    public Color getcBorderIn() {
        return cBorderIn;
    }
    
    
    //Create 3 spinner for Columns
    public JSpinner getjSpinner1() {
        return jSpinnerColonne1;
    }

    public JSpinner getjSpinner2() {
        return jSpinnerColonne2;
    }

    public JSpinner getjSpinner3() {
        return jSpinnerColonne3;
    }
    //Create jTextField for entreprise name
    public String getjTextField1() {
        String j = jTextFieldNomEntreprise.getText();
        return j;
    }

    public controleur getControleur() {
        return controleur;
    }

//    public JPanel getjPanel7() {
//        return jPanel7;
//    }

    public void setControleur(controleur controleur) {
        this.controleur = controleur;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButtonAligneCentre = new javax.swing.JButton();
        jButtonAligneDroite = new javax.swing.JButton();
        jButtonAligneGauche = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSpinnerColonne1 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSpinnerColonne2 = new javax.swing.JSpinner();
        jSpinnerColonne3 = new javax.swing.JSpinner();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jSpinnerColonne4 = new javax.swing.JSpinner();
        jSpinnerColonne5 = new javax.swing.JSpinner();
        jSpinnerColonne6 = new javax.swing.JSpinner();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxFormat = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxOrientation = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jButtonCouleur = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNomEntreprise = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        JKeyMotCle1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        JkeyMotCle2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        JproN = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        JPronum = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Jtit = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Jreleas = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        JAnno = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabelPolice7 = new javax.swing.JLabel();
        jComboBoxPolice = new javax.swing.JComboBox<>();
        jLabelTaille7 = new javax.swing.JLabel();
        jComboBoxTaille1 = new javax.swing.JComboBox<>();
        jLabel106 = new javax.swing.JLabel();
        jTitre5 = new javax.swing.JLabel();
        jButtonCouleur9 = new javax.swing.JButton();
        jLabel107 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel108 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel109 = new javax.swing.JLabel();
        jButtonAliGauCouv = new javax.swing.JButton();
        jButtonItaliqueCouv = new javax.swing.JButton();
        jButtonAliCenCouv = new javax.swing.JButton();
        jButtonAliDroitCouv = new javax.swing.JButton();
        jButtonSouligner1 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabelPolice5 = new javax.swing.JLabel();
        jComboBoxPolice2 = new javax.swing.JComboBox<>();
        jLabelTaille5 = new javax.swing.JLabel();
        jComboBoxTaille2 = new javax.swing.JComboBox<>();
        jLabel96 = new javax.swing.JLabel();
        jTitre3 = new javax.swing.JLabel();
        jButtonCouleur7 = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel98 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButtonItaliqueTDM = new javax.swing.JButton();
        jButtonSouligner2 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jButtonAliGauTDM = new javax.swing.JButton();
        jButtonAliCenTDM = new javax.swing.JButton();
        jButtonAliDroitTDM = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBoxPolice3 = new javax.swing.JComboBox<>();
        jLabelPolice6 = new javax.swing.JLabel();
        jLabelTaille6 = new javax.swing.JLabel();
        jComboBoxTaille3 = new javax.swing.JComboBox<>();
        jButtonCouleur8 = new javax.swing.JButton();
        jTitre4 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButtonItaliqueTitre = new javax.swing.JButton();
        jButtonSouligner3 = new javax.swing.JButton();
        jButtonAliDroitTitre = new javax.swing.JButton();
        jButtonAliCenTitre = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButtonAliGauTitre = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButtonAliDroitPara = new javax.swing.JButton();
        jButtonAliCenPara = new javax.swing.JButton();
        jButtonAliGauPara = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton38 = new javax.swing.JButton();
        jButtonItaliquePara = new javax.swing.JButton();
        jButtonSouligner4 = new javax.swing.JButton();
        jButtonCouleur10 = new javax.swing.JButton();
        jTitre6 = new javax.swing.JLabel();
        jLabelTaille8 = new javax.swing.JLabel();
        jComboBoxTaille4 = new javax.swing.JComboBox<>();
        jLabel113 = new javax.swing.JLabel();
        jComboBoxPolice4 = new javax.swing.JComboBox<>();
        jLabelPolice8 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelTaille9 = new javax.swing.JLabel();
        jComboBoxTaille9 = new javax.swing.JComboBox<>();
        jLabel115 = new javax.swing.JLabel();
        jTitre7 = new javax.swing.JLabel();
        jButtonCouleur11 = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButtonItalique7 = new javax.swing.JButton();
        jButtonSouligner9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        cBordureInt1 = new javax.swing.JButton();
        jTitre1 = new javax.swing.JLabel();
        jTitre2 = new javax.swing.JLabel();
        cBordureInt2 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTitre8 = new javax.swing.JLabel();
        jTitre9 = new javax.swing.JLabel();
        cBordureFondCourant = new javax.swing.JButton();
        cFondEnTeteLigne = new javax.swing.JButton();
        cFondEnTeteColonne = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabelTaille10 = new javax.swing.JLabel();
        jLabelPolice9 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBoxPolice5 = new javax.swing.JComboBox<>();
        jComboBoxTaille5 = new javax.swing.JComboBox<>();
        jLabel118 = new javax.swing.JLabel();
        jTitre10 = new javax.swing.JLabel();
        jButtonCouleur12 = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel120 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        jButtonItaliqueTab = new javax.swing.JButton();
        jButtonSouligner5 = new javax.swing.JButton();
        jButtonAliDroitTab = new javax.swing.JButton();
        jButtonAliCenTab = new javax.swing.JButton();
        jButtonAliGauTab = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jButtonAliGauImages = new javax.swing.JButton();
        jButtonAliCenImages = new javax.swing.JButton();
        jButtonAliDroitImages = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabelTaille11 = new javax.swing.JLabel();
        jComboBoxTaille11 = new javax.swing.JComboBox<>();
        jLabel122 = new javax.swing.JLabel();
        jTitre11 = new javax.swing.JLabel();
        jButtonCouleur13 = new javax.swing.JButton();
        jLabel123 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jButtonItalique5 = new javax.swing.JButton();
        jButtonSouligner11 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelTaille12 = new javax.swing.JLabel();
        jComboBoxTaille6 = new javax.swing.JComboBox<>();
        jLabel124 = new javax.swing.JLabel();
        jTitre12 = new javax.swing.JLabel();
        jButtonCouleur14 = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jButtonItaliqueDos = new javax.swing.JButton();
        jButtonSouligner6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabelTaille13 = new javax.swing.JLabel();
        jComboBoxTaille13 = new javax.swing.JComboBox<>();
        jLabel126 = new javax.swing.JLabel();
        jTitre13 = new javax.swing.JLabel();
        jButtonCouleur15 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XSLT-CM");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 204));

        jButtonAligneCentre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Text-align-center-icon(1).png"))); // NOI18N

        jButtonAligneDroite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-right-icon(1).png"))); // NOI18N

        jButtonAligneGauche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-left-icon(2).png"))); // NOI18N

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel9.setText("Colonne 1 :");

        jSpinnerColonne1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel16.setText("Colonne 2 :");

        jLabel17.setText("Colonne 3 :");

        jSpinnerColonne2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinnerColonne2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                verif(evt);
            }
        });

        jSpinnerColonne3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinnerColonne3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                verif(evt);
            }
        });

        jLabel48.setText("mm");

        jLabel49.setText("mm");

        jLabel50.setText("mm");

        jLabel15.setText("Ligne 1 :");

        jLabel51.setText("Ligne 2 :");

        jLabel52.setText("Ligne 3 :");

        jSpinnerColonne4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSpinnerColonne5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSpinnerColonne6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel53.setText("mm");

        jLabel54.setText("mm");

        jLabel55.setText("mm");

        jLabel14.setText("Format du papier :");

        jComboBoxFormat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4A0", "2A0", "A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "B0", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "C0", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10" }));
        jComboBoxFormat.setSelectedIndex(6);
        jComboBoxFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormatActionPerformed(evt);
            }
        });

        jLabel18.setText("Orientation de la page :");

        jComboBoxOrientation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "portrait", "landscape" }));

        jLabel56.setText("Logo :");

        jButton4.setText("Parcourir");

        jLabel57.setText("Image : ");

        jButton6.setText("Parcourir");

        jButton7.setText("Sauvegarder");

        jLabel58.setText("Couleur de lignes :");

        jButtonCouleur.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleurActionPerformed(evt);
            }
        });

        jLabel5.setText("Nom de l'entreprise :");

        jTextFieldNomEntreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomEntrepriseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(27, 27, 27))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSpinnerColonne1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerColonne2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerColonne3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel51))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSpinnerColonne6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerColonne4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerColonne5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel53)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel57)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxOrientation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinnerColonne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)
                            .addComponent(jLabel15)
                            .addComponent(jSpinnerColonne5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerColonne2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel51)
                            .addComponent(jLabel16)
                            .addComponent(jSpinnerColonne6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jSpinnerColonne3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel52)
                                .addComponent(jSpinnerColonne4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel53)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jComboBoxOrientation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jLabel57)
                            .addComponent(jButton6)
                            .addComponent(jLabel56)
                            .addComponent(jLabel58))))
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNomEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton7)
                .addGap(98, 98, 98))
        );

        jTabbedPane3.addTab("Général", jPanel12);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exemple.jpg"))); // NOI18N

        jLabel25.setText("Keyword [1] :");

        JKeyMotCle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JKeyMotCle1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Keyword [2] :");

        jLabel6.setText("Adresse :");

        jLabel7.setText("Lien :");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Product name :");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Product number :");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Title :");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Release info :");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("annotation :");

        JAnno.setText("Document à conserver\nà proximité de la\nmachine, complet et\nen bon état, pour la\ndisposition de l’opérateur\nou du personnel de\nmaintenance");

        jButton8.setText("Sauvegarder");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(JkeyMotCle2))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(JKeyMotCle1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(jTextField9))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JproN, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JPronum, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jreleas, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(JAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(Jtit))
                        .addGap(48, 48, 48)))
                .addComponent(jLabel19)
                .addGap(148, 148, 148))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(48, 48, 48))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(JKeyMotCle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JproN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(JkeyMotCle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(JPronum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Jtit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(Jreleas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(JAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Edition", jPanel13);

        jLabel105.setText("Nom du style :");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keyword [1]", "Keyword [2]", "Title\t", "Productname" }));

        jLabelPolice7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPolice7.setText("Police :");

        jComboBoxPolice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Comic sans MS", "Calibri" }));

        jLabelTaille7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille7.setText("Taille :");

        jComboBoxTaille1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jLabel106.setText("pt");

        jTitre5.setText("Couleur :");

        jButtonCouleur9.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur9ActionPerformed(evt);
            }
        });

        jLabel107.setText("Césure :");

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel108.setText("Style :");

        jButton30.setText("G");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jLabel109.setText("Alignement texte :");

        jButtonAliGauCouv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-left-icon(1).png"))); // NOI18N

        jButtonItaliqueCouv.setText("I");

        jButtonAliCenCouv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Text-align-center-icon(1).png"))); // NOI18N

        jButtonAliDroitCouv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-right-icon(1).png"))); // NOI18N

        jButtonSouligner1.setText("S");

        jButton34.setText("Sauvegarder");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButtonAliCenCouv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAliDroitCouv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAliGauCouv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTaille7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelPolice7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel105))
                                    .addComponent(jTitre5)
                                    .addComponent(jLabel107)))
                            .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPolice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jComboBoxTaille1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel106))
                            .addComponent(jButtonCouleur9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonItaliqueCouv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSouligner1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(786, Short.MAX_VALUE)
                .addComponent(jButton34)
                .addGap(178, 178, 178))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPolice7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPolice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTaille7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTaille1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCouleur9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitre5))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addComponent(jCheckBox5))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jButton30)
                    .addComponent(jButtonItaliqueCouv)
                    .addComponent(jButtonSouligner1))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAliGauCouv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAliDroitCouv)
                        .addComponent(jButtonAliCenCouv))
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jButton34)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Styles", jPanel9);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jButtonAligneGauche, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButtonAligneCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonAligneDroite, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAligneGauche, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAligneDroite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAligneCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(491, 491, 491))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Couverture", jPanel1);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_sommaire.jpg"))); // NOI18N

        jLabel95.setText("Nom du style :");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titre", "Titre1", "Titre2", "Titre3", "Titre4", "Titre5", "Titre6", " " }));

        jLabelPolice5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPolice5.setText("Police :");

        jComboBoxPolice2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Comic sans MS", "Calibri" }));

        jLabelTaille5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille5.setText("Taille :");

        jComboBoxTaille2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jLabel96.setText("pt");

        jTitre3.setText("Couleur :");

        jButtonCouleur7.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur7ActionPerformed(evt);
            }
        });

        jLabel97.setText("Césure :");

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel98.setText("Style :");

        jButton22.setText("G");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButtonItaliqueTDM.setText("I");

        jButtonSouligner2.setText("S");

        jLabel99.setText("Alignement texte :");

        jButtonAliGauTDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-left-icon(1).png"))); // NOI18N

        jButtonAliCenTDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Text-align-center-icon(1).png"))); // NOI18N

        jButtonAliDroitTDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-right-icon(1).png"))); // NOI18N

        jButton12.setText("Sauvegarder");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonAliGauTDM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAliCenTDM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAliDroitTDM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelTaille5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabelPolice5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel95))
                                            .addComponent(jTitre3)
                                            .addComponent(jLabel97)))
                                    .addComponent(jLabel98, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxPolice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jComboBoxTaille2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel96))
                                    .addComponent(jButtonCouleur7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox3)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonItaliqueTDM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSouligner2)))))
                        .addGap(79, 79, 79)
                        .addComponent(jLabel20)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPolice5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPolice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTaille5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTaille2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCouleur7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTitre3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel97)
                            .addComponent(jCheckBox3))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(jButton22)
                            .addComponent(jButtonItaliqueTDM)
                            .addComponent(jButtonSouligner2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonAliDroitTDM)
                                .addComponent(jButtonAliCenTDM))
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAliGauTDM, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addContainerGap())
        );

        jTabbedPane1.addTab("T.D.M", jPanel8);

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel100.setText("Nom du style :");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titre", "Titre1", "Titre2", "Titre3", "Titre4", "Titre5", "Titre6", " " }));

        jComboBoxPolice3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Comic sans MS", "Calibri" }));

        jLabelPolice6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPolice6.setText("Police :");

        jLabelTaille6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille6.setText("Taille :");

        jComboBoxTaille3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jButtonCouleur8.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur8ActionPerformed(evt);
            }
        });

        jTitre4.setText("Couleur :");

        jLabel101.setText("Césure :");

        jButton26.setText("G");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButtonItaliqueTitre.setText("I");

        jButtonSouligner3.setText("S");

        jButtonAliDroitTitre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-right-icon(1).png"))); // NOI18N

        jButtonAliCenTitre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Text-align-center-icon(1).png"))); // NOI18N

        jLabel102.setText("Alignement texte :");

        jLabel103.setText("Style :");

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButtonAliGauTitre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-left-icon(1).png"))); // NOI18N

        jLabel104.setText("pt");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CorpsBonnet.png"))); // NOI18N

        jButton1.setText("Sauvegarder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButtonAliCenTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAliDroitTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAliGauTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTaille6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelPolice6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel100))
                                    .addComponent(jTitre4)
                                    .addComponent(jLabel101)))
                            .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonItaliqueTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSouligner3))
                            .addComponent(jComboBoxPolice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jComboBoxTaille3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel104))
                            .addComponent(jButtonCouleur8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPolice6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPolice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTaille6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTaille3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCouleur8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTitre4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(jCheckBox4))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(jButton26)
                            .addComponent(jButtonItaliqueTitre)
                            .addComponent(jButtonSouligner3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonAliGauTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAliDroitTitre)
                                .addComponent(jButtonAliCenTitre))
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jTabbedPane2.addTab("Style de titres", jPanel7);

        jButtonAliDroitPara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-right-icon(1).png"))); // NOI18N

        jButtonAliCenPara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Text-align-center-icon(1).png"))); // NOI18N

        jButtonAliGauPara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-left-icon(1).png"))); // NOI18N

        jLabel110.setText("Alignement texte :");

        jLabel111.setText("Style :");

        jLabel112.setText("Césure :");

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jButton38.setText("G");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButtonItaliquePara.setText("I");

        jButtonSouligner4.setText("S");

        jButtonCouleur10.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur10ActionPerformed(evt);
            }
        });

        jTitre6.setText("Couleur :");

        jLabelTaille8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille8.setText("Taille :");

        jComboBoxTaille4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jLabel113.setText("pt");

        jComboBoxPolice4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Comic sans MS", "Calibri" }));

        jLabelPolice8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPolice8.setText("Police :");

        jLabel114.setText("Nom du style :");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Para", "Liste", "Guibutton", "Guilabel", "Guimenu", "Keycap", "Note", "Tip", "Warning", "Important", "Caution", " " }));

        jLabel1.setText("Type de liste :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puces", "Numéros", " " }));

        jLabel2.setText("Niveau :");

        jLabel3.setText("Admonition :");

        jButton2.setText("Parcourir");

        jLabel4.setText("Titre :");

        jLabelTaille9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille9.setText("Taille :");

        jComboBoxTaille9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jLabel115.setText("pt");

        jTitre7.setText("Couleur :");

        jButtonCouleur11.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur11ActionPerformed(evt);
            }
        });

        jLabel116.setText("Style :");

        jButton39.setText("G");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButtonItalique7.setText("I");

        jButtonSouligner9.setText("S");

        jButton3.setText("Sauvegarder");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTaille8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelPolice8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel114))
                                    .addComponent(jTitre6)
                                    .addComponent(jLabel112)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonItaliquePara, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSouligner4))
                            .addComponent(jComboBoxPolice4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jComboBoxTaille4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel113))
                            .addComponent(jButtonCouleur10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTaille9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTaille9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel115)
                                .addGap(18, 18, 18)
                                .addComponent(jTitre7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCouleur11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel116)
                                .addGap(18, 18, 18)
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonItalique7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSouligner9))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel110)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButtonAliCenPara, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAliDroitPara, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAliGauPara, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))))
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTaille9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxTaille9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel115)
                        .addComponent(jTitre7))
                    .addComponent(jButtonCouleur11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel116)
                        .addComponent(jButton39)
                        .addComponent(jButtonItalique7)
                        .addComponent(jButtonSouligner9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPolice8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPolice4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTaille8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTaille4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCouleur10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitre6))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112)
                    .addComponent(jCheckBox6))
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jButton38)
                    .addComponent(jButtonItaliquePara)
                    .addComponent(jButtonSouligner4))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAliGauPara, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAliDroitPara)
                        .addComponent(jButtonAliCenPara))
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Style de paragraphes", jPanel10);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Bordure du tableau"));

        jLabel13.setText("Epaisseur :");

        jLabel29.setText("pt");

        cBordureInt1.setBackground(new java.awt.Color(0, 0, 0));
        cBordureInt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cBordureInt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBordureInt1ActionPerformed(evt);
            }
        });

        jTitre1.setText("Bordures internes :");

        jTitre2.setText("Bordures externes :");

        cBordureInt2.setBackground(new java.awt.Color(0, 0, 0));
        cBordureInt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cBordureInt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBordureInt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTitre2)
                    .addComponent(jTitre1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29))
                    .addComponent(cBordureInt2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBordureInt1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cBordureInt1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cBordureInt2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitre2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Fonds"));

        jLabel30.setText("Lignes courantes :");

        jTitre8.setText("En-tête de ligne :");

        jTitre9.setText("En-tête de colonne :");

        cBordureFondCourant.setBackground(new java.awt.Color(0, 0, 0));
        cBordureFondCourant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cBordureFondCourant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBordureFondCourantActionPerformed(evt);
            }
        });

        cFondEnTeteLigne.setBackground(new java.awt.Color(0, 0, 0));
        cFondEnTeteLigne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cFondEnTeteLigne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFondEnTeteLigneActionPerformed(evt);
            }
        });

        cFondEnTeteColonne.setBackground(new java.awt.Color(0, 0, 0));
        cFondEnTeteColonne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cFondEnTeteColonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFondEnTeteColonneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTitre9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cFondEnTeteColonne, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jTitre8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cBordureFondCourant, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cFondEnTeteLigne, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel30))
                            .addComponent(cBordureFondCourant, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTitre8))
                    .addComponent(cFondEnTeteLigne, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTitre9))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cFondEnTeteColonne, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Style de paragraphes"));

        jLabelTaille10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille10.setText("Taille :");

        jLabelPolice9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPolice9.setText("Police :");

        jLabel117.setText("Nom du style :");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titre du tableau", "En-tête de ligne", "En-tête de colonne" }));

        jComboBoxPolice5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Comic sans MS", "Calibri" }));

        jComboBoxTaille5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jLabel118.setText("pt");

        jTitre10.setText("Couleur :");

        jButtonCouleur12.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur12ActionPerformed(evt);
            }
        });

        jLabel119.setText("Césure :");

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jLabel120.setText("Style :");

        jButton40.setText("G");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButtonItaliqueTab.setText("I");

        jButtonSouligner5.setText("S");

        jButtonAliDroitTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-right-icon(1).png"))); // NOI18N

        jButtonAliCenTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Text-align-center-icon(1).png"))); // NOI18N

        jButtonAliGauTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-left-icon(1).png"))); // NOI18N

        jLabel121.setText("Alignement texte :");

        jButton9.setText("Sauvegarder");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTaille10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPolice9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTitre10)
                                    .addComponent(jLabel119)))
                            .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPolice5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jComboBoxTaille5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel118))
                            .addComponent(jButtonCouleur12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox7)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonItaliqueTab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSouligner5))
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButtonAliCenTab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAliDroitTab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAliGauTab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 570, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(20, 20, 20))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel117))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPolice9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPolice5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTaille10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTaille5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel118))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCouleur12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTitre10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119)
                            .addComponent(jCheckBox7))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel120)
                            .addComponent(jButton40)
                            .addComponent(jButtonItaliqueTab)
                            .addComponent(jButtonSouligner5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonAliGauTab, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAliDroitTab)
                                .addComponent(jButtonAliCenTab))
                            .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jTabbedPane2.addTab("Tableaux", jPanel14);

        jLabel31.setText("Alignement :");

        jButtonAliGauImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-left-icon(1).png"))); // NOI18N

        jButtonAliCenImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Text-align-center-icon(1).png"))); // NOI18N

        jButtonAliDroitImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/text-align-right-icon(1).png"))); // NOI18N

        jLabel32.setText("Titre :");

        jLabelTaille11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille11.setText("Taille :");

        jComboBoxTaille11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jLabel122.setText("pt");

        jTitre11.setText("Couleur :");

        jButtonCouleur13.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur13ActionPerformed(evt);
            }
        });

        jLabel123.setText("Style :");

        jButton47.setText("G");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButtonItalique5.setText("I");

        jButtonSouligner11.setText("S");

        jButton10.setText("Sauvegarder");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel31))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel32))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTaille11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTaille11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel122)
                        .addGap(18, 18, 18)
                        .addComponent(jTitre11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCouleur13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel123)
                        .addGap(18, 18, 18)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonItalique5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSouligner11))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonAliCenImages, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAliDroitImages, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAliGauImages, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(427, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(63, 63, 63))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jCheckBox2)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTaille11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxTaille11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel122)
                        .addComponent(jTitre11))
                    .addComponent(jButtonCouleur13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel123)
                        .addComponent(jButton47)
                        .addComponent(jButtonItalique5)
                        .addComponent(jButtonSouligner11)))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel31))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAliGauImages, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAliDroitImages)
                        .addComponent(jButtonAliCenImages)))
                .addGap(44, 44, 44)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Images", jPanel15);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Page intérieur", jPanel2);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_cover.jpg"))); // NOI18N

        jLabel36.setText("Informations :");

        jLabelTaille12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille12.setText("Taille :");

        jComboBoxTaille6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jLabel124.setText("pt");

        jTitre12.setText("Couleur :");

        jButtonCouleur14.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur14ActionPerformed(evt);
            }
        });

        jLabel125.setText("Style :");

        jButton48.setText("G");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButtonItaliqueDos.setText("I");

        jButtonSouligner6.setText("S");

        jButton5.setText("Sauvegarder");

        jLabel34.setText("Ligne :");

        jLabelTaille13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTaille13.setText("Epaisseur :");

        jComboBoxTaille13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14" }));

        jLabel126.setText("pt");

        jTitre13.setText("Couleur :");

        jButtonCouleur15.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCouleur15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCouleur15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelTaille12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTaille6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel124)
                        .addGap(18, 18, 18)
                        .addComponent(jTitre12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCouleur14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel125)
                        .addGap(18, 18, 18)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonItaliqueDos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSouligner6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTaille13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTaille13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel126)
                        .addGap(25, 25, 25)
                        .addComponent(jTitre13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCouleur15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTaille12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxTaille6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel124)
                                .addComponent(jTitre12))
                            .addComponent(jButtonCouleur14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel125)
                                .addComponent(jButton48)
                                .addComponent(jButtonItaliqueDos)
                                .addComponent(jButtonSouligner6)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jCheckBox8)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTaille13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxTaille13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel126)
                                .addComponent(jTitre13))
                            .addComponent(jButtonCouleur15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel21)))
                .addGap(28, 28, 28)
                .addComponent(jButton5)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dos", jPanel3);

        jMenu1.setText("Fichier");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jMenuItem1.setText("Sauvegarder");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quit.png"))); // NOI18N
        jMenuItem5.setText("Quitter");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(1079, 1079, 1079))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 241, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.getControleur().quitter();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.getControleur().quitter();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Attribution de la methode Save() au bouton save
        try {
            this.controleur.save();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonCouleur15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCouleur15ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButtonCouleur14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCouleur14ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButtonCouleur13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCouleur13ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jButtonCouleur12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCouleur12ActionPerformed

    private void cFondEnTeteColonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFondEnTeteColonneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cFondEnTeteColonneActionPerformed

    private void cFondEnTeteLigneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFondEnTeteLigneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cFondEnTeteLigneActionPerformed

    private void cBordureFondCourantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBordureFondCourantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBordureFondCourantActionPerformed

    private void cBordureInt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBordureInt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBordureInt2ActionPerformed

    private void cBordureInt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBordureInt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBordureInt1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButtonCouleur11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCouleur11ActionPerformed

    private void jButtonCouleur10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCouleur10ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButtonCouleur8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCouleur8ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButtonCouleur7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur7ActionPerformed
        //Creation d'un jColorChooser, Panel de couleur
        JColorChooser jc = new JColorChooser();
        TDM = jc.showDialog(null, "Choisissez une couleur", TDM);
        //Bouton du panel de couleur affiche la couleur choisie actuellement
        jButtonCouleur7.setBorder(BorderFactory.createLineBorder(Color.black));
        jButtonCouleur7.setBackground(TDM);
    }//GEN-LAST:event_jButtonCouleur7ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButtonCouleur9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleur9ActionPerformed
        //Creation d'un jColorChooser, Panel de couleur
        JColorChooser jc = new JColorChooser();
        sc = jc.showDialog(null, "Choisissez une couleur", sc);
        //Bouton du panel de couleur affiche la couleur choisie actuellement
        jButtonCouleur9.setBorder(BorderFactory.createLineBorder(Color.black));
        jButtonCouleur9.setBackground(sc);
    }//GEN-LAST:event_jButtonCouleur9ActionPerformed

    private void jButtonCouleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCouleurActionPerformed
        //Creation d'un jColorChooser, Panel de couleur
        JColorChooser jc = new JColorChooser();
        c = jc.showDialog(null, "Choisissez une couleur", c);
        //Bouton du panel de couleur affiche la couleur choisie actuellement
        jButtonCouleur.setBorder(BorderFactory.createLineBorder(Color.black));
        jButtonCouleur.setBackground(c);
        System.out.println(c);
    }//GEN-LAST:event_jButtonCouleurActionPerformed

    private void jComboBoxFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFormatActionPerformed

    private void verif(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verif
        //Recupere la valeur des colonnes
        Integer c1,c2,c3;
        c1=(Integer)jSpinnerColonne1.getValue();
        c2=(Integer)jSpinnerColonne1.getValue();
        c3=(Integer)jSpinnerColonne1.getValue();
        int somme=c1+c2+c3;
        //Renvoie une erreur si format page non respecté
        if(jComboBoxFormat.getSelectedItem() == "A4" && somme != 210){
            jSpinnerColonne1.setBackground(Color.RED);
            jSpinnerColonne2.setBackground(Color.RED);
            jSpinnerColonne3.setBackground(Color.RED);
        } else {
        }
    }//GEN-LAST:event_verif

    private void jTextFieldNomEntrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomEntrepriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomEntrepriseActionPerformed

    private void JKeyMotCle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JKeyMotCle1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JKeyMotCle1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAnno;
    private javax.swing.JTextField JKeyMotCle1;
    private javax.swing.JTextField JPronum;
    private javax.swing.JTextField JkeyMotCle2;
    private javax.swing.JTextField JproN;
    private javax.swing.JTextField Jreleas;
    private javax.swing.JTextField Jtit;
    private javax.swing.JButton cBordureFondCourant;
    private javax.swing.JButton cBordureInt1;
    private javax.swing.JButton cBordureInt2;
    private javax.swing.JButton cFondEnTeteColonne;
    private javax.swing.JButton cFondEnTeteLigne;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAliCenCouv;
    private javax.swing.JButton jButtonAliCenImages;
    private javax.swing.JButton jButtonAliCenPara;
    private javax.swing.JButton jButtonAliCenTDM;
    private javax.swing.JButton jButtonAliCenTab;
    private javax.swing.JButton jButtonAliCenTitre;
    private javax.swing.JButton jButtonAliDroitCouv;
    private javax.swing.JButton jButtonAliDroitImages;
    private javax.swing.JButton jButtonAliDroitPara;
    private javax.swing.JButton jButtonAliDroitTDM;
    private javax.swing.JButton jButtonAliDroitTab;
    private javax.swing.JButton jButtonAliDroitTitre;
    private javax.swing.JButton jButtonAliGauCouv;
    private javax.swing.JButton jButtonAliGauImages;
    private javax.swing.JButton jButtonAliGauPara;
    private javax.swing.JButton jButtonAliGauTDM;
    private javax.swing.JButton jButtonAliGauTab;
    private javax.swing.JButton jButtonAliGauTitre;
    private javax.swing.JButton jButtonAligneCentre;
    private javax.swing.JButton jButtonAligneDroite;
    private javax.swing.JButton jButtonAligneGauche;
    private javax.swing.JButton jButtonCouleur;
    private javax.swing.JButton jButtonCouleur10;
    private javax.swing.JButton jButtonCouleur11;
    private javax.swing.JButton jButtonCouleur12;
    private javax.swing.JButton jButtonCouleur13;
    private javax.swing.JButton jButtonCouleur14;
    private javax.swing.JButton jButtonCouleur15;
    private javax.swing.JButton jButtonCouleur7;
    private javax.swing.JButton jButtonCouleur8;
    private javax.swing.JButton jButtonCouleur9;
    private javax.swing.JButton jButtonItalique5;
    private javax.swing.JButton jButtonItalique7;
    private javax.swing.JButton jButtonItaliqueCouv;
    private javax.swing.JButton jButtonItaliqueDos;
    private javax.swing.JButton jButtonItaliquePara;
    private javax.swing.JButton jButtonItaliqueTDM;
    private javax.swing.JButton jButtonItaliqueTab;
    private javax.swing.JButton jButtonItaliqueTitre;
    private javax.swing.JButton jButtonSouligner1;
    private javax.swing.JButton jButtonSouligner11;
    private javax.swing.JButton jButtonSouligner2;
    private javax.swing.JButton jButtonSouligner3;
    private javax.swing.JButton jButtonSouligner4;
    private javax.swing.JButton jButtonSouligner5;
    private javax.swing.JButton jButtonSouligner6;
    private javax.swing.JButton jButtonSouligner9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox jComboBoxFormat;
    private javax.swing.JComboBox jComboBoxOrientation;
    private javax.swing.JComboBox<String> jComboBoxPolice;
    private javax.swing.JComboBox<String> jComboBoxPolice2;
    private javax.swing.JComboBox<String> jComboBoxPolice3;
    private javax.swing.JComboBox<String> jComboBoxPolice4;
    private javax.swing.JComboBox<String> jComboBoxPolice5;
    private javax.swing.JComboBox<String> jComboBoxTaille1;
    private javax.swing.JComboBox<String> jComboBoxTaille11;
    private javax.swing.JComboBox<String> jComboBoxTaille13;
    private javax.swing.JComboBox<String> jComboBoxTaille2;
    private javax.swing.JComboBox<String> jComboBoxTaille3;
    private javax.swing.JComboBox<String> jComboBoxTaille4;
    private javax.swing.JComboBox<String> jComboBoxTaille5;
    private javax.swing.JComboBox<String> jComboBoxTaille6;
    private javax.swing.JComboBox<String> jComboBoxTaille9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelPolice5;
    private javax.swing.JLabel jLabelPolice6;
    private javax.swing.JLabel jLabelPolice7;
    private javax.swing.JLabel jLabelPolice8;
    private javax.swing.JLabel jLabelPolice9;
    private javax.swing.JLabel jLabelTaille10;
    private javax.swing.JLabel jLabelTaille11;
    private javax.swing.JLabel jLabelTaille12;
    private javax.swing.JLabel jLabelTaille13;
    private javax.swing.JLabel jLabelTaille5;
    private javax.swing.JLabel jLabelTaille6;
    private javax.swing.JLabel jLabelTaille7;
    private javax.swing.JLabel jLabelTaille8;
    private javax.swing.JLabel jLabelTaille9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinnerColonne1;
    private javax.swing.JSpinner jSpinnerColonne2;
    private javax.swing.JSpinner jSpinnerColonne3;
    private javax.swing.JSpinner jSpinnerColonne4;
    private javax.swing.JSpinner jSpinnerColonne5;
    private javax.swing.JSpinner jSpinnerColonne6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldNomEntreprise;
    private javax.swing.JLabel jTitre1;
    private javax.swing.JLabel jTitre10;
    private javax.swing.JLabel jTitre11;
    private javax.swing.JLabel jTitre12;
    private javax.swing.JLabel jTitre13;
    private javax.swing.JLabel jTitre2;
    private javax.swing.JLabel jTitre3;
    private javax.swing.JLabel jTitre4;
    private javax.swing.JLabel jTitre5;
    private javax.swing.JLabel jTitre6;
    private javax.swing.JLabel jTitre7;
    private javax.swing.JLabel jTitre8;
    private javax.swing.JLabel jTitre9;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getjButton1() {
        return jButton1;
    }


  
    /*----------------------------------------------------------------*/
    //Boutons Aligner
    public javax.swing.JButton getjButtonAliGauCouv() {
        return jButtonAliGauCouv;
    }
    
    public javax.swing.JButton getjButtonAliCenCouv() {
        return jButtonAliCenCouv;
    }

    public javax.swing.JButton getjButtonAliDroitCouv() {
        return jButtonAliDroitCouv;
    }

    public javax.swing.JButton getjButtonAliGauTDM() {
        return jButtonAliGauTDM;
    }
    
    public javax.swing.JButton getjButtonAliCenTDM() {
        return jButtonAliCenTDM;
    }
    
    public javax.swing.JButton getjButtonAliDroitTDM() {
        return jButtonAliDroitTDM;
    }

    public javax.swing.JButton getjButtonAliCenPara() {
        return jButtonAliCenPara;
    }

    public javax.swing.JButton getjButtonAliCenTitre() {
        return jButtonAliCenTitre;
    }

    public javax.swing.JButton getjButtonAliDroitPara() {
        return jButtonAliDroitPara;
    }

    public javax.swing.JButton getjButtonAliDroitTitre() {
        return jButtonAliDroitTitre;
    }

    public javax.swing.JButton getjButtonAliGauPara() {
        return jButtonAliGauPara;
    }

    public javax.swing.JButton getjButtonAliGauTitre() {
        return jButtonAliGauTitre;
    }

    public javax.swing.JButton getjButtonAliCenImages() {
        return jButtonAliCenImages;
    }

    public javax.swing.JButton getjButtonAliCenTab() {
        return jButtonAliCenTab;
    }

    public javax.swing.JButton getjButtonAliDroitImages() {
        return jButtonAliDroitImages;
    }

    public javax.swing.JButton getjButtonAliDroitTab() {
        return jButtonAliDroitTab;
    }

    public javax.swing.JButton getjButtonAliGauImages() {
        return jButtonAliGauImages;
    }

    public javax.swing.JButton getjButtonAliGauTab() {
        return jButtonAliGauTab;
    }
    
    /*----------------------------------------------------------------*/

    public JButton getjButtonItaliqueCouv() {
        return jButtonItaliqueCouv;
    }

    public JButton getjButtonItaliqueDos() {
        return jButtonItaliqueDos;
    }

    public JButton getjButtonItaliquePara() {
        return jButtonItaliquePara;
    }

    public JButton getjButtonItaliqueTDM() {
        return jButtonItaliqueTDM;
    }

    public JButton getjButtonItaliqueTab() {
        return jButtonItaliqueTab;
    }

    public JButton getjButtonItaliqueTitre() {
        return jButtonItaliqueTitre;
    }

    //Boutons souligner
    public javax.swing.JButton getjButtonSoulignerCouv() {
        return jButtonSouligner1;
    }
    
    public javax.swing.JButton getjButtonSoulignerTDM() {
        return jButtonSouligner2;
    }

    public javax.swing.JButton getjButtonSoulignerTitre() {
        return jButtonSouligner3;
    }
    
    public javax.swing.JButton getjButtonSoulignerPara() {
        return jButtonSouligner4;
    }
    
    public javax.swing.JButton getjButtonSoulignerTab() {
        return jButtonSouligner5;
    }
    
    public javax.swing.JButton getjButtonSoulignerDos() {
        return jButtonSouligner6;
    }
    
    //jComboBox pour la police d'ecriture
    public javax.swing.JComboBox<String> getjComboBoxPolice1() {
        return jComboBoxPolice;
    }
    
    public javax.swing.JComboBox<String> getjComboBoxPolice2() {
        return jComboBoxPolice2;
    }
    
    public javax.swing.JComboBox<String> getjComboBoxPoliceTitre() {
        return jComboBoxPolice3;
    }
    
    public javax.swing.JComboBox<String> getjComboBoxPolicePara() {
        return jComboBoxPolice4;
    }
    
    public javax.swing.JComboBox<String> getjComboBoxPolicejTab() {
        return jComboBoxPolice5;
    }
    
    //jComboBox pour la taille de la police
    public javax.swing.JComboBox<String> getjComboBoxTailleCouv() {
        return jComboBoxTaille1;
    }
    
    public javax.swing.JComboBox<String> getjComboBoxTailleTDM() {
        return jComboBoxTaille2;
    }

    public javax.swing.JComboBox<String> getjComboBoxTailleTitre() {
        return jComboBoxTaille3;
    }
    
    public javax.swing.JComboBox<String> getjComboBoxTaillePara() {
        return jComboBoxTaille4;
    }
    
    public javax.swing.JComboBox<String> getjComboBoxTailleTab() {
        return jComboBoxTaille5;
    }
    
    public javax.swing.JComboBox<String> getjComboBoxTailleDos() {
        return jComboBoxTaille6;
    }
    
    //jButton pour le panel de couleur
    public javax.swing.JButton getjButton15() {
        return jButtonCouleur;
    }

    public javax.swing.JMenu getjMenu1() {
        return jMenu1;
    }

    public javax.swing.JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public javax.swing.JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public javax.swing.JMenuItem getjMenuItem5() {
        return jMenuItem5;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    public javax.swing.JPanel getjPanel3() {
        return jPanel3;
    }

    public javax.swing.JPanel getjPanel4() {
        return jPanel4;
    }

//    public javax.swing.JPanel getjPanel5() {
//        return jPanel5;
//    }
//
//    public javax.swing.JPanel getjPanel6() {
//        return jPanel6;
//    }

    public javax.swing.JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public JComboBox getPapier() {
        return jComboBoxFormat;
    }

    public JComboBox getPageO() {
        return jComboBoxOrientation;
    }

    public JTextField getJAnno() {
        return JAnno;
    }

    public JTextField getJKey1() {
        return JKeyMotCle1;
    }

    public JTextField getJPronum() {
        return JPronum;
    }

    public JTextField getJkey2() {
        return JkeyMotCle2;
    }

    public JTextField getJproN() {
        return JproN;
    }

    public JTextField getJreleas() {
        return Jreleas;
    }

    public JTextField getJtit() {
        return Jtit;
    }

    //Changement du logo
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));
    }

}
