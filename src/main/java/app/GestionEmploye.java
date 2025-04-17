package app;

import java.util.ArrayList;
import java.util.List;

public class GestionEmploye {
    private List<Employe> employes;

    public GestionEmploye() {
        this.employes = new ArrayList<>();
    }

    // ➕ CREATE
    public void ajouterEmploye(Employe e) {
        employes.add(e);
        System.out.println("Employé " + e.getNom() + " ajouté en tant que " + e.obtenirRole());
    }

    // 🔍 READ
    public Employe chercherEmploye(String identifiant) {
        for (Employe e : employes) {
            if (e.getIdentifiant().equals(identifiant)) {
                return e;
            }
        }
        return null;
    }

    // 🔁 UPDATE
    public void modifierEmploye(String identifiant, Employe modifie) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getIdentifiant().equals(identifiant)) {
                employes.set(i, modifie);
                System.out.println("Employé " + identifiant + " modifié.");
                return;
            }
        }
        System.out.println("Employé introuvable.");
    }

    // ❌ DELETE
    public void supprimerEmploye(String identifiant) {
        Employe e = chercherEmploye(identifiant);
        if (e != null) {
            employes.remove(e);
            System.out.println("Employé " + identifiant + " supprimé.");
        } else {
            System.out.println("Employé introuvable.");
        }
    }

    // 📋 Afficher tous les employés
    public void afficherTousLesEmployes() {
        if (employes.isEmpty()) {
            System.out.println("Aucun employé enregistré.");
        } else {
            for (Employe e : employes) {
                e.obtenirInfos();
                System.out.println("Role : " + e.obtenirRole());
                System.out.println("------------");
            }
        }
    }

    // 👨‍✈️ Afficher tous les pilotes
    public void afficherTousLesPilotes() {
        for (Employe e : employes) {
            if (e instanceof Pilote) {
                System.out.println("Pilote : " + e.getNom());
            }
        }
    }

    // 👩‍✈️ Afficher tout le personnel cabine
    public void afficherToutLePersonnelCabine() {
        for (Employe e : employes) {
            if (e instanceof PersonnelCabine) {
                System.out.println("Personnel cabine : " + e.getNom());
            }
        }
    }
}
