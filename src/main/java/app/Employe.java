package app;

public class Employe extends Personne{
    private String numeroEmploye;
    private String dateEmbauche;

    public Employe (String identifiant, String nom, String adresse, String contact) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public String getNumeroEmploye(){
        return numeroEmploye;
    }

    public String getDateEmbauche(){
        return dateEmbauche;
    }

    public void setNumeroEmploye(String numeroEmbauche){
        this.numeroEmploye = numeroEmploye;
    }

    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }

    public String obtenirRole(){
        return "Employé générique";
    }

    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Numéro employé : " + numeroEmploye);
        System.out.println("Date d'embauche : " + dateEmbauche);
    }
}
