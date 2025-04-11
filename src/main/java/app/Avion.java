package app;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private boolean disponible;

    public Avion(String immatriculation, String modele, int capacite){
        this.immatriculation= immatriculation;
        this.modele= modele;
        this.capacite= capacite;
        this.disponible= true;
    }
    public String getImmatriculation() {
        return immatriculation;
    }
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public void affecterVol(){
        if(this.disponible){
            this.disponible= false;
            System.out.println("L'avion "+ immatriculation+" a été affecté à un vol.");
            }
        else{
            System.out.println("L'avion " + immatriculation + "n'est pas disponible.");
            }

    }
    public void libererAvion(){
        this.disponible= true;
        System.out.println("L'avion "+immatriculation + " est maintenant disponible. ");
    }
    public boolean verifierDisponibilite(){
        return this.disponible;
    }
}
