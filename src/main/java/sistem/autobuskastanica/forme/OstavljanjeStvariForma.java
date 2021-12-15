package sistem.autobuskastanica.forme;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import sistem.autobuskastanica.backendklase.FajlMenadzer;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.OstavljeneStvari;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class OstavljanjeStvariForma extends javax.swing.JFrame {

    private final OstavljanjeStvariForma instanca = this;
    private Zaposlen vlasnikForme;
    private String poslednjaVrednostPreuzimanjeTextFielda = "";

    public OstavljanjeStvariForma() {

        UcitaniPodaci.ucitajSvePodatke();

        initComponents();
        
        pocniUpdateovanjePreuzimanjeTextArea();
        pocetneAnimacije();

    }

    public OstavljanjeStvariForma(Zaposlen vlasnikForme) {

        UcitaniPodaci.ucitajSvePodatke();

        this.vlasnikForme = vlasnikForme;

        initComponents();
        
        pocniUpdateovanjePreuzimanjeTextArea();
        pocetneAnimacije();

    }

    private void pocniUpdateovanjePreuzimanjeTextArea() {

        UcitaniPodaci.ucitajOstavljeneStvari();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                if (!instanca.isShowing()) {
                    return;
                }

                if (!poslednjaVrednostPreuzimanjeTextFielda.equals(preuzimanjeTextField.getText())) {
                    poslednjaVrednostPreuzimanjeTextFielda = preuzimanjeTextField.getText();

                    int unetID = -1;

                    try {
                        unetID = Integer.valueOf(poslednjaVrednostPreuzimanjeTextFielda);
                    } catch (Throwable ignored) {
                    }

                    String text = "";
                    for (OstavljeneStvari ostavljeneStvari : UcitaniPodaci.getOstavljeneStvari()) {
                        if (ostavljeneStvari.getID() == unetID) {
                            text = ostavljeneStvari.getOpisStvari().replace("|", "\n");
                        }
                        preuzimanjeTextArea.setText(text);
                    }

                }

                pocniUpdateovanjePreuzimanjeTextArea();

            }
        };
        timer.schedule(task, 100);

    }
    
    private void pocetneAnimacije() {

        String ostavljanjeLabela1Text = "OSTAVLJANJE";
        String ostavljanjeLabela2Text = "Molimo opišite ostavljen prtljag";
        String preuzimanjeLabela1Text = "PREUZIMANJE";
        String preuzimanjeLabela2Text = "Molimo unesite ID prtljaga";
        ostavljanjeLabela1.setText("");
        ostavljanjelabela2.setText("");
        preuzimanjeLabela1.setText("");
        preuzimanjeLabela2.setText("");
        LabelAnimacija.pokreni(ostavljanjeLabela1, ostavljanjeLabela1Text, 100, 0, 250);
        LabelAnimacija.pokreni(ostavljanjelabela2, ostavljanjeLabela2Text, 100, 0, 250);
        LabelAnimacija.pokreni(preuzimanjeLabela1, preuzimanjeLabela1Text, 100, 0, 250);
        LabelAnimacija.pokreni(preuzimanjeLabela2, preuzimanjeLabela2Text, 100, 0, 250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLabela = new javax.swing.JLabel();
        ostavljanjeLabela1 = new javax.swing.JLabel();
        ostavljanjelabela2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ostavljanjeTextArea = new javax.swing.JTextArea();
        ostavljanjeGotovoButton = new javax.swing.JButton();
        ostavljanjeGreskaLabela = new javax.swing.JLabel();
        preuzimanjeLabela1 = new javax.swing.JLabel();
        preuzimanjeLabela2 = new javax.swing.JLabel();
        preuzimanjeTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        preuzimanjeTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTOBUSKA STANICA");
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

        ostavljanjeLabela1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        ostavljanjeLabela1.setForeground(new java.awt.Color(114, 137, 218));
        ostavljanjeLabela1.setText("OSTAVLJANJE");

        ostavljanjelabela2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ostavljanjelabela2.setForeground(new java.awt.Color(114, 137, 218));
        ostavljanjelabela2.setText("Molimo opišite ostavljen prtljag");

        ostavljanjeTextArea.setColumns(20);
        ostavljanjeTextArea.setRows(5);
        jScrollPane1.setViewportView(ostavljanjeTextArea);

        ostavljanjeGotovoButton.setBackground(new java.awt.Color(114, 137, 218));
        ostavljanjeGotovoButton.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        ostavljanjeGotovoButton.setText("Gotovo");
        ostavljanjeGotovoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ostavljanjeGotovoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ostavljanjeGotovoButtonMouseClicked(evt);
            }
        });

        ostavljanjeGreskaLabela.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        ostavljanjeGreskaLabela.setForeground(new java.awt.Color(255, 51, 51));

        preuzimanjeLabela1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        preuzimanjeLabela1.setForeground(new java.awt.Color(114, 137, 218));
        preuzimanjeLabela1.setText("PREUZIMANJE");

        preuzimanjeLabela2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        preuzimanjeLabela2.setForeground(new java.awt.Color(114, 137, 218));
        preuzimanjeLabela2.setText("Molimo unesite ID prtljaga");

        preuzimanjeTextField.setBackground(new java.awt.Color(114, 137, 218));

        preuzimanjeTextArea.setColumns(20);
        preuzimanjeTextArea.setRows(5);
        jScrollPane2.setViewportView(preuzimanjeTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backLabela)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ostavljanjeGreskaLabela)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ostavljanjelabela2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ostavljanjeLabela1)
                                        .addComponent(jScrollPane1))
                                    .addComponent(ostavljanjeGotovoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preuzimanjeLabela2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(preuzimanjeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(preuzimanjeLabela1)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabela)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ostavljanjeLabela1)
                    .addComponent(preuzimanjeLabela1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ostavljanjelabela2)
                    .addComponent(preuzimanjeLabela2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ostavljanjeGotovoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ostavljanjeGreskaLabela))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(preuzimanjeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseClicked

        RadnikForma radnikForma = new RadnikForma(vlasnikForme);
        radnikForma.setLocation(instanca.getLocation());
        radnikForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_backLabelaMouseClicked

    private void backLabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseEntered

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png")));

    }//GEN-LAST:event_backLabelaMouseEntered

    private void backLabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseExited

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png")));

    }//GEN-LAST:event_backLabelaMouseExited

    private void ostavljanjeGotovoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ostavljanjeGotovoButtonMouseClicked

        UcitaniPodaci.ucitajOstavljeneStvari();

        if (ostavljanjeTextArea.getText().isEmpty()) {

            String ostavljanjeGreskaLabelaText = "Text area je prazan";

            //Animacija u slucaju da je text area prazan
            //ostavljanjeGreskaLabela animacija 1
            int ostavljanjeGreskaLabelaBrzinaAnimacije1 = 10;
            int ostavljanjeGreskaLabelaZakasnjenjeAnimacije1 = 0;
            int ostavljanjeGreskaLabelaCeloTrajanjeAnimacije1 = ostavljanjeGreskaLabelaBrzinaAnimacije1 * ostavljanjeGreskaLabelaText.length() + ostavljanjeGreskaLabelaZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(ostavljanjeGreskaLabela, ostavljanjeGreskaLabelaText, ostavljanjeGreskaLabelaBrzinaAnimacije1, 0, ostavljanjeGreskaLabelaZakasnjenjeAnimacije1);

            //ostavljanjeGreskaLabela animacija 2
            int ostavljanjeGreskaLabelaBrzinaAnimacije2 = 10;
            int ostavljanjeGreskaLabelaZakasnjenjeAnimacije2 = ostavljanjeGreskaLabelaCeloTrajanjeAnimacije1 + 3000;
            int ostavljanjeGreskaLabelaCeloTrajanjeAnimacije2 = ostavljanjeGreskaLabelaBrzinaAnimacije2 * ostavljanjeGreskaLabelaText.length() + ostavljanjeGreskaLabelaZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(ostavljanjeGreskaLabela, ostavljanjeGreskaLabelaText, ostavljanjeGreskaLabelaBrzinaAnimacije2, 1, ostavljanjeGreskaLabelaZakasnjenjeAnimacije2);

            return;

        }

        String opisStvari = ostavljanjeTextArea.getText().replace("\n", "|");

        int randomID;
        randomIDSetter:
        while (true) {
            randomID = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
            for (OstavljeneStvari ostavljeneStvari : UcitaniPodaci.getOstavljeneStvari()) {
                if (ostavljeneStvari.getID() == randomID) {
                    continue randomIDSetter;
                }
            }
            break;
        }

        ostavljanjeTextArea.append("\n\nID: " + randomID);

        OstavljeneStvari ostavljeneStvari = new OstavljeneStvari(opisStvari, randomID);
        FajlMenadzer.pisiFajl(OstavljeneStvari.imeFajla, ostavljeneStvari.uString());
        UcitaniPodaci.ucitajOstavljeneStvari();

        PrinterJob printerJob = PrinterJob.getPrinterJob();
        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            } catch (PrinterException exc) {
                System.out.println(exc);
            }
        }

    }//GEN-LAST:event_ostavljanjeGotovoButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OstavljanjeStvariForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OstavljanjeStvariForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OstavljanjeStvariForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OstavljanjeStvariForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OstavljanjeStvariForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton ostavljanjeGotovoButton;
    private javax.swing.JLabel ostavljanjeGreskaLabela;
    private javax.swing.JLabel ostavljanjeLabela1;
    private javax.swing.JTextArea ostavljanjeTextArea;
    private javax.swing.JLabel ostavljanjelabela2;
    private javax.swing.JLabel preuzimanjeLabela1;
    private javax.swing.JLabel preuzimanjeLabela2;
    private javax.swing.JTextArea preuzimanjeTextArea;
    private javax.swing.JTextField preuzimanjeTextField;
    // End of variables declaration//GEN-END:variables
}
