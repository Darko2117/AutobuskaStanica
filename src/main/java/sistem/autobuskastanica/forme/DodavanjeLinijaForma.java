package sistem.autobuskastanica.forme;

import javax.swing.DefaultComboBoxModel;
import sistem.autobuskastanica.backendklase.AutobuskaLinija;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class DodavanjeLinijaForma extends javax.swing.JFrame {

    private DodavanjeLinijaForma instanca;
    private Zaposlen vlasnikForme;

    public DodavanjeLinijaForma() {

        instanca = this;

        initComponents();

        ucitavanjeComboBoxeva();
        pocetneAnimacije();

    }

    public DodavanjeLinijaForma(Zaposlen zaposlen) {

        instanca = this;
        vlasnikForme = zaposlen;

        initComponents();

        ucitavanjeComboBoxeva();
        pocetneAnimacije();

    }

    private void pocetneAnimacije() {

        int brzinaAnimacija = 50;
        int prvoZakasnjenje = 250;
        String gradPolazkaLabelaText = "Grad Polazka";
        String gradDolazkaLabelaText = "Grad Dolazka";
        String datumiLabela1Text = "Datumi";
        String datumiLabela2Text = "(DD.MM.GGGG jedan po liniji)";
        String vremenaLabela1Text = "Vremena";
        String vremenaLabela2Text = "(SS:MM jedno po liniji)";
        String sedistaLabelaText = "Sedista";
        String cenaLabelaText = "Cena";
        gradPolazkaLabela1.setText("");
        gradDolazkaLabela1.setText("");
        datumiLabela1.setText("");
        datumiLabela2.setText("");
        vremenaLabela1.setText("");
        vremenaLabela2.setText("");
        sedistaLabela1.setText("");
        cenaLabela1.setText("");
        LabelAnimacija.pokreni(gradPolazkaLabela1, gradPolazkaLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(gradDolazkaLabela1, gradDolazkaLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(datumiLabela1, datumiLabela1Text, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(datumiLabela2, datumiLabela2Text, brzinaAnimacija, 0, prvoZakasnjenje + datumiLabela1Text.length() * brzinaAnimacija);
        LabelAnimacija.pokreni(vremenaLabela1, vremenaLabela1Text, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(vremenaLabela2, vremenaLabela2Text, brzinaAnimacija, 0, prvoZakasnjenje + vremenaLabela1Text.length() * brzinaAnimacija);
        LabelAnimacija.pokreni(sedistaLabela1, sedistaLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(cenaLabela1, cenaLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);

    }

    private void ucitavanjeComboBoxeva() {

        DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addAll(AutobuskaLinija.dozvoljeniGradovi);
        gradPolazkaComboBox.setModel(defaultComboBoxModel1);
        DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addAll(AutobuskaLinija.dozvoljeniGradovi);
        gradDolazkaComboBox.setModel(defaultComboBoxModel2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLabela = new javax.swing.JLabel();
        gradPolazkaLabela1 = new javax.swing.JLabel();
        gradPolazkaComboBox = new javax.swing.JComboBox<>();
        gradPolazkaLabela2 = new javax.swing.JLabel();
        gradDolazkaLabela1 = new javax.swing.JLabel();
        gradDolazkaComboBox = new javax.swing.JComboBox<>();
        gradDolazkaLabela2 = new javax.swing.JLabel();
        datumiLabela1 = new javax.swing.JLabel();
        datumiLabela2 = new javax.swing.JLabel();
        datumiScrollPane = new javax.swing.JScrollPane();
        datumiTextArea = new javax.swing.JTextArea();
        datumiLabela3 = new javax.swing.JLabel();
        vremenaLabela1 = new javax.swing.JLabel();
        vremenaLabela2 = new javax.swing.JLabel();
        vremenaScrollPane = new javax.swing.JScrollPane();
        vremenaTextArea = new javax.swing.JTextArea();
        vremenaLabela3 = new javax.swing.JLabel();
        sedistaLabela1 = new javax.swing.JLabel();
        sedistaTextField = new javax.swing.JTextField();
        cenaLabela1 = new javax.swing.JLabel();
        cenaTextField = new javax.swing.JTextField();
        dodajButton = new javax.swing.JButton();
        unosenjeUspeloLabela = new javax.swing.JLabel();

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

        gradPolazkaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        gradPolazkaLabela1.setForeground(new java.awt.Color(114, 137, 218));
        gradPolazkaLabela1.setText("Grad Polazka");

        gradPolazkaComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        gradPolazkaLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        gradPolazkaLabela2.setForeground(new java.awt.Color(255, 51, 51));

        gradDolazkaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        gradDolazkaLabela1.setForeground(new java.awt.Color(114, 137, 218));
        gradDolazkaLabela1.setText("Grad Dolazka");

        gradDolazkaComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        gradDolazkaLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        gradDolazkaLabela2.setForeground(new java.awt.Color(255, 51, 51));

        datumiLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        datumiLabela1.setForeground(new java.awt.Color(114, 137, 218));
        datumiLabela1.setText("Datumi");

        datumiLabela2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        datumiLabela2.setForeground(new java.awt.Color(114, 137, 218));
        datumiLabela2.setText("(DD.MM.GGGG jedan po liniji)");

        datumiTextArea.setColumns(20);
        datumiTextArea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        datumiTextArea.setRows(5);
        datumiScrollPane.setViewportView(datumiTextArea);

        datumiLabela3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        datumiLabela3.setForeground(new java.awt.Color(255, 51, 51));

        vremenaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        vremenaLabela1.setForeground(new java.awt.Color(114, 137, 218));
        vremenaLabela1.setText("Vremena");

        vremenaLabela2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        vremenaLabela2.setForeground(new java.awt.Color(114, 137, 218));
        vremenaLabela2.setText("(SS:MM jedno po liniji)");

        vremenaTextArea.setColumns(20);
        vremenaTextArea.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        vremenaTextArea.setRows(5);
        vremenaScrollPane.setViewportView(vremenaTextArea);

        vremenaLabela3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        vremenaLabela3.setForeground(new java.awt.Color(255, 51, 51));

        sedistaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sedistaLabela1.setForeground(new java.awt.Color(114, 137, 218));
        sedistaLabela1.setText("Sedista");

        cenaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cenaLabela1.setForeground(new java.awt.Color(114, 137, 218));
        cenaLabela1.setText("Cena");

        dodajButton.setBackground(new java.awt.Color(114, 137, 218));
        dodajButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dodajButton.setText("Dodaj");

        unosenjeUspeloLabela.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        unosenjeUspeloLabela.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabela))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vremenaLabela1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vremenaLabela2))
                            .addComponent(gradDolazkaLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gradDolazkaComboBox, 0, 300, Short.MAX_VALUE)
                            .addComponent(gradPolazkaLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gradPolazkaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(datumiLabela1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datumiLabela2))
                            .addComponent(datumiScrollPane)
                            .addComponent(vremenaScrollPane)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sedistaLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sedistaTextField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cenaLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cenaTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(unosenjeUspeloLabela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gradPolazkaLabela2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(gradDolazkaLabela2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datumiLabela3)
                                    .addComponent(vremenaLabela3))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabela)
                .addGap(50, 50, 50)
                .addComponent(gradPolazkaLabela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradPolazkaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradPolazkaLabela2))
                .addGap(18, 18, 18)
                .addComponent(gradDolazkaLabela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradDolazkaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradDolazkaLabela2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datumiLabela1)
                    .addComponent(datumiLabela2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datumiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datumiLabela3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vremenaLabela1)
                    .addComponent(vremenaLabela2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vremenaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vremenaLabela3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sedistaLabela1)
                    .addComponent(cenaLabela1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sedistaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(unosenjeUspeloLabela)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseEntered

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png")));

    }//GEN-LAST:event_backLabelaMouseEntered

    private void backLabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseExited

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png")));

    }//GEN-LAST:event_backLabelaMouseExited

    private void backLabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseClicked

        RadnikForma radnikForma = new RadnikForma(vlasnikForme);
        radnikForma.setLocation(instanca.getLocation());
        radnikForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_backLabelaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DodavanjeLinijaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DodavanjeLinijaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DodavanjeLinijaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DodavanjeLinijaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DodavanjeLinijaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabela;
    private javax.swing.JLabel cenaLabela1;
    private javax.swing.JTextField cenaTextField;
    private javax.swing.JLabel datumiLabela1;
    private javax.swing.JLabel datumiLabela2;
    private javax.swing.JLabel datumiLabela3;
    private javax.swing.JScrollPane datumiScrollPane;
    private javax.swing.JTextArea datumiTextArea;
    private javax.swing.JButton dodajButton;
    private javax.swing.JComboBox<String> gradDolazkaComboBox;
    private javax.swing.JLabel gradDolazkaLabela1;
    private javax.swing.JLabel gradDolazkaLabela2;
    private javax.swing.JComboBox<String> gradPolazkaComboBox;
    private javax.swing.JLabel gradPolazkaLabela1;
    private javax.swing.JLabel gradPolazkaLabela2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sedistaLabela1;
    private javax.swing.JTextField sedistaTextField;
    private javax.swing.JLabel unosenjeUspeloLabela;
    private javax.swing.JLabel vremenaLabela1;
    private javax.swing.JLabel vremenaLabela2;
    private javax.swing.JLabel vremenaLabela3;
    private javax.swing.JScrollPane vremenaScrollPane;
    private javax.swing.JTextArea vremenaTextArea;
    // End of variables declaration//GEN-END:variables
}
