package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.FileNotAvailableException;

import java.util.ArrayList;

public class IQuestionnaireImplMockOk implements IQuestionnaire {
    @Override
    public QuestionnaireDTO chargerQuestionnaire(String url) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {

        ArrayList<QuestionDTO> lq = new ArrayList();
        QuestionnaireDTO questionnaire = new QuestionnaireDTO(lq);

        return questionnaire; //mettre le résultat que l'on veut
    }
}
