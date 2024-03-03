package clase;

import java.util.Arrays;

public class Student extends Aplicant implements Finantare{

    protected String facultate;
    protected int anStudii;


    public String getFacultate() {
        return facultate;
    }
    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
    public int getAn_studii() {
        return anStudii;
    }
    public void setAn_studii(int an_studii) {
        this.anStudii = an_studii;
    }


    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }
    @Override
    public String toString() {
        return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte +  ", DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate + ", An_studii=" + anStudii ;
    }


    @Override
    public int finantare() {
        int s=30;
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
        return s;
    }
}
