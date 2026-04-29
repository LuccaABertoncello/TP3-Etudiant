package app;
import Vehicule.Auto;
import Vehicule.GestionAuto;
import client.Client;
import client.GestionClient;
import client.Sexe;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Classe de test
 *

 */
public class Application {

    public static void main(String[] args) {
        ArrayList<Auto> TAuto;
        ArrayList<Auto> LAuto = new ArrayList<Auto>();
        Auto a1 = new Auto("E23CDE-1", "Toyota", 12, 40, 2);
        Auto a2 = new Auto("B56DEF-3", "Ford", 24, 38, 5);
        Auto a3 = new Auto("A56DEF-3", "Toyota", 18, 30, 3);
        Auto a4 = new Auto("C56DEF-3", "Audi", 32, 37, 5);
        LAuto.add(a1);
        LAuto.add(a2);
        LAuto.add(a3);
        LAuto.add(a4);
        GestionAuto.ecrireAutoBinaire(LAuto);
        int cpt = GestionAuto.compterAutosFichier(GestionAuto.pfichier);

        if (cpt > 0) {
            // Instancier le tableau selon le nombre de Autos comptés
            TAuto = new ArrayList();
            TAuto = GestionAuto.lireAutosFichier(GestionAuto.pfichier, cpt);

            System.out.println("Trier par km: ");
            GestionAuto.trierParKm(TAuto);
            System.out.println(TAuto);
            String mar = JOptionPane.showInputDialog(null, "entrer une marque :");
            System.out.println("Les Autos trouvés pour la marque qui commence par :"+mar);
            int[] listeIndices = GestionAuto.rechercherMarque(mar, TAuto);
            GestionAuto.afficherAutoTrouvee(listeIndices, TAuto);
            System.out.println();

        }

    Client c1 = new Client("Daniel Bouchard", Sexe.MASCULIN, 36, "B1458-171954-08", "E44CDE-1");
    Client c2 = new Client("Eleonor Dutil", Sexe.FEMININ,21,"D1551-174959-99", "B87DEF-5");
    Client c3 = new Client("Paul Martin", Sexe.MASCULIN,26,"M5843-300489-95", "A69DEF-3");
    Client c4 = new Client("Jean-Philippe Boivin", Sexe.MASCULIN,40,"B1505-171296-08", "C91DEF-3");
    LClients.add(c1);
        LClients.add(c2);
        LClients.add(c3);
        LClients.add(c4);
        GestionClient.ecrireFichierClients(LClients);
        System.out.println("Liste des clients: ");
        GestionClient.lireFichierClients(GestionClient.fichierClients);
        GestionClient.serialiseListeClients(LClients);
        System.out.println();

    //Test de la méthode ajouter une location

    GestionClient.ajouterLocation(permisClient, noPlaque1);

    System.out.println("Location des clients:");


    //Test de la méthode supprimer une location
        GestionClient.supprimerLocation(permisClient, noPlaque3);


//Test pour afficher les locations d'un client

        GestionClient.afficherLocationsClient(permisClient);

    }
}
