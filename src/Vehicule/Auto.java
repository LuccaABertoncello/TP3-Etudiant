package Vehicule;

/**
 * Definition de la classe Auto. Attributs et methodes
 * 
 */
public class Auto extends Vehicule
{


    /**
     * Constructeur avec paramétres
     *
     * @param pplaque la plaque du Vehicule
     * @param pmarque le marque du Vehicule
     * @param pkm     km du Vehicule
     * @param pprix   le prix du Vehicule
     */
    public Auto(String pplaque, String pmarque, int pkm, float pprix) {
        super(pplaque, pmarque, pkm, pprix);
    }
}
