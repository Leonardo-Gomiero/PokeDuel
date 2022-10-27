/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Duel;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;


public class HallOfFame extends javax.swing.JFrame {

    String playerName;
    String pokemonName;
    String gender;
    
    ImageIcon playerIcon;
    ImageIcon pokemonIcon;
    
    ImageIcon icon;
    
    public HallOfFame() {
        initComponents();
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

        LblPokemon = new javax.swing.JLabel();
        LblPlayer = new javax.swing.JLabel();
        LblText = new javax.swing.JLabel();
        LblChat = new javax.swing.JLabel();
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

        LblPokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPokemon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\Giratina.png")); // NOI18N
        getContentPane().add(LblPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 450, 430));

        LblPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPlayer.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\lucasSolid.png")); // NOI18N
        getContentPane().add(LblPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 260, 430));

        LblText.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        LblText.setForeground(new java.awt.Color(0, 0, 0));
        LblText.setText("...");
        getContentPane().add(LblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 850, 140));

        LblChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblChat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\chatBox.png")); // NOI18N
        getContentPane().add(LblChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        LblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\hallOfFame.png")); // NOI18N
        getContentPane().add(LblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1040, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/hallOfFame.png");
        LblBackground.setIcon(icon);

        if(gender.equals("boy")){
            playerIcon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/lucasSolid.png");
        }else{
            playerIcon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/dawnSolid.png");
        }
        
        pokemonIcon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/" + pokemonName + ".png");
        
        LblPlayer.setIcon(playerIcon);
        LblPokemon.setIcon(pokemonIcon);
        
        LblText.setText("<html>Congratulations, " + playerName + " and " + pokemonName + " for winning the battle!<br>You are a true Pokémon Master!");
    }//GEN-LAST:event_formWindowActivated

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        dispose();
        System.exit(0);
        
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HallOfFame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBackground;
    private javax.swing.JLabel LblChat;
    private javax.swing.JLabel LblPlayer;
    private javax.swing.JLabel LblPokemon;
    private javax.swing.JLabel LblText;
    // End of variables declaration//GEN-END:variables
}
