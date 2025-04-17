// Fichier complet : Main.java avec menu principal + sous-menus CRUD pour chaque entité

package org.example;

import app.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GestionPassager gestionPassager = new GestionPassager();
        GestionAeroport gestionAeroport = new GestionAeroport();
        GestionVol gestionVol = new GestionVol();
        GestionAvion gestionAvion = new GestionAvion();
        GestionEmploye gestionEmploye = new GestionEmploye();
        GestionReservation gestionReservation = new GestionReservation();

        int choixPrincipal;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Gestion des passagers");
            System.out.println("2. Gestion des aéroports");
            System.out.println("3. Gestion des vols");
            System.out.println("4. Gestion des avions");
            System.out.println("5. Gestion des employés");
            System.out.println("6. Gestion des réservations");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choixPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (choixPrincipal) {
                case 1 -> menuPassager(scanner, gestionPassager);
                case 2 -> menuAeroport(scanner, gestionAeroport);
                case 3 -> menuVol(scanner, gestionVol);
                case 4 -> menuAvion(scanner, gestionAvion);
                case 5 -> menuEmploye(scanner, gestionEmploye);
                case 6 -> menuReservation(scanner, gestionReservation);
                case 0 -> System.out.println("Fermeture du programme...");
                default -> System.out.println("Choix invalide.");
            }
        } while (choixPrincipal != 0);
    }

    public static void menuPassager(Scanner scanner, GestionPassager g) {
        int choix;
        do {
            System.out.println("\n--- GESTION DES PASSAGERS ---");
            System.out.println("1. Ajouter");
            System.out.println("2. Modifier");
            System.out.println("3. Supprimer");
            System.out.println("4. Afficher tous");
            System.out.println("0. Retour");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> {
                    System.out.print("ID : ");
                    String id = scanner.nextLine();
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Contact : ");
                    String contact = scanner.nextLine();
                    System.out.print("Passeport : ");
                    String passeport = scanner.nextLine();
                    Passager p = new Passager(id, nom, adresse, contact, passeport);
                    g.ajouterPassager(p);
                }
                case 2 -> {
                    System.out.print("ID du passager à modifier : ");
                    String idModif = scanner.nextLine();
                    Passager passager = g.chercherPassager(idModif);
                    if (passager != null) {
                        int sousChoix;
                        do {
                            System.out.println("1. Nom\n2. Adresse\n3. Contact\n4. Passeport\n0. Terminer");
                            sousChoix = scanner.nextInt();
                            scanner.nextLine();
                            switch (sousChoix) {
                                case 1 -> {
                                    System.out.print("Nouveau nom : ");
                                    passager.setNom(scanner.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Nouvelle adresse : ");
                                    passager.setAdresse(scanner.nextLine());
                                }
                                case 3 -> {
                                    System.out.print("Nouveau contact : ");
                                    passager.setContact(scanner.nextLine());
                                }
                                case 4 -> {
                                    System.out.print("Nouveau passeport : ");
                                    passager.setPasseport(scanner.nextLine());
                                }
                            }
                        } while (sousChoix != 0);
                    } else {
                        System.out.println("Passager introuvable.");
                    }
                }
                case 3 -> {
                    System.out.print("ID à supprimer : ");
                    String idSuppr = scanner.nextLine();
                    g.supprimerPassager(idSuppr);
                }
                case 4 -> g.afficherTousLesPassagers();
            }
        } while (choix != 0);
    }

    public static void menuAeroport(Scanner scanner, GestionAeroport g) {
        int choix;
        do {
            System.out.println("\n--- GESTION DES AÉROPORTS ---");
            System.out.println("1. Ajouter");
            System.out.println("2. Modifier");
            System.out.println("3. Supprimer");
            System.out.println("4. Afficher tous");
            System.out.println("0. Retour");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> {
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Ville : ");
                    String ville = scanner.nextLine();
                    System.out.print("Description : ");
                    String desc = scanner.nextLine();
                    g.ajouterAeroport(new Aeroport(nom, ville, desc));
                }
                case 2 -> {
                    System.out.print("Nom à modifier : ");
                    String nom = scanner.nextLine();
                    System.out.print("Nouvelle ville : ");
                    String ville = scanner.nextLine();
                    System.out.print("Nouvelle description : ");
                    String desc = scanner.nextLine();
                    g.modifierAeroport(nom, ville, desc);
                }
                case 3 -> {
                    System.out.print("Nom à supprimer : ");
                    g.supprimerAeroport(scanner.nextLine());
                }
                case 4 -> g.afficherTousLesAeroports();
            }
        } while (choix != 0);
    }

    public static void menuVol(Scanner scanner, GestionVol g) {
        int choix;
        do {
            System.out.println("\n--- GESTION DES VOLS ---");
            System.out.println("1. Ajouter");
            System.out.println("2. Modifier");
            System.out.println("3. Supprimer");
            System.out.println("4. Afficher tous");
            System.out.println("0. Retour");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> {
                    System.out.print("Numéro : ");
                    String num = scanner.nextLine();
                    System.out.print("Origine : ");
                    String ori = scanner.nextLine();
                    System.out.print("Destination : ");
                    String dest = scanner.nextLine();
                    System.out.print("Départ : ");
                    String dep = scanner.nextLine();
                    System.out.print("Arrivée : ");
                    String arr = scanner.nextLine();
                    g.ajouterVol(new Vol(num, ori, dest, dep, arr));
                }
                case 2 -> {
                    System.out.print("Numéro à modifier : ");
                    String num = scanner.nextLine();
                    System.out.print("Nouvelle origine : ");
                    String ori = scanner.nextLine();
                    System.out.print("Nouvelle destination : ");
                    String dest = scanner.nextLine();
                    System.out.print("Nouvelle départ : ");
                    String dep = scanner.nextLine();
                    System.out.print("Nouvelle arrivée : ");
                    String arr = scanner.nextLine();
                    g.modifierVol(num, ori, dest, dep, arr);
                }
                case 3 -> {
                    System.out.print("Numéro à supprimer : ");
                    g.supprimerVol(scanner.nextLine());
                }
                case 4 -> g.afficherTousLesVols();
            }
        } while (choix != 0);
    }

    public static void menuAvion(Scanner scanner, GestionAvion g) {
        int choix;
        do {
            System.out.println("\n--- GESTION DES AVIONS ---");
            System.out.println("1. Ajouter");
            System.out.println("2. Modifier");
            System.out.println("3. Supprimer");
            System.out.println("4. Afficher tous");
            System.out.println("0. Retour");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> {
                    System.out.print("Immatriculation : ");
                    String imm = scanner.nextLine();
                    System.out.print("Modèle : ");
                    String mod = scanner.nextLine();
                    System.out.print("Capacité : ");
                    int cap = scanner.nextInt();
                    scanner.nextLine();
                    g.ajouterAvion(new Avion(imm, mod, cap));
                }
                case 2 -> {
                    System.out.print("Immatriculation : ");
                    String imm = scanner.nextLine();
                    System.out.print("Nouveau modèle : ");
                    String mod = scanner.nextLine();
                    System.out.print("Nouvelle capacité : ");
                    int cap = scanner.nextInt();
                    scanner.nextLine();
                    g.modifierAvion(imm, mod, cap);
                }
                case 3 -> {
                    System.out.print("Immatriculation à supprimer : ");
                    g.supprimerAvion(scanner.nextLine());
                }
                case 4 -> g.afficherTousLesAvions();
            }
        } while (choix != 0);
    }

    public static void menuEmploye(Scanner scanner, GestionEmploye g) {
        int choix;
        do {
            System.out.println("\n--- GESTION DES EMPLOYÉS ---");
            System.out.println("1. Ajouter un pilote");
            System.out.println("2. Afficher tous les employés");
            System.out.println("0. Retour");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> {
                    System.out.print("ID : ");
                    String id = scanner.nextLine();
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Contact : ");
                    String contact = scanner.nextLine();
                    System.out.print("Numéro employé : ");
                    String num = scanner.nextLine();
                    System.out.print("Date d'embauche : ");
                    String date = scanner.nextLine();
                    System.out.print("Licence : ");
                    String licence = scanner.nextLine();
                    System.out.print("Heures de vol : ");
                    int heures = scanner.nextInt();
                    scanner.nextLine();
                    g.ajouterEmploye(new Pilote(id, nom, adresse, contact, num, date, licence, heures));
                }
                case 2 -> g.afficherTousLesEmployes();
            }
        } while (choix != 0);
    }

    public static void menuReservation(Scanner scanner, GestionReservation g) {
        int choix;
        do {
            System.out.println("\n--- GESTION DES RÉSERVATIONS ---");
            System.out.println("1. Ajouter");
            System.out.println("2. Modifier");
            System.out.println("3. Supprimer");
            System.out.println("4. Afficher toutes");
            System.out.println("0. Retour");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> {
                    System.out.print("Numéro : ");
                    String numero = scanner.nextLine();
                    System.out.print("Date : ");
                    String date = scanner.nextLine();
                    System.out.print("Statut : ");
                    String statut = scanner.nextLine();
                    g.ajouterReservation(new Reservation(numero, date, statut, null, null));
                }
                case 2 -> {
                    System.out.print("Numéro de réservation à modifier : ");
                    String numero = scanner.nextLine();
                    System.out.print("Nouvelle date : ");
                    String date = scanner.nextLine();
                    System.out.print("Nouveau statut : ");
                    String statut = scanner.nextLine();
                    g.modifierReservation(numero, date, statut);
                }
                case 3 -> {
                    System.out.print("Numéro à supprimer : ");
                    g.supprimerReservation(scanner.nextLine());
                }
                case 4 -> g.afficherToutesLesReservations();
            }
        } while (choix != 0);
    }
}
