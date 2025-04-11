package app;

public class Personne {
        private String identifiant;
        private String nom;
        private String adresse;
        private String contact;
        public void obtenirInfos(){
            System.out.println("ID:"+ identifiant);
            System.out.println("Nom:" + nom);
            System.out.println("Adresse:" + adresse);
            System.out.println("Contact:" + contact);
        }
    }

