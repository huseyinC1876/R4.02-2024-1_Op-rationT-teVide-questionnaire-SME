package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.test.question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impl.question.IQuestionMockWrongTypeArgument;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.WrongArgumentTypeException;

public class IQuestionTestWrongTypeArgument {
    private IQuestionMockWrongTypeArgument questionMockWrongTypeArgument = new IQuestionMockWrongTypeArgument();

    @Test
    public void testCreerQuestionWrongArgumentTypeException() throws MissingArgumentException, WrongArgumentTypeException {
        String[] ligne = {"1", "FR", "Question test", "Reponse test", "five", "Explication test", "Reference test"};
        Assertions.assertThrows(WrongArgumentTypeException.class, () -> {
            questionMockWrongTypeArgument.creerQuestion(ligne);
        });

    }
}
