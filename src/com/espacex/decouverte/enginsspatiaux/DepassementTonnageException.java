package com.espacex.decouverte.enginsspatiaux;

public class DepassementTonnageException extends Exception{

    int tonnageExces;

    public DepassementTonnageException(int tonnageExces) {
        super("La cargaison ne peut être chargée car elle présente un excès de "+tonnageExces+" tonnes.");
        this.tonnageExces=tonnageExces;
    }

}
