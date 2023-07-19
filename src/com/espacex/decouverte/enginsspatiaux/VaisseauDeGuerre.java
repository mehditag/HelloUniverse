package com.espacex.decouverte.enginsspatiaux;
public class VaisseauDeGuerre extends Vaisseau {

    boolean armesDesactivees;

    public VaisseauDeGuerre(TypeVaisseau type){
        this.type=type;
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

    public int emporterCargaison(int cargaison){
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
                if (cargaison>tonnageAConsiderer){
                    tonnageActuel=tonnageMax;
                    return cargaison-tonnageAConsiderer;
                }
                else {
                    tonnageActuel+=cargaison;
                    return 0;
                }
            }
        }
    }
}
