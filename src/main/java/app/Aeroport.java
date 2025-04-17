package app;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;
    private List<String> avionsDisponibles = new ArrayList<>();

    // 🔹 Constructeur par défaut
    public Aeroport() {
        avionsDisponibles.add("Avion1");
        avionsDisponibles.add("Avion2");
        avionsDisponibles.add("Avion3");
    }

    // 🔹 Constructeur complet
    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    // 🔹 Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // 🔹 Méthode d’affectation fictive
    public void affecterVol() {
        if (!avionsDisponibles.isEmpty()) {
            String avionAffecte = avionsDisponibles.remove(0);
            System.out.println("Vol affecté à l'avion : " + avionAffecte);
        } else {
            System.out.println("Aucun avion disponible pour affecter le vol.");
        }
    }
}
