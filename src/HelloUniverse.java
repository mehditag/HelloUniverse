


public class HelloUniverse {

    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("MERCURE");
        mercure.diametre = 4880;

        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur=new VaisseauDeGuerre();
        chasseur.type="CHASSEUR";
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        System.out.println("Un vaisseau de type "+chasseur.type+ " se voit refuser "+chasseur.emporterCargaison(20)+" tonnes l'embarquement");


        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers=100;
        System.out.println("Un vaisseau de type "+fregate.type+ " se voit refuser "+fregate.emporterCargaison(45)+" tonnes à l'embarquement");
        System.out.println("Un vaisseau de type "+fregate.type+ " se voit refuser "+fregate.emporterCargaison(12)+" tonnes à l'embarquement");

        Vaisseau fregate2 = new VaisseauDeGuerre("FREGATE");
        fregate2.nbPassagers=14;
        System.out.println("Un vaisseau de type "+fregate2.type+ " se voit refuser "+fregate2.emporterCargaison(30)+" tonnes à l'embarquement");



        Vaisseau vaisseauMonde=new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.type="VAISSEAU-MONDE";
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        System.out.println("Un vaisseau de type "+vaisseauMonde.type+ " se voit refuser "+vaisseauMonde.emporterCargaison(1560)+" tonnes à l'embarquement");
        System.out.println("Un vaisseau de type "+vaisseauMonde.type+ " se voit refuser "+vaisseauMonde.emporterCargaison(600)+" tonnes à l'embarquement");


        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        ((VaisseauDeGuerre) chasseur).attaque(vaisseauMonde, "laser photonique", 3);
        vaisseauMonde.desactiverBouclier();

        System.out.println("Le Vaisseau-Monde dispose encore de "+vaisseauMonde.resistanceDuBouclier+" minutes de protection grâce à son bouclier.");
        System.out.println("Le Vaisseau-Monde dispose encore d'un blindage de valeur "+vaisseauMonde.blindage+".");

        mars.accueillirVaisseau(vaisseauMonde);

        mars.accueillirVaisseau(chasseur);





    }

}
