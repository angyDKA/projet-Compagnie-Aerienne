package app;

public class Reservation {
    private String numeroReservation;
    private String dateReservation;
    private String statut;
    private Passager passager;
    private Vol vol;

    public Reservation(String numeroReservation, String dateReservation, String statut, Passager passager, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.passager = passager;
        this.vol = vol;
    }

    // Getters
    public String getNumeroReservation() {
        return numeroReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public Passager getPassager() {
        return passager;
    }

    public Vol getVol() {
        return vol;
    }

    // Setters
    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    // Méthodes demandées
    public void confirmerReservation() {
        this.statut = "Confirmée";
    }

    public void annulerReservation() {
        this.statut = "Annulée";
    }

    public void modifierReservation(String nouvelleDate) {
        this.dateReservation = nouvelleDate;
    }
}
