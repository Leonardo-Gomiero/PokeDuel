package Duel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Battle extends javax.swing.JFrame {

    Color ghost = new Color(51, 0, 204);
    Color dragon = new Color(0, 0, 102);
    Color fire = new Color(255, 51, 0);
    Color flying = new Color(0, 153, 153);
    Color normal = new Color(102, 102, 102);
    Color electric = new Color(255, 204, 0);
    Color rock = new Color(153, 51, 0);
    Color psychic = new Color(255, 27, 224);
    Color normalText = new Color(204, 204, 204);
    Color white = new Color(255, 255, 255);

    Pokemon playerPokemon;
    Pokemon foePokemon;

    String trainerName;
    String trainerGender;

    Move playerMove1;
    Move playerMove2;
    Move playerMove3;
    Move playerMove4;

    Move actualMove;
    String actualFoeMove;

    boolean tempo = true;

    int index = 0;
    int roundCount = 0;

    ImageIcon icon;

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

        LblFoeHP = new javax.swing.JLabel();
        LblYourName = new javax.swing.JLabel();
        LblFoeName = new javax.swing.JLabel();
        PlayerHP = new javax.swing.JLabel();
        FoeHP = new javax.swing.JProgressBar();
        YourHP = new javax.swing.JProgressBar();
        BtnMove1 = new javax.swing.JButton();
        BtnMove2 = new javax.swing.JButton();
        BtnMove3 = new javax.swing.JButton();
        BtnMove4 = new javax.swing.JButton();
        PokemonChoosed = new javax.swing.JLabel();
        PokemonFoe = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        LblText = new javax.swing.JLabel();
        LblChat = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

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

        LblFoeHP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        LblFoeHP.setForeground(new java.awt.Color(0, 0, 0));
        LblFoeHP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblFoeHP.setText("150/150");
        getContentPane().add(LblFoeHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 60, 20));

        LblYourName.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        LblYourName.setForeground(new java.awt.Color(255, 255, 255));
        LblYourName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblYourName.setText("Giratina");
        getContentPane().add(LblYourName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 400, 50));

        LblFoeName.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        LblFoeName.setForeground(new java.awt.Color(255, 255, 255));
        LblFoeName.setText("Giratina");
        getContentPane().add(LblFoeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 32, 400, 50));

        PlayerHP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        PlayerHP.setForeground(new java.awt.Color(0, 0, 0));
        PlayerHP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PlayerHP.setText("150/150");
        getContentPane().add(PlayerHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 60, 20));

        FoeHP.setBackground(new java.awt.Color(204, 204, 204));
        FoeHP.setForeground(new java.awt.Color(102, 255, 102));
        FoeHP.setMaximum(150);
        FoeHP.setValue(150);
        FoeHP.setFocusable(false);
        getContentPane().add(FoeHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 400, 20));

        YourHP.setBackground(new java.awt.Color(204, 204, 204));
        YourHP.setForeground(new java.awt.Color(102, 255, 102));
        YourHP.setMaximum(150);
        YourHP.setValue(150);
        getContentPane().add(YourHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 400, 20));

        BtnMove1.setBackground(new java.awt.Color(0, 0, 102));
        BtnMove1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        BtnMove1.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove1.setText("Dragon Claw");
        BtnMove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 230, 80));

        BtnMove2.setBackground(new java.awt.Color(153, 0, 0));
        BtnMove2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        BtnMove2.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove2.setText("Aura Sphere");
        BtnMove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMove2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 230, 80));

        BtnMove3.setBackground(new java.awt.Color(51, 0, 204));
        BtnMove3.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        BtnMove3.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove3.setText("Shadow Force");
        BtnMove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove3ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMove3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 230, 80));

        BtnMove4.setBackground(new java.awt.Color(153, 51, 0));
        BtnMove4.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        BtnMove4.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove4.setText("Earth Power");
        BtnMove4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove4ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMove4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 230, 80));

        PokemonChoosed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PokemonChoosed.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\backGiratina.png")); // NOI18N
        getContentPane().add(PokemonChoosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 680, -1));

        PokemonFoe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PokemonFoe.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\Giratina.png")); // NOI18N
        getContentPane().add(PokemonFoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 510, -1));

        Background.setForeground(new java.awt.Color(218, 188, 104));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\scenarioGiratina.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 680));

        LblText.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        LblText.setForeground(new java.awt.Color(0, 0, 0));
        LblText.setText("...");
        getContentPane().add(LblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 700, 850, 150));

        LblChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblChat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\chatBox.png")); // NOI18N
        getContentPane().add(LblChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1040, 200));

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
                case "Psychic":
                    BtnMove1.setBackground(psychic);
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
                case "Psychic":
                    BtnMove2.setBackground(psychic);
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
                case "Psychic":
                    BtnMove3.setBackground(psychic);
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
                case "Psychic":
                    BtnMove4.setBackground(psychic);
                    break;
            }

            BtnMove4.setText(move.getName());
        }

    }

    public void checkWinner() {
        if (YourHP.getValue() == 0) {
            int wait = index;
            System.out.println("Batalha: " + this.trainerGender);

            while (wait == index) {
                LblText.setText("<html>Your " + playerPokemon.getName() + " has fainted!<br>This is it...");
                PokemonChoosed.setVisible(false);
            }
            System.out.println("You Lose!");
            Connect.registerBattle(trainerName, trainerGender, playerPokemon.getName(), foePokemon.getName(), "Loss", roundCount);

            //foePokemon.showInfo();
            HallOfShame hallOfShame = new HallOfShame();
            hallOfShame.pokemonFoe = foePokemon;
            hallOfShame.pokemonFoe.showInfo();
            hallOfShame.setVisible(true);

            System.out.println("Batalha: " + this.trainerGender);

            dispose();

        } else if (FoeHP.getValue() == 0) {
            int wait = index;
            System.out.println("Batalha: " + this.trainerGender);
            while (wait == index) {
                LblText.setText("<html>The foe's " + foePokemon.getName() + " has fainted!<br>This is over! You are the true Pokémon Master!");
                PokemonFoe.setVisible(false);
            }
            Connect.registerBattle(trainerName, trainerGender, playerPokemon.getName(), foePokemon.getName(), "Win", roundCount);

            //playerPokemon.showInfo();
            HallOfFame hallOfFame = new HallOfFame();
            hallOfFame.playerName = trainerName;
            System.out.println(hallOfFame.playerName);
            hallOfFame.pokemonName = playerPokemon.getName();
            hallOfFame.gender = trainerGender;
            hallOfFame.setVisible(true);

            dispose();
        }
    }

    public class Fight extends Thread {

        int foeHP = FoeHP.getValue();
        String foeHpValue = LblFoeHP.getText();

        int yourHP = YourHP.getValue();
        int value = defineDamage();

        @Override
        public void run() {

            try {
                if (playerPokemon.getSpeed() > foePokemon.getSpeed()) {

                    roundCount++;
                    BtnMove4.setEnabled(false);
                    BtnMove1.setEnabled(false);
                    BtnMove2.setEnabled(false);
                    BtnMove3.setEnabled(false);

                    //Give damage before getting damage:
                    for (int i = 0; i <= actualMove.getPower(); i++) {

                        System.out.println("Damage given: " + i);
                        LblText.setText("Your " + playerPokemon.getName() + " used " + actualMove.getName() + "!");
                        if ((foeHP - i) >= 0) {
                            FoeHP.setValue(foeHP - i);
                            LblFoeHP.setText((foeHP - i) + "/" + foeHP);
                            Thread.sleep(100);
                        }
                        if (FoeHP.getValue() <= (foeHP * 0.25)) {
                            FoeHP.setForeground(Color.red);
                        }else if(FoeHP.getValue() > (foeHP * 0.25) && FoeHP.getValue() <= (foeHP * 0.5)){
                            FoeHP.setForeground(Color.orange);
                        }
                        checkWinner();
                    }

                    //Take damage after giving damage:
                    int yourHP = YourHP.getValue();

                    LblText.setText("The foe's " + foePokemon.getName() + " used " + actualFoeMove + "!");
                    for (int i = 0; i <= value; i++) {

                        System.out.println("Damage received: " + i);
                        if ((yourHP - i) >= 0) {
                            YourHP.setValue(yourHP - i);
                            PlayerHP.setText((yourHP - i) + "/" + yourHP);
                            Thread.sleep(100);
                        }
                        
                        if (YourHP.getValue() <= (yourHP * 0.25)) {
                            YourHP.setForeground(Color.red);
                        }else if(YourHP.getValue() > (yourHP * 0.25) && YourHP.getValue() <= (yourHP * 0.5)){
                            YourHP.setForeground(Color.orange);
                        }
                        checkWinner();
                    }

                    BtnMove1.setEnabled(true);
                    BtnMove2.setEnabled(true);
                    BtnMove3.setEnabled(true);
                    BtnMove4.setEnabled(true);

                    LblText.setText("What's your next move?");
                } else {

                    roundCount++;
                    BtnMove4.setEnabled(false);
                    BtnMove1.setEnabled(false);
                    BtnMove2.setEnabled(false);
                    BtnMove3.setEnabled(false);

                    //Take damage
                    int yourHP = YourHP.getValue();
                    LblText.setText("The foe's " + foePokemon.getName() + " used " + actualFoeMove + "!");

                    for (int i = 0; i <= value; i++) {

                        System.out.println("Damage received: " + i);
                        if ((yourHP - i) >= 0) {
                            YourHP.setValue(yourHP - i);
                            PlayerHP.setText((yourHP - i) + "/" + yourHP);
                            Thread.sleep(100);
                        }
                        
                        if (YourHP.getValue() <= (yourHP * 0.25)) {
                            YourHP.setForeground(Color.red);
                        }else if(YourHP.getValue() > (yourHP * 0.25) && YourHP.getValue() <= (yourHP * 0.5)){
                            YourHP.setForeground(Color.orange);
                        }
                        checkWinner();
                    }

                    LblText.setText("Your " + playerPokemon.getName() + " used " + actualMove.getName() + "!");
                    //Give damage
                    for (int i = 0; i <= actualMove.getPower(); i++) {

                        System.out.println("Damage given: " + i);
                        LblText.setText("Your " + playerPokemon.getName() + " used " + actualMove.getName() + "!");
                        if ((foeHP - i) >= 0) {
                            FoeHP.setValue(foeHP - i);
                            LblFoeHP.setText((foeHP - i) + "/" + foeHP);
                            Thread.sleep(100);
                        }
                        if (FoeHP.getValue() <= (foeHP * 0.25)) {
                            FoeHP.setForeground(Color.red);
                        }else if(FoeHP.getValue() > (foeHP * 0.25) && FoeHP.getValue() <= (foeHP * 0.5)){
                            FoeHP.setForeground(Color.orange);
                        }
                        checkWinner();
                    }

                    if (FoeHP.getValue() <= (foeHP * 0.3)) {
                        FoeHP.setForeground(Color.red);
                    }
                    BtnMove1.setEnabled(true);
                    BtnMove2.setEnabled(true);
                    BtnMove3.setEnabled(true);
                    BtnMove4.setEnabled(true);

                    LblText.setText("What's your next move?");
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public int defineDamage() {

        Move move1 = Connect.Move(foePokemon.getMove1());
        Move move2 = Connect.Move(foePokemon.getMove2());
        Move move3 = Connect.Move(foePokemon.getMove3());
        Move move4 = Connect.Move(foePokemon.getMove4());

        int damage = 0;

        int[] moves = {move1.getPower(), move2.getPower(), move3.getPower(), move4.getPower()};

        String[] allMoves = {move1.getName(), move2.getName(), move3.getName(), move4.getName()};

        int index = (int) (Math.random() * (4 - 1 + 1) + 1);

        actualFoeMove = allMoves[index - 1];
        damage = moves[index - 1];

        System.out.println(damage);

        return damage;
    }


    private void BtnMove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove1ActionPerformed
        actualMove = playerMove1;
        Fight fight = new Fight();
        fight.start();


    }//GEN-LAST:event_BtnMove1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Setting all the icons
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/chatBox.png");
        LblChat.setIcon(icon);

        FoeHP.setForeground(Color.green);
        YourHP.setForeground(Color.green);

        BtnMove1.setEnabled(false);
        BtnMove2.setEnabled(false);
        BtnMove3.setEnabled(false);
        BtnMove4.setEnabled(false);

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

        LblText.setText("A wild " + foePokemon.getName() + " has challenged you!");

    }//GEN-LAST:event_formWindowActivated

    private void BtnMove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove2ActionPerformed
        actualMove = playerMove2;
        Fight fight = new Fight();
        fight.start();
    }//GEN-LAST:event_BtnMove2ActionPerformed

    private void BtnMove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove3ActionPerformed
        actualMove = playerMove3;
        Fight fight = new Fight();
        fight.start();
    }//GEN-LAST:event_BtnMove3ActionPerformed

    private void BtnMove4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove4ActionPerformed
        actualMove = playerMove4;
        Fight fight = new Fight();
        fight.start();
    }//GEN-LAST:event_BtnMove4ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        index++;
        switch (index) {
            case 1:
                LblText.setText("It looks angry!");
                break;
            case 2:
                LblText.setText("What will you do?");
                break;
            case 3:
                BtnMove1.setEnabled(true);
                BtnMove2.setEnabled(true);
                BtnMove3.setEnabled(true);
                BtnMove4.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_formMouseClicked

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JLabel LblChat;
    public static javax.swing.JLabel LblFoeHP;
    private javax.swing.JLabel LblFoeName;
    private javax.swing.JLabel LblText;
    private javax.swing.JLabel LblYourName;
    private javax.swing.JLabel PlayerHP;
    public javax.swing.JLabel PokemonChoosed;
    public javax.swing.JLabel PokemonFoe;
    private javax.swing.JProgressBar YourHP;
    public javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private int moves(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
