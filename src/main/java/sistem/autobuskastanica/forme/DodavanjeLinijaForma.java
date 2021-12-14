package sistem.autobuskastanica.forme;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeIncrement;
import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import sistem.autobuskastanica.backendklase.AutobuskaLinija;
import sistem.autobuskastanica.backendklase.FajlMenadzer;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.Metode;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class DodavanjeLinijaForma extends javax.swing.JFrame {

    private DodavanjeLinijaForma instanca;
    private Zaposlen vlasnikForme;

    public DodavanjeLinijaForma() {

        UcitaniPodaci.ucitajSvePodatke();

        instanca = this;

        initComponents();

        ucitavanjeComboBoxeva();
        namestanjeDateTimePickera();
        pocetneAnimacije();

    }

    public DodavanjeLinijaForma(Zaposlen vlasnikForme) {

        UcitaniPodaci.ucitajSvePodatke();

        instanca = this;
        vlasnikForme = vlasnikForme;

        initComponents();

        ucitavanjeComboBoxeva();
        namestanjeDateTimePickera();
        pocetneAnimacije();

    }

    private void ucitavanjeComboBoxeva() {

        /*        
        Ovako bih uradio ovaj deo ali zbog nekog razloga DefaultComboBoxModel.addAll() izbacuje gresku kada mu se da lista.
        Program svakako radi ali outputuje warning prilikom prvog builda.
        Da bi bilo sto manje upozorenja tokom buildovanja, uradio sam ovaj duzi i gori nacin.
        
        DefaultComboBoxModel defaultComboBoxModel;

        defaultComboBoxModel = new DefaultComboBoxModel();
        defaultComboBoxModel.addAll(AutobuskaLinija.dozvoljeniGradovi);
        gradPolazkaComboBox.setModel(defaultComboBoxModel);

        defaultComboBoxModel = new DefaultComboBoxModel();
        defaultComboBoxModel.addAll(AutobuskaLinija.dozvoljeniGradovi);
        gradDolazkaComboBox.setModel(defaultComboBoxModel);
         */
        String[] nizDozvoljenihGradova = new String[AutobuskaLinija.dozvoljeniGradovi.size()];
        for (int i = 0; i < AutobuskaLinija.dozvoljeniGradovi.size(); i++) {
            nizDozvoljenihGradova[i] = AutobuskaLinija.dozvoljeniGradovi.get(i);
        }

        gradPolazkaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(nizDozvoljenihGradova));
        gradDolazkaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(nizDozvoljenihGradova));

    }

    private void namestanjeDateTimePickera() {

        DatePickerSettings datePickerSettings = datumIVremeDateTImePicker.getDatePicker().getSettings();
        datePickerSettings.setAllowEmptyDates(false);

        TimePickerSettings timePickerSettings = datumIVremeDateTImePicker.getTimePicker().getSettings();
        timePickerSettings.setAllowEmptyTimes(false);
        timePickerSettings.use24HourClockFormat();
        timePickerSettings.generatePotentialMenuTimes(TimeIncrement.FifteenMinutes, null, null);

        datumIVremeDateTImePicker.getTimePicker().setTime(LocalTime.MIN);

    }

    private void pocetneAnimacije() {

        int brzinaAnimacija = 50;
        int prvoZakasnjenje = 250;
        String gradPolazkaLabelaText = "Grad Polazka";
        String gradDolazkaLabelaText = "Grad Dolazka";
        String datumIVremeLabela1Text = "Datum i Vreme";
        String sedistaLabelaText = "Sedista";
        String cenaLabelaText = "Cena";
        gradPolazkaLabela1.setText("");
        gradDolazkaLabela1.setText("");
        datumIVremeLabela1.setText("");
        sedistaLabela1.setText("");
        cenaLabela1.setText("");
        LabelAnimacija.pokreni(gradPolazkaLabela1, gradPolazkaLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(gradDolazkaLabela1, gradDolazkaLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(datumIVremeLabela1, datumIVremeLabela1Text, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(sedistaLabela1, sedistaLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);
        LabelAnimacija.pokreni(cenaLabela1, cenaLabelaText, brzinaAnimacija, 0, prvoZakasnjenje);

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
        datumIVremeLabela1 = new javax.swing.JLabel();
        datumIVremeDateTImePicker = new com.github.lgooddatepicker.components.DateTimePicker();
        sedistaLabela1 = new javax.swing.JLabel();
        sedistaTextField = new javax.swing.JTextField();
        cenaLabela1 = new javax.swing.JLabel();
        cenaTextField = new javax.swing.JTextField();
        sedistaICenaLabela1 = new javax.swing.JLabel();
        dodajButton = new javax.swing.JButton();
        obrisiButton = new javax.swing.JButton();
        unosenjeUspeloLabela = new javax.swing.JLabel();
        dodajRandomButton = new javax.swing.JButton();

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

        gradPolazkaLabela1.setText("Grad Polazka");
        gradPolazkaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        gradPolazkaLabela1.setForeground(new java.awt.Color(114, 137, 218));

        gradPolazkaComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        gradPolazkaLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        gradPolazkaLabela2.setForeground(new java.awt.Color(255, 51, 51));

        gradDolazkaLabela1.setText("Grad Dolazka");
        gradDolazkaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        gradDolazkaLabela1.setForeground(new java.awt.Color(114, 137, 218));

        gradDolazkaComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        gradDolazkaLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        gradDolazkaLabela2.setForeground(new java.awt.Color(255, 51, 51));

        datumIVremeLabela1.setText("Datum i vreme");
        datumIVremeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        datumIVremeLabela1.setForeground(new java.awt.Color(114, 137, 218));

        sedistaLabela1.setText("Sedista");
        sedistaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sedistaLabela1.setForeground(new java.awt.Color(114, 137, 218));

        cenaLabela1.setText("Cena");
        cenaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cenaLabela1.setForeground(new java.awt.Color(114, 137, 218));

        sedistaICenaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sedistaICenaLabela1.setForeground(new java.awt.Color(255, 51, 51));

        dodajButton.setText("Dodaj");
        dodajButton.setBackground(new java.awt.Color(114, 137, 218));
        dodajButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dodajButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajButtonMouseClicked(evt);
            }
        });

        obrisiButton.setText("Obrisi");
        obrisiButton.setBackground(new java.awt.Color(114, 137, 218));
        obrisiButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        obrisiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obrisiButtonMouseClicked(evt);
            }
        });

        unosenjeUspeloLabela.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        unosenjeUspeloLabela.setForeground(new java.awt.Color(0, 153, 51));

        dodajRandomButton.setText("+");
        dodajRandomButton.setBackground(new java.awt.Color(44, 44, 44));
        dodajRandomButton.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        dodajRandomButton.setForeground(new java.awt.Color(255, 255, 255));
        dodajRandomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dodajRandomButtonMouseClicked(evt);
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
                        .addGap(350, 350, 350)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(datumIVremeDateTImePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gradDolazkaLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gradDolazkaComboBox, 0, 300, Short.MAX_VALUE)
                                    .addComponent(gradPolazkaLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gradPolazkaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datumIVremeLabela1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(obrisiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradPolazkaLabela2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(gradDolazkaLabela2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(sedistaTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sedistaLabela1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cenaLabela1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sedistaICenaLabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(unosenjeUspeloLabela))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dodajRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(datumIVremeLabela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datumIVremeDateTImePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sedistaLabela1)
                    .addComponent(cenaLabela1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sedistaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sedistaICenaLabela1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obrisiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(unosenjeUspeloLabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(dodajRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void backLabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseExited

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png")));

    }//GEN-LAST:event_backLabelaMouseExited

    private void backLabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseEntered

        backLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png")));

    }//GEN-LAST:event_backLabelaMouseEntered

    private void backLabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelaMouseClicked

        RadnikForma radnikForma = new RadnikForma(vlasnikForme);
        radnikForma.setLocation(instanca.getLocation());
        radnikForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_backLabelaMouseClicked

    private void dodajButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajButtonMouseClicked

        String gradPolazka;
        String gradDolazka;
        String datum;
        String vreme;
        int sedista;
        int cena;

        String neispravnoPoljeText = "Polje nije validno";

        //Provera grada polazka
        gradPolazka = (String) gradPolazkaComboBox.getSelectedItem();
        if (gradPolazka == null) {

            //Animacija u slucaju da grad polazka nije validan
            //gradPolazkaLabela2 animacija 1
            int gradPolazkaLabela2BrzinaAnimacije1 = 10;
            int gradPolazkaLabela2ZakasnjenjeAnimacije1 = 0;
            int gradPolazkaLabela2CeloTrajanjeAnimacije1 = gradPolazkaLabela2BrzinaAnimacije1 * neispravnoPoljeText.length() + gradPolazkaLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(gradPolazkaLabela2, neispravnoPoljeText, gradPolazkaLabela2BrzinaAnimacije1, 0, gradPolazkaLabela2ZakasnjenjeAnimacije1);

            //gradPolazkaLabela2 animacija 2
            int gradPolazkaLabela2BrzinaAnimacije2 = 10;
            int gradPolazkaLabela2ZakasnjenjeAnimacije2 = gradPolazkaLabela2CeloTrajanjeAnimacije1 + 3000;
            int gradPolazkaLabela2CeloTrajanjeAnimacije2 = gradPolazkaLabela2BrzinaAnimacije2 * neispravnoPoljeText.length() + gradPolazkaLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(gradPolazkaLabela2, neispravnoPoljeText, gradPolazkaLabela2BrzinaAnimacije2, 1, gradPolazkaLabela2ZakasnjenjeAnimacije2);

            return;

        }

        //Provera grada dolazka
        gradDolazka = (String) gradDolazkaComboBox.getSelectedItem();
        if (gradDolazka == null || gradDolazka.equals(gradPolazka)) {

            if (gradDolazka != null && gradDolazka.equals(gradPolazka)) {
                neispravnoPoljeText = "Gradovi dolazka i polazka ne mogu biti isti";
            }

            //Animacija u slucaju da grad dolazka nije validan
            //gradDolazkaLabela2 animacija 1
            int gradDolazkaLabela2BrzinaAnimacije1 = 10;
            int gradDolazkaLabela2ZakasnjenjeAnimacije1 = 0;
            int gradDolazkaLabela2CeloTrajanjeAnimacije1 = gradDolazkaLabela2BrzinaAnimacije1 * neispravnoPoljeText.length() + gradDolazkaLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(gradDolazkaLabela2, neispravnoPoljeText, gradDolazkaLabela2BrzinaAnimacije1, 0, gradDolazkaLabela2ZakasnjenjeAnimacije1);

            //gradDolazkaLabela2 animacija 2
            int gradDolazkaLabela2BrzinaAnimacije2 = 10;
            int gradDolazkaLabela2ZakasnjenjeAnimacije2 = gradDolazkaLabela2CeloTrajanjeAnimacije1 + 3000;
            int gradDolazkaLabela2CeloTrajanjeAnimacije2 = gradDolazkaLabela2BrzinaAnimacije2 * neispravnoPoljeText.length() + gradDolazkaLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(gradDolazkaLabela2, neispravnoPoljeText, gradDolazkaLabela2BrzinaAnimacije2, 1, gradDolazkaLabela2ZakasnjenjeAnimacije2);

            return;

        }

        //Provera datuma
        datum = Metode.getDatumStringDDMMGGGGIzLocalDate(datumIVremeDateTImePicker.getDatePicker().getDate());
        //Datum ne moze da se unese pogresno

        //Provera vremena
        vreme = Metode.getVremeStringSSMMIzLocalTime(datumIVremeDateTImePicker.getTimePicker().getTime());
        //Vreme ne moze da se unese pogresno

        //Provera sedista
        try {
            sedista = Integer.parseInt(sedistaTextField.getText());
        } catch (Throwable throwable) {

            neispravnoPoljeText = "\"Sedista\" polje nije validno";

            //Animacija u slucaju da sedista nisu validna
            //sedistaICenaLabela1 animacija 1
            int sedistaICenaLabela1BrzinaAnimacije1 = 10;
            int sedistaICenaLabela1ZakasnjenjeAnimacije1 = 0;
            int sedistaICenaLabela1CeloTrajanjeAnimacije1 = sedistaICenaLabela1BrzinaAnimacije1 * neispravnoPoljeText.length() + sedistaICenaLabela1ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(sedistaICenaLabela1, neispravnoPoljeText, sedistaICenaLabela1BrzinaAnimacije1, 0, sedistaICenaLabela1ZakasnjenjeAnimacije1);

            //sedistaICenaLabela1 animacija 2
            int sedistaICenaLabela1BrzinaAnimacije2 = 10;
            int sedistaICenaLabela1ZakasnjenjeAnimacije2 = sedistaICenaLabela1CeloTrajanjeAnimacije1 + 3000;
            int sedistaICenaLabela1CeloTrajanjeAnimacije2 = sedistaICenaLabela1BrzinaAnimacije2 * neispravnoPoljeText.length() + sedistaICenaLabela1ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(sedistaICenaLabela1, neispravnoPoljeText, sedistaICenaLabela1BrzinaAnimacije2, 1, sedistaICenaLabela1ZakasnjenjeAnimacije2);

            return;

        }

        //Provera cene
        try {
            cena = Integer.parseInt(cenaTextField.getText());
        } catch (Throwable throwable) {

            neispravnoPoljeText = "\"Cena\" polje nije validno";

            //Animacija u slucaju da cena nije validna
            //sedistaICenaLabela1 animacija 1
            int sedistaICenaLabela1BrzinaAnimacije1 = 10;
            int sedistaICenaLabela1ZakasnjenjeAnimacije1 = 0;
            int sedistaICenaLabela1CeloTrajanjeAnimacije1 = sedistaICenaLabela1BrzinaAnimacije1 * neispravnoPoljeText.length() + sedistaICenaLabela1ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(sedistaICenaLabela1, neispravnoPoljeText, sedistaICenaLabela1BrzinaAnimacije1, 0, sedistaICenaLabela1ZakasnjenjeAnimacije1);

            //sedistaICenaLabela1 animacija 2
            int sedistaICenaLabela1BrzinaAnimacije2 = 10;
            int sedistaICenaLabela1ZakasnjenjeAnimacije2 = sedistaICenaLabela1CeloTrajanjeAnimacije1 + 3000;
            int sedistaICenaLabela1CeloTrajanjeAnimacije2 = sedistaICenaLabela1BrzinaAnimacije2 * neispravnoPoljeText.length() + sedistaICenaLabela1ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(sedistaICenaLabela1, neispravnoPoljeText, sedistaICenaLabela1BrzinaAnimacije2, 1, sedistaICenaLabela1ZakasnjenjeAnimacije2);

            return;

        }

        AutobuskaLinija autobuskaLinija = new AutobuskaLinija(gradPolazka, gradDolazka, datum, vreme, sedista, cena);
        FajlMenadzer.pisiFajl(AutobuskaLinija.imeFajla, autobuskaLinija.uString());
        UcitaniPodaci.ucitajAutobuskeLinije();

        String uspesnoUnosenjeText = "Unošenje linije je uspelo!";
        //Animacija za uspesno unosenje
        //unosenjeUspeloLabela animacija 1
        int unosenjeUspeloLabelaBrzinaAnimacije1 = 10;
        int unosenjeUspeloLabelaZakasnjenjeAnimacije1 = 0;
        int unosenjeUspeloLabelaCeloTrajanjeAnimacije1 = unosenjeUspeloLabelaBrzinaAnimacije1 * uspesnoUnosenjeText.length() + unosenjeUspeloLabelaZakasnjenjeAnimacije1;
        LabelAnimacija.pokreni(unosenjeUspeloLabela, uspesnoUnosenjeText, unosenjeUspeloLabelaBrzinaAnimacije1, 0, unosenjeUspeloLabelaZakasnjenjeAnimacije1);

        //unosenjeUspeloLabela animacija 2
        int unosenjeUspeloLabelaBrzinaAnimacije2 = 10;
        int unosenjeUspeloLabelaZakasnjenjeAnimacije2 = unosenjeUspeloLabelaCeloTrajanjeAnimacije1 + 3000;
        int unosenjeUspeloLabelaCeloTrajanjeAnimacije2 = unosenjeUspeloLabelaBrzinaAnimacije2 * uspesnoUnosenjeText.length() + unosenjeUspeloLabelaZakasnjenjeAnimacije2;
        LabelAnimacija.pokreni(unosenjeUspeloLabela, uspesnoUnosenjeText, unosenjeUspeloLabelaBrzinaAnimacije2, 1, unosenjeUspeloLabelaZakasnjenjeAnimacije2);

    }//GEN-LAST:event_dodajButtonMouseClicked

    private void obrisiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obrisiButtonMouseClicked

        gradPolazkaComboBox.setSelectedIndex(0);
        gradDolazkaComboBox.setSelectedIndex(0);
        datumIVremeDateTImePicker.getDatePicker().setDateToToday();
        datumIVremeDateTImePicker.getTimePicker().setTime(LocalTime.MIN);
        sedistaTextField.setText("");
        cenaTextField.setText("");

    }//GEN-LAST:event_obrisiButtonMouseClicked

    private void dodajRandomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dodajRandomButtonMouseClicked

        if (JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da dodate 1000 random linija?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            long pocetakVreme = System.currentTimeMillis();

            for (int i = 0; i < 1000; i++) {

                String randomGradPolazka = Metode.getRandomGradAutobuskeLinije();

                String randomGradDolazka;
                while (true) {
                    randomGradDolazka = Metode.getRandomGradAutobuskeLinije();
                    if (!randomGradDolazka.equals(randomGradPolazka)) {
                        break;
                    }
                }

                String randomDatum = Metode.getRandomDatumString(10, 365);

                String randomVreme;
                while (true) {
                    randomVreme = Metode.getRandomVremeString();
                    if (Integer.valueOf(randomVreme.substring(randomVreme.indexOf(":") + 1)) % 15 == 0) {
                        break;
                    }
                }

                int randomBrojSedista = ThreadLocalRandom.current().nextInt(0, 100);
                int randomCena = ThreadLocalRandom.current().nextInt(200, 2000);

                AutobuskaLinija autobuskaLinija = new AutobuskaLinija(randomGradPolazka, randomGradDolazka, randomDatum, randomVreme, randomBrojSedista, randomCena);
                FajlMenadzer.pisiFajl(AutobuskaLinija.imeFajla, autobuskaLinija.uString());

            }

            UcitaniPodaci.ucitajAutobuskeLinije();

            long zavrsetakVreme = System.currentTimeMillis();

            JOptionPane.showMessageDialog(this, "Uspešno dodato 1000 linija!\nBilo je potrebno " + (zavrsetakVreme - pocetakVreme) + "ms.");

        }

    }//GEN-LAST:event_dodajRandomButtonMouseClicked

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
    private com.github.lgooddatepicker.components.DateTimePicker datumIVremeDateTImePicker;
    private javax.swing.JLabel datumIVremeLabela1;
    private javax.swing.JButton dodajButton;
    private javax.swing.JButton dodajRandomButton;
    private javax.swing.JComboBox<String> gradDolazkaComboBox;
    private javax.swing.JLabel gradDolazkaLabela1;
    private javax.swing.JLabel gradDolazkaLabela2;
    private javax.swing.JComboBox<String> gradPolazkaComboBox;
    private javax.swing.JLabel gradPolazkaLabela1;
    private javax.swing.JLabel gradPolazkaLabela2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton obrisiButton;
    private javax.swing.JLabel sedistaICenaLabela1;
    private javax.swing.JLabel sedistaLabela1;
    private javax.swing.JTextField sedistaTextField;
    private javax.swing.JLabel unosenjeUspeloLabela;
    // End of variables declaration//GEN-END:variables
}
