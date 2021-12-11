/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.autobuskastanica.backendklase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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

        return getDatumStringDDMMGGGGIzLocalDate(LocalDate.now());

    }

    public static String getDatumStringDDMMGGGGIzLocalDate(LocalDate localDate) {

        int dan = localDate.getDayOfMonth();
        int mesec = localDate.getMonthValue();
        int godina = localDate.getYear();

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
        
        datum.append(".");

        return datum.toString();

    }
    
    public static String getVremeStringSSMMIzLocalTime(LocalTime localTime){
    
        int sat = localTime.getHour();
        int minut = localTime.getMinute();
        
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

    public static String stringIzStringListe(List<String> stringLista) {

        String string = "";

        for (String string1 : stringLista) {
            string = string.concat(string1).concat(", ");
        }
        if (!string.isEmpty()) {
            string = string.substring(0, string.length() - 2);
        }

        return string;

    }

    public static List<String> stringListaIzStringa(String string) {

        List<String> stringLista = new ArrayList<>();

        while (true) {
            if (string.contains(", ")) {
                stringLista.add(string.substring(0, string.indexOf(", ")));
                string = string.substring(string.indexOf(", ") + 2);
            } else {
                stringLista.add(string);
                break;
            }
        }

        return stringLista;

    }

}
