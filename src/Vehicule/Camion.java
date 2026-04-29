package Vehicule;

public class Camion extends Vehicule {
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
     * @param hauteur la hauteur du vehicule
     */
    public Camion(String plaque, String marque, int km, int prix, int hauteur) {
        super(plaque, marque, km, prix);
        if (hauteur < HAUTEUR_MIN || hauteur > HAUTEUR_MAX){
            throw new HauteurHorsLimiteException("Hauteur invalide de " + hauteur + " métres");
        } else {
            this.hauteur = hauteur;
        }

    }


    public int gethauteur() {
        return hauteur;
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString() +
                "nHAUTEUR=" + gethauteur() +
                '}';
    }


}
