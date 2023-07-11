public class Atmosphere {

    float txHydrogene;
    float txMethane;
    float txAzote;
    float txHelium;
    float txArgon;
    float txCarbone;
    float txSodium;

    float txOxygene;

    void newAtmoshpere(float txHydrogene, float txOxygene,float txMethane, float txAzote, float txHelium, float txArgon, float txCarbone, float txSodium) {

        this.txHydrogene = txHydrogene;
        this.txMethane = txMethane;
        this.txAzote = txAzote;
        this.txHelium = txHelium;
        this.txArgon = txArgon;
        this.txCarbone = txCarbone;
        this.txSodium = txSodium;
        this.txOxygene=txOxygene;
    }

    void descAtmosphere() {
        System.out.println("A "+this.txHydrogene+"% d'hydrogène");
        System.out.println("A "+this.txArgon+"% d'argon");
        System.out.println("A "+this.txCarbone+"% de dioxyde de carbone");
        System.out.println("A "+this.txAzote+"% d'azote");
        System.out.println("A "+this.txHelium+"% d'hélium");
        System.out.println("A "+this.txMethane+"% de méthane");
        System.out.println("A "+this.txSodium+"% de sodium");
        System.out.println("A "+this.txOxygene+"% d'oxygène");
    }
}