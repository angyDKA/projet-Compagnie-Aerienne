package app;

import java.util.ArrayList;
import java.util.List;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;
    private List<Vol> volsAffectes = new ArrayList<>();

    public Pilote(String identifiant, String nom, String adresse, String contact,
                  String numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public int getHeuresDeVol() {
        return heuresDeVol;
    }

    public void setHeuresDeVol(int heuresDeVol) {
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }

    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Licence : " + licence);
        System.out.println("Heures de vol : " + heuresDeVol);
    }

    public void affecterVol(Vol vol) {
        volsAffectes.add(vol);
        System.out.println("Le vol " + vol.getNumeroVol() + " a été affecté au pilote " + getNom());
    }

    public void obtenirVol() {
        System.out.println("Vols affectés à " + getNom() + " :");
        for (Vol v : volsAffectes) {
            System.out.println("- " + v.getNumeroVol());
        }
    }
}
