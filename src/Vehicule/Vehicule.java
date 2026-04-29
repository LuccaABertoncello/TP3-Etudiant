package Vehicule;

public class Vehicule implements Comparable<Vehicule> {
    /**
     * La plaque par défaut
     */
    public final static String PLAQUE_PAR_DEFAUT = "A11BBC-0";

    /**
     * La longueur d'une plaque
     */
    public final static int NBR_CAR_PLAQUE = 8;

    /**
     * Une marque par défaut
     */
    public final static String MARQUE_PAR_DEFAUT = "MARQUE PAR DEFAUT";

    /**
     * La longueur minimum d'une marque
     */
    public final static int LONGUEUR_MARQUE_MIN = 4;

    /**
     * La longueur maximum d'une marque
     */
    public final static int LONGUEUR_MARQUE_MAX = 20;
    /**
     * Le kilometrage minimum
     */
    public final static int KM_MIN = 10;
    /**
     * Un km par défaut
     */
    public final static int KM_PAR_DEFAUT = 10;
    /**
     * Prix d'un Vehicule par défaut
     */
    public final static int PRIX_PAR_DEFAUT = 20;

    /**
     * Prix d'un Vehicule minimum
     */
    public final static float PRIX_MIN = 20f;


    /**
     * La plaque d'un Vehicule
     */
    private String plaque = null;

    /**
     * Le marque d'un Vehicule
     */
    private String marque = null;
    /**
     * km d'un Vehicule
     */
    private int km = 10;

    /**
     * Le prix d'un Vehicule
     */
    private float prix = 0f;

    /**
     * Constructeur avec paramétres
     *
     * @param plaque la plaque du Vehicule
     * @param marque le marque du Vehicule
     * @param km     km du Vehicule
     * @param prix   le prix du Vehicule
     */
    public Vehicule(String plaque, String marque, int km, float prix) {
        boolean ok = this.setplaque(plaque) && this.setmarque(marque)
                && this.setkm(km) && this.setprix(prix);

        if (!ok) {
            setplaque(Vehicule.PLAQUE_PAR_DEFAUT);
            setmarque(Vehicule.MARQUE_PAR_DEFAUT);
            setkm(Vehicule.KM_PAR_DEFAUT);
            setprix(Vehicule.PRIX_PAR_DEFAUT);
        }
    }

    /**
     * Obtenir la valeur de la plaque
     *
     * @return String, la plaque
     */
    public String getplaque() {
        return plaque;
    }

    /**
     * Obtenir le marque du Vehicule
     *
     * @return String, le marque
     */
    public String getmarque() {
        return marque;
    }

    /**
     * Obtenir les KM du Vehicule
     *
     * @return int, les km
     */
    public int getkm() {
        return km;
    }

    /**
     * Obtenir le prix du Vehicule
     *
     * @return int, le prix
     */
    public float getprix() {
        return prix;
    }

    /**
     * Mettre à jour la plaque du Vehicule
     *
     * @param pplaque la plaque à mettre à jour
     * @return boolean, vrai si la plaque a été mise à jour
     */
    public boolean setplaque(String pplaque) {
        boolean ok = Vehicule.validerplaque(pplaque);

        if (ok) {
            plaque = pplaque;
        }

        return ok;
    }

    /**
     * Mettre à jour le marque du Vehicule
     *
     * @param pmarque la  marque à mettre à jour
     * @return boolean, vrai si la marque a été mise à jour
     */
    public boolean setmarque(String pmarque) {
        boolean ok = Vehicule.validermarque(pmarque);

        if (ok) {
            marque = pmarque;
        }

        return ok;
    }

    /**
     * Mettre a jour les km du Vehicule
     *
     * @param pkm les km du vehicule à mettre à jour
     * @return boolean, vrai si les km ont été mise à jour
     */
    public boolean setkm(int pkm) {
        boolean ok = Vehicule.validerkm(pkm);

        if (ok) {
            km = pkm;
        }

        return ok;
    }

    /**
     * Valider la plaque du Vehicule. La plaque doit étre obligatoirement du format
     * suivant soit 1 lettre majuscule suivie de 2 chiffres
     * suivies de 3 lettres suivie du car - suivie d'un chiffre.
     *
     * @param pplaque la plaque à valider
     * @return boolean, vrai si la plaque est valide
     */
    public static boolean validerplaque(String pplaque) {
        // Expressions réguliéres
        return ((pplaque != null) && (pplaque.matches("[A-Z][0-9][0-9][A-Z][A-Z][A-Z][-][0-9]")));
    }

    /**
     * Valider le marque du Vehicule
     *
     * @param pmarque le marque à valider
     * @return boolean, vrai si la marque est valide
     */
    public static boolean validermarque(String pmarque) {
        return ((pmarque != null)
                && (pmarque.length() >= Vehicule.LONGUEUR_MARQUE_MIN) && (pmarque
                .length() <= Vehicule.LONGUEUR_MARQUE_MAX));
    }

    /**
     * Valider les km du Vehicule
     *
     * @param pkm les km a valider
     * @return boolean, vrai si les km sont valides
     */
    public static boolean validerkm(int pkm) {
        return (pkm >= Vehicule.KM_MIN);
    }

    /**
     * Mettre à jour le prix de l'Auto
     *
     * @param pPrix la valeur du prix à mettre à jour
     * @return boolean, vrai si la valeur a été mise à jour
     */
    public boolean setprix(float pPrix) {
        boolean ok = Vehicule.validerprix(pPrix);

        if (ok) {
            prix = pPrix;
        }

        return ok;
    }

    /**
     * Valider le prix du vehicule
     *
     * @param pValeur le prix a valider
     * @return boolean, vrai si le prix est valide
     */
    public static boolean validerprix(float pValeur) {
        return (pValeur >= Vehicule.PRIX_MIN);
    }


    /**
     * Construire une chaine avec les informations du Vehicule
     *
     * @return String, la chaine construite
     */

    @Override
    public String toString() {

        return "plaque: " + getplaque() + "\t\tmarque: " + getmarque() + " km: "
                + getkm() + "\t\tprix: " + getprix() + "\t\t";
    }


    /**
     * Permet de comparer deux autos en considérant leur km.
     *
     * @param v le Vehicule avec lequel il faut comparer le Vehicule courant.
     * @return float, une valeur négative si inférieur, positive si supérieur et 0
     * si égale.
     */
    public int compareTo(Vehicule v) {
        //à compléter
        return Integer.compare(this.km, v.km);
    }

    public static void main(String[] args) {

        Vehicule v1 = new Vehicule("A23CDE-1", "marque", 12000, 30);
        System.out.println(v1.getplaque() + "\n" +
                v1.getmarque() + "\n" + v1.getkm() + "\n" + v1.getprix());
        Vehicule v2 = new Vehicule("B56DEF-3", "marque", 1400, 35);
        System.out.println(v1.compareTo(v2));
    }
}
