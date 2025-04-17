package app;

import java.util.ArrayList;
import java.util.List;

public class GestionPassager {
    private List<Passager> passagers;

    public GestionPassager() {
        this.passagers = new ArrayList<>();
    }

    // ➕ CREATE
    public void ajouterPassager(Passager p) {
        passagers.add(p);
        System.out.println("Passager " + p.getNom() + " ajouté.");
    }

    // 🔍 READ
    public Passager chercherPassager(String identifiant) {
        for (Passager p : passagers) {
            if (p.getIdentifiant().equals(identifiant)) {
                return p;
            }
        }
        return null;
    }

    // 🔁 UPDATE
    public void modifierPassager(String identifiant, Passager nouveau) {
        for (int i = 0; i < passagers.size(); i++) {
            if (passagers.get(i).getIdentifiant().equals(identifiant)) {
                passagers.set(i, nouveau);
                System.out.println("Passager " + identifiant + " modifié.");
                return;
            }
        }
        System.out.println("Passager " + identifiant + " introuvable.");
    }

    // ❌ DELETE
    public void supprimerPassager(String identifiant) {
        Passager p = chercherPassager(identifiant);
        if (p != null) {
            passagers.remove(p);
            System.out.println("Passager " + identifiant + " supprimé.");
        } else {
            System.out.println("Passager " + identifiant + " introuvable.");
        }
    }

    // 🖨️ Afficher tous les passagers
    public void afficherTousLesPassagers() {
        if (passagers.isEmpty()) {
            System.out.println("Aucun passager enregistré.");
        } else {
            for (Passager p : passagers) {
                p.obtenirInfos();
                System.out.println("------------");
            }
        }
    }
}
