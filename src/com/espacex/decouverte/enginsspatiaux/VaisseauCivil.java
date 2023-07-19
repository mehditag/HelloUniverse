package com.espacex.decouverte.enginsspatiaux;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CARGO;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.VAISSEAUMONDE;

public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil(TypeVaisseau type) {
        super(type);
        if (type == CARGO) {
            tonnageMax = 500;
        } else if (type == VAISSEAUMONDE) {
            tonnageMax = 2000;
        }

    }

    public void emporterCargaison(int tonnage) throws DepassementTonnageException{

        int tonnageRestant = tonnageMax - tonnageActuel;
        if (tonnage > tonnageRestant) {
            //tonnageActuel = tonnageMax;
            throw new DepassementTonnageException(tonnage-tonnageRestant);
        }
        tonnageActuel+=tonnage;
    }

}
