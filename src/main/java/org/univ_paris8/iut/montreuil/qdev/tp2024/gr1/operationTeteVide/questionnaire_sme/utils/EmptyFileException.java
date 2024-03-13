package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils;

public class EmptyFileException extends Exception{
    public EmptyFileException(){
        super("Le fichier est vide");
    }
}
