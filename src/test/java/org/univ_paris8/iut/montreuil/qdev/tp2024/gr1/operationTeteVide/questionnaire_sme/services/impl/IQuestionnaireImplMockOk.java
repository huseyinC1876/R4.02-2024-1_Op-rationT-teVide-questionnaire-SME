package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.FileNotAvailableException;

import java.util.ArrayList;

public class IQuestionnaireImplMockOk implements IQuestionnaire {
    @Override
    public QuestionnaireDTO chargerQuestionnaire(String url) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {

        QuestionDTO q1 = new QuestionDTO(1, Langue.FR, "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", Difficulte.FACILE, "Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.", "https://fr.wikipedia.org/wiki/Matériel_de_golf");

        ArrayList<QuestionDTO> lq = new ArrayList();
        lq.add(q1);
        QuestionnaireDTO questionnaire = new QuestionnaireDTO(lq);

        return questionnaire; //mettre le résultat que l'on veut
    }
}
