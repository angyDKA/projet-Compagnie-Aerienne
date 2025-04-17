package app;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations;

    public Passager(String identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void reserverVol(Reservation reservation) {
        reservations.add(reservation);
    }

    public void annulerReservation(String numeroReservation) {
        reservations.removeIf(r -> r.getNumeroReservation().equals(numeroReservation));
    }

    public void obtenirReservations() {
        System.out.println("Réservations de " + getNom() + " :");
        for (Reservation r : reservations) {
            System.out.println("- " + r.getNumeroReservation());
        }
    }

    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Passeport : " + passeport);
    }
}

