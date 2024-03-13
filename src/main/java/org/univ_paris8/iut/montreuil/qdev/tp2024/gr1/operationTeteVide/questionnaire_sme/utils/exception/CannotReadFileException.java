package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception;

public class CannotReadFileException extends Exception{

    public CannotReadFileException(){
        super("La lecture du fichier a échoué");
    }

}
