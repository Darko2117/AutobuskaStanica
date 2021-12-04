/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.autobuskastanica.backendklase;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Darko
 */
public class AutobuskaLinija {

    private String mestoPolazka;
    private String mestoDolazka;
    private String datum;
    private String vreme;
    private int brojMesta;
    private int cena;

    public static final String imeFajla = "autobuskeLinije.txt";
    public static final List<String> dozvoljeniGradovi = Arrays.asList("Beograd", "Novi Sad", "Nis", "Kragujevac", "Pristina", "Subotica", "Zrenjanin", "Pancevo", "Cacak", "Krusevac", "Kraljevo");

    public AutobuskaLinija(String mestoPolazka, String mestoDolazka, String datum, String vreme, int brojMesta, int cena) {
        this.mestoPolazka = mestoPolazka;
        this.mestoDolazka = mestoDolazka;
        this.datum = datum;
        this.vreme = vreme;
        this.brojMesta = brojMesta;
        this.cena = cena;
    }

    public static AutobuskaLinija izStringa(String string) {

        String mestoPolazka = string.substring(string.indexOf("MestoPolazka:") + 13, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String mestoDolazka = string.substring(string.indexOf("MestoDolazka:") + 13, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String datum = string.substring(string.indexOf("Datum:") + 6, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String vreme = string.substring(string.indexOf("Vreme:") + 6, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        int brojMesta = Integer.parseInt(string.substring(string.indexOf("BrojMesta:") + 10, string.indexOf("\t")));
        string = string.substring(string.indexOf("\t") + 1);

        int cena = Integer.parseInt(string.substring(string.indexOf("Cena:") + 5));

        return new AutobuskaLinija(mestoPolazka, mestoDolazka, datum, vreme, brojMesta, cena);

    }

    public String uString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MestoPolazka:").append(mestoPolazka).append("\t");
        stringBuilder.append("MestoDolazka:").append(mestoDolazka).append("\t");
        stringBuilder.append("Datumi:").append(datum).append("\t");
        stringBuilder.append("Vremena:").append(vreme).append("\t");
        stringBuilder.append("BrojMesta:").append(brojMesta).append("\t");
        stringBuilder.append("Cena:").append(cena);
        return stringBuilder.toString();

    }

    public String getMestoPolazka() {
        return mestoPolazka;
    }

    public void setMestoPolazka(String mestoPolazka) {
        this.mestoPolazka = mestoPolazka;
    }

    public String getMestoDolazka() {
        return mestoDolazka;
    }

    public void setMestoDolazka(String mestoDolazka) {
        this.mestoDolazka = mestoDolazka;
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

    public int getBrojMesta() {
        return brojMesta;
    }

    public void setBrojMesta(int brojMesta) {
        this.brojMesta = brojMesta;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

}
