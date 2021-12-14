package sistem.autobuskastanica.backendklase;

public class OstavljeneStvari {

    private String opisStvari;
    private int ID;

    public static final String imeFajla = "ostavljeneStvari.txt";

    public OstavljeneStvari(String opisStvari, int ID) {
        this.opisStvari = opisStvari;
        this.ID = ID;
    }

    public static OstavljeneStvari izStringa(String string) {

        String opisStvari = string.substring(string.indexOf("OpisStvari:") + 11, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        int ID = Integer.parseInt(string.substring(string.indexOf("ID:") + 3));

        return new OstavljeneStvari(opisStvari, ID);

    }

    public String uString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OpisStvari:").append(opisStvari).append("\t");
        stringBuilder.append("ID:").append(ID);
        return stringBuilder.toString();

    }

    public String getOpisStvari() {
        return opisStvari;
    }

    public void setOpisStvari(String opisStvari) {
        this.opisStvari = opisStvari;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
