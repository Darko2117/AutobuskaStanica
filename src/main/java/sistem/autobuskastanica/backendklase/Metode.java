/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.autobuskastanica.backendklase;

import java.time.LocalDate;

/**
 *
 * @author danij
 */
public class Metode {

    public static String getDatumStringDDMMGGGG() {

        StringBuilder datum = new StringBuilder();

        int godina = LocalDate.now().getYear();
        int mesec = LocalDate.now().getMonthValue();
        int dan = LocalDate.now().getDayOfMonth();

        if (dan < 10) {
            datum.append("0");
        }
        datum.append(dan);

        datum.append(".");

        if (mesec < 10) {
            datum.append("0");
        }
        datum.append(mesec).append(".");
        
        datum.append (godina);

        return datum.toString();

    }

}
