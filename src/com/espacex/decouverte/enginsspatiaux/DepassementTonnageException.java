
package com.espacex.decouverte.enginsspatiaux;

public class DepassementTonnageException extends Exception {

    public DepassementTonnageException(int tonnageEnExces){
        super("La cargaison ne peut être chargée car elle présente un excès de "+tonnageEnExces);
        this.tonnageEnExces=tonnageEnExces;
    }

    public int tonnageEnExces;

}
