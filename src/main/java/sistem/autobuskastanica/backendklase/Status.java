package sistem.autobuskastanica.backendklase;

public class Status {

    private int br;
    private String status;

    public static final String imeFajla = "statusi.txt";

    public Status(int br, String status) {
        this.br = br;
        this.status = status;
    }

    public static Status izStringa(String string) {

        int br = Integer.parseInt(string.substring(string.indexOf("Br:") + 3, string.indexOf("\t")));
        string = string.substring(string.indexOf("\t") + 1);

        String status = string.substring(string.indexOf("Status:") + 7);

        return new Status(br, status);

    }

    public String uString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Br:").append(br).append("\t");
        stringBuilder.append("Status:").append(status);
        return stringBuilder.toString();

    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
