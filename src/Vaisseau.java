
public abstract class Vaisseau {
    String type;
    int nbPassagers;
    int resistanceDuBouclier;
    int blindage;
    int tonnageActuel;
    int tonnageMax;

    Vaisseau(){

    }

    Vaisseau(String type){
        this.type=type;
        switch(type){
            case "CHASSEUR":        this.tonnageMax=0;break;
            case "FREGATE":         this.tonnageMax=50;break;
            case "CROISEUR":        this.tonnageMax=100;break;
            case "CARGO":           this.tonnageMax=500;break;
            case "VAISSEAU-MONDE":  this.tonnageMax=2000;break;
        }

    }
    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+type+".");
    }

    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type "+type+".");
    }

    abstract int emporterCargaison(int tonnage);
}
