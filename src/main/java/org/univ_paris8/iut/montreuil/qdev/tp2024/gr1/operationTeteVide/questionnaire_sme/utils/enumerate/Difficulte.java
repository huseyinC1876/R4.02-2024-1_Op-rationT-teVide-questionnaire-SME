package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate;

public enum Difficulte {
    FACILE(1),
    INTERMEDIARE(2),
    DIFFICILE(3);

    private final int numero;

    Difficulte(int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }
}
