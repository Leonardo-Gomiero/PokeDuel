package Duel;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class CharacterSelection extends javax.swing.JFrame {

    int index = 0;
    boolean statusSelect = false;
    boolean male = false;
    boolean female = false;
    String gender = "";
    ImageIcon icon;
    
    public CharacterSelection() {
        initComponents();
        
        LblBackground.setVisible(false);
        LblRowan.setVisible(false);
        LblDawn.setVisible(false);
        LblLucas.setVisible(false);
        TxtName.setVisible(false);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        URL url = this.getClass().getResource("/Images/pokeduel.png");
        Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imgTitulo);

        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtName = new javax.swing.JTextArea();
        LblLucas = new javax.swing.JLabel();
        LblDawn = new javax.swing.JLabel();
        LblText = new javax.swing.JLabel();
        LblChat = new javax.swing.JLabel();
        LblRowan = new javax.swing.JLabel();
        LblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtName.setColumns(20);
        TxtName.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        TxtName.setRows(5);
        TxtName.setText("...");
        TxtName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNameFocusGained(evt);
            }
        });
        jPanel1.add(TxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 470, 50));

        LblLucas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblLucas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\lucasTranslucid.png")); // NOI18N
        LblLucas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblLucasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblLucasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LblLucasMousePressed(evt);
            }
        });
        jPanel1.add(LblLucas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 250, 430));

        LblDawn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblDawn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\dawnTranslucid.png")); // NOI18N
        LblDawn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblDawnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblDawnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LblDawnMouseReleased(evt);
            }
        });
        jPanel1.add(LblDawn, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 56, 250, 430));

        LblText.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        LblText.setForeground(new java.awt.Color(0, 0, 0));
        LblText.setText("...");
        jPanel1.add(LblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 850, 140));

        LblChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblChat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\chatBox.png")); // NOI18N
        jPanel1.add(LblChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        LblRowan.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\professorRowan.png")); // NOI18N
        jPanel1.add(LblRowan, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, -1));

        LblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\greetingsWallpaper.png")); // NOI18N
        jPanel1.add(LblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        if(!statusSelect){
            index++;            
        }
        else{
            index--;
        }
        
        System.out.println(index);
        switch (index) {
            case 1:
                LblText.setText("Hello there! It's so very nice to meet you!");
                break;
            case 2:
                LblText.setText("Welcome to the world of Pokémon!");
                LblBackground.setVisible(true);
                LblRowan.setVisible(true);
                break;
            case 3:
                LblText.setText("<html>My name is Rowan! However, everyone just call<br>me the Pokémon Professor.");
                break;
            case 4:
                LblText.setText("<html>This world is widely inhabited by creatures known<br>as Pokémon.");
                break;
            case 5:
                LblText.setText("I conduct research so that we may learn more about Pokémon.");
                break;
            case 6:
                LblText.setText("Battling alongside your Pokémon makes you stronger!");
                break;
            case 7:
                LblText.setText("<html>It's not about winning! It's about giving everything<br>you can!");
                break;
            case 8:
                LblText.setText("<html>But that's enough chatting! Tell me about yourself!<br>Are you a boy or a girl?");
                break;
            case 9:
                LblDawn.setVisible(true);
                LblLucas.setVisible(true);
                break;
            
            case -1:
                LblDawn.setVisible(false);
                LblLucas.setVisible(false);
                LblText.setText("So you're a " + gender + ". Alright, how about your name?");
                break;
            case -2:
                TxtName.setVisible(true);
                TxtName.requestFocus();
                break;
            case -3:
                TxtName.setVisible(false);
                LblText.setText("Nice to meet you, " + TxtName.getText() + "! It's an honour!");
                break;
            case -4:
                LblText.setText("But now, it's time to battle! See you later, " + TxtName.getText() + "!");
                break;
            case -5:
                ChoosePokemon choosePokemon = new ChoosePokemon();
                choosePokemon.trainerName = TxtName.getText();
                choosePokemon.trainerGender = gender;
                choosePokemon.setVisible(true);
                System.out.println("Tela intro: " + gender);
                dispose();
                break;
                

        }
    }//GEN-LAST:event_formMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        
        //JOptionPane.showMessageDialog(null, System.getProperties().getProperty("user.dir"));

        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/chatBox.png");
        LblChat.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/professorRowan.png");
        LblRowan.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/dawnTranslucid.png");
        LblDawn.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/lucasTranslucid.png");
        LblLucas.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/greetingsWallpaper.png");
        LblBackground.setIcon(icon);

        
        
    }//GEN-LAST:event_formWindowActivated

    private void LblDawnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblDawnMouseEntered
        if (!statusSelect) {
            ImageIcon icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/dawnSolid.png");
            LblDawn.setIcon(icon);
        }
    }//GEN-LAST:event_LblDawnMouseEntered

    private void LblDawnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblDawnMouseExited
        if(!statusSelect){
            ImageIcon icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/dawnTranslucid.png");
            LblDawn.setIcon(icon);
        }
    }//GEN-LAST:event_LblDawnMouseExited

    private void LblLucasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblLucasMouseEntered
        if(!statusSelect){
            ImageIcon icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/lucasSolid.png");
            LblLucas.setIcon(icon);
        }
    }//GEN-LAST:event_LblLucasMouseEntered

    private void LblLucasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblLucasMouseExited
        if(!statusSelect){
            ImageIcon icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/lucasTranslucid.png");
            LblLucas.setIcon(icon);
        }
    }//GEN-LAST:event_LblLucasMouseExited

    private void LblDawnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblDawnMouseReleased
        statusSelect = true;
        female = true;
        male = false;
        
        ImageIcon icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/dawnSolid.png");
        LblDawn.setIcon(icon);

        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/lucasTranslucid.png");
        LblLucas.setIcon(icon);
        gender = "girl";
        index = 0;
    }//GEN-LAST:event_LblDawnMouseReleased

    private void LblLucasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblLucasMousePressed
        statusSelect = true;
        female = false;
        male = true;
        
        ImageIcon icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/dawnTranslucid.png");
        LblDawn.setIcon(icon);

        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/lucasSolid.png");
        LblLucas.setIcon(icon);
        gender = "boy";
        index = 0;
    }//GEN-LAST:event_LblLucasMousePressed

    private void TxtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNameFocusGained
        TxtName.setText("");
    }//GEN-LAST:event_TxtNameFocusGained

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
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBackground;
    private javax.swing.JLabel LblChat;
    private javax.swing.JLabel LblDawn;
    private javax.swing.JLabel LblLucas;
    private javax.swing.JLabel LblRowan;
    private javax.swing.JLabel LblText;
    private javax.swing.JTextArea TxtName;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
