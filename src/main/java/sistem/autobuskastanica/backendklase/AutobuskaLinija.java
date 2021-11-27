/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.autobuskastanica.backendklase;

import java.util.List;

/**
 *
 * @author Darko
 */
public class AutobuskaLinija {
    
    private String mestoPolazka;
    private String mestoDolazka;
    private List<String> datumi;
    private List<String> vremena;
    private int brojMesta;
    private int cena;
    
    public static final String imeFajla = "linije.txt";

    public AutobuskaLinija(String mestoPolazka, String mestoDolazka, List<String> datumi, List<String> vremena, int brojMesta, int cena) {
        this.mestoPolazka = mestoPolazka;
        this.mestoDolazka = mestoDolazka;
        this.datumi = datumi;
        this.vremena = vremena;
        this.brojMesta = brojMesta;
        this.cena = cena;
    }
    
    public static AutobuskaLinija izStringa(String string) {

        String mestoPolazka = string.substring(string.indexOf("MestoPolazka:") + 13, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        String mestoDolazka = string.substring(string.indexOf("MestoDolazka:") + 13, string.indexOf("\t"));
        string = string.substring(string.indexOf("\t") + 1);

        List<String> datumi = Metode.stringListaIzStringa(string.substring(string.indexOf("Datumi:") + 7, string.indexOf("\t")));
        string = string.substring(string.indexOf("\t") + 1);

        List<String> vremena = Metode.stringListaIzStringa(string.substring(string.indexOf("Vremena:") + 8, string.indexOf("\t")));
        string = string.substring(string.indexOf("\t") + 1);

        int brojMesta = Integer.parseInt(string.substring(string.indexOf("BrojMesta:") + 10, string.indexOf("\t")));
        string = string.substring(string.indexOf("\t") + 1);

        int cena = Integer.parseInt(string.substring(string.indexOf("Cena:") + 5));

        return new AutobuskaLinija(mestoPolazka, mestoDolazka, datumi, vremena, brojMesta, cena);

    }

    public String uString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MestoPolazka:").append(mestoPolazka).append("\t");
        stringBuilder.append("MestoDolazka:").append(mestoDolazka).append("\t");
        stringBuilder.append("Datumi:").append(Metode.stringIzStringListe(datumi)).append("\t");
        stringBuilder.append("Vremena:").append(Metode.stringIzStringListe(vremena)).append("\t");
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

    public List<String> getDatumi() {
        return datumi;
    }

    public void setDatumi(List<String> datumi) {
        this.datumi = datumi;
    }

    public List<String> getVremena() {
        return vremena;
    }

    public void setVremena(List<String> vremena) {
        this.vremena = vremena;
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
