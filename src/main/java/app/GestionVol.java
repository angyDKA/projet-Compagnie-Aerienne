package app;

import java.util.ArrayList;
import java.util.List;

public class GestionVol {
    private List<Vol> vols;

    public GestionVol() {
        this.vols = new ArrayList<>();
    }

    // ➕ CREATE
    public void ajouterVol(Vol v) {
        vols.add(v);
        System.out.println("Vol " + v.getNumeroVol() + " ajouté.");
    }

    // 🔍 READ
    public Vol chercherVol(String numeroVol) {
        for (Vol v : vols) {
            if (v.getNumeroVol().equals(numeroVol)) {
                return v;
            }
        }
        return null;
    }

    // 🔁 UPDATE
    public void modifierVol(String numeroVol, String nouvelleOrigine, String nouvelleDestination,
                            String nouvelleDateDepart, String nouvelleDateArrivee) {
        Vol v = chercherVol(numeroVol);
        if (v != null) {
            v.modifierVol(nouvelleOrigine, nouvelleDestination, nouvelleDateDepart, nouvelleDateArrivee);
        } else {
            System.out.println("Vol " + numeroVol + " introuvable.");
        }
    }

    // ❌ DELETE
    public void supprimerVol(String numeroVol) {
        Vol v = chercherVol(numeroVol);
        if (v != null) {
            vols.remove(v);
            System.out.println("Vol " + numeroVol + " supprimé.");
        } else {
            System.out.println("Vol introuvable.");
        }
    }

    // 📋 Afficher tous les vols
    public void afficherTousLesVols() {
        if (vols.isEmpty()) {
            System.out.println("Aucun vol enregistré.");
        } else {
            for (Vol v : vols) {
                System.out.println("Vol " + v.getNumeroVol() + " | " + v.getOrigine() + " → " + v.getDestination()
                        + " | Départ : " + v.getDateHeureDepart() + " | Arrivée : " + v.getDateHeureArrivee()
                        + " | État : " + v.getEtat());
            }
        }
    }

    // ➕ Ajouter un passager à un vol
    public void ajouterPassagerAuVol(String numeroVol, Personne passager) {
        Vol v = chercherVol(numeroVol);
        if (v != null) {
            v.ajouterPassager(passager);
        } else {
            System.out.println("Vol introuvable.");
        }
    }

    // 📋 Afficher les passagers d’un vol
    public void afficherPassagersVol(String numeroVol) {
        Vol v = chercherVol(numeroVol);
        if (v != null) {
            v.listingPassager();
        } else {
            System.out.println("Vol introuvable.");
        }
    }
}
