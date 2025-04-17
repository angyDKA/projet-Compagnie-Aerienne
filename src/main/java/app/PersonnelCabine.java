package app;

import java.util.ArrayList;
import java.util.List;

public class PersonnelCabine extends Employe {
    private String qualification;
    private List<Vol> volsAffectes = new ArrayList<>();

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact,
                           String numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel de cabine";
    }

    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Qualification : " + qualification);
    }

    public void affecterVol(Vol vol) {
        volsAffectes.add(vol);
        System.out.println("Le vol " + vol.getNumeroVol() + " a été affecté au personnel cabine " + getNom());
    }

    public void obtenirVol() {
        System.out.println("Vols affectés à " + getNom() + " :");
        for (Vol v : volsAffectes) {
            System.out.println("- " + v.getNumeroVol());
        }
    }
}
