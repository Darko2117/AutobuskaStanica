package sistem.autobuskastanica.backendklase;

public class StatusZaposlenog {

    private int IDZaposlenog;
    private String datum;
    private String vreme;
    private int IDStatusa;

    public static final String imeFajla = "statusiZaposlenih.txt";

    public StatusZaposlenog(int IDZaposlenog, String datum, String vreme, int IDStatusa) {
        this.IDZaposlenog = IDZaposlenog;
        this.datum = datum;
        this.vreme = vreme;
        this.IDStatusa = IDStatusa;
    }

    public static StatusZaposlenog izStringa(String string) {

        int IDZaposlenog = Integer.parseInt(string.substring(string.indexOf("IDZaposlenog:") + 13, string.indexOf("\t")));
        string = string.substring(string.indexOf("\t") + 1);

        String datum = string.substring(string.indexOf("Datum:") + 6, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String vreme = string.substring(string.indexOf("Vreme:") + 6, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        int IDStatusa = Integer.parseInt(string.substring(string.indexOf("IDStatusa:") + 10));

        return new StatusZaposlenog(IDZaposlenog, datum, vreme, IDStatusa);

    }

    public String uString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IDZaposlenog:").append(IDZaposlenog).append("\t");
        stringBuilder.append("Datum:").append(datum).append("\t");
        stringBuilder.append("Vreme:").append(vreme).append("\t");
        stringBuilder.append("IDStatusa:").append(IDStatusa);
        return stringBuilder.toString();

    }

    public int getIDZaposlenog() {
        return IDZaposlenog;
    }

    public void setIDZaposlenog(int IDZaposlenog) {
        this.IDZaposlenog = IDZaposlenog;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public int getIDStatusa() {
        return IDStatusa;
    }

    public void setIDStatusa(int IDStatusa) {
        this.IDStatusa = IDStatusa;
    }

}
