/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Duel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class ChoosePokemon extends javax.swing.JFrame {

    Color ghost = new Color(51,0,204);
    Color dragon =  new Color(0, 0, 102);
    Color fire =  new Color(255,51,0);
    Color flying =  new Color(0,153,153);
    Color normal =  new Color(102,102,102);
    Color electric =  new Color(255,204,0);
    Color normalText = new Color(204,204,204);
    Color white =  new Color(255, 255, 255);
    
    Pokemon pokemon;
    ImageIcon icon;
    
    public ChoosePokemon() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        URL url = this.getClass().getResource("/Images/pokeduel.png");
        Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imgTitulo);
        
        setResizable(false);
        BtnPlay.setEnabled(false);
        
    }

    public void loadStats(Pokemon pokemon){
        DefaultTableModel tblStats = (DefaultTableModel) TableStats.getModel();
        tblStats.setRowCount(0);
        
        tblStats.addRow(new String[]{"HP", String.valueOf(pokemon.getHp())});
        tblStats.addRow(new String[]{"Attack", String.valueOf(pokemon.getAttack())});
        tblStats.addRow(new String[]{"Defense", String.valueOf(pokemon.getDefense())});
        tblStats.addRow(new String[]{"Sp Attack", String.valueOf(pokemon.getSpAtk())});
        tblStats.addRow(new String[]{"Sp Defense", String.valueOf(pokemon.getSpDef())});
        tblStats.addRow(new String[]{"Speed", String.valueOf(pokemon.getSpeed())});
        
        
        LblAbility.setText(pokemon.getAbility());
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        LblPokedex = new javax.swing.JLabel();
        LblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblPokemonChoosed = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LblAbility = new javax.swing.JLabel();
        BtnPlay = new javax.swing.JButton();
        SelectionBar = new javax.swing.JLabel();
        Type2 = new javax.swing.JButton();
        Type1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableStats = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblPokedex.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        LblPokedex.setForeground(new java.awt.Color(255, 255, 255));
        LblPokedex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPokedex.setText("000");
        Background.add(LblPokedex, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 200, -1));

        LblName.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        LblName.setForeground(new java.awt.Color(255, 255, 255));
        LblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblName.setText("Pokémon Name");
        Background.add(LblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 390, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\ReshiramPokeBall.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\ElectivirePokeBall.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\RayquazaPokeBall.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\ArceusPokeBall.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\GiratinaPokeBall.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        LblPokemonChoosed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPokemonChoosed.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\Giratina.png")); // NOI18N
        Background.add(LblPokemonChoosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 490, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\ability.png")); // NOI18N
        Background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, 70));

        LblAbility.setBackground(new java.awt.Color(51, 51, 51));
        LblAbility.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        LblAbility.setForeground(new java.awt.Color(255, 255, 255));
        LblAbility.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblAbility.setText("Ability");
        LblAbility.setOpaque(true);
        Background.add(LblAbility, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 330, 40));

        BtnPlay.setBackground(new java.awt.Color(51, 255, 51));
        BtnPlay.setFont(new java.awt.Font("Yu Gothic Medium", 3, 18)); // NOI18N
        BtnPlay.setForeground(new java.awt.Color(0, 0, 0));
        BtnPlay.setText("PLAY");
        BtnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPlayMouseClicked(evt);
            }
        });
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });
        Background.add(BtnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, 140, 50));

        SelectionBar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\menuBar.png")); // NOI18N
        Background.add(SelectionBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1040, 310));

        Type2.setBackground(new java.awt.Color(0, 0, 102));
        Type2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Type2.setForeground(new java.awt.Color(255, 255, 255));
        Type2.setText("DRAGON");
        Type2.setFocusable(false);
        Background.add(Type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 190, 50));

        Type1.setBackground(new java.awt.Color(255, 204, 0));
        Type1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Type1.setForeground(new java.awt.Color(255, 255, 255));
        Type1.setText("ELECTRIC");
        Type1.setFocusable(false);
        Background.add(Type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 190, 50));

        TableStats.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TableStats.setForeground(new java.awt.Color(0, 0, 0));
        TableStats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stats", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableStats.setFocusable(false);
        jScrollPane1.setViewportView(TableStats);

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 200, 170));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\Wallpaper.jpg")); // NOI18N
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 420));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        icon = new ImageIcon("C:/Users/Leonardo/Documents/Java/PokeDuel/src/main/resources/Images/Reshiram.png");
        LblPokemonChoosed.setIcon(icon);
        Pokemon pokemon = Connect.Pokemon(643);
        loadStats(pokemon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(fire);
        Type1.setText("FIRE");
        
        Type2.setBackground(dragon);
        Type2.setText("DRAGON");
        
        LblPokedex.setText("643");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed
        
    }//GEN-LAST:event_jLabel5KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        icon = new ImageIcon("C:/Users/Leonardo/Documents/Java/PokeDuel/src/main/resources/Images/Rayquaza.png");
        LblPokemonChoosed.setIcon(icon);
        pokemon = Connect.Pokemon(384);
        loadStats(pokemon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(flying);
        Type1.setText("FLYING");
        
        
        Type2.setVisible(true);
        Type2.setBackground(dragon);
        Type2.setText("DRAGON");
        
        LblPokedex.setText("384");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        icon = new ImageIcon("C:/Users/Leonardo/Documents/Java/PokeDuel/src/main/resources/Images/Giratina.png");
        LblPokemonChoosed.setIcon(icon);
        pokemon = Connect.Pokemon(487);
        loadStats(pokemon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(ghost);
        Type1.setText("GHOST");
        
        Type2.setVisible(true);
        Type2.setBackground(dragon);
        Type2.setText("DRAGON");
        
        
        LblPokedex.setText("487");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        icon = new ImageIcon("C:/Users/Leonardo/Documents/Java/PokeDuel/src/main/resources/Images/Arceus.png");
        LblPokemonChoosed.setIcon(icon);
        pokemon = Connect.Pokemon(493);
        loadStats(pokemon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(normal);
        Type1.setText("NORMAL");
        
        Type2.setVisible(false);
        
        LblPokedex.setText("493");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        icon = new ImageIcon("C:/Users/Leonardo/Documents/Java/PokeDuel/src/main/resources/Images/Electivire.png");
        LblPokemonChoosed.setIcon(icon);
        pokemon = Connect.Pokemon(466);
        loadStats(pokemon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(electric);
        Type1.setText("ELECTRIC");
        Type1.setForeground(white);
        
        Type2.setVisible(false);
        
        LblPokedex.setText("466");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_jLabel2MouseClicked

    private Pokemon randomizeFoe(){
        int[] foes = {466, 487, 384, 493, 643};
        
        int index = (int) (Math.random() * (5 - 1 + 1) + 1);
        
        Pokemon foe = Connect.Pokemon(foes[index - 1]);
        
        return foe;
        
    }
    
   
    
    
    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnPlayActionPerformed

    private void BtnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPlayMouseClicked
        // TODO add your handling code here:
        Battle battleForm = new Battle();
        
        battleForm.playerPokemon = this.pokemon;
        
        battleForm.foePokemon = randomizeFoe();
        
        System.out.println("Foe: " + battleForm.foePokemon.getName());
        
        ImageIcon foeIcon = new ImageIcon("C:/Users/Leonardo/Documents/Java/PokeDuel/src/main/resources/Images/" + battleForm.foePokemon.getName() + ".png");
        
        battleForm.PokemonFoe.setIcon(foeIcon);
        
        battleForm.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_BtnPlayMouseClicked

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
            java.util.logging.Logger.getLogger(ChoosePokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosePokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosePokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosePokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosePokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnPlay;
    private javax.swing.JLabel LblAbility;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblPokedex;
    private javax.swing.JLabel LblPokemonChoosed;
    private javax.swing.JLabel SelectionBar;
    private javax.swing.JTable TableStats;
    private javax.swing.JButton Type1;
    private javax.swing.JButton Type2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
