package Duel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class ChoosePokemon extends javax.swing.JFrame {

    Color ghost = new Color(51,0,204);
    Color dragon =  new Color(0, 0, 102);
    Color fire =  new Color(255,51,0);
    Color flying =  new Color(0,153,153);
    Color normal =  new Color(102,102,102);
    Color electric =  new Color(255,204,0);
    Color rock = new Color(153, 51, 0);
    Color psychic = new Color(255, 27, 224);
    Color normalText = new Color(204,204,204);
    Color white =  new Color(255, 255, 255);
    
    Pokemon pokemon;
    ImageIcon icon;
    
    String trainerName;
    String trainerGender;
    
    Move playerMove1;
    Move playerMove2;
    Move playerMove3;
    Move playerMove4;
    
    
    public ChoosePokemon() {
        initComponents();
        
        
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/ReshiramPokeBall.png");
        ImgReshiram.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/GiratinaPokeBall.png");
        ImgGiratina.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/RayquazaPokeBall.png");
        ImgRayquaza.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/ArceusPokeBall.png");
        ImgArceus.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/ElectivirePokeBall.png");
        ImgElectivire.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/menuBar.png");
        SelectionBar.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/Wallpaper.jpg");
        LblBackground.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/ability.png");
        LblFormAbility.setIcon(icon);
        
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/Giratina.png");
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
        BtnMove1 = new javax.swing.JButton();
        BtnMove3 = new javax.swing.JButton();
        BtnMove4 = new javax.swing.JButton();
        BtnMove2 = new javax.swing.JButton();
        LblFormAbility = new javax.swing.JLabel();
        LblPokedex = new javax.swing.JLabel();
        LblName = new javax.swing.JLabel();
        ImgReshiram = new javax.swing.JLabel();
        ImgElectivire = new javax.swing.JLabel();
        ImgRayquaza = new javax.swing.JLabel();
        ImgArceus = new javax.swing.JLabel();
        ImgGiratina = new javax.swing.JLabel();
        LblPokemonChoosed = new javax.swing.JLabel();
        BtnPlay = new javax.swing.JButton();
        SelectionBar = new javax.swing.JLabel();
        Type2 = new javax.swing.JButton();
        LblAbility = new javax.swing.JLabel();
        Type1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableStats = new javax.swing.JTable();
        LblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnMove1.setBackground(new java.awt.Color(0, 0, 102));
        BtnMove1.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        BtnMove1.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove1.setText("Dragon Claw");
        BtnMove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove1ActionPerformed(evt);
            }
        });
        Background.add(BtnMove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 200, 40));

        BtnMove3.setBackground(new java.awt.Color(51, 0, 204));
        BtnMove3.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        BtnMove3.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove3.setText("Shadow Force");
        BtnMove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove3ActionPerformed(evt);
            }
        });
        Background.add(BtnMove3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 200, 40));

        BtnMove4.setBackground(new java.awt.Color(153, 51, 0));
        BtnMove4.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        BtnMove4.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove4.setText("Earth Power");
        BtnMove4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove4ActionPerformed(evt);
            }
        });
        Background.add(BtnMove4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 190, 40));

        BtnMove2.setBackground(new java.awt.Color(153, 0, 0));
        BtnMove2.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        BtnMove2.setForeground(new java.awt.Color(255, 255, 255));
        BtnMove2.setText("Aura Sphere");
        BtnMove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMove2ActionPerformed(evt);
            }
        });
        Background.add(BtnMove2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 190, 40));

        LblFormAbility.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\ability.png")); // NOI18N
        Background.add(LblFormAbility, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, 70));

        LblPokedex.setFont(new java.awt.Font("Bahnschrift", 3, 48)); // NOI18N
        LblPokedex.setForeground(new java.awt.Color(255, 255, 255));
        LblPokedex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPokedex.setText("000");
        Background.add(LblPokedex, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 200, -1));

        LblName.setFont(new java.awt.Font("Bahnschrift", 3, 48)); // NOI18N
        LblName.setForeground(new java.awt.Color(255, 255, 255));
        LblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblName.setText("Pokémon Name");
        Background.add(LblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 390, -1));

        ImgReshiram.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\ReshiramPokeBall.png")); // NOI18N
        ImgReshiram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgReshiramMouseClicked(evt);
            }
        });
        Background.add(ImgReshiram, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        ImgElectivire.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\ElectivirePokeBall.png")); // NOI18N
        ImgElectivire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgElectivireMouseClicked(evt);
            }
        });
        Background.add(ImgElectivire, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, -1, -1));

        ImgRayquaza.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\RayquazaPokeBall.png")); // NOI18N
        ImgRayquaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgRayquazaMouseClicked(evt);
            }
        });
        Background.add(ImgRayquaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        ImgArceus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\ArceusPokeBall.png")); // NOI18N
        ImgArceus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgArceusMouseClicked(evt);
            }
        });
        Background.add(ImgArceus, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        ImgGiratina.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\GiratinaPokeBall.png")); // NOI18N
        ImgGiratina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgGiratinaMouseClicked(evt);
            }
        });
        ImgGiratina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ImgGiratinaKeyPressed(evt);
            }
        });
        Background.add(ImgGiratina, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        LblPokemonChoosed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPokemonChoosed.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\Giratina.png")); // NOI18N
        Background.add(LblPokemonChoosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 490, -1));

        BtnPlay.setBackground(new java.awt.Color(0, 0, 153));
        BtnPlay.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        BtnPlay.setForeground(new java.awt.Color(255, 255, 255));
        BtnPlay.setText("LET'S GO");
        BtnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPlayMouseEntered(evt);
            }
        });
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });
        Background.add(BtnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1040, 60));

        SelectionBar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\menuBar.png")); // NOI18N
        Background.add(SelectionBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1040, 310));

        Type2.setBackground(new java.awt.Color(0, 0, 102));
        Type2.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        Type2.setForeground(new java.awt.Color(255, 255, 255));
        Type2.setText("DRAGON");
        Type2.setFocusable(false);
        Background.add(Type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 190, 50));

        LblAbility.setBackground(new java.awt.Color(51, 51, 51));
        LblAbility.setFont(new java.awt.Font("Bahnschrift", 2, 18)); // NOI18N
        LblAbility.setForeground(new java.awt.Color(255, 255, 255));
        LblAbility.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblAbility.setText("Ability");
        LblAbility.setOpaque(true);
        Background.add(LblAbility, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 330, 40));

        Type1.setBackground(new java.awt.Color(255, 204, 0));
        Type1.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        Type1.setForeground(new java.awt.Color(255, 255, 255));
        Type1.setText("ELECTRIC");
        Type1.setFocusable(false);
        Background.add(Type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 190, 50));

        TableStats.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
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

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 170, 140));

        LblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\Java\\PokeDuel\\src\\main\\resources\\Images\\Wallpaper.jpg")); // NOI18N
        Background.add(LblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 420));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImgReshiramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgReshiramMouseClicked
        
        pokemon = Connect.Pokemon(643);
        loadStats(pokemon);
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/"+ pokemon.getName() + ".png");
        LblPokemonChoosed.setIcon(icon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(fire);
        Type1.setText("FIRE");
        
        Type2.setBackground(dragon);
        Type2.setText("DRAGON");
        
        playerMove1 = Connect.Move(pokemon.getMove1());
        playerMove2 = Connect.Move(pokemon.getMove2());
        playerMove3 = Connect.Move(pokemon.getMove3());
        playerMove4 = Connect.Move(pokemon.getMove4());
        
        defineMove(playerMove1, 1);
        defineMove(playerMove2, 2);
        defineMove(playerMove3, 3);
        defineMove(playerMove4, 4);
        
        LblPokedex.setText("643");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_ImgReshiramMouseClicked

    private void ImgGiratinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImgGiratinaKeyPressed
        
    }//GEN-LAST:event_ImgGiratinaKeyPressed

    private void ImgRayquazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgRayquazaMouseClicked
        pokemon = Connect.Pokemon(384);
        loadStats(pokemon);
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/"+ pokemon.getName() + ".png");
        LblPokemonChoosed.setIcon(icon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(flying);
        Type1.setText("FLYING");
        
        Type2.setVisible(true);
        Type2.setBackground(dragon);
        Type2.setText("DRAGON");
        
        playerMove1 = Connect.Move(pokemon.getMove1());
        playerMove2 = Connect.Move(pokemon.getMove2());
        playerMove3 = Connect.Move(pokemon.getMove3());
        playerMove4 = Connect.Move(pokemon.getMove4());
        
        defineMove(playerMove1, 1);
        defineMove(playerMove2, 2);
        defineMove(playerMove3, 3);
        defineMove(playerMove4, 4);
        
        LblPokedex.setText("384");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_ImgRayquazaMouseClicked

    private void ImgGiratinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgGiratinaMouseClicked
        pokemon = Connect.Pokemon(487);
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/"+ pokemon.getName() + ".png");
        LblPokemonChoosed.setIcon(icon);
        loadStats(pokemon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(ghost);
        Type1.setText("GHOST");
        
        Type2.setVisible(true);
        Type2.setBackground(dragon);
        Type2.setText("DRAGON");
        
        playerMove1 = Connect.Move(pokemon.getMove1());
        playerMove2 = Connect.Move(pokemon.getMove2());
        playerMove3 = Connect.Move(pokemon.getMove3());
        playerMove4 = Connect.Move(pokemon.getMove4());
        
        defineMove(playerMove1, 1);
        defineMove(playerMove2, 2);
        defineMove(playerMove3, 3);
        defineMove(playerMove4, 4);
        
        LblPokedex.setText("487");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_ImgGiratinaMouseClicked

    private void ImgArceusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgArceusMouseClicked
        pokemon = Connect.Pokemon(493);
        loadStats(pokemon);
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/"+ pokemon.getName() + ".png");
        LblPokemonChoosed.setIcon(icon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(normal);
        Type1.setText("NORMAL");
        
        playerMove1 = Connect.Move(pokemon.getMove1());
        playerMove2 = Connect.Move(pokemon.getMove2());
        playerMove3 = Connect.Move(pokemon.getMove3());
        playerMove4 = Connect.Move(pokemon.getMove4());
        
        defineMove(playerMove1, 1);
        defineMove(playerMove2, 2);
        defineMove(playerMove3, 3);
        defineMove(playerMove4, 4);
        
        Type2.setVisible(false);
        
        LblPokedex.setText("493");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_ImgArceusMouseClicked

    private void ImgElectivireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgElectivireMouseClicked
        pokemon = Connect.Pokemon(466);
        loadStats(pokemon);
        icon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/"+ pokemon.getName() + ".png");
        LblPokemonChoosed.setIcon(icon);
        BtnPlay.setEnabled(true);
        
        Type1.setBackground(electric);
        Type1.setText("ELECTRIC");
        Type1.setForeground(white);
        
        Type2.setVisible(false);
        
        playerMove1 = Connect.Move(pokemon.getMove1());
        playerMove2 = Connect.Move(pokemon.getMove2());
        playerMove3 = Connect.Move(pokemon.getMove3());
        playerMove4 = Connect.Move(pokemon.getMove4());
        
        defineMove(playerMove1, 1);
        defineMove(playerMove2, 2);
        defineMove(playerMove3, 3);
        defineMove(playerMove4, 4);
        
        LblPokedex.setText("466");
        LblName.setText(pokemon.getName());
    }//GEN-LAST:event_ImgElectivireMouseClicked

    private Pokemon randomizeFoe(){
        int[] foes = {466, 487, 384, 493, 643};
        
        int index = (int) (Math.random() * (5 - 1 + 1) + 1);
        
        Pokemon foe = Connect.Pokemon(foes[index - 1]);
        
        return foe;
        
    }
    
   
    
    
    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        //Declaring a new Battle form, as well as defining a random Pokémon opponent
        Battle battleForm = new Battle();
        battleForm.playerPokemon = this.pokemon;
        battleForm.foePokemon = randomizeFoe();
        
        //Define the images used in the battle
        ImageIcon foeIcon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Gifs/" + battleForm.foePokemon.getName() + ".gif");
        battleForm.PokemonFoe.setIcon(foeIcon);
        ImageIcon backgroundIcon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Images/scenario" + battleForm.foePokemon.getName() + ".png");
        
        battleForm.background.setIcon(backgroundIcon);
        ImageIcon playerIcon = new ImageIcon(System.getProperties().getProperty("user.dir") + "/src/main/resources/Gifs/back" + battleForm.playerPokemon.getName() + ".gif");
        battleForm.PokemonChoosed.setIcon(playerIcon);
        
        
        //Define all Moves from the Player Pokémon
        battleForm.playerMove1 = Connect.Move(battleForm.playerPokemon.getMove1());
        battleForm.playerMove2 = Connect.Move(battleForm.playerPokemon.getMove2());
        battleForm.playerMove3 = Connect.Move(battleForm.playerPokemon.getMove3());
        battleForm.playerMove4 = Connect.Move(battleForm.playerPokemon.getMove4());
        
        
        
        battleForm.trainerName = this.trainerName;
        battleForm.trainerGender = this.trainerGender;
        battleForm.setVisible(true);
        
        System.out.println("Tela escolher Pkmn: " + this.trainerGender);
        dispose();

    }//GEN-LAST:event_BtnPlayActionPerformed

    private void BtnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPlayMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnPlayMouseClicked

    private void BtnPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPlayMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPlayMouseEntered

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //All labels structures:

        
    }//GEN-LAST:event_formWindowActivated

    private void BtnMove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove1ActionPerformed
        

    }//GEN-LAST:event_BtnMove1ActionPerformed

    private void BtnMove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove3ActionPerformed
        
    }//GEN-LAST:event_BtnMove3ActionPerformed

    private void BtnMove4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove4ActionPerformed
        
    }//GEN-LAST:event_BtnMove4ActionPerformed

    private void BtnMove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMove2ActionPerformed
        
    }//GEN-LAST:event_BtnMove2ActionPerformed

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
                if ("Metal".equals(info.getName())) {
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
    private javax.swing.JButton BtnMove1;
    private javax.swing.JButton BtnMove2;
    private javax.swing.JButton BtnMove3;
    private javax.swing.JButton BtnMove4;
    private javax.swing.JButton BtnPlay;
    private javax.swing.JLabel ImgArceus;
    private javax.swing.JLabel ImgElectivire;
    private javax.swing.JLabel ImgGiratina;
    private javax.swing.JLabel ImgRayquaza;
    private javax.swing.JLabel ImgReshiram;
    private javax.swing.JLabel LblAbility;
    private javax.swing.JLabel LblBackground;
    private javax.swing.JLabel LblFormAbility;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblPokedex;
    private javax.swing.JLabel LblPokemonChoosed;
    private javax.swing.JLabel SelectionBar;
    private javax.swing.JTable TableStats;
    private javax.swing.JButton Type1;
    private javax.swing.JButton Type2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
