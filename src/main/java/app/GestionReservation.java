package app;

import java.util.ArrayList;
import java.util.List;

public class GestionReservation {
    private List<Reservation> reservations;

    public GestionReservation() {
        this.reservations = new ArrayList<>();
    }

    // ➕ CREATE
    public void ajouterReservation(Reservation r) {
        reservations.add(r);
        System.out.println("Réservation " + r.getNumeroReservation() + " ajoutée.");
    }

    // 🔍 READ
    public Reservation chercherReservation(String numeroReservation) {
        for (Reservation r : reservations) {
            if (r.getNumeroReservation().equals(numeroReservation)) {
                return r;
            }
        }
        return null;
    }

    // 🔁 UPDATE
    public void modifierReservation(String numeroReservation, String nouvelleDate, String nouveauStatut) {
        Reservation r = chercherReservation(numeroReservation);
        if (r != null) {
            r.setDateReservation(nouvelleDate);
            r.setStatut(nouveauStatut);
            System.out.println("Réservation " + numeroReservation + " modifiée.");
        } else {
            System.out.println("Réservation introuvable.");
        }
    }

    // ❌ DELETE
    public void supprimerReservation(String numeroReservation) {
        Reservation r = chercherReservation(numeroReservation);
        if (r != null) {
            reservations.remove(r);
            System.out.println("Réservation " + numeroReservation + " supprimée.");
        } else {
            System.out.println("Réservation introuvable.");
        }
    }

    // 🖨️ Afficher toutes les réservations
    public void afficherToutesLesReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Aucune réservation enregistrée.");
        } else {
            for (Reservation r : reservations) {
                System.out.println("Réservation " + r.getNumeroReservation() +
                        " | Passager : " + r.getPassager().getNom() +
                        " | Vol : " + r.getVol().getNumeroVol() +
                        " | Statut : " + r.getStatut() +
                        " | Date : " + r.getDateReservation());
            }
        }
    }
}
