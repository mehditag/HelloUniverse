public enum TypeVaisseau {
    VAISSEAUMONDE("Vaisseau-Monde"),
    CHASSEUR("Chasseur"),
    FREGATE("Frégate"),
    CROISEUR("Croiseur"),
    CARGO("Cargo");

    String nomVaisseau;
    TypeVaisseau(String nomVaisseau) {
        this.nomVaisseau=nomVaisseau;
    }
}
