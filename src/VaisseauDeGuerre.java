public class VaisseauDeGuerre extends Vaisseau{

    void attaque(Vaisseau cible, String arme, int tpsAttaque){
        System.out.println("Un vaisseau de type "+this.type+" attaque un vaisseau de type "+cible.type+" en utilisant l'arme "+arme+" pendant "+tpsAttaque+" minutes");
        cible.resistanceDuBouclier=0;
        cible.blindage/=2;

    }
}