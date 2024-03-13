package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception;

public class MissingArgumentException extends Exception{
    public MissingArgumentException(){
        super("Il manque un argument");
    }
}
