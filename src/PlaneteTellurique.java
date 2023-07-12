
public class PlaneteTellurique extends Planete implements Habitable{
    Vaisseau vaisseauAccoste;
    int totalVisiteurs;

    public PlaneteTellurique(String nom) {
        super(nom);
    }

    public void accueillirVaisseau(Vaisseau nouveauVaisseau){
        totalVisiteurs+=nouveauVaisseau.nbPassagers;
        Vaisseau vaisseauPrecedent=vaisseauAccoste;

        if (nouveauVaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre) nouveauVaisseau).desactiverArmes();
        }

        if (vaisseauPrecedent==null){
            System.out.println("Aucun vaisseau ne s'en va");
        }
        else{
            System.out.println("Le vaisseau de type "+vaisseauPrecedent.type+" doit s'en aller");
        }
        vaisseauAccoste=nouveauVaisseau;
        //return vaisseauPrecedent;
    }
}


