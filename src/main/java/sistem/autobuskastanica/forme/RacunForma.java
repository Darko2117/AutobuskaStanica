package sistem.autobuskastanica.forme;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.concurrent.ThreadLocalRandom;
import sistem.autobuskastanica.backendklase.AutobuskaLinija;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class RacunForma extends javax.swing.JFrame {

    private final RacunForma instanca = this;
    private Zaposlen vlasnikForme;
    private AutobuskaLinija autobuskaLinija;
    private int brojKarata;
    private String vrstaKarte;

    public RacunForma() {

        initComponents();

    }

    public RacunForma(Zaposlen vlasnikForme, AutobuskaLinija autobuskaLinija, int brojKarata, String vrstaKarte) {

        this.vlasnikForme = vlasnikForme;
        this.autobuskaLinija = autobuskaLinija;
        this.brojKarata = brojKarata;
        this.vrstaKarte = vrstaKarte;

        initComponents();

        namestiRacunTextArea();

    }

    private void namestiRacunTextArea() {

        String mesta;
        if (brojKarata == 1) {
            mesta = String.valueOf(ThreadLocalRandom.current().nextInt(1, 100));
        } else {
            int randomMesto = ThreadLocalRandom.current().nextInt(1, 100 - brojKarata);
            mesta = String.valueOf(randomMesto + "-" + (randomMesto + brojKarata - 1));
        }

        int cena = autobuskaLinija.getCena();
        if (vrstaKarte.equals("Penzioner")) {
            cena = (cena / 100) * 75;
        } else if (vrstaKarte.equals("Deca")) {
            cena = (cena / 100) * 60;
        }

        String text = "";

        text = text.concat("=+=+=+=+=+=+=+= AUTOBUSKA STANICA =+=+=+=+=+=+=+=\n");
        text = text.concat("=+=+=+=+= HVALA VAM STO PUTUJETE SA NAMA =+=+=+=+=\n\n");
        text = text.concat("Mesto polazka: " + autobuskaLinija.getMestoPolazka() + "\n");
        text = text.concat("Mesto dolazka: " + autobuskaLinija.getMestoDolazka() + "\n");
        text = text.concat("Datum: " + autobuskaLinija.getDatum() + "\n");
        text = text.concat("Vreme: " + autobuskaLinija.getVreme() + "\n");
        if (brojKarata == 1) {
            text = text.concat("Mesto: " + mesta + "\n");
        } else {
            text = text.concat("Mesta: " + mesta + "\n");
        }
        text = text.concat("Cena: " + cena + "*" + brojKarata + "=" + (cena * brojKarata) + "din." + "\n");

        racunTextArea.setText(text);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLabela = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        racunTextArea = new javax.swing.JTextArea();
        stampajRacunLabela = new javax.swing.JLabel();

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

        racunTextArea.setColumns(20);
        racunTextArea.setRows(5);
        jScrollPane1.setViewportView(racunTextArea);

        stampajRacunLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racun1.png"))); // NOI18N
        stampajRacunLabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stampajRacunLabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stampajRacunLabelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stampajRacunLabelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stampajRacunLabelaMouseExited(evt);
            }
        });

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
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stampajRacunLabela)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stampajRacunLabela)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backLabela)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
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

    private void backLabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseClicked

        IzdavanjeKarataForma izdavanjeKarataForma = new IzdavanjeKarataForma(vlasnikForme);
        izdavanjeKarataForma.setLocation(instanca.getLocation());
        izdavanjeKarataForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_backLabelaMouseClicked

    private void backLabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseEntered

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png")));

    }//GEN-LAST:event_backLabelaMouseEntered

    private void backLabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseExited

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png")));

    }//GEN-LAST:event_backLabelaMouseExited

    private void stampajRacunLabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stampajRacunLabelaMouseEntered

        stampajRacunLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racun2.png")));

    }//GEN-LAST:event_stampajRacunLabelaMouseEntered

    private void stampajRacunLabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stampajRacunLabelaMouseExited

        stampajRacunLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racun1.png")));

    }//GEN-LAST:event_stampajRacunLabelaMouseExited

    private void stampajRacunLabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stampajRacunLabelaMouseClicked

        PrinterJob printerJob = PrinterJob.getPrinterJob();

        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            } catch (PrinterException exc) {
                System.out.println(exc);
            }
        }

    }//GEN-LAST:event_stampajRacunLabelaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RacunForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RacunForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RacunForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RacunForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RacunForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea racunTextArea;
    private javax.swing.JLabel stampajRacunLabela;
    // End of variables declaration//GEN-END:variables
}
