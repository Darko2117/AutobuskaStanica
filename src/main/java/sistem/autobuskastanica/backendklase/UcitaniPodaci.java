package sistem.autobuskastanica.backendklase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UcitaniPodaci {

    private static List<Korisnik> korisnici = new ArrayList<>();
    private static List<Status> statusi = new ArrayList<>();
    private static List<StatusZaposlenog> statusiZaposlenih = new ArrayList<>();
    private static List<Zaposlen> zaposleni = new ArrayList<>();

    public static int getPrviSlobodanIDZaposlenog() {

        List<Integer> listaID = new ArrayList<>();
        for (Korisnik korisnik : korisnici) {
            listaID.add(korisnik.getIDZaposlenog());
        }

        int slobodanID = 0;
        while (listaID.contains(slobodanID)) {
            slobodanID++;
        }

        return slobodanID;

    }

    public static List<String> getListaKorisnickihImena() {

        List<String> listaKorisnickihImena = new ArrayList<>();
        for (Korisnik korisnik : getKorisnici()) {
            listaKorisnickihImena.add(korisnik.getKorisnickoIme());
        }

        return listaKorisnickihImena;

    }

    public static Zaposlen getZaposlenIzIDZaposlenog(int IDZaposlenog) {

        for (Zaposlen zaposlen : getZaposleni()) {
            if (zaposlen.getID() == IDZaposlenog) {
                return zaposlen;
            }
        }

        return null;

    }

    public static Korisnik getKorisnikIzKorisnickogImena(String korisnickoIme) {

        for (Korisnik korisnik : getKorisnici()) {
            if (korisnik.getKorisnickoIme().equals(korisnickoIme)) {
                return korisnik;
            }
        }

        return null;

    }

    public static void ucitajKorisnike() {

        korisnici.clear();

        File korisniciFajl = new File("podaci" + File.separator + Korisnik.imeFajla);

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(korisniciFajl));
            String linija;
            while ((linija = bufferedReader.readLine()) != null) {

                korisnici.add(Korisnik.izStringa(linija));

            }
            bufferedReader.close();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public static void ucitajStatuse() {

        statusi.clear();

        File statusiFajl = new File("podaci" + File.separator + Status.imeFajla);

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(statusiFajl));
            String linija;
            while ((linija = bufferedReader.readLine()) != null) {

                statusi.add(Status.izStringa(linija));

            }
            bufferedReader.close();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public static void ucitajStatuseZaposlenih() {

        statusiZaposlenih.clear();

        File statusiZaposlenihFajl = new File("podaci" + File.separator + StatusZaposlenog.imeFajla);

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(statusiZaposlenihFajl));
            String linija;
            while ((linija = bufferedReader.readLine()) != null) {

                statusiZaposlenih.add(StatusZaposlenog.izStringa(linija));

            }
            bufferedReader.close();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public static void ucitajZaposlene() {

        zaposleni.clear();

        File zaposleniFajl = new File("podaci" + File.separator + Zaposlen.imeFajla);

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(zaposleniFajl));
            String linija;
            while ((linija = bufferedReader.readLine()) != null) {

                zaposleni.add(Zaposlen.izStringa(linija));

            }
            bufferedReader.close();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public static List<Korisnik> getKorisnici() {
        return korisnici;
    }

    public static void setKorisnici(List<Korisnik> korisnici) {
        UcitaniPodaci.korisnici = korisnici;
    }

    public static List<Status> getStatusi() {
        return statusi;
    }

    public static void setStatusi(List<Status> statusi) {
        UcitaniPodaci.statusi = statusi;
    }

    public static List<StatusZaposlenog> getStatusiZaposlenih() {
        return statusiZaposlenih;
    }

    public static void setStatusiZaposlenih(List<StatusZaposlenog> statusiZaposlenih) {
        UcitaniPodaci.statusiZaposlenih = statusiZaposlenih;
    }

    public static List<Zaposlen> getZaposleni() {
        return zaposleni;
    }

    public static void setZaposleni(List<Zaposlen> zaposleni) {
        UcitaniPodaci.zaposleni = zaposleni;
    }

}
