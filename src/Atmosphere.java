
public class Atmosphere {
    Float tauxHelium;
    Float tauxHydrogene;
    Float tauxAzote;
    Float tauxArgon;
    Float tauxDioxydeDeCarbone;
    Float tauxSodium;
    Float tauxMethane;
    Float tauxOxygene;

    void descAtmosphere() {
        if (this.tauxHydrogene!=null)           System.out.println("A "+this.tauxHydrogene.floatValue()+"% d'hydrogène");
        if (this.tauxArgon!=null)               System.out.println("A "+this.tauxArgon.floatValue()+"% d'argon");
        if (this.tauxDioxydeDeCarbone!=null)    System.out.println("A "+this.tauxDioxydeDeCarbone.floatValue()+"% de dioxyde de carbone");
        if (this.tauxAzote!=null)               System.out.println("A "+this.tauxAzote.floatValue()+"% d'azote");
        if (this.tauxHelium!=null)              System.out.println("A "+this.tauxHelium.floatValue()+"% d'hélium");
        if (this.tauxMethane!=null)             System.out.println("A "+this.tauxMethane.floatValue()+"% de méthane");
        if (this.tauxSodium!=null)              System.out.println("A "+this.tauxSodium.floatValue()+"% de sodium");
        if (this.tauxOxygene!=null)             System.out.println("A "+this.tauxOxygene.floatValue()+"% d'oxygène");
    }
}
