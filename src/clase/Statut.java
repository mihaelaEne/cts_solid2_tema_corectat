package clase;



public class Statut extends Aplicant{

    public void statut(){
        if(getPunctaj()>80)
            System.out.println("Aplicantul "+getNume()+" "+getPrenume()+" a fost acceptat.");
        else
            System.out.println("Aplicantul "+getNume()+" "+getPrenume()+" nu a fost acceptat.");
    }
}
