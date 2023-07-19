package com.espacex.decouverte.objetsastro;

public abstract class Planete implements Comparable {
   public String nom;
   public int diametre;

    public Atmosphere atmosphere;

    static String forme="Sphérique";
    static int nbPlanetesDecouvertes;
    public Float distanceEtoile;

    Planete(String nom){
        this.nom=nom;
        nbPlanetesDecouvertes++;
    }

    int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+degres+" degrés.");
        return degres/360;
    }

    int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même de "+degres+" degrés.");
        return degres/360;
    }

    static String expansion (double milliardsDAnneesLumiere){
        if (milliardsDAnneesLumiere < 14){
            return "Oh la la mais c'est super rapide !";
        }
        else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }

    public int compareTo(Object o) {
        Planete planeteAComparer = (Planete)o;
        return this.distanceEtoile.compareTo(planeteAComparer.distanceEtoile);
    }
}
