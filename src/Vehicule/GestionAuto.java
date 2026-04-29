package Vehicule;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class GestionAuto {
    public static String pfichier = "Autos.bin";


    public static void ecrireAutoBinaire(ArrayList<Auto> ListeA) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/working/" + pfichier)));
            oos.writeObject(ListeA);
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichier ne pas été trouvé");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("problème lors de la lecture du fichier");
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Auto> lireAutosFichier(String pFichier, int t) {

        ImageIcon icon =

                JOptionPane.showMessageDialog(null,
                        "Erreur ouverture du fichier",
                        "Erreur E/S", JOptionPane.ERROR_MESSAGE, icon);
    }

    public static int compterAutosFichier(String pFichier) {

        return 0;
    }


    /**
     * Effectue le tri en ordre croissant d'un tableau, recu en entrée, en
     * fonction du km des Autos.
     *
     */
    public static void trierParKm(ArrayList pCol) {

    }

    /**
     * Recherche dans le tableau recu en entrée (pCol), d'une marque
     * qui commence par la chaine recue en entrée (pMarque). Les Autos trouvés
     * seront tous ceux pour lesquels la marque commence par la chaine pMarque.
     *
     * <br>
     * <br>
     * Cette méthode retourne un tableau des indices des Autos trouvés ou
     * <b>null</b> s'il y en a pas. Attention aux minuscules et majuscules.
     *
     * <br>
     * <br>
     *
     *
     * <br>
     * <br>
     * <b>IMPORTANT : la méthode "startsWith()" de la classe "String" pourrait
     * peut-étre vous aider.</b>
     *
     * @param pMarque la marque à rechercher
     * @param pCol    la liste d'Autos
     * @return int[], un tableau des indices des Autos correspondants ou "null"
     */
    public static int[] rechercherMarque(String pMarque, ArrayList pCol) {

    }


}
