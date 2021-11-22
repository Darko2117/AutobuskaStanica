package sistem.autobuskastanica.backendklase;

public class Korisnik {

    private int IDZaposlenog;
    private String korisnickoIme;
    private String lozinka;

    public static final String imeFajla = "korisnici.txt";

    public Korisnik(int IDZaposlenog, String korisnickoIme, String lozinka) {
        this.IDZaposlenog = IDZaposlenog;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public static Korisnik izStringa(String string) {

        int IDZaposlenog = Integer.parseInt(string.substring(string.indexOf("IDZaposlenog:") + 13, string.indexOf("\t")));
        string = string.substring(string.indexOf("\t") + 1);

        String korisnickoIme = string.substring(string.indexOf("KorisnickoIme:") + 14, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String lozinka = string.substring(string.indexOf("Lozinka:") + 8);

        return new Korisnik(IDZaposlenog, korisnickoIme, lozinka);

    }

    public String uString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IDZaposlenog:").append(IDZaposlenog).append("\t");
        stringBuilder.append("KorisnickoIme:").append(korisnickoIme).append("\t");
        stringBuilder.append("Lozinka:").append(lozinka);
        return stringBuilder.toString();

    }
    
    public int getIDZaposlenog() {
        return IDZaposlenog;
    }

    public void setIDZaposlenog(int IDZaposlenog) {
        this.IDZaposlenog = IDZaposlenog;
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
