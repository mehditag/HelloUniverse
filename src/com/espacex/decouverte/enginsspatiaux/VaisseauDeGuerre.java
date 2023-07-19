package com.espacex.decouverte.enginsspatiaux;
import com.espacex.decouverte.enginsspatiaux.DepassementTonnageException;

import java.util.Scanner;

public class VaisseauDeGuerre extends Vaisseau{

    private boolean armesDesactivees;

    public VaisseauDeGuerre(TypeVaisseau type){
        super(type);
        if (type==TypeVaisseau.CHASSEUR){
            tonnageMax=0;
        }
        else if (type==TypeVaisseau.FREGATE){
            tonnageMax=50;
        }
        else if (type==TypeVaisseau.CROISEUR){
            tonnageMax=100;
        }

    }

    void attaque(Vaisseau vaisseauCible, String arme, int duree) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        } else {
            System.out.println("Un vaisseau de type " + type.nom + " attaque un vaisseau de type " + vaisseauCible.type.nom + " en utilisant l'arme " + arme + " pendant " + duree + " minutes.");
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }

    public void desactiverArmes() {
        System.out.println("Désactivation des armes d'un vaisseau de type " + type.nom);
        armesDesactivees = true;
    }

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+type.nom+".");
        desactiverArmes();
    }

    void activerArmes(){
        System.out.println("Activation des armes d'un vaisseau de type " + type.nom);
        armesDesactivees = false;
    }

    public int emporterCargaison(int cargaison) {
        if (type==TypeVaisseau.CHASSEUR){
            return cargaison;
        }
        else {
            if (nbPassagers<12){
                return cargaison;
            }
            else {
                int tonnagePassagers=nbPassagers*2;
                int tonnageRestant=tonnageMax-tonnageActuel;
                int tonnageAConsiderer=(tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
                try {
                    this.verifTonnage(cargaison,tonnageAConsiderer);
                    tonnageActuel+=cargaison;
                    return 0;
                } catch (DepassementTonnageException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Voulez-vous emporter une cargaison partielle à hauteur de la place disponible ("+tonnageAConsiderer+" tonnes) oui/non");
                    Scanner sc = new Scanner(System.in);
                    if (sc.nextLine().equals("oui")) {
                        tonnageActuel=tonnageMax;
                        return cargaison-tonnageAConsiderer;
                    }
                    else{
                        return cargaison;

                    }
                }
            }
        }
    }

    private void verifTonnage(int cargaison, int tonnageAConsiderer) throws DepassementTonnageException{
        if (cargaison>tonnageAConsiderer){
            throw new DepassementTonnageException(cargaison-tonnageAConsiderer);
        }
    }
}
