/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.autobuskastanica.backendklase;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author danij
 */
public class Metode {

    private static List<String> ilegalniStringoviZaUpis = Arrays.asList(":", "\t");

    public static String getDatumStringDDMMGGGG() {

        int dan = LocalDate.now().getDayOfMonth();
        int mesec = LocalDate.now().getMonthValue();
        int godina = LocalDate.now().getYear();

        StringBuilder datum = new StringBuilder();

        if (dan < 10) {
            datum.append("0");
        }
        datum.append(dan);

        datum.append(".");

        if (mesec < 10) {
            datum.append("0");
        }
        datum.append(mesec).append(".");

        datum.append(godina);

        return datum.toString();

    }

    public static String getVremeString() {

        int sat = GregorianCalendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int minut = GregorianCalendar.getInstance().get(Calendar.MINUTE);

        StringBuilder vreme = new StringBuilder();

        if (sat < 10) {
            vreme.append("0");
        }
        vreme.append(sat);
        
        vreme.append(":");

        if (minut < 10) {
            vreme.append("0");
        }
        vreme.append(minut);

        return vreme.toString();

    }

    public static Integer statusIntIzStringa(String statusString) {

        for (Status status : UcitaniPodaci.getStatusi()) {
            if (status.getStatus().equalsIgnoreCase(statusString)) {
                return status.getBr();
            }
        }

        return null;

    }

    public static String statusStringIzInta(int statusInt) {

        for (Status status : UcitaniPodaci.getStatusi()) {
            if (status.getBr() == statusInt) {
                return status.getStatus();
            }
        }

        return null;

    }

    public static boolean daLiJeStringLegalanZaUpis(String string) {

        for (String ilagalanString : ilegalniStringoviZaUpis) {
            if (string.contains(ilagalanString)) {
                return false;
            }
        }

        return true;

    }

}
