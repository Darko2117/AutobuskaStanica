/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.autobuskastanica.backendklase;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author danij
 */
public class Metode {

    private static List<String> ilegalniStringoviZaUpis = Arrays.asList(":", "\t");

    public static String getDatumStringDDMMGGGG() {

        StringBuilder datum = new StringBuilder();

        int dan = LocalDate.now().getDayOfMonth();
        int mesec = LocalDate.now().getMonthValue();
        int godina = LocalDate.now().getYear();

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

    public static Integer statusIntIzStringa(String statusString) {

        if (statusString.equalsIgnoreCase("radnik")) {
            return 0;
        }
        if (statusString.equalsIgnoreCase("menadžer")) {
            return 1;
        }
        if (statusString.equalsIgnoreCase("obrisan")) {
            return 2;
        }

        return null;

    }

    public static String statusStringIzInta(int statusInt) {

        if (statusInt == 0) {
            return "radnik";
        }
        if (statusInt == 1) {
            return "menadžer";
        }
        if (statusInt == 2) {
            return "obrisan";
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
