
public class Planete {
    String nom;
    int diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;

    Vaisseau vaisseau;

    int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+degres+" degrés.");
        return degres/360;
    }

    int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même de "+degres+" degrés.");
        return degres/360;
    }

    void accueillirVaisseau(Vaisseau vaisseau){

        if (this.vaisseau==null){
            System.out.println("Aucun vaisseau ne s'en va");
        }
        else{
            System.out.println("Un vaisseau de type "+this.vaisseau.type+" doit s'en aller");
        }
        this.vaisseau=vaisseau;
        this.totalVisiteurs+=this.vaisseau.nbPassagers;
    }

    /*void accueillirVaisseau(String typeVaisseau){
        if (typeVaisseau.equals("CHASSEUR")){
            totalVisiteurs+=3;
        }
        else if (typeVaisseau.equals("FREGATE")){
            totalVisiteurs+=12;
        }
        else if (typeVaisseau.equals("CROISEUR")){
            totalVisiteurs+=50;
        }
    }*/
}
