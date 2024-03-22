package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impls;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionnaireService implements IQuestionnaire {


    @Override
    public QuestionnaireDTO chargerQuestionnaire(String url) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        String line = "";
        String cvsSplitBy = ";";
        ArrayList<QuestionDTO> questions = new ArrayList<>();
        QuestionService questionService = new QuestionService();
        try (BufferedReader br = new BufferedReader(new FileReader(url))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                QuestionDTO question = questionService.creerQuestion(data);
                questions.add(question);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (MissingArgumentException | WrongArgumentTypeException e) {
            throw new RuntimeException(e);
        }

        return new QuestionnaireDTO(questions);
    }


}
