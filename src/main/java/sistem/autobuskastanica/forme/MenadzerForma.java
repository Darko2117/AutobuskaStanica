package sistem.autobuskastanica.forme;

import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import sistem.autobuskastanica.backendklase.FajlMenadzer;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.Metode;
import sistem.autobuskastanica.backendklase.StatusZaposlenog;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class MenadzerForma extends javax.swing.JFrame {

    private final MenadzerForma instanca = this;
    private Zaposlen vlasnikForme;

    private int selektovanRed = -1;
    private Zaposlen selektovanZaposlen;

    public MenadzerForma() {

        UcitaniPodaci.ucitajSvePodatke();

        initComponents();

        ucitajTabelu();

        unaprediButton.setEnabled(false);
        dajOtkazButton.setEnabled(false);

        pocetneAnimacije();

    }

    public MenadzerForma(Zaposlen vlasnikForme) {

        UcitaniPodaci.ucitajSvePodatke();

        initComponents();

        this.vlasnikForme = vlasnikForme;

        ucitajTabelu();

        unaprediButton.setEnabled(false);
        dajOtkazButton.setEnabled(false);

        pocetneAnimacije();

    }

    private void ucitajTabelu() {

        DefaultTableModel defaultTableModel = (DefaultTableModel) tabela.getModel();
        defaultTableModel.setRowCount(0);

        for (Zaposlen zaposlen : UcitaniPodaci.getZaposleni()) {

            Vector<Object> redPodaci = new Vector<>();
            redPodaci.add(zaposlen.getID());
            redPodaci.add(zaposlen.getIme());
            redPodaci.add(zaposlen.getPrezime());
            redPodaci.add(zaposlen.getDatumZasnivanjaRadnogOdnosa());
            redPodaci.add(zaposlen.getDatumPrestankaRadnogOdnosa());
            redPodaci.add(Metode.statusStringIzInta(zaposlen.getStatus()));

            defaultTableModel.addRow(redPodaci);

        }

        //Centriranje teksta u celijama
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tabela.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tabela.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tabela.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tabela.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tabela.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tabela.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);

        //Centriranje teksta u headeru tabele
        TableCellRenderer rendererFromHeader = tabela.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

        tabela.setModel(defaultTableModel);

    }

    private void pocetneAnimacije() {

        if (vlasnikForme == null) {
            return;
        }

        String Labela1Text = "MENADŽER: " + vlasnikForme.getIme() + " " + vlasnikForme.getPrezime();
        menadzerLabela1.setText("");
        LabelAnimacija.pokreni(menadzerLabela1, Labela1Text, 25, 0, 250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLabela = new javax.swing.JLabel();
        menadzerLabela1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        unaprediButton = new javax.swing.JButton();
        dajOtkazButton = new javax.swing.JButton();
        dodajButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTOBUSKA STANICA");
        setBackground(new java.awt.Color(44, 47, 51));
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setForeground(new java.awt.Color(44, 47, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

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

        menadzerLabela1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        menadzerLabela1.setForeground(new java.awt.Color(114, 137, 218));
        menadzerLabela1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menadzerLabela1.setText("MENADŽER");

        tabela.setBackground(new java.awt.Color(114, 137, 218));
        tabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ime", "Prezime", "Datum zapošljavanja", "Datum prestanka radnog odnosa", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setMaximumSize(new java.awt.Dimension(800, 300));
        tabela.setMinimumSize(new java.awt.Dimension(800, 300));
        tabela.setRowHeight(40);
        tabela.setShowGrid(true);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        unaprediButton.setText("UNAPREDI");
        unaprediButton.setBackground(new java.awt.Color(44, 44, 44));
        unaprediButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unaprediButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        unaprediButton.setForeground(new java.awt.Color(153, 255, 153));
        unaprediButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unaprediButtonMouseClicked(evt);
            }
        });

        dajOtkazButton.setText("DAJ OTKAZ");
        dajOtkazButton.setBackground(new java.awt.Color(44, 44, 44));
        dajOtkazButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dajOtkazButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dajOtkazButton.setForeground(new java.awt.Color(255, 51, 51));
        dajOtkazButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dajOtkazButtonMouseClicked(evt);
            }
        });

        dodajButton.setText("+");
        dodajButton.setBackground(new java.awt.Color(44, 44, 44));
        dodajButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dodajButton.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        dodajButton.setForeground(new java.awt.Color(255, 255, 255));
        dodajButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menadzerLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(unaprediButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dajOtkazButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabela)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabela)
                .addGap(18, 18, 18)
                .addComponent(menadzerLabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(unaprediButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dajOtkazButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
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

    private void dodajButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButtonMouseClicked

        UnosenjeForma unosenjeForma = new UnosenjeForma(vlasnikForme);
        unosenjeForma.setLocation(instanca.getLocation());
        unosenjeForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_dodajButtonMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        if (selektovanRed == tabela.getSelectedRow()) {

            InformacijeZaposlenogForma informacijeZaposlenog = new InformacijeZaposlenogForma(UcitaniPodaci.getZaposlenIzIDZaposlenog((int) tabela.getValueAt(selektovanRed, 0)), vlasnikForme);
            informacijeZaposlenog.setLocation(instanca.getLocation());
            informacijeZaposlenog.setVisible(true);
            instanca.dispose();

        }

        selektovanRed = tabela.getSelectedRow();
        selektovanZaposlen = UcitaniPodaci.getZaposlenIzIDZaposlenog((int) tabela.getValueAt(selektovanRed, 0));

        unaprediButton.setEnabled(selektovanZaposlen.getStatus() == 0);
        dajOtkazButton.setEnabled(selektovanZaposlen.getStatus() != 2);

    }//GEN-LAST:event_tabelaMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

        unaprediButton.setEnabled(false);
        dajOtkazButton.setEnabled(false);
        tabela.clearSelection();

    }//GEN-LAST:event_jPanel1MouseClicked

    private void unaprediButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unaprediButtonMouseClicked

        if (!unaprediButton.isEnabled()) {
            return;
        }

        if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da unapredite ovog zaposlenog?\n" + selektovanZaposlen.getIme() + " " + selektovanZaposlen.getPrezime(), "Unapredjenje", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            selektovanZaposlen.setStatus(1);
            FajlMenadzer.updateZaposlenog(selektovanZaposlen);
            UcitaniPodaci.ucitajZaposlene();

            StatusZaposlenog statusZaposlenog = new StatusZaposlenog(selektovanZaposlen.getID(), Metode.getDatumStringDDMMGGGG(), Metode.getVremeString(), 1);
            FajlMenadzer.pisiFajl(StatusZaposlenog.imeFajla, statusZaposlenog.uString());
            UcitaniPodaci.ucitajStatuseZaposlenih();

            ucitajTabelu();

            unaprediButton.setEnabled(false);
            dajOtkazButton.setEnabled(false);
            tabela.clearSelection();
            selektovanZaposlen = null;
            selektovanRed = -1;

        }

    }//GEN-LAST:event_unaprediButtonMouseClicked

    private void dajOtkazButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dajOtkazButtonMouseClicked

        if (!dajOtkazButton.isEnabled()) {
            return;
        }

        if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da date otkaz ovom zaposlenom?\n" + selektovanZaposlen.getIme() + " " + selektovanZaposlen.getPrezime(), "Otkaz", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            selektovanZaposlen.setDatumPrestankaRadnogOdnosa(Metode.getDatumStringDDMMGGGG());
            selektovanZaposlen.setStatus(2);
            FajlMenadzer.updateZaposlenog(selektovanZaposlen);
            UcitaniPodaci.ucitajZaposlene();

            StatusZaposlenog statusZaposlenog = new StatusZaposlenog(selektovanZaposlen.getID(), Metode.getDatumStringDDMMGGGG(), Metode.getVremeString(), 2);
            FajlMenadzer.pisiFajl(StatusZaposlenog.imeFajla, statusZaposlenog.uString());
            UcitaniPodaci.ucitajStatuseZaposlenih();

            ucitajTabelu();

            unaprediButton.setEnabled(false);
            dajOtkazButton.setEnabled(false);
            tabela.clearSelection();
            selektovanZaposlen = null;
            selektovanRed = -1;

        }

    }//GEN-LAST:event_dajOtkazButtonMouseClicked

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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenadzerForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenadzerForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenadzerForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenadzerForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenadzerForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabela;
    private javax.swing.JButton dajOtkazButton;
    private javax.swing.JButton dodajButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menadzerLabela1;
    private javax.swing.JTable tabela;
    private javax.swing.JButton unaprediButton;
    // End of variables declaration//GEN-END:variables
}
