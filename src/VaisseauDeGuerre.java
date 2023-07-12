
public class VaisseauDeGuerre extends Vaisseau {
    void attaque(Vaisseau vaisseauCible, String arme, int duree){
        System.out.println("Un vaisseau de type "+type+" attaque un vaisseau de type "+vaisseauCible.type+" en utilisant l'arme "+arme+" pendant "+duree+" minutes.");
        vaisseauCible.resistanceDuBouclier=0;
        vaisseauCible.blindage=vaisseauCible.blindage/2;
    }
}
