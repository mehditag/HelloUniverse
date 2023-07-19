package com.espacex.decouverte.enginsspatiaux;

import java.util.Scanner;

public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil(TypeVaisseau type) {
        super(type);
        if (type == TypeVaisseau.CARGO) {
            tonnageMax = 500;
        } else if (type == TypeVaisseau.VAISSEAUMONDE) {
            tonnageMax = 2000;
        }

    }

    public int emporterCargaison(int tonnage) {

        int tonnageRestant = tonnageMax - this.tonnageActuel;
        try {
            this.verifCargaison(tonnage, tonnageRestant);
            tonnageActuel += tonnage;
            return 0;
        } catch (DepassementTonnageException e) {
            System.out.println(e.getMessage());
            System.out.println("Voulez-vous emporter une cargaison partielle à hauteur de la place disponible (" + tonnageRestant + " tonnes) oui/non");
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().equals("oui")) {
                this.tonnageActuel = tonnageMax;
                return tonnage - tonnageRestant;
            }
            else {
                return tonnage;
            }
        }
    }
    private void verifCargaison(int tonnage, int tonnageRestant) throws DepassementTonnageException{
        if (tonnage>tonnageRestant){
            throw new DepassementTonnageException(tonnage-tonnageRestant);
        }
    }

}
