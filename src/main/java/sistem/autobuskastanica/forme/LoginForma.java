package sistem.autobuskastanica.forme;

import sistem.autobuskastanica.backendklase.Korisnik;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

public class LoginForma extends javax.swing.JFrame {

    private final LoginForma instanca = this;

    public LoginForma() {

        initComponents();

        pocetneAnimacije();

    }

    private void pocetneAnimacije() {

        String korisnickoImeLabelaText = "Korisničko Ime";
        String lozinkaLabelaText = "Lozinka";
        korisnickoImeLabela1.setText("");
        lozinkaLabela1.setText("");
        LabelAnimacija.pokreni(korisnickoImeLabela1, korisnickoImeLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(lozinkaLabela1, lozinkaLabelaText, 100, 0, 250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        korisnickoImeLabela1 = new javax.swing.JLabel();
        korisnickoImeTextField = new javax.swing.JTextField();
        korisnickoImeLabela2 = new javax.swing.JLabel();
        lozinkaLabela1 = new javax.swing.JLabel();
        lozinkaPasswordField = new javax.swing.JPasswordField();
        lozinkaLabela2 = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTOBUSKA STANICA");
        setBackground(new java.awt.Color(44, 47, 51));
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setForeground(new java.awt.Color(114, 137, 218));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1.png"))); // NOI18N

        korisnickoImeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        korisnickoImeLabela1.setForeground(new java.awt.Color(114, 137, 218));
        korisnickoImeLabela1.setText("Korisničko Ime");

        korisnickoImeTextField.setBackground(new java.awt.Color(114, 137, 218));
        korisnickoImeTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        korisnickoImeTextField.setToolTipText("");

        korisnickoImeLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        korisnickoImeLabela2.setForeground(new java.awt.Color(255, 51, 51));

        lozinkaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lozinkaLabela1.setForeground(new java.awt.Color(114, 137, 218));
        lozinkaLabela1.setText("Lozinka");

        lozinkaPasswordField.setBackground(new java.awt.Color(114, 137, 218));
        lozinkaPasswordField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lozinkaLabela2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lozinkaLabela2.setForeground(new java.awt.Color(255, 51, 51));

        logInButton.setBackground(new java.awt.Color(114, 137, 218));
        logInButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        logInButton.setForeground(new java.awt.Color(44, 47, 51));
        logInButton.setText("Log in");
        logInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lozinkaLabela1)
                            .addComponent(korisnickoImeLabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lozinkaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(korisnickoImeTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(korisnickoImeLabela2)
                                    .addComponent(lozinkaLabela2)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(logo)
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
                    .addComponent(lozinkaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lozinkaLabela2))
                .addGap(18, 18, 18)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseClicked

        String korisnickoIme = korisnickoImeTextField.getText();
        String lozinka = String.valueOf(lozinkaPasswordField.getPassword());

        if (korisnickoIme.isEmpty()) {

            String korisnickoImeLabela2Text = "Korisničko ime ne sme da ostane prazno";

            //Animacija u slucaju da je korisnicko ime prazno
            //korisnickoImeLabela2 animacija 1
            int korisnickoImeLabela2BrzinaAnimacije1 = 10;
            int korisnickoImeLabela2ZakasnjenjeAnimacije1 = 0;
            int korisnickoImeLabela2CeloTrajanjeAnimacije1 = korisnickoImeLabela2BrzinaAnimacije1 * korisnickoImeLabela2Text.length() + korisnickoImeLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(korisnickoImeLabela2, korisnickoImeLabela2Text, korisnickoImeLabela2BrzinaAnimacije1, 0, korisnickoImeLabela2ZakasnjenjeAnimacije1);

            //korisnickoImeLabela2 animacija 2
            int korisnickoImeLabela2BrzinaAnimacije2 = 10;
            int korisnickoImeLabela2ZakasnjenjeAnimacije2 = 3000;
            int korisnickoImeLabela2CeloTrajanjeAnimacije2 = korisnickoImeLabela2BrzinaAnimacije2 * korisnickoImeLabela2Text.length() + korisnickoImeLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(korisnickoImeLabela2, korisnickoImeLabela2Text, korisnickoImeLabela2BrzinaAnimacije2, 1, korisnickoImeLabela2CeloTrajanjeAnimacije2);

            return;

        }

        if (!UcitaniPodaci.getListaKorisnickihImena().contains(korisnickoIme) || UcitaniPodaci.getZaposlenIzIDZaposlenog(UcitaniPodaci.getKorisnikIzKorisnickogImena(korisnickoIme).getIDZaposlenog()).getStatus() == 2) {

            String korisnickoImeLabela2Text = "Uneseno korisničko ime ne odgovara nijednom nalogu";

            //Animacija u slucaju da korisnicko ime ne postoji
            //korisnickoImeLabela2 animacija 1
            int korisnickoImeLabela2BrzinaAnimacije1 = 10;
            int korisnickoImeLabela2ZakasnjenjeAnimacije1 = 0;
            int korisnickoImeLabela2CeloTrajanjeAnimacije1 = korisnickoImeLabela2BrzinaAnimacije1 * korisnickoImeLabela2Text.length() + korisnickoImeLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(korisnickoImeLabela2, korisnickoImeLabela2Text, korisnickoImeLabela2BrzinaAnimacije1, 0, korisnickoImeLabela2ZakasnjenjeAnimacije1);

            //korisnickoImeLabela2 animacija 2
            int korisnickoImeLabela2BrzinaAnimacije2 = 10;
            int korisnickoImeLabela2ZakasnjenjeAnimacije2 = 3000;
            int korisnickoImeLabela2CeloTrajanjeAnimacije2 = korisnickoImeLabela2BrzinaAnimacije2 * korisnickoImeLabela2Text.length() + korisnickoImeLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(korisnickoImeLabela2, korisnickoImeLabela2Text, korisnickoImeLabela2BrzinaAnimacije2, 1, korisnickoImeLabela2CeloTrajanjeAnimacije2);

            return;

        }

        if (lozinka.isEmpty()) {

            String lozinkaLabela2Text = "Lozinka ne sme da ostane prazna";

            //ANIMACIJA U SLUCAJU DA JE LOZINKA PRAZNA
            //lozinkaLabela2 animacija 1
            int lozinkaLabela2BrzinaAnimacije1 = 10;
            int lozinkaLabela2ZakasnjenjeAnimacije1 = 0;
            int lozinkaLabela2CeloTrajanjeAnimacije1 = lozinkaLabela2BrzinaAnimacije1 * lozinkaLabela2Text.length() + lozinkaLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(lozinkaLabela2, lozinkaLabela2Text, lozinkaLabela2BrzinaAnimacije1, 0, lozinkaLabela2ZakasnjenjeAnimacije1);

            //lozinkaLabela2 animacija 2
            int lozinkaLabela2BrzinaAnimacije2 = 10;
            int lozinkaLabela2ZakasnjenjeAnimacije2 = 3000;
            int lozinkaLabela2CeloTrajanjeAnimacije2 = lozinkaLabela2BrzinaAnimacije2 * lozinkaLabela2Text.length() + lozinkaLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(lozinkaLabela2, lozinkaLabela2Text, lozinkaLabela2BrzinaAnimacije2, 1, lozinkaLabela2CeloTrajanjeAnimacije2);

            return;

        }

        if (!UcitaniPodaci.getKorisnikIzKorisnickogImena(korisnickoIme).getLozinka().equals(lozinka)) {

            String lozinkaLabela2Text = "Unesena lozinka ne odgovara tom korisničkom imenu";

            //Animacija u slucaju da lozinka ne odgovara unesenom korisnickom imenu
            //lozinkaLabela2 animacija 1
            int lozinkaLabela2BrzinaAnimacije1 = 10;
            int lozinkaLabela2ZakasnjenjeAnimacije1 = 0;
            int lozinkaLabela2CeloTrajanjeAnimacije1 = lozinkaLabela2BrzinaAnimacije1 * lozinkaLabela2Text.length() + lozinkaLabela2ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(lozinkaLabela2, lozinkaLabela2Text, lozinkaLabela2BrzinaAnimacije1, 0, lozinkaLabela2ZakasnjenjeAnimacije1);

            //lozinkaLabela2 animacija 2
            int lozinkaLabela2BrzinaAnimacije2 = 10;
            int lozinkaLabela2ZakasnjenjeAnimacije2 = 3000;
            int lozinkaLabela2CeloTrajanjeAnimacije2 = lozinkaLabela2BrzinaAnimacije2 * lozinkaLabela2Text.length() + lozinkaLabela2ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(lozinkaLabela2, lozinkaLabela2Text, lozinkaLabela2BrzinaAnimacije2, 1, lozinkaLabela2CeloTrajanjeAnimacije2);

            return;

        }

        Korisnik korisnik = UcitaniPodaci.getKorisnikIzKorisnickogImena(korisnickoIme);
        Zaposlen zaposlen = UcitaniPodaci.getZaposlenIzIDZaposlenog(korisnik.getIDZaposlenog());

        if (zaposlen.getStatus() == 1) {

            MenadzerForma menadzerForma = new MenadzerForma(zaposlen);
            menadzerForma.setLocation(instanca.getLocation());
            menadzerForma.setVisible(true);
            instanca.dispose();

        } else if (zaposlen.getStatus() == 0) {

            RadnikForma radnikForma = new RadnikForma(zaposlen);
            radnikForma.setLocation(instanca.getLocation());
            radnikForma.setVisible(true);
            instanca.dispose();

        }

    }//GEN-LAST:event_logInButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel korisnickoImeLabela1;
    private javax.swing.JLabel korisnickoImeLabela2;
    private javax.swing.JTextField korisnickoImeTextField;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel lozinkaLabela1;
    private javax.swing.JLabel lozinkaLabela2;
    private javax.swing.JPasswordField lozinkaPasswordField;
    // End of variables declaration//GEN-END:variables
}
