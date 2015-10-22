/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlückspielV2;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jesusr3kt
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }
    public double x = 0;
    public double g = 0;
    String pfad = "src/wow.gif";
    public int r = 0;
    public double max = 0;
    public double maxscore = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btAufladen = new javax.swing.JButton();
        lbGeld = new javax.swing.JLabel();
        tfGeld = new javax.swing.JTextField();
        tfSetzen = new javax.swing.JTextField();
        btSetzten = new javax.swing.JButton();
        btStart = new javax.swing.JButton();
        lbGeld1 = new javax.swing.JLabel();
        lbGeld2 = new javax.swing.JLabel();
        lbText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btAufladen.setText("Geld aufladen");
        btAufladen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAufladenActionPerformed(evt);
            }
        });

        lbGeld.setText("Geld");

        tfGeld.setEditable(false);

        tfSetzen.setEditable(false);
        tfSetzen.setEnabled(false);

        btSetzten.setText("Setzen");
        btSetzten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSetztenActionPerformed(evt);
            }
        });

        btStart.setText("Starten");
        btStart.setEnabled(false);
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        lbGeld1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GlückspielV2/ksnoop.gif"))); // NOI18N

        lbGeld2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GlückspielV2/ksnoop.gif"))); // NOI18N

        lbText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Highscore:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbGeld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbGeld1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btSetzten, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfSetzen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbGeld2)
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfGeld, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAufladen))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbScore)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSetzen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSetzten))
                    .addComponent(lbGeld1)
                    .addComponent(lbGeld2))
                .addGap(62, 62, 62)
                .addComponent(lbText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGeld)
                    .addComponent(tfGeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAufladen))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>                        

    private void btAufladenActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            File file = new File("highscore.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();

            System.out.println(stringBuffer.toString());
            String hs = stringBuffer.toString();
            maxscore = Double.parseDouble(hs);
            maxscore = Math.round(100.0 * maxscore) / 100.0;
        } catch (IOException e) {
            e.printStackTrace();
        }

        lbScore.setText("" + maxscore);
        String d = "";

        double y = 0;

        while (true) {
            boolean worked = true;
            try {
                d = JOptionPane.showInputDialog("Bitte Kreditkartennummer angeben!");
                y = Double.parseDouble(d);
            } catch (Exception e) {
                System.out.println(e.toString());
                worked = false;
            }
            if (worked) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Alter gib deine Nummer an!", "FAGGET!", JOptionPane.WARNING_MESSAGE, null);
            }
        }

        System.out.println(y);
        x = 5000;
        JOptionPane.showMessageDialog(null, "Du hast 5000€ aufgeladen", "FAGGET!", JOptionPane.INFORMATION_MESSAGE, null);
        btAufladen.setEnabled(false);
        tfGeld.setText("" + x);
        lbText.setForeground(Color.BLUE);
        lbText.setText("+" + x);
    }                                          

    private void btSetztenActionPerformed(java.awt.event.ActionEvent evt) {                                          
        lbText.setText("");
        while (true) {
            boolean w = true;
            try {
                String sgesetzt = JOptionPane.showInputDialog("Bitte betrag angeben!");
                g = Double.parseDouble(sgesetzt);
                if (g > x) {
                    w = false;
                }

            } catch (Exception e) {
                System.out.println(e.toString());
                w = false;
            }
            if (w) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Bitte gültige Zahl eingeben!", "FAGGET!", JOptionPane.WARNING_MESSAGE, null);
            }
        }
        lbText.setForeground(Color.RED);
        lbText.setText("-" + g);
        x += -g;
        tfSetzen.setText("" + g);
        tfGeld.setText("" + x);
        btSetzten.setEnabled(false);
        btStart.setEnabled(true);
        tfSetzen.setEnabled(true);
    }                                         

    private void btStartActionPerformed(java.awt.event.ActionEvent evt) {                                        
        r += 1;
        tfSetzen.setEnabled(false);
        btSetzten.setEnabled(true);
        Random rand = new Random();

        int zz = rand.nextInt(100) + 1;
        System.out.println(zz);
        //-10%
        if (zz
                <= 20) {
            lbText.setText("");

            x += g - g / 100 * 10;
            double h = g - g / 100 * 10;
            h = Math.round(100.0 * h) / 100.0;
            final ImageIcon icon = new ImageIcon("/home/jesusr3kt/Schreibtisch/Drive/POS/Projekte/Glücksspiel/src/GlückspielV2/lose.gif");
            JOptionPane.showMessageDialog(null, "- 10%\nDu hast " + g / 100 * 10 + "€ verloren!", "-10%", JOptionPane.INFORMATION_MESSAGE, icon);
            lbText.setForeground(Color.BLUE);
            lbText.setText("+" + h);

        }
        //+200%
        if (zz > 20 && zz <= 25) {
            lbText.setText("");

            x += g * 2;
            double h = g + g * 2;
            h = Math.round(100.0 * h) / 100.0;
            final ImageIcon icon = new ImageIcon("/home/jesusr3kt/Schreibtisch/Drive/POS/Projekte/Glücksspiel/src/GlückspielV2/winkrap.gif");
            JOptionPane.showMessageDialog(null, "200%\nDu hast " + g * 2 + "€ gewonnen!", "200%", JOptionPane.INFORMATION_MESSAGE, icon);
            lbText.setForeground(Color.BLUE);
            lbText.setText("+" + h);
        }
        //+60%
        if (zz > 25 && zz <= 30) {
            lbText.setText("");

            x += g / 100 * 60;
            double h = g + g / 100 * 60;
            h = Math.round(100.0 * h) / 100.0;
            final ImageIcon icon = new ImageIcon("/home/jesusr3kt/Schreibtisch/Drive/POS/Projekte/Glücksspiel/src/GlückspielV2/win2.gif");

            JOptionPane.showMessageDialog(null, "60%\nDu hast " + g / 100 * 60 + "€ gewonnen!", "60%", JOptionPane.INFORMATION_MESSAGE, icon);
            lbText.setForeground(Color.BLUE);
            lbText.setText("+" + h);
        }

        //+10%
        if (zz > 30 && zz
                <= 50) {
            lbText.setText("");
            final ImageIcon icon = new ImageIcon(pfad);
            x += g + g / 100 * 10;
            double h = g + g / 100 * 10;
            h = Math.round(100.0 * h) / 100.0;
            JOptionPane.showMessageDialog(null, "+ 10%\nDu hast " + g / 100 * 10 + "€ gewonnen!", "+10%", JOptionPane.INFORMATION_MESSAGE, icon);
            lbText.setForeground(Color.BLUE);
            lbText.setText("+" + h);
            if (h > max) {
                max = h;
            }
        }

        //+40%
        if (zz > 50 && zz <= 60) {
            lbText.setText("");
            final ImageIcon icon = new ImageIcon(pfad);
            x += g + g / 100 * 40;
            double h = g + g / 100 * 40;
            h = Math.round(100.0 * h) / 100.0;
            JOptionPane.showMessageDialog(null, "+ 40%\nDu hast " + g / 100 * 40 + "€ gewonnen!", "+10%", JOptionPane.INFORMATION_MESSAGE, icon);
            lbText.setForeground(Color.BLUE);
            lbText.setText("+" + h);
            if (h > max) {
                max = h;
            }
        }

        //+20%
        if (zz <= 70 && zz
                > 60) {
            lbText.setText("");
            final ImageIcon icon = new ImageIcon(pfad);
            x += g + g / 100 * 20;
            double h = g + g / 100 * 20;
            h = Math.round(100.0 * h) / 100.0;
            JOptionPane.showMessageDialog(null, "+ 20%\nDu hast " + g / 100 * 20 + "€ gewonnen!", "+20%", JOptionPane.INFORMATION_MESSAGE, icon);
            lbText.setForeground(Color.BLUE);
            lbText.setText("+" + h);
            if (h > max) {
                max = h;
            }
        }

        //+30%
        if (zz <= 80 && zz
                > 70) {
            lbText.setText("");
            final ImageIcon icon = new ImageIcon(pfad);
            x += g + g / 100 * 30;
            double h = g + g / 100 * 30;
            h = Math.round(100.0 * h) / 100.0;
            JOptionPane.showMessageDialog(null, "+ 30%\nDu hast " + g / 100 * 30 + "€ gewonnen!", "+30%", JOptionPane.INFORMATION_MESSAGE, icon);
            lbText.setForeground(Color.BLUE);
            lbText.setText("+" + h);
            if (h > max) {
                max = h;
            }
        }

        //+50%
        if (zz <= 90 && zz
                > 80) {
            lbText.setText("");
            final ImageIcon icon = new ImageIcon("/home/jesusr3kt/Schreibtisch/Drive/POS/Projekte/Glücksspiel/src/GlückspielV2/win2.gif");
            x += g + g / 100 * 50;
            double h = g + g / 100 * 50;
            h = Math.round(100.0 * h) / 100.0;
            JOptionPane.showMessageDialog(null, "+ 40%\nDu hast " + g / 100 * 50 + "€ gewonnen!", "+50%", JOptionPane.INFORMATION_MESSAGE, icon);
            lbText.setForeground(Color.BLUE);
            if (h > max) {
                max = h;
            }
        }
        //-alles
        if (zz <= 100 && zz
                > 90) {
            lbText.setText("");
            final ImageIcon icon = new ImageIcon("/home/jesusr3kt/Schreibtisch/Drive/POS/Projekte/Glücksspiel/src/GlückspielV2/lost.gif");
            JOptionPane.showMessageDialog(null, "Du hast alles verloren! " + "Du bekommst " + " nichts zurück.", "Verloren!", JOptionPane.INFORMATION_MESSAGE, icon);

        }
        x = Math.round(100.0 * x) / 100.0;

        tfSetzen.setText(
                "");
        tfGeld.setText(
                "" + x);
        btStart.setEnabled(false);

        if (x <= 0) {
            btAufladen.setEnabled(true);
            final ImageIcon icon = new ImageIcon(pfad);
            JOptionPane.showMessageDialog(null, "Dein Score ist: " + max * r, "Verloren", JOptionPane.INFORMATION_MESSAGE, icon);
            if (max * r > maxscore) {

                JOptionPane.showMessageDialog(null, "NEUER HIGHSCORE", "NEUER HIGHSCORE", JOptionPane.INFORMATION_MESSAGE, icon);

                PrintWriter pWriter = null;
                try {
                    pWriter = new PrintWriter(new BufferedWriter(new FileWriter("highscore.txt")));
                    double score = max * r;
                    score = Math.round(100.0 * score) / 100.0;
                    pWriter.println("" + max * r);

                } catch (IOException ioe) {
                    ioe.printStackTrace();
                } finally {
                    if (pWriter != null) {
                        pWriter.flush();
                        pWriter.close();
                    }
                }
            }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btAufladen;
    private javax.swing.JButton btSetzten;
    private javax.swing.JButton btStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbGeld;
    private javax.swing.JLabel lbGeld1;
    private javax.swing.JLabel lbGeld2;
    private javax.swing.JLabel lbScore;
    private javax.swing.JLabel lbText;
    private javax.swing.JTextField tfGeld;
    private javax.swing.JTextField tfSetzen;
    // End of variables declaration                   
}

