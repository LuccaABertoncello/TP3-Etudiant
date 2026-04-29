package Vehicule;

/**
 * Definition de la classe Auto. Attributs et methodes
 *
 */
public class Auto extends Vehicule {

    public final int nPortes;
    /**
     * Constructeur avec paramétres
     *
     * @param plaque la plaque du Vehicule
     * @param marque le marque du Vehicule
     * @param km     km du Vehicule
     * @param prix   le prix du Vehicule
     */
    public Auto(String plaque, String marque, int km, float prix, int nPortes) {
        super(plaque, marque, km, prix);
        this.nPortes = nPortes;
    }
}
