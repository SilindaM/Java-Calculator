/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticta;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mdu
 */
public class TicTocc extends javax.swing.JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton playeroscore;
    private javax.swing.JButton playerxscore;
private String startGame="X";
private  JButton[]butt={jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9};
private int Ocount=0;
private int Xcount=0;

    /**
     * Creates new form TicTocc
     */
    public TicTocc() {
        initComponents();
        setSize(550,500);
        setLocationRelativeTo(null);
    }
public void gameScore(){
    playerxscore.setText(String.valueOf(Xcount));
    playeroscore.setText(String.valueOf(Ocount));
}
public void choosePlayer(){
    if(startGame.equalsIgnoreCase("X")){
        startGame="O";
    }
    else
    {
        startGame="X";
    }
}

   private void winningGameO(){
       String b1=jButton1.getText();
       String b2=jButton2.getText();
       String b3=jButton3.getText();
       String b4=jButton4.getText();
       String b5=jButton5.getText();
       String b6=jButton6.getText();
       String b7=jButton7.getText();
       String b8=jButton8.getText();
       String b9=jButton9.getText();
       
       
       //possible combinations to win for X
       if(b1==("O") && b2==("O") && b3==("O"))
       {
           JOptionPane.showMessageDialog(this, "player O Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Ocount++;
           gameScore();
           jButton1.setBackground(Color.ORANGE);
           jButton2.setBackground(Color.ORANGE);
           jButton3.setBackground(Color.ORANGE);
       }
       //possible combinations to win for X
       else if(b4==("O") && b5==("O") && b6==("O"))
       {
           JOptionPane.showMessageDialog(this, "player O Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                      Ocount++;

           gameScore();
           jButton4.setBackground(Color.ORANGE);
           jButton5.setBackground(Color.ORANGE);
           jButton6.setBackground(Color.ORANGE);
       }
       //possible combinations to win for X
       else if(b7==("O") && b8==("O") && b9==("O"))
       {
           JOptionPane.showMessageDialog(this, "player O Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                      Ocount++;
           gameScore();
           jButton7.setBackground(Color.ORANGE);
           jButton8.setBackground(Color.ORANGE);
           jButton9.setBackground(Color.ORANGE);
       }
       //possible combinations to win for X
       else if(b1==("O") && b4==("O") && b7==("O"))
       {
           JOptionPane.showMessageDialog(this, "player O Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                      Ocount++;

           gameScore();
           jButton1.setBackground(Color.ORANGE);
           jButton4.setBackground(Color.ORANGE);
           jButton7.setBackground(Color.ORANGE);
       }
       //possible combinations to win for X
       
       else if(b2==("O") && b5==("O") && b8==("O"))
       {
           JOptionPane.showMessageDialog(this, "player O Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Ocount++;
           gameScore();
           jButton2.setBackground(Color.ORANGE);
           jButton5.setBackground(Color.ORANGE);
           jButton8.setBackground(Color.ORANGE);
       }
       //possible combinations to win for X
       else if(b3==("O") && b6==("O") && b9==("O"))
       {
           JOptionPane.showMessageDialog(this, "player O Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Ocount++;
           gameScore();
           jButton3.setBackground(Color.ORANGE);
           jButton6.setBackground(Color.ORANGE);
           jButton9.setBackground(Color.ORANGE);
       }
       //possible combinations to win for X
       else if(b1==("O") && b5==("O") && b9==("O"))
       {
           JOptionPane.showMessageDialog(this, "player O Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Ocount++;
           gameScore();
           jButton1.setBackground(Color.ORANGE);
           jButton5.setBackground(Color.ORANGE);
           jButton9.setBackground(Color.ORANGE);
       }
       //possible combinations to win for X
       else if(b3==("O") && b5==("O") && b7==("O"))
       {
           JOptionPane.showMessageDialog(this, "player O Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Ocount++;
           gameScore();
           jButton3.setBackground(Color.ORANGE);
           jButton5.setBackground(Color.ORANGE);
           jButton7.setBackground(Color.ORANGE);
       }
       
   }
   private void winningGameX(){
       String b1=jButton1.getText();
       String b2=jButton2.getText();
       String b3=jButton3.getText();
       String b4=jButton4.getText();
       String b5=jButton5.getText();
       String b6=jButton6.getText();
       String b7=jButton7.getText();
       String b8=jButton8.getText();
       String b9=jButton9.getText();
       
       
       //possible combinations to win for X
       if(b1==("X") && b2==("X") && b3==("X"))
       {
           JOptionPane.showMessageDialog(this, "player X Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Xcount++;
           gameScore();
           jButton1.setBackground(Color.CYAN);
           jButton2.setBackground(Color.CYAN);
           jButton3.setBackground(Color.CYAN);
       }
       //possible combinations to win for X
       else if(b4==("X") && b5==("X") && b6==("X"))
       {
           JOptionPane.showMessageDialog(this, "player X Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Xcount++;
           gameScore();
           jButton4.setBackground(Color.CYAN);
           jButton5.setBackground(Color.CYAN);
           jButton6.setBackground(Color.CYAN);
       }
       //possible combinations to win for X
       else if(b7==("X") && b8==("X") && b9==("X"))
       {
           JOptionPane.showMessageDialog(this, "player X Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Xcount++;
           gameScore();
           jButton7.setBackground(Color.CYAN);
           jButton8.setBackground(Color.CYAN);
           jButton9.setBackground(Color.CYAN);
       }
       //possible combinations to win for X
       else if(b1==("X") && b4==("X") && b7==("X"))
       {
           JOptionPane.showMessageDialog(this, "player X Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Xcount++;
           gameScore();
           jButton1.setBackground(Color.CYAN);
           jButton4.setBackground(Color.CYAN);
           jButton7.setBackground(Color.CYAN);
       }
       //possible combinations to win for X
       
       else if(b2==("X") && b5==("X") && b8==("X"))
       {
           JOptionPane.showMessageDialog(this, "player X Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Xcount++;
           gameScore();
           jButton2.setBackground(Color.CYAN);
           jButton5.setBackground(Color.CYAN);
           jButton8.setBackground(Color.CYAN);
       }
       //possible combinations to win for X
       else if(b3==("X") && b6==("X") && b9==("X"))
       {
           JOptionPane.showMessageDialog(this, "player X Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Xcount++;
           gameScore();
           jButton3.setBackground(Color.CYAN);
           jButton6.setBackground(Color.CYAN);
           jButton9.setBackground(Color.CYAN);
       }
       //possible combinations to win for X
       else if(b1==("X") && b5==("X") && b9==("X"))
       {
           JOptionPane.showMessageDialog(this, "player X Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Xcount++;
           gameScore();
           jButton1.setBackground(Color.CYAN);
           jButton5.setBackground(Color.CYAN);
           jButton9.setBackground(Color.CYAN);
       }
       //possible combinations to win for X
       else if(b3==("X") && b5==("X") && b7==("X"))
       {
           JOptionPane.showMessageDialog(this, "player X Wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
           Xcount++;
           gameScore();
           jButton3.setBackground(Color.CYAN);
           jButton5.setBackground(Color.CYAN);
           jButton7.setBackground(Color.CYAN);
       }
       
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   private JFrame frame;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        playerxscore = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        playeroscore = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnreset = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TOC");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(546, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TIC TOC TOE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel4.setBackground(new java.awt.Color(102, 51, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 166));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 51, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(102, 51, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(102, 51, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton11.setBackground(new java.awt.Color(255, 255, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("PLAYER X:");
        jButton11.setEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(102, 51, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        playerxscore.setBackground(new java.awt.Color(255, 255, 0));
        playerxscore.setEnabled(false);
        jPanel8.add(playerxscore, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(102, 51, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(102, 51, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(102, 51, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(102, 51, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton10.setBackground(new java.awt.Color(0, 0, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("PLAYER O:");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel12);

        jPanel14.setBackground(new java.awt.Color(102, 51, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        playeroscore.setBackground(new java.awt.Color(51, 0, 255));
        playeroscore.setEnabled(false);
        jPanel14.add(playeroscore, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel14);

        jPanel13.setBackground(new java.awt.Color(102, 51, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel13);

        jPanel15.setBackground(new java.awt.Color(102, 51, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(102, 51, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(102, 51, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnreset.setText("RESET");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnreset, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(102, 51, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnexit.setText("EXIT");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel18.add(jbtnexit, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel18);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton2.setForeground(Color.yellow);
                 }
                 else
                 {jButton2.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
                    winningGameO();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
       frame=new JFrame("EXIT");
       if(JOptionPane.showConfirmDialog(frame, "DO YOU WANT TO EXIT","TIC TOE GAME",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        jButton1.setText(null);   
        jButton1.setBackground(Color.lightGray);
        jButton2.setText(null);    
        jButton2.setBackground(Color.lightGray);                                   
        jButton3.setText(null);  
        jButton3.setBackground(Color.lightGray);                                     
        jButton4.setText(null);  
        jButton4.setBackground(Color.lightGray);                                     
        jButton5.setText(null); 
        jButton5.setBackground(Color.lightGray);                                      
        jButton6.setText(null); 
        jButton6.setBackground(Color.lightGray);                                      
        jButton7.setText(null);  
        jButton7.setBackground(Color.lightGray);                                     
        jButton8.setText(null);   
        jButton8.setBackground(Color.lightGray);                                    
        jButton9.setText(null);
        jButton9.setBackground(Color.lightGray);
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton1.setForeground(Color.yellow);
                 }
                 else
                 {jButton1.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
                    winningGameO();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton3.setForeground(Color.yellow);
                 }
                 else
                 {jButton3.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
                    winningGameO();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton4.setForeground(Color.yellow);
                 }
                 else
                 {jButton4.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
                    winningGameO();
                    winningGameO();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton5.setForeground(Color.yellow);
                 }
                 else
                 {jButton5.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton6.setForeground(Color.yellow);
                 }
                 else
                 {jButton6.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
                    winningGameO();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton7.setForeground(Color.yellow);
                 }
                 else
                 {jButton7.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
                    winningGameO();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton8.setForeground(Color.yellow);
                 }
                 else
                 {jButton8.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
                    winningGameO();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
                     jButton9.setForeground(Color.yellow);
                 }
                 else
                 {jButton9.setForeground(Color.BLUE);
                 }
                    choosePlayer();
                    winningGameX();
                    winningGameO();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTocc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTocc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTocc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTocc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTocc().setVisible(true);
            }
        });
    } 
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton playeroscore;
    private javax.swing.JButton playerxscore;
    // End of variables declaration//GEN-END:variables
*/
}
