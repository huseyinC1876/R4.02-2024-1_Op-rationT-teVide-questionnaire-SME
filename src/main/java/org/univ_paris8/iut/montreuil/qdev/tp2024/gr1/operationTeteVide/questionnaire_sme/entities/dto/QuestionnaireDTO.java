package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.Objects;

public class QuestionnaireDTO {

    private int idQuestionnaire;
    private ArrayList<QuestionDTO> listeQuestions;
    private static int compteur = 0;

    public QuestionnaireDTO(ArrayList<QuestionDTO> listeQuestions){
        this.listeQuestions = listeQuestions;
        compteur++;
        this.idQuestionnaire = compteur;
    }

    public ArrayList<QuestionDTO> getListeQuestions() {
        return listeQuestions;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public void setListeQuestions(ArrayList<QuestionDTO> listeQuestions) {
        this.listeQuestions = listeQuestions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnaireDTO that = (QuestionnaireDTO) o;
        return idQuestionnaire == that.idQuestionnaire;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestionnaire);
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "idQuestionnaire=" + idQuestionnaire +
                ", listeQuestions=" + listeQuestions +
                '}';
    }
}
