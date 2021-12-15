package sistem.autobuskastanica.forme;

import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class RadnikForma extends javax.swing.JFrame {

    private final RadnikForma instanca = this;
    private Zaposlen vlasnikForme;

    public RadnikForma() {

        UcitaniPodaci.ucitajSvePodatke();

        initComponents();

        pocetneAnimacije();

    }

    public RadnikForma(Zaposlen vlasnikForme) {

        UcitaniPodaci.ucitajSvePodatke();

        this.vlasnikForme = vlasnikForme;

        initComponents();

        pocetneAnimacije();

    }

    private void pocetneAnimacije() {

        if (vlasnikForme == null) {
            return;
        }

        String Labela1Text = "RADNIK: " + vlasnikForme.getIme() + " " + vlasnikForme.getPrezime();
        radnikLabela1.setText("");
        LabelAnimacija.pokreni(radnikLabela1, Labela1Text, 25, 0, 250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLabela = new javax.swing.JLabel();
        radnikLabela1 = new javax.swing.JLabel();
        izdavanjeKarataButton = new javax.swing.JButton();
        statusLinijaButton = new javax.swing.JButton();
        dodavanjeLinijaButton = new javax.swing.JButton();
        ostavljanjeStvariButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        backLabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelaMouseExited(evt);
            }
        });

        radnikLabela1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        radnikLabela1.setForeground(new java.awt.Color(114, 137, 218));
        radnikLabela1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radnikLabela1.setText("RADNIK");

        izdavanjeKarataButton.setBackground(new java.awt.Color(114, 137, 218));
        izdavanjeKarataButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        izdavanjeKarataButton.setForeground(new java.awt.Color(44, 47, 51));
        izdavanjeKarataButton.setText("IZDAVANJE KARATA");
        izdavanjeKarataButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izdavanjeKarataButton.setMaximumSize(new java.awt.Dimension(250, 30));
        izdavanjeKarataButton.setMinimumSize(new java.awt.Dimension(250, 30));
        izdavanjeKarataButton.setPreferredSize(new java.awt.Dimension(250, 30));
        izdavanjeKarataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izdavanjeKarataButtonActionPerformed(evt);
            }
        });

        statusLinijaButton.setBackground(new java.awt.Color(114, 137, 218));
        statusLinijaButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        statusLinijaButton.setForeground(new java.awt.Color(44, 47, 51));
        statusLinijaButton.setText("STATISTIKA LINIJA");
        statusLinijaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statusLinijaButton.setMaximumSize(new java.awt.Dimension(250, 30));
        statusLinijaButton.setMinimumSize(new java.awt.Dimension(250, 30));
        statusLinijaButton.setPreferredSize(new java.awt.Dimension(250, 30));
        statusLinijaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusLinijaButtonMouseClicked(evt);
            }
        });

        dodavanjeLinijaButton.setBackground(new java.awt.Color(114, 137, 218));
        dodavanjeLinijaButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dodavanjeLinijaButton.setForeground(new java.awt.Color(44, 47, 51));
        dodavanjeLinijaButton.setText("DODAVANJE LINIJA");
        dodavanjeLinijaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dodavanjeLinijaButton.setMaximumSize(new java.awt.Dimension(250, 30));
        dodavanjeLinijaButton.setMinimumSize(new java.awt.Dimension(250, 30));
        dodavanjeLinijaButton.setPreferredSize(new java.awt.Dimension(250, 30));
        dodavanjeLinijaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodavanjeLinijaButtonActionPerformed(evt);
            }
        });

        ostavljanjeStvariButton.setBackground(new java.awt.Color(114, 137, 218));
        ostavljanjeStvariButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ostavljanjeStvariButton.setForeground(new java.awt.Color(44, 47, 51));
        ostavljanjeStvariButton.setText("OSTAVLJANJE STVARI");
        ostavljanjeStvariButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ostavljanjeStvariButton.setMaximumSize(new java.awt.Dimension(250, 30));
        ostavljanjeStvariButton.setMinimumSize(new java.awt.Dimension(250, 30));
        ostavljanjeStvariButton.setPreferredSize(new java.awt.Dimension(250, 30));
        ostavljanjeStvariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ostavljanjeStvariButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(radnikLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabela))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dodavanjeLinijaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(ostavljanjeStvariButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(izdavanjeKarataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(statusLinijaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabela)
                .addGap(18, 18, 18)
                .addComponent(radnikLabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(izdavanjeKarataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLinijaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodavanjeLinijaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ostavljanjeStvariButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void izdavanjeKarataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izdavanjeKarataButtonActionPerformed

        IzdavanjeKarataForma izdavanjeKarataForma = new IzdavanjeKarataForma(vlasnikForme);
        izdavanjeKarataForma.setLocation(instanca.getLocation());
        izdavanjeKarataForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_izdavanjeKarataButtonActionPerformed

    private void dodavanjeLinijaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodavanjeLinijaButtonActionPerformed

        DodavanjeLinijaForma dodavanjeLinijaForma = new DodavanjeLinijaForma(vlasnikForme);
        dodavanjeLinijaForma.setLocation(instanca.getLocation());
        dodavanjeLinijaForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_dodavanjeLinijaButtonActionPerformed

    private void ostavljanjeStvariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ostavljanjeStvariButtonActionPerformed

        OstavljanjeStvariForma ostavljanjeStvariForma = new OstavljanjeStvariForma(vlasnikForme);
        ostavljanjeStvariForma.setLocation(instanca.getLocation());
        ostavljanjeStvariForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_ostavljanjeStvariButtonActionPerformed

    private void backLabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseEntered

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png")));

    }//GEN-LAST:event_backLabelaMouseEntered

    private void backLabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseExited

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png")));

    }//GEN-LAST:event_backLabelaMouseExited

    private void backLabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseClicked

        LoginForma loginForma = new LoginForma();
        loginForma.setLocation(instanca.getLocation());
        loginForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_backLabelaMouseClicked

    private void statusLinijaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusLinijaButtonMouseClicked

        StatistikaLinijaForma statistikaLinijaForma = new StatistikaLinijaForma(vlasnikForme);
        statistikaLinijaForma.setLocation(instanca.getLocation());
        statistikaLinijaForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_statusLinijaButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RadnikForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadnikForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadnikForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadnikForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadnikForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabela;
    private javax.swing.JButton dodavanjeLinijaButton;
    private javax.swing.JButton izdavanjeKarataButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ostavljanjeStvariButton;
    private javax.swing.JLabel radnikLabela1;
    private javax.swing.JButton statusLinijaButton;
    // End of variables declaration//GEN-END:variables
}
