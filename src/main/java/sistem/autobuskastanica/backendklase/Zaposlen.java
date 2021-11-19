package sistem.autobuskastanica.backendklase;

public class Zaposlen {

    private int ID;
    private String ime;
    private String prezime;
    private String datumZasnivanjaRadnogOdnosa;
    private String datumPrestankaRadnogOdnosa;
    private int status;

    public static final String imeFajla = "zaposleni.txt";

    public Zaposlen(int ID, String ime, String prezime, String datumZasnivanjaRadnogOdnosa, String datumPrestankaRadnogOdnosa, int status) {

        this.ID = ID;
        this.ime = ime;
        this.prezime = prezime;
        this.datumZasnivanjaRadnogOdnosa = datumZasnivanjaRadnogOdnosa;
        this.datumPrestankaRadnogOdnosa = datumPrestankaRadnogOdnosa;
        this.status = status;

        if (this.datumPrestankaRadnogOdnosa.isEmpty()) {
            this.datumPrestankaRadnogOdnosa = "-";
        }

    }

    public static Zaposlen izStringa(String string) {

        int id = Integer.parseInt(string.substring(string.indexOf("ID:") + 3, string.indexOf("\t")));
        string = string.substring(string.indexOf("\t") + 1);

        String ime = string.substring(string.indexOf("Ime:") + 4, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String prezime = string.substring(string.indexOf("Prezime:") + 8, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String datumZasnivanjaRadnogOdnosa = string.substring(string.indexOf("DatumZasnivanjaRadnogOdnosa:") + 28, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String datumPrestankaRadnogOdnosa = string.substring(string.indexOf("DatumPrestankaRadnogOdnosa:") + 27, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        int status = Integer.parseInt(string.substring(string.indexOf("Status:") + 7));

        return new Zaposlen(id, ime, prezime, datumZasnivanjaRadnogOdnosa, datumPrestankaRadnogOdnosa, status);

    }

    public String uString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID:").append(ID).append("\t");
        stringBuilder.append("Ime:").append(ime).append("\t");
        stringBuilder.append("Prezime:").append(prezime).append("\t");
        stringBuilder.append("DatumZasnivanjaRadnogOdnosa:").append(datumZasnivanjaRadnogOdnosa).append("\t");
        stringBuilder.append("DatumPrestankaRadnogOdnosa:").append(datumPrestankaRadnogOdnosa).append("\t");
        stringBuilder.append("Status:").append(status);
        return stringBuilder.toString();

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDatumZasnivanjaRadnogOdnosa() {
        return datumZasnivanjaRadnogOdnosa;
    }

    public void setDatumZasnivanjaRadnogOdnosa(String datumZasnivanjaRadnogOdnosa) {
        this.datumZasnivanjaRadnogOdnosa = datumZasnivanjaRadnogOdnosa;
    }

    public String getDatumPrestankaRadnogOdnosa() {
        return datumPrestankaRadnogOdnosa;
    }

    public void setDatumPrestankaRadnogOdnosa(String datumPrestankaRadnogOdnosa) {
        this.datumPrestankaRadnogOdnosa = datumPrestankaRadnogOdnosa;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
