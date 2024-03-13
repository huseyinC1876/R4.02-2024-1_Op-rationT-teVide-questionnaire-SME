package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils;

public class WrongArgumentTypeException extends Exception{
    public WrongArgumentTypeException(){
        super("Un ou plusieurs arguments n'ont pas le bon type");
    }
}
