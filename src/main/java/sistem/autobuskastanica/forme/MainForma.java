package sistem.autobuskastanica.forme;

import java.util.Timer;
import java.util.TimerTask;
import sistem.autobuskastanica.backendklase.FajlMenadzer;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;

public class MainForma extends javax.swing.JFrame {

    private final MainForma instanca = this;

    public MainForma() {

        FajlMenadzer.napraviPocetneFajlove();

        UcitaniPodaci.ucitajSvePodatke();

        initComponents();
        
        instanca.setLocationRelativeTo(null); //Centrira jFrame na sredini ekrana

        pocetneAnimacije();

    }

    private void pocetneAnimacije() {

        //Pocetna animacija
        //labela1 animacija 1
        labela1.setText("");
        String labela1Text = "AUTOBUSKA STANICA";
        int labela1BrzinaAnimacije1 = 50;
        int labela1ZakasnjenjeAnimacije1 = 1000;
        int labela1CeloTrajanjeAnimacije1 = labela1BrzinaAnimacije1 * labela1Text.length() + labela1ZakasnjenjeAnimacije1;
        LabelAnimacija.pokreni(labela1, labela1Text, labela1BrzinaAnimacije1, 0, labela1ZakasnjenjeAnimacije1);

        //labela2 animacija 1
        labela2.setText("");
        String labela2Text = "DOBRODOŠLI";
        int labela2BrzinaAnimacije1 = 50;
        int labela2ZakasnjenjeAnimacije1 = labela1CeloTrajanjeAnimacije1 + 1000;
        int labela2CeloTrajanjeAnimacije1 = labela2BrzinaAnimacije1 * labela2Text.length() + labela2ZakasnjenjeAnimacije1;
        LabelAnimacija.pokreni(labela2, labela2Text, labela2BrzinaAnimacije1, 0, labela2ZakasnjenjeAnimacije1);

        //labela2 animacija 2
        int labela2BrzinaAnimacije2 = 30;
        int labela2ZakasnjenjeAnimacije2 = labela2CeloTrajanjeAnimacije1 + 2500;
        int labela2CeloTrajanjeAnimacije2 = labela2BrzinaAnimacije2 * labela2Text.length() + labela2ZakasnjenjeAnimacije2;
        LabelAnimacija.pokreni(labela2, labela2Text, labela2BrzinaAnimacije2, 1, labela2ZakasnjenjeAnimacije2);

        //labela1 animacija 2
        int labela1BrzinaAnimacije2 = 30;
        int labela1ZakasnjenjeAnimacije2 = labela2CeloTrajanjeAnimacije2;
        int labela1CeloTrajanjeAnimacije2 = labela1BrzinaAnimacije2 * labela1Text.length() + labela1ZakasnjenjeAnimacije2;
        LabelAnimacija.pokreni(labela1, labela1Text, labela1BrzinaAnimacije2, 1, labela1ZakasnjenjeAnimacije2);

        if (!UcitaniPodaci.getKorisnici().isEmpty()) {

            Timer timer = new Timer();

            TimerTask timerTask = new TimerTask() {
                public void run() {

                    LoginForma loginForma = new LoginForma();
                    loginForma.setLocation(instanca.getLocation());
                    loginForma.setVisible(true);
                    instanca.dispose();

                }
            };
            timer.schedule(timerTask, labela1CeloTrajanjeAnimacije2 + 250);

        }

        //Animacija u slucaju da nema korisnika
        if (UcitaniPodaci.getKorisnici().isEmpty()) {

            Timer timer = new Timer();

            TimerTask task1 = new TimerTask() {
                public void run() {

                    logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo2.png")));

                    labela1.setFont(new java.awt.Font("Tahoma", 0, 50));
                    labela1.setForeground(new java.awt.Color(255, 51, 51));
                    labela2.setFont(new java.awt.Font("Tahoma", 0, 50));
                    labela2.setForeground(new java.awt.Color(255, 51, 51));

                    String labela1Text = "NIJE PRONAĐEN NIJEDAN KORISNIK";
                    String labela2Text = "MOLIMO UNESITE PRVOG";

                    //labela1 animacija 1
                    int labela1BrzinaAnimacije1 = 50;
                    int labela1ZakasnjenjeAnimacije1 = 0;
                    int labela1CeloTrajanjeAnimacije1 = labela1BrzinaAnimacije1 * labela1Text.length() + labela1ZakasnjenjeAnimacije1;
                    LabelAnimacija.pokreni(labela1, labela1Text, labela1BrzinaAnimacije1, 0, labela1ZakasnjenjeAnimacije1);

                    //labela2 animacija 1
                    int labela2BrzinaAnimacije1 = 50;
                    int labela2ZakasnjenjeAnimacije1 = labela1CeloTrajanjeAnimacije1 + 1000;
                    int labela2CeloTrajanjeAnimacije1 = labela2BrzinaAnimacije1 * labela2Text.length() + labela2ZakasnjenjeAnimacije1;
                    LabelAnimacija.pokreni(labela2, labela2Text, labela2BrzinaAnimacije1, 0, labela2ZakasnjenjeAnimacije1);

                    TimerTask task2 = new TimerTask() {
                        public void run() {

                            UnosenjeForma unosenjeForma = new UnosenjeForma();
                            unosenjeForma.setLocation(instanca.getLocation());
                            unosenjeForma.setVisible(true);
                            instanca.dispose();

                        }
                    };
                    timer.schedule(task2, labela2CeloTrajanjeAnimacije1 + 1500);

                }

            };
            timer.schedule(task1, labela1CeloTrajanjeAnimacije2 + 250);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        labela1 = new javax.swing.JLabel();
        labela2 = new javax.swing.JLabel();

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

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1.png"))); // NOI18N

        labela1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labela1.setText("AUTOBUSKA STANICA");
        labela1.setFont(new java.awt.Font("Tahoma", 0, 75)); // NOI18N
        labela1.setForeground(new java.awt.Color(114, 137, 218));

        labela2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labela2.setText("DOBRODOŠLI");
        labela2.setFont(new java.awt.Font("Tahoma", 0, 75)); // NOI18N
        labela2.setForeground(new java.awt.Color(114, 137, 218));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(logo))
                    .addComponent(labela1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labela2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(270, 270, 270))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(labela1)
                .addGap(18, 18, 18)
                .addComponent(labela2)
                .addGap(182, 182, 182))
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labela1;
    private javax.swing.JLabel labela2;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
