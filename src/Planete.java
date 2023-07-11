
public class Planete {
    static int nbPlanetesDecouvertes;
    String nom;
    int diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;

    Vaisseau vaisseau;

    Planete (String nom){
        nbPlanetesDecouvertes+=1;
        this.nom=nom;
    }

    static String expansion(double distance){
        if (distance<14){
            return "Oh la la mais c'est super rapide !";
        }
        else{
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }

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
