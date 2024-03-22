package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.test.question;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impl.question.IQuestionMockOk;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.WrongArgumentTypeException;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IQuestionTestOk {
    private IQuestionMockOk iQuestionMockOk = new IQuestionMockOk();

    @Test
    public void testCreerQuestionOk() throws MissingArgumentException, WrongArgumentTypeException {
        QuestionDTO actualQuestion = new QuestionDTO(1, Langue.FR, "Question test", "Reponse test", Difficulte.DIFFICILE, "Explication test", "Reference test");
        String[] ligne = {"1", String.valueOf(Langue.FR), "Question test", "Reponse test", "5", "Explication test", "Reference test"};
        QuestionDTO expectedQuestion = iQuestionMockOk.creerQuestion(ligne);
        Assertions.assertEquals(expectedQuestion, actualQuestion);
    }


}

