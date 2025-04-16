package app;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;
    private List<String> avionsDisponibles = new ArrayList<>(); // Liste des avions disponibles

    public Aeroport() {
        // Initialisation des avions disponibles (exemple)
        avionsDisponibles.add("Avion1");
        avionsDisponibles.add("Avion2");
        avionsDisponibles.add("Avion3");
    }

    public void affecterVol() {
        if (!avionsDisponibles.isEmpty()) {
            String avionAffecte = avionsDisponibles.remove(0); // Retirer le premier avion disponible
            System.out.println("Vol affecté à l'avion : " + avionAffecte);
        } else {
            System.out.println("Aucun avion disponible pour affecter le vol.");
        }
    }
}
