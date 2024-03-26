package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.test.question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impl.question.IQuestionMockMissingArgument;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces.IQuestion;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.WrongArgumentTypeException;


public class IQuestionTestMissingArgument {
    private IQuestion iQuestion = new IQuestionMockMissingArgument();

    @Test
    public void testCreerQuestionMissingArgumentException() throws MissingArgumentException, WrongArgumentTypeException {
        String[] ligne = {"1", "FR", "Question test", "Reponse test", "5"};
        Assertions.assertThrows(MissingArgumentException.class, () -> {
            iQuestion.creerQuestion(ligne);
        });
    }

}

