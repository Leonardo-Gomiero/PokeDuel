package Duel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Battle extends javax.swing.JFrame {

    Color ghost = new Color(51, 0, 204);
    Color dragon = new Color(0, 0, 102);
    Color fire = new Color(255, 51, 0);
    Color flying = new Color(0, 153, 153);
    Color normal = new Color(102, 102, 102);
    Color electric = new Color(255, 204, 0);
    Color rock = new Color(153, 51, 0);

    Color normalText = new Color(204, 204, 204);
    Color white = new Color(255, 255, 255);
    Pokemon playerPokemon;

    Pokemon foePokemon;

    Move playerMove1;
    Move playerMove2;
    Move playerMove3;
    Move playerMove4;

    Move actualMove;

    boolean tempo = true;

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

        LblYourName = new javax.swing.JLabel();
        LblFoeName = new javax.swing.JLabel();
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

        LblYourName.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        LblYourName.setForeground(new java.awt.Color(255, 255, 255));
        LblYourName.setText("Giratina");
        getContentPane().add(LblYourName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 400, 50));

        LblFoeName.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        LblFoeName.setForeground(new java.awt.Color(255, 255, 255));
        LblFoeName.setText("Giratina");
        getContentPane().add(LblFoeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 32, 400, 50));

        PlayerHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PlayerHP.setForeground(new java.awt.Color(0, 0, 0));
        PlayerHP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PlayerHP.setText("150/150");
        getContentPane().add(PlayerHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 60, 20));

        LblFoeHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblFoeHP.setForeground(new java.awt.Color(0, 0, 0));
        LblFoeHP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblFoeHP.setText("150/150");
        getContentPane().add(LblFoeHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 60, 20));

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
        BtnMove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMove2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 230, 80));

        BtnMove3.setBackground(new java.awt.Color(51, 0, 204));
        BtnMove3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnMove3.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove3.setText("Shadow Force");
        BtnMove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove3ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMove3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 230, 80));

        BtnMove4.setBackground(new java.awt.Color(153, 51, 0));
        BtnMove4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnMove4.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove4.setText("Earth Power");
        BtnMove4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove4ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMove4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 230, 80));

        Background.setForeground(new java.awt.Color(218, 188, 104));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\scenarioGiratina.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void defineMove(Move move, int index) {

        if (index == 1) {
            switch (move.getType()) {
                case "Ghost":
                    BtnMove1.setBackground(ghost);
                    break;
                case "Dragon":
                    BtnMove1.setBackground(dragon);
                    break;
                case "Normal":
                    BtnMove1.setBackground(normal);
                    break;
                case "Flying":
                    BtnMove1.setBackground(flying);
                    break;
                case "Fire":
                    BtnMove1.setBackground(fire);
                    break;
                case "Electric":
                    BtnMove1.setBackground(electric);
                    break;
                case "Rock":
                    BtnMove1.setBackground(rock);
                    break;
            }

            BtnMove1.setText(move.getName());
        } else if (index == 2) {
            switch (move.getType()) {
                case "Ghost":
                    BtnMove2.setBackground(ghost);
                    break;
                case "Dragon":
                    BtnMove2.setBackground(dragon);
                    break;
                case "Normal":
                    BtnMove2.setBackground(normal);
                    break;
                case "Flying":
                    BtnMove2.setBackground(flying);
                    break;
                case "Fire":
                    BtnMove2.setBackground(fire);
                    break;
                case "Electric":
                    BtnMove2.setBackground(electric);
                    break;
                case "Rock":
                    BtnMove2.setBackground(rock);
                    break;
            }

            BtnMove2.setText(move.getName());
        } else if (index == 3) {
            switch (move.getType()) {
                case "Ghost":
                    BtnMove3.setBackground(ghost);
                    break;
                case "Dragon":
                    BtnMove3.setBackground(dragon);
                    break;
                case "Normal":
                    BtnMove3.setBackground(normal);
                    break;
                case "Flying":
                    BtnMove3.setBackground(flying);
                    break;
                case "Fire":
                    BtnMove3.setBackground(fire);
                    break;
                case "Electric":
                    BtnMove3.setBackground(electric);
                    break;
                case "Rock":
                    BtnMove3.setBackground(rock);
                    break;
            }

            BtnMove3.setText(move.getName());
        } else if (index == 4) {
            switch (move.getType()) {
                case "Ghost":
                    BtnMove4.setBackground(ghost);
                    break;
                case "Dragon":
                    BtnMove4.setBackground(dragon);
                    break;
                case "Normal":
                    BtnMove4.setBackground(normal);
                    break;
                case "Flying":
                    BtnMove4.setBackground(flying);
                    break;
                case "Fire":
                    BtnMove4.setBackground(fire);
                    break;
                case "Electric":
                    BtnMove4.setBackground(electric);
                    break;
                case "Rock":
                    BtnMove4.setBackground(rock);
                    break;
            }

            BtnMove4.setText(move.getName());
        }

    }

    public void checkWinner() {
        if (YourHP.getValue() == 0) {
            System.out.println("You Lose!");
            dispose();
        } else if (FoeHP.getValue() == 0) {
            System.out.println("You Win!");
            dispose();
        }
    }

    public class getNiceDamage extends Thread {

        int yourHP = YourHP.getValue();
        int value = defineDamage();

        @Override
        public void run() {

            try {
                int yourHP = YourHP.getValue();

                for (int i = 0; i <= value; i++) {

                    System.out.println("Damage received: " + i);
                    if ((yourHP - i) >= 0) {
                        YourHP.setValue(yourHP - i);
                        PlayerHP.setText((yourHP - i) + "/" + yourHP);
                    }

                    Thread.sleep(100);
                }
                checkWinner();
                if (YourHP.getValue() <= (yourHP * 0.3)) {
                    YourHP.setForeground(Color.red);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void getDamage(int value) throws InterruptedException {
        int yourHP = YourHP.getValue();

        for (int i = 0; i <= value; i++) {

            System.out.println("Damage received: " + i);
            if ((yourHP - i) >= 0) {
                YourHP.setValue(yourHP - i);
                PlayerHP.setText((yourHP - i) + "/" + yourHP);
            }

            //Thread.sleep(50);
        }
        checkWinner();
        if (YourHP.getValue() <= (yourHP * 0.3)) {
            YourHP.setForeground(Color.red);
        }

    }

    public class giveNiceDamage extends Thread {

        int foeHP = FoeHP.getValue();

        String foeHpValue = LblFoeHP.getText();

        @Override
        public void run() {

            try {
                for (int i = 0; i <= actualMove.getPower(); i++) {

                    System.out.println("Damage given: " + i);
                    if ((foeHP - i) >= 0) {
                        FoeHP.setValue(foeHP - i);
                        LblFoeHP.setText((foeHP - i) + "/" + foeHP);
                        Thread.sleep(100);
                    }
                }
                checkWinner();

                if (FoeHP.getValue() <= (foeHP * 0.3)) {
                    FoeHP.setForeground(Color.red);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void giveDamage(int value) throws InterruptedException {

        int foeHP = FoeHP.getValue();

        System.out.println("FoeHP is " + foeHP);

        System.out.println("Damage will be " + value);

        String foeHpValue = LblFoeHP.getText();

        for (int i = 0; i <= value; i++) {

            System.out.println("Damage given: " + i);
            if ((foeHP - i) >= 0) {
                FoeHP.setValue(foeHP - i);
                LblFoeHP.setText((foeHP - i) + "/" + foeHP);

            }
        }
        checkWinner();

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

    public void fight(Move movePlayer, int damageTaken) throws InterruptedException {
        if (playerPokemon.getSpeed() > foePokemon.getSpeed()) {
            giveDamage(movePlayer.getPower() / 2);
            giveNiceDamage hit = new giveNiceDamage();
            hit.start();

            getNiceDamage damage = new getNiceDamage();
            damage.start();
        } else {
            getNiceDamage damage = new getNiceDamage();
            damage.start();

            //giveDamage(movePlayer.getPower());
            giveNiceDamage hit = new giveNiceDamage();
            hit.start();
        }
    }

    private void BtnMove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove1ActionPerformed
        try {
            actualMove = playerMove1;
            fight(playerMove1, defineDamage());
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

        playerMove1.showInfo();
        defineMove(playerMove1, 1);
        defineMove(playerMove2, 2);
        defineMove(playerMove3, 3);
        defineMove(playerMove4, 4);

        LblFoeName.setText(foePokemon.getName());
        LblYourName.setText(playerPokemon.getName());

    }//GEN-LAST:event_formWindowActivated

    private void BtnMove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove2ActionPerformed
        try {
            actualMove = playerMove2;
            fight(playerMove2, defineDamage());
        } catch (InterruptedException ex) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnMove2ActionPerformed

    private void BtnMove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove3ActionPerformed
        try {
            actualMove = playerMove3;
            fight(playerMove3, defineDamage());
        } catch (InterruptedException ex) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnMove3ActionPerformed

    private void BtnMove4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove4ActionPerformed
        try {
            actualMove = playerMove4;
            fight(playerMove4, defineDamage());
        } catch (InterruptedException ex) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnMove4ActionPerformed

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
    private javax.swing.JLabel LblFoeName;
    private javax.swing.JLabel LblYourName;
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
