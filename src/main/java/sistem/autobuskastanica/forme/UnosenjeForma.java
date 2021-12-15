package sistem.autobuskastanica.forme;

import java.util.Timer;
import java.util.TimerTask;
import sistem.autobuskastanica.backendklase.FajlMenadzer;
import sistem.autobuskastanica.backendklase.Korisnik;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.Metode;
import sistem.autobuskastanica.backendklase.StatusZaposlenog;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class UnosenjeForma extends javax.swing.JFrame {

    private final UnosenjeForma instanca = this;
    private Zaposlen vlasnikForme;

    //Ovaj konstruktor se koristi samo kada je program u procesu unosenja prvog korisnika
    public UnosenjeForma() {

        UcitaniPodaci.ucitajSvePodatke();

        initComponents();

        pocetneAnimacije();

        backLabela.setVisible(false);
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"MENADZER"}));

    }

    //Ovaj konstruktor se koristi za sve ostale prilike
    public UnosenjeForma(Zaposlen vlasnikForme) {

        UcitaniPodaci.ucitajSvePodatke();

        this.vlasnikForme = vlasnikForme;

        initComponents();

        pocetneAnimacije();

    }

    private void pocetneAnimacije() {

        String imeLabelaText = "Ime";
        String prezimeLabelaText = "Prezime";
        String korisnickoImeLabelaText = "Korisničko Ime";
        String lozinkaLabelaText = "Lozinka";
        String statusLabelaText = "Status";
        imeLabela1.setText("");
        prezimeLabela1.setText("");
        korisnickoImeLabela1.setText("");
        lozinkaLabela1.setText("");
        statusLabela.setText("");
        LabelAnimacija.pokreni(imeLabela1, imeLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(prezimeLabela1, prezimeLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(korisnickoImeLabela1, korisnickoImeLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(lozinkaLabela1, lozinkaLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(statusLabela, statusLabelaText, 100, 0, 250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLabela = new javax.swing.JLabel();
        imeLabela1 = new javax.swing.JLabel();
        imeTextField = new javax.swing.JTextField();
        imeLabela2 = new javax.swing.JLabel();
        prezimeLabela1 = new javax.swing.JLabel();
        prezimeTextField = new javax.swing.JTextField();
        prezimeLabela2 = new javax.swing.JLabel();
        korisnickoImeLabela1 = new javax.swing.JLabel();
        korisnickoImeTextField = new javax.swing.JTextField();
        korisnickoImeLabela2 = new javax.swing.JLabel();
        lozinkaLabela1 = new javax.swing.JLabel();
        lozinkaTextField = new javax.swing.JTextField();
        lozinkaLabela2 = new javax.swing.JLabel();
        statusLabela = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        dodajButton = new javax.swing.JButton();
        ocistiButton = new javax.swing.JButton();
        uspesnoUnosenjeLabela = new javax.swing.JLabel();

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

        imeLabela1.setBackground(new java.awt.Color(114, 137, 218));
        imeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        imeLabela1.setForeground(new java.awt.Color(114, 137, 218));
        imeLabela1.setText("Ime");

        imeTextField.setBackground(new java.awt.Color(114, 137, 218));

        imeLabela2.setBackground(new java.awt.Color(114, 137, 218));
        imeLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        imeLabela2.setForeground(new java.awt.Color(255, 51, 51));

        prezimeLabela1.setBackground(new java.awt.Color(114, 137, 218));
        prezimeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        prezimeLabela1.setForeground(new java.awt.Color(114, 137, 218));
        prezimeLabela1.setText("Prezime");

        prezimeTextField.setBackground(new java.awt.Color(114, 137, 218));

        prezimeLabela2.setBackground(new java.awt.Color(114, 137, 218));
        prezimeLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        prezimeLabela2.setForeground(new java.awt.Color(255, 51, 51));

        korisnickoImeLabela1.setBackground(new java.awt.Color(114, 137, 218));
        korisnickoImeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        korisnickoImeLabela1.setForeground(new java.awt.Color(114, 137, 218));
        korisnickoImeLabela1.setText("Korisničko Ime");

        korisnickoImeTextField.setBackground(new java.awt.Color(114, 137, 218));

        korisnickoImeLabela2.setBackground(new java.awt.Color(114, 137, 218));
        korisnickoImeLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        korisnickoImeLabela2.setForeground(new java.awt.Color(255, 51, 51));

        lozinkaLabela1.setBackground(new java.awt.Color(114, 137, 218));
        lozinkaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lozinkaLabela1.setForeground(new java.awt.Color(114, 137, 218));
        lozinkaLabela1.setText("Lozinka");

        lozinkaTextField.setBackground(new java.awt.Color(114, 137, 218));

        lozinkaLabela2.setBackground(new java.awt.Color(114, 137, 218));
        lozinkaLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lozinkaLabela2.setForeground(new java.awt.Color(255, 51, 51));

        statusLabela.setBackground(new java.awt.Color(114, 137, 218));
        statusLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        statusLabela.setForeground(new java.awt.Color(114, 137, 218));
        statusLabela.setText("Status");

        statusComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RADNIK", "MENADZER" }));

        dodajButton.setBackground(new java.awt.Color(114, 137, 218));
        dodajButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dodajButton.setForeground(new java.awt.Color(44, 47, 51));
        dodajButton.setText("Dodaj");
        dodajButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dodajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajButtonActionPerformed(evt);
            }
        });

        ocistiButton.setBackground(new java.awt.Color(114, 137, 218));
        ocistiButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ocistiButton.setForeground(new java.awt.Color(44, 47, 51));
        ocistiButton.setText("Ocisti");
        ocistiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocistiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocistiButtonActionPerformed(evt);
            }
        });

        uspesnoUnosenjeLabela.setBackground(new java.awt.Color(114, 137, 218));
        uspesnoUnosenjeLabela.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        uspesnoUnosenjeLabela.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uspesnoUnosenjeLabela)
                            .addComponent(lozinkaLabela1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(statusLabela)
                                    .addComponent(lozinkaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(korisnickoImeLabela1)
                                    .addComponent(korisnickoImeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(prezimeLabela1)
                                    .addComponent(prezimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(imeLabela1)
                                    .addComponent(imeTextField)
                                    .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imeLabela2)
                                    .addComponent(prezimeLabela2)
                                    .addComponent(korisnickoImeLabela2)
                                    .addComponent(lozinkaLabela2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(ocistiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabela)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabela)
                .addGap(50, 50, 50)
                .addComponent(imeLabela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imeLabela2))
                .addGap(18, 18, 18)
                .addComponent(prezimeLabela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prezimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prezimeLabela2))
                .addGap(18, 18, 18)
                .addComponent(korisnickoImeLabela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(korisnickoImeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(korisnickoImeLabela2))
                .addGap(18, 18, 18)
                .addComponent(lozinkaLabela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lozinkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lozinkaLabela2))
                .addGap(18, 18, 18)
                .addComponent(statusLabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocistiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uspesnoUnosenjeLabela)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajButtonActionPerformed

        if (!dodajButton.isEnabled()) {
            return;
        }

        //Kopiranje svih vrednosti sa forme u promenljive
        int IDZaposlenog = UcitaniPodaci.getPrviSlobodanIDZaposlenog();
        String ime = imeTextField.getText();
        String prezime = prezimeTextField.getText();
        String korisnickoIme = korisnickoImeTextField.getText();
        String lozinka = lozinkaTextField.getText();
        String datumZasnivanjaRadnogOdnosa = Metode.getDatumStringDDMMGGGG();
        String datumPrestankaRadnogOdnosa = "-";
        String vreme = Metode.getVremeString();
        int status = Metode.statusIntIzStringa((String) statusComboBox.getSelectedItem());

        String neispravnoPoljeText = "Polje nije validno";

        //Provera imena
        if (ime.isBlank() || !Metode.daLiJeStringLegalanZaUpis(ime)) {

            //Animacija u slucaju da je ime neispravno
            //imeLabela2 animacija 1
            int imeLabela2BrzinaAnimacije1 = 10;
            int imeLabela2ZakasnjenjeAnimacije1 = 0;
            int imeLabela2CeloTrajanjeAnimacije1 = imeLabela2BrzinaAnimacije1 * neispravnoPoljeText.length() + imeLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(imeLabela2, neispravnoPoljeText, imeLabela2BrzinaAnimacije1, 0, imeLabela2ZakasnjenjeAnimacije1);

            //imeLabela2 animcaija 2
            int imeLabela2BrzinaAnimacije2 = 10;
            int imeLabela2ZakasnjenjeAnimacije2 = imeLabela2CeloTrajanjeAnimacije1 + 3000;
            int imeLabela2CeloTrajanjeAnimacije2 = imeLabela2BrzinaAnimacije2 * neispravnoPoljeText.length() + imeLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(imeLabela2, neispravnoPoljeText, imeLabela2BrzinaAnimacije2, 1, imeLabela2ZakasnjenjeAnimacije2);

            return;

        }

        //Provera prezimena
        if (prezime.isBlank() || !Metode.daLiJeStringLegalanZaUpis(prezime)) {

            //Animacija u slucaju da je prezime neispravno
            //prezimeLabela2 animacija 1
            int prezimeLabela2BrzinaAnimacije1 = 10;
            int prezimeLabela2ZakasnjenjeAnimacije1 = 0;
            int prezimeLabela2CeloTrajanjeAnimacije1 = prezimeLabela2BrzinaAnimacije1 * neispravnoPoljeText.length() + prezimeLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(prezimeLabela2, neispravnoPoljeText, prezimeLabela2BrzinaAnimacije1, 0, prezimeLabela2ZakasnjenjeAnimacije1);

            //prezimeLabela2 animacija 2
            int prezimeLabela2BrzinaAnimacije2 = 10;
            int prezimeLabela2ZakasnjenjeAnimacije2 = prezimeLabela2CeloTrajanjeAnimacije1 + 3000;
            int prezimeLabela2CeloTrajanjeAnimacije2 = prezimeLabela2BrzinaAnimacije2 * neispravnoPoljeText.length() + prezimeLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(prezimeLabela2, neispravnoPoljeText, prezimeLabela2BrzinaAnimacije2, 1, prezimeLabela2ZakasnjenjeAnimacije2);

            return;

        }

        //Provera korisnickog imena
        if (korisnickoIme.isBlank() || !Metode.daLiJeStringLegalanZaUpis(korisnickoIme)) {

            //Animacija u slucaju da je korisnicko ime neispravno
            //korisnickoImeLabela2 animacija 1
            int korisnickoImeLabela2BrzinaAnimacije1 = 10;
            int korisnickoImeLabela2ZakasnjenjeAnimacije1 = 0;
            int korisnickoImeLabela2CeloTrajanjeAnimacije1 = korisnickoImeLabela2BrzinaAnimacije1 * neispravnoPoljeText.length() + korisnickoImeLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(korisnickoImeLabela2, neispravnoPoljeText, korisnickoImeLabela2BrzinaAnimacije1, 0, korisnickoImeLabela2ZakasnjenjeAnimacije1);

            //korisnickoImeLabela2 animacija 2
            int korisnickoImeLabela2BrzinaAnimacije2 = 10;
            int korisnickoImeLabela2ZakasnjenjeAnimacije2 = korisnickoImeLabela2CeloTrajanjeAnimacije1 + 3000;
            int korisnickoImeLabela2CeloTrajanjeAnimacije2 = korisnickoImeLabela2BrzinaAnimacije2 * neispravnoPoljeText.length() + korisnickoImeLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(korisnickoImeLabela2, neispravnoPoljeText, korisnickoImeLabela2BrzinaAnimacije2, 1, korisnickoImeLabela2ZakasnjenjeAnimacije2);

            return;

        }

        if (UcitaniPodaci.getListaKorisnickihImena().contains(korisnickoIme)) {

            //Animacija u slucaju da je korisnicko zauzeto
            neispravnoPoljeText = "Ovo korisničko ime je već u upotrebi";

            //korisnickoImeLabela2 animacija 1
            int korisnickoImeLabela2BrzinaAnimacije1 = 10;
            int korisnickoImeLabela2ZakasnjenjeAnimacije1 = 0;
            int korisnickoImeLabela2CeloTrajanjeAnimacije1 = korisnickoImeLabela2BrzinaAnimacije1 * neispravnoPoljeText.length() + korisnickoImeLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(korisnickoImeLabela2, neispravnoPoljeText, korisnickoImeLabela2BrzinaAnimacije1, 0, korisnickoImeLabela2ZakasnjenjeAnimacije1);

            //korisnickoImeLabela2 animacija 2
            int korisnickoImeLabela2BrzinaAnimacije2 = 10;
            int korisnickoImeLabela2ZakasnjenjeAnimacije2 = korisnickoImeLabela2CeloTrajanjeAnimacije1 + 3000;
            int korisnickoImeLabela2CeloTrajanjeAnimacije2 = korisnickoImeLabela2BrzinaAnimacije2 * neispravnoPoljeText.length() + korisnickoImeLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(korisnickoImeLabela2, neispravnoPoljeText, korisnickoImeLabela2BrzinaAnimacije2, 1, korisnickoImeLabela2ZakasnjenjeAnimacije2);

            return;

        }

        //Provera lozinke
        if (lozinka.isBlank() || !Metode.daLiJeStringLegalanZaUpis(lozinka)) {

            //Animacija u slucaju da je lozinka neispravna
            //lozinkaLabela2 animacija 1
            int lozinkaLabela2BrzinaAnimacije1 = 10;
            int lozinkaLabela2ZakasnjenjeAnimacije1 = 0;
            int lozinkaLabela2CeloTrajanjeAnimacije1 = lozinkaLabela2BrzinaAnimacije1 * neispravnoPoljeText.length() + lozinkaLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(lozinkaLabela2, neispravnoPoljeText, lozinkaLabela2BrzinaAnimacije1, 0, lozinkaLabela2ZakasnjenjeAnimacije1);

            //lozinkaLabela2 ANIMACIJA 2
            int lozinkaLabela2BrzinaAnimacije2 = 10;
            int lozinkaLabela2ZakasnjenjeAnimacije2 = lozinkaLabela2CeloTrajanjeAnimacije1 + 3000;
            int lozinkaLabela2CeloTrajanjeAnimacije2 = lozinkaLabela2BrzinaAnimacije2 * neispravnoPoljeText.length() + lozinkaLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(lozinkaLabela2, neispravnoPoljeText, lozinkaLabela2BrzinaAnimacije2, 1, lozinkaLabela2ZakasnjenjeAnimacije2);

            return;

        }

        Korisnik korisnik = new Korisnik(IDZaposlenog, korisnickoIme, lozinka);
        FajlMenadzer.pisiFajl(Korisnik.imeFajla, korisnik.uString());
        UcitaniPodaci.ucitajKorisnike();

        Zaposlen zaposlen = new Zaposlen(IDZaposlenog, ime, prezime, datumZasnivanjaRadnogOdnosa, datumPrestankaRadnogOdnosa, status);
        FajlMenadzer.pisiFajl(Zaposlen.imeFajla, zaposlen.uString());
        UcitaniPodaci.ucitajZaposlene();

        StatusZaposlenog statusZaposlenog = new StatusZaposlenog(IDZaposlenog, datumZasnivanjaRadnogOdnosa, vreme, status);
        FajlMenadzer.pisiFajl(statusZaposlenog.imeFajla, statusZaposlenog.uString());
        UcitaniPodaci.ucitajStatuseZaposlenih();

        String uspesnoUnosenjeText = "Unošenje korisnika je uspelo!";
        //Animacija za uspesno unosenje
        //uspesnoUnosenjeLabela animacija 1
        int uspesnoUnosenjeLabelaBrzinaAnimacije1 = 10;
        int uspesnoUnosenjeLabelaZakasnjenjeAnimacije1 = 0;
        int uspesnoUnosenjeLabelaCeloTrajanjeAnimacije1 = uspesnoUnosenjeLabelaBrzinaAnimacije1 * uspesnoUnosenjeText.length() + uspesnoUnosenjeLabelaZakasnjenjeAnimacije1;
        LabelAnimacija.pokreni(uspesnoUnosenjeLabela, uspesnoUnosenjeText, uspesnoUnosenjeLabelaBrzinaAnimacije1, 0, uspesnoUnosenjeLabelaZakasnjenjeAnimacije1);

        //uspesnoUnosenjeLabela animacija 2
        int uspesnoUnosenjeLabelaBrzinaAnimacije2 = 10;
        int uspesnoUnosenjeLabelaZakasnjenjeAnimacije2 = uspesnoUnosenjeLabelaCeloTrajanjeAnimacije1 + 3000;
        int uspesnoUnosenjeLabelaCeloTrajanjeAnimacije2 = uspesnoUnosenjeLabelaBrzinaAnimacije2 * uspesnoUnosenjeText.length() + uspesnoUnosenjeLabelaZakasnjenjeAnimacije2;
        LabelAnimacija.pokreni(uspesnoUnosenjeLabela, uspesnoUnosenjeText, uspesnoUnosenjeLabelaBrzinaAnimacije2, 1, uspesnoUnosenjeLabelaZakasnjenjeAnimacije2);

        //Prelaz na Login formu u slucaju da je ovo bilo unosenje prvog korisnika
        if (UcitaniPodaci.getKorisnici().size() == 1) {

            dodajButton.setEnabled(false);
            ocistiButton.setEnabled(false);

            Timer timer = new Timer();

            TimerTask timerTask = new TimerTask() {
                public void run() {

                    LoginForma loginForma = new LoginForma();
                    loginForma.setLocation(instanca.getLocation());
                    loginForma.setVisible(true);
                    instanca.dispose();

                }
            };
            timer.schedule(timerTask, uspesnoUnosenjeLabelaCeloTrajanjeAnimacije2);

        }

    }//GEN-LAST:event_dodajButtonActionPerformed

    private void ocistiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocistiButtonActionPerformed

        if (!ocistiButton.isEnabled()) {
            return;
        }

        imeTextField.setText("");
        prezimeTextField.setText("");
        korisnickoImeTextField.setText("");
        lozinkaTextField.setText("");
        statusComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_ocistiButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UnosenjeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnosenjeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnosenjeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnosenjeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnosenjeForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabela;
    private javax.swing.JButton dodajButton;
    private javax.swing.JLabel imeLabela1;
    private javax.swing.JLabel imeLabela2;
    private javax.swing.JTextField imeTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel korisnickoImeLabela1;
    private javax.swing.JLabel korisnickoImeLabela2;
    private javax.swing.JTextField korisnickoImeTextField;
    private javax.swing.JLabel lozinkaLabela1;
    private javax.swing.JLabel lozinkaLabela2;
    private javax.swing.JTextField lozinkaTextField;
    private javax.swing.JButton ocistiButton;
    private javax.swing.JLabel prezimeLabela1;
    private javax.swing.JLabel prezimeLabela2;
    private javax.swing.JTextField prezimeTextField;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLabela;
    private javax.swing.JLabel uspesnoUnosenjeLabela;
    // End of variables declaration//GEN-END:variables
}
