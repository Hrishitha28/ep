package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Contest;
import com.klef.ep.models.Questionnaire;

@Remote
public interface QuestionnaireService {
	public String addQuestionnaire(Questionnaire q);
	public List<Questionnaire> viewallQuestions();
	public String deleteQuestions(int q_id);
}
