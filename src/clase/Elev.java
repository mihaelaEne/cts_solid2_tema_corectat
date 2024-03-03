package clase;

import java.util.Arrays;

public class Elev extends Aplicant implements Finantare{
    private int clasa;
    private String tutore;

    public int getClasa() {
        return clasa;
    }
    public void setClasa(int i) {
        this.clasa = i;
    }
    public String getTutore() {
        return tutore;
    }
    public void setTutore(String tutore) {
        this.tutore = tutore;
    }


    @Override
    public String toString() {
        return "Elev{" +
                "clasa=" + clasa +
                ", tutore='" + tutore + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nrProiecte=" + nrProiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect) +
                '}';
    }

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    @Override
    public int finantare() {
        int s=30;
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
        return s;
    }


}
