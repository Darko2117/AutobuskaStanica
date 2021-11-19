package sistem.autobuskastanica.backendklase;

import java.io.File;
import java.io.FileWriter;

public class FajlMenadzer {

    public static void napraviPocetneFajlove() {

        pisiFajl(Korisnik.imeFajla, "");
        pisiFajl(StatusZaposlenog.imeFajla, "");
        pisiFajl(Zaposlen.imeFajla, "");

        if(!new File("podaci" + File.separator + Status.imeFajla).exists()){
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

}
