import java.util.Scanner;

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
        chasseur.type=TypeVaisseau.CHASSEUR;
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        ;System.out.println("Un vaisseau de type "+chasseur.type+ " se voit refuser "+chasseur.emporterCargaison(20)+" tonnes l'embarquement");


        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.valueOf("FREGATE"));
        fregate.nbPassagers=100;
        ;System.out.println("Un vaisseau de type "+fregate.type+ " se voit refuser "+fregate.emporterCargaison(45)+" tonnes à l'embarquement");
        ;System.out.println("Un vaisseau de type "+fregate.type+ " se voit refuser "+fregate.emporterCargaison(12)+" tonnes à l'embarquement");

        Vaisseau fregate2 = new VaisseauDeGuerre(TypeVaisseau.valueOf("FREGATE"));
        fregate2.nbPassagers=14;
        //System.out.println("Un vaisseau de type "+fregate2.type+ " se voit refuser "+fregate2.emporterCargaison(30)+" tonnes à l'embarquement");



        Vaisseau vaisseauMonde=new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        //vaisseauMonde.type=TypeVaisseau.valueOf("Vaisseau-Monde");
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel vaisseau voulez-vous manipuler");
        Vaisseau vaisseauSelectionne=null;
        TypeVaisseau vaisseau=TypeVaisseau.valueOf(sc.nextLine());
        switch (vaisseau){
            case FREGATE:vaisseauSelectionne=fregate;break;
            case VAISSEAUMONDE:vaisseauSelectionne=vaisseauMonde;
        }

        System.out.println("Sur quel planète voulez vous atterir ");
        String planete=sc.nextLine();
        PlaneteTellurique planeteChoisie= null;
        switch (planete)
        {
            case "TERRE":planeteChoisie=terre;break;
            case "MARS":planeteChoisie=mars;break;
        }

        System.out.println("Combien de tonne souhaitez vous charger");
        int tonnage=sc.nextInt();

        planeteChoisie.accueillirVaisseau(vaisseauSelectionne);
        System.out.println("Tonnage rejeté : "+vaisseauSelectionne.emporterCargaison(tonnage));

        uranus.atmosphere.tauxHydrogene=83F;
        uranus.atmosphere.tauxHelium=15F;
        uranus.atmosphere.tauxMethane=2.5F;
        uranus.atmosphere.tauxAzote=0.0F;

        uranus.descAtmosphere();


    }

}
