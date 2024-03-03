import clase.Angajat;
import clase.Utils;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Angajat> listaAngajati;
        try {
            listaAngajati = Utils.readAngajati("/Users/mihaelaene/Desktop/CTS/solid_coretat/src/text/angajat.txt");
            for (Angajat angajat : listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
