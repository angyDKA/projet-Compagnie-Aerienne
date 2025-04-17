package app;

import java.util.ArrayList;
import java.util.List;

public class GestionAvion {
    private List<Avion> avions;

    public GestionAvion() {
        this.avions = new ArrayList<>();
    }

    // ➕ CREATE
    public void ajouterAvion(Avion a) {
        avions.add(a);
        System.out.println("Avion " + a.getImmatriculation() + " ajouté.");
    }

    // 🔍 READ
    public Avion chercherAvion(String immatriculation) {
        for (Avion a : avions) {
            if (a.getImmatriculation().equals(immatriculation)) {
                return a;
            }
        }
        return null;
    }

    // 🔁 UPDATE
    public void modifierAvion(String immatriculation, String nouveauModele, int nouvelleCapacite) {
        Avion a = chercherAvion(immatriculation);
        if (a != null) {
            a.setModele(nouveauModele);
            a.setCapacite(nouvelleCapacite);
            System.out.println("Avion " + immatriculation + " modifié.");
        } else {
            System.out.println("Avion introuvable.");
        }
    }

    // ❌ DELETE
    public void supprimerAvion(String immatriculation) {
        Avion a = chercherAvion(immatriculation);
        if (a != null) {
            avions.remove(a);
            System.out.println("Avion " + immatriculation + " supprimé.");
        } else {
            System.out.println("Avion introuvable.");
        }
    }

    // 📋 Afficher tous les avions
    public void afficherTousLesAvions() {
        if (avions.isEmpty()) {
            System.out.println("Aucun avion enregistré.");
        } else {
            for (Avion a : avions) {
                System.out.println("Avion " + a.getImmatriculation() + " | Modèle : " + a.getModele() +
                        " | Capacité : " + a.getCapacite() +
                        " | Disponible : " + (a.verifierDisponibilite() ? "Oui" : "Non"));
            }
        }
    }

    // ✅ Afficher les avions disponibles
    public void afficherAvionsDisponibles() {
        System.out.println("Avions disponibles :");
        for (Avion a : avions) {
            if (a.verifierDisponibilite()) {
                System.out.println("- " + a.getImmatriculation());
            }
        }
    }
}
