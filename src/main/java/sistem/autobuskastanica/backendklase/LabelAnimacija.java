package sistem.autobuskastanica.backendklase;

import java.util.Timer;
import java.util.TimerTask;

public class LabelAnimacija {

    /**
     * Zakazuje potrebne taskove za animaciju teksta.
     *
     * @param labela Labela na kojoj se vrsi animacija.
     * @param text Tekst labele.
     * @param msPoKarakteru Broj milisekundi po karakteru animacije.
     * @param mod Mod animacije, 0 - tekst se stvara, 1 - tekst nestaje.
     * @param zakasnjenje Broj milisekundi cekanja pre pocetka animacije.
     */
    public static void pokreni(javax.swing.JLabel labela, String text, int msPoKarakteru, int mod, int zakasnjenje) {

        Timer timer = new Timer();

        //MOD 0
        mod_0:
        {
            if (mod != 0) {
                break mod_0;
            }

            TimerTask task1 = new TimerTask() {
                public void run() {

                    labela.setText("|");

                    for (int i = 0; i <= text.length(); i++) {
                        int kopijaI = i;
                        TimerTask task2 = new TimerTask() {
                            @Override
                            public void run() {
                                labela.setText(text.substring(0, kopijaI));
                                if (kopijaI != text.length()) {
                                    labela.setText(labela.getText() + "|");
                                }
                            }
                        };
                        timer.schedule(task2, msPoKarakteru * kopijaI);
                    }

                }
            };
            timer.schedule(task1, zakasnjenje);

        }

        //MOD 1
        mod_1:
        {
            if (mod != 1) {
                break mod_1;
            }

            TimerTask task1 = new TimerTask() {
                public void run() {

                    labela.setText(text);

                    for (int i = text.length(); i >= 0; i--) {
                        int kopijaI = i;
                        TimerTask task = new TimerTask() {
                            @Override
                            public void run() {
                                labela.setText(text.substring(0, kopijaI));
                                if (kopijaI != 0 && kopijaI != text.length()) {
                                    labela.setText(labela.getText() + "|");
                                }
                            }
                        };
                        timer.schedule(task, (msPoKarakteru * text.length()) - (msPoKarakteru * kopijaI));
                    }

                }
            };
            timer.schedule(task1, zakasnjenje);

        }

    }

}
