

public class HelloUniverse {

    public static void main(String... args) {

        Planete mercure= new Planete();
        mercure.nom = "Mercure";
        mercure.diametre=4880;
        mercure.matiere="Tellurique";
        mercure.atmosphere= new Atmosphere();
        mercure.atmosphere.newAtmoshpere(22,42,7,0,0,0,0,29);

        Planete venus= new Planete();
        venus.nom = "Venus";
        venus.diametre=12100;
        venus.matiere="Tellurique";
        venus.atmosphere= new Atmosphere();
        venus.atmosphere.newAtmoshpere(0,1,0,3,0,0,96,0);

        Planete terre= new Planete();
        terre.nom = "Terre";
        terre.diametre=12756;
        terre.matiere="Tellurique";

        Planete mars= new Planete();
        mars.nom = "Mars";
        mars.diametre=6792;
        mars.matiere="Tellurique";

        Planete jupiter= new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre=142984;
        jupiter.matiere="Gazeuse";

        Planete saturne= new Planete();
        saturne.nom = "Saturne";
        saturne.diametre=120536;
        saturne.matiere="Gazeuse";

        Planete uranus= new Planete();
        uranus.nom = "Uranus";
        uranus.diametre=51118;
        uranus.matiere="Gazeuse";
        uranus.atmosphere= new Atmosphere();
        uranus.atmosphere.newAtmoshpere(83,0,2.5f,15,0,0,0,0);

        Planete neptune= new Planete();
        neptune.nom = "Neptune";
        neptune.diametre=49532;
        neptune.matiere="Gazeuse";

        Planete pluton= new Planete();
        pluton.nom = "Pluton";
        pluton.diametre=2300;
        pluton.matiere="Gazeuse";

        //System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diametre de "+jupiter.diametre+"km.");

        //System.out.println("L'atmosphère de Uranus est composée de :");
        //uranus.atmosphere.descAtmosphere();

        Vaisseau fregate = new Vaisseau();
        fregate.type="Frégate";
        fregate.nbPassagers=9;

        mars.accueillirVaisseau(fregate);
        Vaisseau croiseur = new Vaisseau();
        croiseur.type="Croiseur";
        croiseur.nbPassagers=42;

        mars.accueillirVaisseau(croiseur);

        System.out.println("Le nombre d'humains ayant déjà séjourné sur "+mars.nom+" est actuellement de "+mars.totalVisiteurs);

        System.out.println(Planete.expansion(10.5d));
        System.out.println(Planete.expansion(14.2d));

    }

}
