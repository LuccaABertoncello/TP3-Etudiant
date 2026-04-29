package Vehicule;

public class Camion  {
    /**
     * hauteur de degagement par defaut
     */
    public final static int HAUTEUR_PAR_DEFAUT = 2;

    /**
     * La hauteur minimum
     */
    public final static int HAUTEUR_MIN = 2;
    /**
     * La hauteur maximum
     */
    public final static int HAUTEUR_MAX = 5;
    /**
     * La hauteur d'un Vehicule
     */
    private int hauteur = 0;


    /**
     * Constructeur avec parametres
     *
     *
     * @param phauteur la hauteur du vehicule
     */
    public Camion(String pplaque, String pmarque,  int pkm, int pprix, int phauteur)
    {

    }



    public int gethauteur() {
        return hauteur;
    }

    @Override
    public String toString() {
        return "Auto{" +super.toString()+
                "nHAUTEUR=" + gethauteur() +
                '}';
    }



}
