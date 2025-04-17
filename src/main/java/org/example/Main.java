package org.example;

import app.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionPassager gestionPassager = new GestionPassager();

        int choix;
        do {
            System.out.println("\n=== MENU PASSAGER ===");
            System.out.println("1. Ajouter un passager");
            System.out.println("2. Modifier un passager");
            System.out.println("3. Supprimer un passager");
            System.out.println("4. Afficher tous les passagers");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // nettoie la ligne

            switch (choix) {
                case 1:
                    System.out.print("Identifiant : ");
                    String id = scanner.nextLine();

                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();

                    System.out.print("Adresse : ");
                    String adresse = scanner.nextLine();

                    System.out.print("Contact : ");
                    String contact = scanner.nextLine();

                    System.out.print("Passeport : ");
                    String passeport = scanner.nextLine();

                    Passager nouveau = new Passager(id, nom, adresse, contact, passeport);
                    gestionPassager.ajouterPassager(nouveau);
                    break;

                case 2:
                    System.out.print("Identifiant du passager à modifier : ");
                    String idModif = scanner.nextLine();
                    Passager passagerModif = gestionPassager.chercherPassager(idModif);

                    if (passagerModif != null) {
                        int sousChoix;
                        do {
                            System.out.println("\n--- Modifier Passager " + passagerModif.getNom() + " ---");
                            System.out.println("1. Nom");
                            System.out.println("2. Adresse");
                            System.out.println("3. Contact");
                            System.out.println("4. Passeport");
                            System.out.println("0. Terminer les modifications");
                            System.out.print("Votre choix : ");
                            sousChoix = scanner.nextInt();
                            scanner.nextLine(); // consommer le retour

                            switch (sousChoix) {
                                case 1:
                                    System.out.print("Nouveau nom : ");
                                    passagerModif.setNom(scanner.nextLine());
                                    break;
                                case 2:
                                    System.out.print("Nouvelle adresse : ");
                                    passagerModif.setAdresse(scanner.nextLine());
                                    break;
                                case 3:
                                    System.out.print("Nouveau contact : ");
                                    passagerModif.setContact(scanner.nextLine());
                                    break;
                                case 4:
                                    System.out.print("Nouveau passeport : ");
                                    passagerModif.setPasseport(scanner.nextLine());
                                    break;
                                case 0:
                                    System.out.println("Modification terminée.");
                                    break;
                                default:
                                    System.out.println("Choix invalide.");
                            }
                        } while (sousChoix != 0);
                    } else {
                        System.out.println("Passager introuvable.");
                    }
                    break;

                case 3:
                    System.out.print("Identifiant du passager à supprimer : ");
                    String idSuppr = scanner.nextLine();
                    gestionPassager.supprimerPassager(idSuppr);
                    break;

                case 4:
                    gestionPassager.afficherTousLesPassagers();
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        scanner.close();
    }
}
