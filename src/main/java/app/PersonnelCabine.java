package app;

public class PersonnelCabine extends Employe {
    private String qualification;

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
        super.obtenirInfos(); // → affiche les infos de Personne + Employe
        System.out.println("Qualification : " + qualification);
    }
}
    
}
