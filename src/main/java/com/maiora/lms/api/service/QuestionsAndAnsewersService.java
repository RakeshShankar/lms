package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.QuestionsAndAnswers;

public interface QuestionsAndAnsewersService {

	public List<QuestionsAndAnswers> readAllQuestionsAndAnswers(int from, int pagesize, String filtertext);

	public QuestionsAndAnswers addQuestionsAndAnswers(QuestionsAndAnswers questionAndAnswrModel);

	public QuestionsAndAnswers updateTheExistingQuestionsAndAnswers(QuestionsAndAnswers questionAndAnswrModel);

	public List<QuestionsAndAnswers> getAllData();

}
