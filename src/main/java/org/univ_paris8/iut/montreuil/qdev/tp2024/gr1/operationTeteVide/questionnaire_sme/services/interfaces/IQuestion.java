package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.WrongArgumentTypeException;

public interface IQuestion {

    public QuestionDTO creerQuestion(String[] ligne) throws MissingArgumentException, WrongArgumentTypeException;

}
