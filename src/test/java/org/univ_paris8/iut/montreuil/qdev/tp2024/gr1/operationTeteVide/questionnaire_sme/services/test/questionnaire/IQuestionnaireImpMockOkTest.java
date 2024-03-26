package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.test.questionnaire;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impl.IQuestionnaireImplMockOk;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.FileNotAvailableException;

import java.util.ArrayList;

public class IQuestionnaireImpMockOkTest {

    private IQuestionnaire Iquestionnaire = new IQuestionnaireImplMockOk();
    @Test
    public void testChargerQuestionnaireOk() throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        QuestionDTO q1 = new QuestionDTO(1, Langue.FR, "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", Difficulte.FACILE, "Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.", "https://fr.wikipedia.org/wiki/Matériel_de_golf");
        QuestionDTO q2 = new QuestionDTO(2, Langue.FR, "Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?", "Badminton", Difficulte.FACILE, "Le badminton est toujours pratiqué en intérieur car avec le vent, en extérieur, le volant peut brusquement changer de direction.", "https://fr.wikipedia.org/wiki/Badminton");
        QuestionDTO q3 = new QuestionDTO(3, Langue.FR, "Combien y a-t-il de joueurs sur le terrain dans une équipe de football ?", "Onze", Difficulte.FACILE, "Codifié par les Britanniques à la fin du XIXe siècle, le football s'est doté en 1904 d'une fédération internationale, la FIFA.", "https://fr.wikipedia.org/wiki/Football");

        ArrayList<QuestionDTO> listeQ = new ArrayList<>();
        listeQ.add(q1);
        listeQ.add(q2);
        listeQ.add(q3);

        QuestionnaireDTO questionnaire = new QuestionnaireDTO(listeQ);

        Assert.assertEquals(q1, Iquestionnaire.chargerQuestionnaire("src/test/resources/testOk").getListeQuestions().get(0));
    }
/*
    public void chargerQuestionnaireTestWrongURL(String url) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {

        QuestionDTO q1 = new QuestionDTO(1, Langue.FR, "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", Difficulte.FACILE, "Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.", "https://fr.wikipedia.org/wiki/Matériel_de_golf");
        QuestionDTO q2 = new QuestionDTO(2, Langue.FR, "Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?", "Badminton", Difficulte.FACILE, "Le badminton est toujours pratiqué en intérieur car avec le vent, en extérieur, le volant peut brusquement changer de direction.", "https://fr.wikipedia.org/wiki/Badminton");
        QuestionDTO q3 = new QuestionDTO(3, Langue.FR, "Combien y a-t-il de joueurs sur le terrain dans une équipe de football ?", "Onze", Difficulte.FACILE, "Codifié par les Britanniques à la fin du XIXe siècle, le football s'est doté en 1904 d'une fédération internationale, la FIFA.", "https://fr.wikipedia.org/wiki/Football");

        ArrayList<QuestionDTO> listeQ = new ArrayList<>();
        listeQ.add(q1);
        listeQ.add(q2);
        listeQ.add(q3);

        QuestionnaireDTO questionnaire = new QuestionnaireDTO(listeQ);

        Assertions.assertThrows()

    }*/
}