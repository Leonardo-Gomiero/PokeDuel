/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Duel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class Battle extends javax.swing.JFrame {

    Color ghost = new Color(51,0,204);
    Color dragon =  new Color(0, 0, 102);
    Color fire =  new Color(255,51,0);
    Color flying =  new Color(0,153,153);
    Color normal =  new Color(102,102,102);
    Color electric =  new Color(255,204,0);
    Color normalText = new Color(204,204,204);
    Color white =  new Color(255, 255, 255);
    Pokemon playerPokemon;
    
    Pokemon foePokemon;
    
    
    public Battle() {
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

        PlayerHP = new javax.swing.JLabel();
        LblFoeHP = new javax.swing.JLabel();
        FoeHP = new javax.swing.JProgressBar();
        YourHP = new javax.swing.JProgressBar();
        PokemonFoe = new javax.swing.JLabel();
        PokemonChoosed = new javax.swing.JLabel();
        BtnMove1 = new javax.swing.JButton();
        BtnMove2 = new javax.swing.JButton();
        BtnMove3 = new javax.swing.JButton();
        BtnMove4 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayerHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PlayerHP.setForeground(new java.awt.Color(0, 0, 0));
        PlayerHP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PlayerHP.setText("150/150");
        getContentPane().add(PlayerHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 130, 20));

        LblFoeHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblFoeHP.setForeground(new java.awt.Color(0, 0, 0));
        LblFoeHP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblFoeHP.setText("150/150");
        getContentPane().add(LblFoeHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, 20));

        FoeHP.setBackground(new java.awt.Color(102, 255, 102));
        FoeHP.setForeground(new java.awt.Color(102, 255, 102));
        FoeHP.setMaximum(150);
        FoeHP.setValue(150);
        getContentPane().add(FoeHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 400, 20));

        YourHP.setBackground(new java.awt.Color(102, 255, 102));
        YourHP.setForeground(new java.awt.Color(102, 255, 102));
        YourHP.setMaximum(150);
        YourHP.setValue(150);
        getContentPane().add(YourHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 400, 20));

        PokemonFoe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokemonFoe.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\Giratina.png")); // NOI18N
        getContentPane().add(PokemonFoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 490, -1));

        PokemonChoosed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PokemonChoosed.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\backGiratina.png")); // NOI18N
        getContentPane().add(PokemonChoosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 500, -1));

        BtnMove1.setBackground(new java.awt.Color(0, 0, 102));
        BtnMove1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnMove1.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove1.setText("Dragon Claw");
        BtnMove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 230, 80));

        BtnMove2.setBackground(new java.awt.Color(153, 0, 0));
        BtnMove2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnMove2.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove2.setText("Aura Sphere");
        getContentPane().add(BtnMove2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 230, 80));

        BtnMove3.setBackground(new java.awt.Color(51, 0, 204));
        BtnMove3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnMove3.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove3.setText("Shadow Force");
        getContentPane().add(BtnMove3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 230, 80));

        BtnMove4.setBackground(new java.awt.Color(153, 51, 0));
        BtnMove4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnMove4.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove4.setText("Earth Power");
        getContentPane().add(BtnMove4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 230, 80));

        Background.setForeground(new java.awt.Color(218, 188, 104));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\scenarioGiratina.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getDamage(int value) throws InterruptedException {
        int yourHP = YourHP.getValue();

        for (int i = 0; i <= value; i++) {

            //System.out.println(i);
            if ((yourHP - i) >= 0) {
                YourHP.setValue(yourHP - i);
                PlayerHP.setText((yourHP - i) + "/" + yourHP);
            }

            Thread.sleep(50);

        }

        if (YourHP.getValue() <= (yourHP * 0.3)) {
            YourHP.setForeground(Color.red);
        }

    }

    public void giveDamage(int value) throws InterruptedException {
        int foeHP = FoeHP.getValue();

        System.out.println("FoeHP is " + foeHP);

        System.out.println("Damage will be " + value);

        String foeHpValue = LblFoeHP.getText();

        for (int i = 0; i <= value; i++) {

            //System.out.println(i);
            if ((foeHP - i) >= 0) {
                FoeHP.setValue(foeHP - i);
                LblFoeHP.setText((foeHP - i) + "/" + foeHP);
                Thread.sleep(50);
            }

            Thread.sleep(50);
        }

        if (FoeHP.getValue() <= (foeHP * 0.3)) {
            FoeHP.setForeground(Color.red);
        }

    }

    public int defineDamage() {
        
        Move move1 = Connect.Move(foePokemon.getMove1());
        Move move2 = Connect.Move(foePokemon.getMove2());
        Move move3 = Connect.Move(foePokemon.getMove3());
        Move move4 = Connect.Move(foePokemon.getMove4());
        
        int damage = 0;

        int[] moves = {move1.getPower(), move2.getPower(), move3.getPower(), move4.getPower()};

        int index = (int) (Math.random() * (4 - 1 + 1) + 1);

        damage = moves[index - 1];

        System.out.println(damage);
        return damage;
    }


    private void BtnMove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove1ActionPerformed
        // TODO add your handling code here:

        try {
            Move move1 = Connect.Move(playerPokemon.getMove1());
            giveDamage(move1.getPower());
            getDamage(defineDamage());

        } catch (InterruptedException ex) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BtnMove1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        FoeHP.setForeground(Color.green);
        
        //Set foe HP bar:
        LblFoeHP.setText(String.valueOf(foePokemon.getHp()) + "/" + String.valueOf(foePokemon.getHp()));
        FoeHP.setMaximum(foePokemon.getHp());
        
        PlayerHP.setText(String.valueOf(playerPokemon.getHp()) + "/" + String.valueOf(playerPokemon.getHp()));
        YourHP.setMaximum(playerPokemon.getHp());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Battle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnMove1;
    private javax.swing.JButton BtnMove2;
    private javax.swing.JButton BtnMove3;
    private javax.swing.JButton BtnMove4;
    private javax.swing.JProgressBar FoeHP;
    public static javax.swing.JLabel LblFoeHP;
    private javax.swing.JLabel PlayerHP;
    public javax.swing.JLabel PokemonChoosed;
    public javax.swing.JLabel PokemonFoe;
    private javax.swing.JProgressBar YourHP;
    public javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables

    private int moves(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
