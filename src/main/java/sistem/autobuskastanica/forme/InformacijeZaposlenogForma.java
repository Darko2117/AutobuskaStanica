package sistem.autobuskastanica.forme;

import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.Metode;
import sistem.autobuskastanica.backendklase.StatusZaposlenog;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class InformacijeZaposlenogForma extends javax.swing.JFrame {

    private final InformacijeZaposlenogForma instanca = this;
    private Zaposlen vlasnikForme, oKomeJeForma;

    public InformacijeZaposlenogForma() {

        UcitaniPodaci.ucitajSvePodatke();

        initComponents();

        ucitajTabelu();
        pocetneAnimacije();

    }

    public InformacijeZaposlenogForma(Zaposlen vlasnikForme, Zaposlen oKomeJeForma) {

        UcitaniPodaci.ucitajSvePodatke();

        this.vlasnikForme = vlasnikForme;
        this.oKomeJeForma = oKomeJeForma;

        initComponents();

        ucitajTabelu();
        pocetneAnimacije();

    }

    private void ucitajTabelu() {

        if (oKomeJeForma == null) {
            return;
        }

        UcitaniPodaci.ucitajKorisnike();
        UcitaniPodaci.ucitajZaposlene();
        UcitaniPodaci.ucitajStatuse();
        UcitaniPodaci.ucitajStatuseZaposlenih();

        DefaultTableModel defaultTableModel = (DefaultTableModel) tabela.getModel();
        defaultTableModel.setRowCount(0);

        for (StatusZaposlenog statusZaposlenog : UcitaniPodaci.getStatusiZaposlenog(oKomeJeForma)) {

            Vector<Object> redPodaci = new Vector<>();
            redPodaci.add(statusZaposlenog.getDatum());
            redPodaci.add(statusZaposlenog.getVreme());
            redPodaci.add(Metode.statusStringIzInta(statusZaposlenog.getIDStatusa()));

            defaultTableModel.addRow(redPodaci);

        }

        //Centriranje teksta u celijama
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tabela.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tabela.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tabela.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

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

        int brzinaAnimacija = 50;
        int prvoZakasnjenje = 250;
        String menadzerLabelaText = "ID: " + oKomeJeForma.getID() + " " + oKomeJeForma.getIme() + " " + oKomeJeForma.getPrezime();
        menadzerLabela.setText("");
        LabelAnimacija.pokreni(menadzerLabela, menadzerLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLabela = new javax.swing.JLabel();
        menadzerLabela = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

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

        menadzerLabela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menadzerLabela.setText("ID: 0 Ime Prezime");
        menadzerLabela.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        menadzerLabela.setForeground(new java.awt.Color(114, 137, 218));

        tabela.setBackground(new java.awt.Color(114, 137, 218));
        tabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datum", "Vreme", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setMaximumSize(new java.awt.Dimension(800, 300));
        tabela.setMinimumSize(new java.awt.Dimension(800, 300));
        tabela.setRowHeight(40);
        tabela.setShowGrid(true);
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menadzerLabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabela)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabela)
                .addGap(18, 18, 18)
                .addComponent(menadzerLabela, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
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

    private void backLabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseEntered

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png")));

    }//GEN-LAST:event_backLabelaMouseEntered

    private void backLabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseExited

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png")));

    }//GEN-LAST:event_backLabelaMouseExited

    private void backLabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseClicked

        MenadzerForma menadzerForma = new MenadzerForma(vlasnikForme);
        menadzerForma.setLocation(instanca.getLocation());
        menadzerForma.setVisible(true);
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
            java.util.logging.Logger.getLogger(InformacijeZaposlenogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacijeZaposlenogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacijeZaposlenogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacijeZaposlenogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacijeZaposlenogForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menadzerLabela;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
