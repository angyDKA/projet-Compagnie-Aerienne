package app;

import java.util.ArrayList;
import java.util.List;

public class GestionAeroport {
    private List<Aeroport> aeroports;

    public GestionAeroport() {
        this.aeroports = new ArrayList<>();
    }

    // ➕ CREATE
    public void ajouterAeroport(Aeroport a) {
        aeroports.add(a);
        System.out.println("Aéroport " + a.getNom() + " ajouté.");
    }

    // 🔍 READ
    public Aeroport chercherAeroport(String nom) {
        for (Aeroport a : aeroports) {
            if (a.getNom().equalsIgnoreCase(nom)) {
                return a;
            }
        }
        return null;
    }

    // 🔁 UPDATE
    public void modifierAeroport(String nom, String nouvelleVille, String nouvelleDescription) {
        Aeroport a = chercherAeroport(nom);
        if (a != null) {
            a.setVille(nouvelleVille);
            a.setDescription(nouvelleDescription);
            System.out.println("Aéroport " + nom + " modifié.");
        } else {
            System.out.println("Aéroport introuvable.");
        }
    }

    // ❌ DELETE
    public void supprimerAeroport(String nom) {
        Aeroport a = chercherAeroport(nom);
        if (a != null) {
            aeroports.remove(a);
            System.out.println("Aéroport " + nom + " supprimé.");
        } else {
            System.out.println("Aéroport introuvable.");
        }
    }

    // 📋 Afficher tous les aéroports
    public void afficherTousLesAeroports() {
        if (aeroports.isEmpty()) {
            System.out.println("Aucun aéroport enregistré.");
        } else {
            for (Aeroport a : aeroports) {
                System.out.println("Nom : " + a.getNom() +
                        " | Ville : " + a.getVille() +
                        " | Description : " + a.getDescription());
            }
        }
    }
}
