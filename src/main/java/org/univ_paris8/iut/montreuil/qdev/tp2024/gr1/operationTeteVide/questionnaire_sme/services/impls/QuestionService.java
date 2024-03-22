package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impls;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces.IQuestion;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.WrongArgumentTypeException;

import java.util.Objects;

public class QuestionService implements IQuestion {

    @Override
    public QuestionDTO creerQuestion(String[] ligne) throws MissingArgumentException, WrongArgumentTypeException {
        Difficulte difficulte = (Integer.parseInt(ligne[5]) == 1)? Difficulte.FACILE : (Integer.parseInt(ligne[5]) == 2)? Difficulte.INTERMEDIARE : Difficulte.DIFFICILE;
        Langue langue = (Objects.equals(ligne[2], "fr")) ? Langue.FR : null;

        QuestionDTO question = new QuestionDTO(
                Integer.parseInt(ligne[1]),
                langue,
                ligne[3],
                ligne[4],
                difficulte,
                ligne[6],
                ligne[7]


        );

        return question;
    }
}
