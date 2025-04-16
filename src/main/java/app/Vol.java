package app;

import java.util.ArrayList;
import java.util.List;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat; // Exemple : "Planifié", "Annulé", "En cours"
    private List<Personne> passagers;

    public Vol(String numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = "Planifié";
        this.passagers = new ArrayList<>();
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(String numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public String getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(String dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void planifierVol() {
        this.etat = "Planifié";
        System.out.println("Le vol " + numeroVol + " a été planifié.");
    }

    public void annulerVol() {
        this.etat = "Annulé";
        System.out.println("Le vol " + numeroVol + " a été annulé.");
    }

    public void modifierVol(String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        System.out.println("Le vol " + numeroVol + " a été modifié.");
    }

    public void listingPassager() {
        System.out.println("Liste des passagers pour le vol " + numeroVol + " :");
        for (Personne passager : passagers) {
            System.out.println("- " + passager.getNom());
        }
    }

    public void ajouterPassager(Personne passager) {
        passagers.add(passager);
        System.out.println("Passager " + passager.getNom() + " ajouté au vol " + numeroVol + ".");
    }
}