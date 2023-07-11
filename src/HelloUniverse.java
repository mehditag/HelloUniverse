

public class HelloUniverse {

    public static void main(String... args) {

        Planete Mercure= new Planete();
        Mercure.nom = "Mercure";
        Mercure.diametre=4880;
        Mercure.matiere="Tellurique";
        Mercure.atmosphere= new Atmosphere();
        Mercure.atmosphere.newAtmoshpere(22,42,7,0,0,0,0,29);

        Planete Venus= new Planete();
        Venus.nom = "Venus";
        Venus.diametre=12100;
        Venus.matiere="Tellurique";
        Venus.atmosphere= new Atmosphere();
        Venus.atmosphere.newAtmoshpere(0,1,0,3,0,0,96,0);

        Planete Terre= new Planete();
        Terre.nom = "Terre";
        Terre.diametre=12756;
        Terre.matiere="Tellurique";

        Planete Mars= new Planete();
        Mars.nom = "Mars";
        Mars.diametre=6792;
        Mars.matiere="Tellurique";

        Planete Jupiter= new Planete();
        Jupiter.nom = "Jupiter";
        Jupiter.diametre=142984;
        Jupiter.matiere="Gazeuse";

        Planete Saturne= new Planete();
        Saturne.nom = "Saturne";
        Saturne.diametre=120536;
        Saturne.matiere="Gazeuse";

        Planete Uranus= new Planete();
        Uranus.nom = "Uranus";
        Uranus.diametre=51118;
        Uranus.matiere="Gazeuse";
        Uranus.atmosphere= new Atmosphere();
        Uranus.atmosphere.newAtmoshpere(83,0,2.5f,15,0,0,0,0);

        Planete Neptune= new Planete();
        Neptune.nom = "Neptune";
        Neptune.diametre=49532;
        Neptune.matiere="Gazeuse";

        Planete Pluton= new Planete();
        Pluton.nom = "Pluton";
        Pluton.diametre=2300;
        Pluton.matiere="Gazeuse";

        System.out.println(Jupiter.nom+" est une planète "+Jupiter.matiere+" avec un diametre de "+Jupiter.diametre+"km.");

        System.out.println("L'atmosphère de Uranus est composée de :");
        Uranus.atmosphere.descAtmosphere();

    }

}
