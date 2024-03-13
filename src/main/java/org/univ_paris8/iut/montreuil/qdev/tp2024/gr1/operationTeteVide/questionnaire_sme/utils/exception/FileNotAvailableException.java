package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception;

public class FileNotAvailableException extends Exception{

    public FileNotAvailableException(){
        super("Le fichier n'a pas été trouvé");
    }
}
