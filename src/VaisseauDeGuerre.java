
public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees;

    void attaque(Vaisseau vaisseauCible, String arme, int duree){

        if (armesDesactivees){
            System.out.println("Attaque impossible, l'armement est désactivé");
        }
        else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseauCible.type + " en utilisant l'arme " + arme + " pendant " + duree + " minutes.");
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }

    void desactiverArmes(){
        this.armesDesactivees=true;
        System.out.println("Désactivation des armes d'un vaisseau de type "+this.type);
    }

    void activerBouclier(){
        this.desactiverArmes();
    }
}
