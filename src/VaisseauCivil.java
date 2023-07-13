
public class VaisseauCivil extends Vaisseau{

    VaisseauCivil(){
        super();
    }

    VaisseauCivil(String type){
        super(type);
    }
    @Override
    int emporterCargaison(int tonnage) {

        System.out.println("Le vaisseau "+this.type+" tente d'embarquer "+tonnage+" tonnes");
        int tonnageRestant = this.tonnageMax-this.tonnageActuel;
        if (tonnage>tonnageRestant){
            this.tonnageActuel=this.tonnageMax;
            return tonnage-tonnageRestant;
        }
        else{
            this.tonnageActuel+=tonnage;
            return 0;
        }
    }
}
