package sistem.autobuskastanica.forme;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import sistem.autobuskastanica.backendklase.AutobuskaLinija;
import sistem.autobuskastanica.backendklase.FajlMenadzer;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.Metode;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class IzdavanjeKarataForma extends javax.swing.JFrame {

    private final IzdavanjeKarataForma instanca = this;
    private Zaposlen vlasnikForme;
    private String poslednjaVrednostPretragaTextFielda = "";

    public IzdavanjeKarataForma() {

        UcitaniPodaci.ucitajSvePodatke();

        initComponents();

        ucitajTabelu();
        pocniUpdateovanjeTabele();
        namestiButtonGroup();
        pocetneAnimacije();

    }

    public IzdavanjeKarataForma(Zaposlen vlasnikForme) {

        UcitaniPodaci.ucitajSvePodatke();

        this.vlasnikForme = vlasnikForme;

        initComponents();

        ucitajTabelu();
        pocniUpdateovanjeTabele();
        namestiButtonGroup();
        pocetneAnimacije();

    }

    private void ucitajTabelu() {

        UcitaniPodaci.ucitajAutobuskeLinije();

        DefaultTableModel defaultTableModel = (DefaultTableModel) tabela.getModel();
        defaultTableModel.setRowCount(0);

        for (AutobuskaLinija autobuskaLinija : UcitaniPodaci.getAutobuskeLinije()) {

            if (!autobuskaLinija.uString().toLowerCase().contains(poslednjaVrednostPretragaTextFielda.toLowerCase())) {
                continue;
            }

            if (LocalDate.now().isAfter(Metode.getLocalDateIzDDMMGGGGStringa(autobuskaLinija.getDatum()))) {
                continue;
            }

            if (LocalDate.now().equals(Metode.getLocalDateIzDDMMGGGGStringa(autobuskaLinija.getDatum())) && LocalTime.now().isAfter(Metode.getLocalTimeIzSSMMStringa(autobuskaLinija.getVreme()))) {
                continue;
            }

            Vector<Object> redPodaci = new Vector<>();
            redPodaci.add(autobuskaLinija.getMestoPolazka());
            redPodaci.add(autobuskaLinija.getMestoDolazka());
            redPodaci.add(autobuskaLinija.getDatum());
            redPodaci.add(autobuskaLinija.getVreme());
            redPodaci.add(autobuskaLinija.getBrojMesta());
            redPodaci.add(autobuskaLinija.getCena() + "din.");

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

    private void pocniUpdateovanjeTabele() {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                if (!instanca.isShowing()) {
                    return;
                }

                if (!poslednjaVrednostPretragaTextFielda.equals(pretragaTextField.getText())) {
                    poslednjaVrednostPretragaTextFielda = pretragaTextField.getText();
                    ucitajTabelu();
                }

                /*Ovo ce da pravi jako puno razlicitih taskova ali nema veze jer ce javin garbage collector sve da ih obrise nakon nekog vremena*/
                pocniUpdateovanjeTabele();

            }
        };
        timer.schedule(task, 100);

    }

    private void namestiButtonGroup() {

        vrstaKarteButtonGroup.add(odrasliRadioButton);
        vrstaKarteButtonGroup.add(penzioneriRadioButton);
        vrstaKarteButtonGroup.add(decaRadioButton);

        odrasliRadioButton.setSelected(true);

    }

    private void pocetneAnimacije() {

        String brojKarataLabelaText = "Broj karata";
        String vrstaKarteLabelaText = "Vrsta karte";
        brojKarataLabela.setText("");
        vrstaKarteLabela.setText("");
        LabelAnimacija.pokreni(brojKarataLabela, brojKarataLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(vrstaKarteLabela, vrstaKarteLabelaText, 100, 0, 250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vrstaKarteButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        backLabela = new javax.swing.JLabel();
        pretragaTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        brojKarataLabela = new javax.swing.JLabel();
        brojKarataSpinner = new javax.swing.JSpinner();
        vrstaKarteLabela = new javax.swing.JLabel();
        odrasliRadioButton = new javax.swing.JRadioButton();
        penzioneriRadioButton = new javax.swing.JRadioButton();
        decaRadioButton = new javax.swing.JRadioButton();
        gotovoButton = new javax.swing.JButton();
        greskaLabela = new javax.swing.JLabel();

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

        pretragaTextField.setBackground(new java.awt.Color(114, 137, 218));

        tabela.setBackground(new java.awt.Color(114, 137, 218));
        tabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MestoPolazka", "MestoDolazka", "Datum", "Vreme", "Mesta", "Cena"
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
        jScrollPane1.setViewportView(tabela);

        brojKarataLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        brojKarataLabela.setForeground(new java.awt.Color(114, 137, 218));
        brojKarataLabela.setText("Broj karata");

        brojKarataSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 90, 1));

        vrstaKarteLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        vrstaKarteLabela.setForeground(new java.awt.Color(114, 137, 218));
        vrstaKarteLabela.setText("Vrsta karte");

        odrasliRadioButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        odrasliRadioButton.setForeground(new java.awt.Color(114, 137, 218));
        odrasliRadioButton.setText("Odrasli");

        penzioneriRadioButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        penzioneriRadioButton.setForeground(new java.awt.Color(114, 137, 218));
        penzioneriRadioButton.setText("Penzioneri (-25%)");

        decaRadioButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        decaRadioButton.setForeground(new java.awt.Color(114, 137, 218));
        decaRadioButton.setText("Deca (-40%)");

        gotovoButton.setBackground(new java.awt.Color(114, 137, 218));
        gotovoButton.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        gotovoButton.setText("Gotovo");
        gotovoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotovoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotovoButtonMouseClicked(evt);
            }
        });

        greskaLabela.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        greskaLabela.setForeground(new java.awt.Color(255, 51, 51));

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(brojKarataSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brojKarataLabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vrstaKarteLabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(odrasliRadioButton)
                                    .addComponent(penzioneriRadioButton)
                                    .addComponent(decaRadioButton)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pretragaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gotovoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(greskaLabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(greskaLabela))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backLabela)
                        .addGap(50, 50, 50)
                        .addComponent(pretragaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(brojKarataLabela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brojKarataSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vrstaKarteLabela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(odrasliRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(penzioneriRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decaRadioButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(gotovoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
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

    private void gotovoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotovoButtonMouseClicked

        if (tabela.getSelectedRow() == -1) {

            String nijeSelektovanoLabelaText = "Nije selektovano ni jedno polje u tabeli";

            //Animacija u slucaju da nije selektovan red u tabeli
            //nijeSelektovanoLabela animacija 1
            int nijeSelektovanoLabelaBrzinaAnimacije1 = 10;
            int nijeSelektovanoLabelaZakasnjenjeAnimacije1 = 0;
            int nijeSelektovanoLabelaCeloTrajanjeAnimacije1 = nijeSelektovanoLabelaBrzinaAnimacije1 * nijeSelektovanoLabelaText.length() + nijeSelektovanoLabelaZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(greskaLabela, nijeSelektovanoLabelaText, nijeSelektovanoLabelaBrzinaAnimacije1, 0, nijeSelektovanoLabelaZakasnjenjeAnimacije1);

            //nijeSelektovanoLabela animacija 2
            int nijeSelektovanoLabelaBrzinaAnimacije2 = 10;
            int nijeSelektovanoLabelaZakasnjenjeAnimacije2 = nijeSelektovanoLabelaCeloTrajanjeAnimacije1 + 3000;
            int nijeSelektovanoLabelaCeloTrajanjeAnimacije2 = nijeSelektovanoLabelaBrzinaAnimacije2 * nijeSelektovanoLabelaText.length() + nijeSelektovanoLabelaZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(greskaLabela, nijeSelektovanoLabelaText, nijeSelektovanoLabelaBrzinaAnimacije2, 1, nijeSelektovanoLabelaZakasnjenjeAnimacije2);

            return;

        }

        if (Integer.valueOf(String.valueOf(tabela.getValueAt(tabela.getSelectedRow(), 4))) < (int) brojKarataSpinner.getValue()) {

            String nijeSelektovanoLabelaText = "Na toj liniji nema dovoljno mesta";

            //Animacija u slucaju da na selektovanoj liniji nema dovoljno mesta
            //nijeSelektovanoLabela animacija 1
            int nijeSelektovanoLabelaBrzinaAnimacije1 = 10;
            int nijeSelektovanoLabelaZakasnjenjeAnimacije1 = 0;
            int nijeSelektovanoLabelaCeloTrajanjeAnimacije1 = nijeSelektovanoLabelaBrzinaAnimacije1 * nijeSelektovanoLabelaText.length() + nijeSelektovanoLabelaZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(greskaLabela, nijeSelektovanoLabelaText, nijeSelektovanoLabelaBrzinaAnimacije1, 0, nijeSelektovanoLabelaZakasnjenjeAnimacije1);

            //nijeSelektovanoLabela animacija 2
            int nijeSelektovanoLabelaBrzinaAnimacije2 = 10;
            int nijeSelektovanoLabelaZakasnjenjeAnimacije2 = nijeSelektovanoLabelaCeloTrajanjeAnimacije1 + 3000;
            int nijeSelektovanoLabelaCeloTrajanjeAnimacije2 = nijeSelektovanoLabelaBrzinaAnimacije2 * nijeSelektovanoLabelaText.length() + nijeSelektovanoLabelaZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(greskaLabela, nijeSelektovanoLabelaText, nijeSelektovanoLabelaBrzinaAnimacije2, 1, nijeSelektovanoLabelaZakasnjenjeAnimacije2);

            return;

        }

        String mestoPolazka = String.valueOf(tabela.getValueAt(tabela.getSelectedRow(), 0));
        String mestoDolazka = String.valueOf(tabela.getValueAt(tabela.getSelectedRow(), 1));
        String datum = String.valueOf(tabela.getValueAt(tabela.getSelectedRow(), 2));
        String vreme = String.valueOf(tabela.getValueAt(tabela.getSelectedRow(), 3));
        int mesta = Integer.valueOf(String.valueOf(tabela.getValueAt(tabela.getSelectedRow(), 4)));
        String cenaString = String.valueOf(tabela.getValueAt(tabela.getSelectedRow(), 5));
        cenaString = cenaString.substring(0, cenaString.indexOf("din."));
        int cena = Integer.valueOf(cenaString);

        int brojKarata = (int) brojKarataSpinner.getValue();
        String vrstaKarte = "";
        if (odrasliRadioButton.isSelected()) {
            vrstaKarte = "Odrasli";
        } else if (penzioneriRadioButton.isSelected()) {
            vrstaKarte = "Penzioneri";
        } else if (decaRadioButton.isSelected()) {
            vrstaKarte = "Deca";
        }

        mesta -= brojKarata;

        AutobuskaLinija autobuskaLinija = new AutobuskaLinija(mestoPolazka, mestoDolazka, datum, vreme, mesta, cena);

        FajlMenadzer.updateBrojMestaAutobuskeLinije(autobuskaLinija);
        UcitaniPodaci.ucitajAutobuskeLinije();

        RacunForma racunForma = new RacunForma(vlasnikForme, autobuskaLinija, brojKarata, vrstaKarte);
        racunForma.setLocation(instanca.getLocation());
        racunForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_gotovoButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IzdavanjeKarataForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IzdavanjeKarataForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IzdavanjeKarataForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IzdavanjeKarataForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IzdavanjeKarataForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabela;
    private javax.swing.JLabel brojKarataLabela;
    private javax.swing.JSpinner brojKarataSpinner;
    private javax.swing.JRadioButton decaRadioButton;
    private javax.swing.JButton gotovoButton;
    private javax.swing.JLabel greskaLabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton odrasliRadioButton;
    private javax.swing.JRadioButton penzioneriRadioButton;
    private javax.swing.JTextField pretragaTextField;
    private javax.swing.JTable tabela;
    private javax.swing.ButtonGroup vrstaKarteButtonGroup;
    private javax.swing.JLabel vrstaKarteLabela;
    // End of variables declaration//GEN-END:variables
}
