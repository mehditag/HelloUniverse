package com.espacex.decouverte;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CARGO;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.FREGATE;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CROISEUR;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CHASSEUR;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.VAISSEAUMONDE;

import com.espacex.decouverte.enginsspatiaux.TypeVaisseau;
import com.espacex.decouverte.enginsspatiaux.Vaisseau;
import com.espacex.decouverte.enginsspatiaux.VaisseauCivil;
import com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre;
import com.espacex.decouverte.objetsastro.Atmosphere;
import com.espacex.decouverte.objetsastro.Galaxie;
import com.espacex.decouverte.objetsastro.Planete;
import com.espacex.decouverte.objetsastro.PlaneteGazeuse;
import com.espacex.decouverte.objetsastro.PlaneteTellurique;

import java.util.Scanner;


public class HelloUniverse {

    public static void main(String... args) {

        Galaxie systemeSolaire=new Galaxie();


        PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 1);
        mercure.diametre = 4880;
        mercure.distanceEtoile=57.9f;

        PlaneteTellurique venus = new PlaneteTellurique("Venus", 2);
        venus.diametre = 12100;
        venus.distanceEtoile=108.2f;

        PlaneteTellurique terre = new PlaneteTellurique("Terre", 100);
        terre.diametre = 12756;
        terre.distanceEtoile=149.6f;

        PlaneteTellurique mars = new PlaneteTellurique("Mars", 5);
        mars.diametre = 6792;
        mars.distanceEtoile=227.9f;


        mars.atmosphere = new Atmosphere();

        mars.atmosphere.constituants.put("CO2",95f);
        mars.atmosphere.constituants.put("N2",3f);
        mars.atmosphere.constituants.put("AR",1.5f);
        mars.atmosphere.constituants.put("NO",0.013f);

        for (String constituant : mars.atmosphere.constituants.keySet()){
            System.out.println("L'atmosphère de "+mars.nom+" est contitué de "+mars.atmosphere.constituants.get(constituant)+"% de "+constituant );
        }

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        jupiter.distanceEtoile=778.3f;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        saturne.distanceEtoile=1427.0f;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        uranus.distanceEtoile=2877.38f;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;
        neptune.distanceEtoile=4497.07f;


        systemeSolaire.planetes.add(uranus);
        systemeSolaire.planetes.add(neptune);
        systemeSolaire.planetes.add(mars);
        systemeSolaire.planetes.add(venus);
        systemeSolaire.planetes.add(saturne);
        systemeSolaire.planetes.add(jupiter);
        systemeSolaire.planetes.add(mercure);
        systemeSolaire.planetes.add(terre);

        for (Planete p : systemeSolaire.planetes) {
            System.out.println("La planète "+p.nom+" se trouve à "+p.distanceEtoile+" du soleil");
        }

        Vaisseau chasseur = new VaisseauDeGuerre(CHASSEUR);
        chasseur.nbPassagers = 3;
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        Vaisseau croiseur = new VaisseauDeGuerre(CROISEUR);
        croiseur.nbPassagers = 35;
        croiseur.blindage = 851;
        croiseur.resistanceDuBouclier = 25;

        Vaisseau fregate = new VaisseauDeGuerre(FREGATE);
        fregate.nbPassagers = 100;
        fregate.blindage = 542;
        fregate.resistanceDuBouclier = 50;

        Vaisseau cargo = new VaisseauCivil(CARGO);
        cargo.nbPassagers = 10000;
        cargo.blindage = 1520;
        cargo.resistanceDuBouclier = 20;

        Vaisseau vaisseauMonde = new VaisseauCivil(VAISSEAUMONDE);
        vaisseauMonde.nbPassagers = 10000;
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        Vaisseau chasseur2 = new VaisseauDeGuerre(CHASSEUR);
        chasseur2.nbPassagers = 4;
        chasseur2.blindage = 156;
        chasseur2.resistanceDuBouclier = 2;
        Vaisseau chasseur3 = new VaisseauDeGuerre(CHASSEUR);
        chasseur3.nbPassagers = 5;
        chasseur3.blindage = 156;
        chasseur3.resistanceDuBouclier = 2;
        Vaisseau cargo2 = new VaisseauCivil(CARGO);
        cargo2.nbPassagers = 10001;
        cargo2.blindage = 1520;
        cargo2.resistanceDuBouclier = 20;
        terre.accueillirVaisseaux(chasseur2,chasseur3,cargo2);

        Scanner sc = new Scanner(System.in);
        boolean recommencer = true;
        while (recommencer) {
            System.out.println("Quel vaisseau souhaitez vous manipuler​ : " + CHASSEUR.name() + ", " + FREGATE.name() + ", " + CROISEUR.name() + ", " + CARGO.name() + " ou " + VAISSEAUMONDE.name() + " ?");
            String typeVaisseauString = sc.nextLine();
            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(typeVaisseauString);
            Vaisseau vaisseauSelectionne = null;
            switch (typeVaisseau) {
                case CHASSEUR:
                    vaisseauSelectionne = chasseur;
                    break;
                case FREGATE:
                    vaisseauSelectionne = fregate;
                    break;
                case CROISEUR:
                    vaisseauSelectionne = croiseur;
                    break;
                case CARGO:
                    vaisseauSelectionne = cargo;
                    break;
                case VAISSEAUMONDE:
                    vaisseauSelectionne = vaisseauMonde;
                    break;
            }

            System.out.println("Sur quelle planète tellurique du systeme solaire voulez-vous vous poser : Mercure, Venus, Terre ou Mars ?");
            String nomPlanete = sc.nextLine();
            Planete planeteSelectionneeDansGalaxie = null;
            for (Planete planeteSuivante : systemeSolaire.planetes){
                if (planeteSuivante.nom.equals(nomPlanete)){
                    planeteSelectionneeDansGalaxie=planeteSuivante;
                    break;
                }
            }
            if (planeteSelectionneeDansGalaxie instanceof PlaneteGazeuse){
                System.out.println("Il ne s'agit pas d'une planète Tellurique !");
                continue;
            }

            System.out.println("Le vaisseau souhaite se poser sur la planète "+planeteSelectionneeDansGalaxie.nom);
            PlaneteTellurique planeteSelectionnee=(PlaneteTellurique)planeteSelectionneeDansGalaxie;

            System.out.println("Quel tonnage souhaitez-vous emporter ?");
            int tonnageSouhaite = sc.nextInt();

            if (planeteSelectionnee.restePlaceDisponible(vaisseauSelectionne)) {
                planeteSelectionnee.accueillirVaisseaux(vaisseauSelectionne);
                System.out.println("Le vaisseau a rejeté : " + vaisseauSelectionne.emporterCargaison(tonnageSouhaite) + " tonnes.");
            } else {
                System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
            }

            sc.nextLine();
            System.out.println("Voulez-vous recommencer oui/non ?");

            recommencer = sc.nextLine().equals("oui");

        }
    }

}
