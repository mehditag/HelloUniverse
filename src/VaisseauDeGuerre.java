
public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees;

    VaisseauDeGuerre(){
        super();
    }

    VaisseauDeGuerre(String type){
        super(type);
    }

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
        super.activerBouclier();
    }

    @Override
    int emporterCargaison(int tonnage) {

        System.out.println("Le vaisseau "+this.type+" tente d'embarquer "+tonnage+" tonnes");

        if (this.equals("CHASSEUR")) return tonnage;
        else{
            if (this.nbPassagers<12) return tonnage;
            else{
                int tonnagePassagers = 2*this.nbPassagers;
                int tonnageRestant = this.tonnageMax-this.tonnageActuel;
                int tonnageAConsiderer=(tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
                if (tonnage>tonnageAConsiderer){
                    this.tonnageActuel=this.tonnageMax;
                    return tonnage-tonnageAConsiderer;
                }
                else{
                    this.tonnageActuel+=tonnage;
                    return 0;
                }
            }



        }
    }
}
