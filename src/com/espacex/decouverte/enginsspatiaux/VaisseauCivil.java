package com.espacex.decouverte.enginsspatiaux;
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
        if (tonnage > tonnageRestant) {
            this.tonnageActuel = tonnageMax;
            return tonnage-tonnageRestant;
        }
        this.tonnageActuel+=tonnage;
        return 0;
    }

}
