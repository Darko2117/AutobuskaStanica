package sistem.autobuskastanica.backendklase;

public class Korisnik {

    private String korisnickoIme;
    private String lozinka;

    public static final String imeFajla = "korisnici.txt";

    public Korisnik(String korisnickoIme, String lozinka) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public static Korisnik izStringa(String string) {

        String korisnickoIme = string.substring(string.indexOf("KorisnickoIme:") + 14, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String lozinka = string.substring(string.indexOf("Lozinka:") + 8);

        return new Korisnik(korisnickoIme, lozinka);

    }

    public String uString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KorisnickoIme:").append(korisnickoIme).append("\t");
        stringBuilder.append("Lozinka:").append(lozinka);
        return stringBuilder.toString();

    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

}
