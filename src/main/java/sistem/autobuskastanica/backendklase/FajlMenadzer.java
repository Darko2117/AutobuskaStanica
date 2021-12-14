package sistem.autobuskastanica.backendklase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FajlMenadzer {

    public static void napraviPocetneFajlove() {

        pisiFajl(Korisnik.imeFajla, "");
        pisiFajl(StatusZaposlenog.imeFajla, "");
        pisiFajl(Zaposlen.imeFajla, "");
        pisiFajl(AutobuskaLinija.imeFajla, "");
        pisiFajl(OstavljeneStvari.imeFajla, "");

        if (!new File("podaci" + File.separator + Status.imeFajla).exists()) {
            pisiFajl(Status.imeFajla, new Status(0, "radnik").uString());
            pisiFajl(Status.imeFajla, new Status(1, "menadzer").uString());
            pisiFajl(Status.imeFajla, new Status(2, "obrisan").uString());
        }

    }

    public static void pisiFajl(String imeFajla, String text) {
        try {

            new File("podaci").mkdir();

            if (!text.isEmpty()) {
                text = text.concat("\n");
            }

            FileWriter writer = new FileWriter("podaci" + File.separator + imeFajla, true);
            writer.write(text);
            writer.close();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * Updateuje zaposlenog u zaposleni.txt fajlu koristeci Zaposlen objekat.<br>
     *
     * @param zaposlen Objekat sa vec modifikovanim vrednostima.
     */
    public static void updateZaposlenog(Zaposlen zaposlen) {
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("podaci" + File.separator + Zaposlen.imeFajla));
            StringBuffer inputBuffer = new StringBuffer();
            String linija;
            while ((linija = bufferedReader.readLine()) != null) {

                if (linija.contains("ID:" + zaposlen.getID())) {
                    linija = zaposlen.uString();
                }
                inputBuffer.append(linija).append("\n");

            }
            bufferedReader.close();

            FileOutputStream fileOut = new FileOutputStream("podaci" + File.separator + Zaposlen.imeFajla);
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * Updateuje broj mesta autobuske linije u autobuskeLinije.txt fajlu koristeci AutobuskaLinija objekat.<br>
     * Da bi identifikovao tacnu liniju proverava sve parametre sem BrojMesta:<br>
     * Poznat bug: Ako vise linija imaju sve proverene parametre identicne, metoda ce da updateuje sve te linije.<br>
     * AutobuskaLinija nema u sebi unikatan parametar tako da ce morati ovako da ostane.
     *
     * @param autobuskaLinija Objekat sa vec modifikovanom vrednoscu broja mesta.
     */
    public static void updateBrojMestaAutobuskeLinije(AutobuskaLinija autobuskaLinija) {
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("podaci" + File.separator + AutobuskaLinija.imeFajla));
            StringBuffer inputBuffer = new StringBuffer();
            String linija;
            while ((linija = bufferedReader.readLine()) != null) {

                if (linija.contains("MestoPolazka:" + autobuskaLinija.getMestoPolazka()) && linija.contains("MestoDolazka:" + autobuskaLinija.getMestoDolazka()) && linija.contains("Datum:" + autobuskaLinija.getDatum()) && linija.contains("Vreme:" + autobuskaLinija.getVreme()) && linija.contains("Cena:" + autobuskaLinija.getCena())) {
                    linija = autobuskaLinija.uString();
                }
                inputBuffer.append(linija).append("\n");

            }
            bufferedReader.close();

            FileOutputStream fileOut = new FileOutputStream("podaci" + File.separator + AutobuskaLinija.imeFajla);
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
