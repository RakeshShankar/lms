package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.QuestionsandAnswersDao;
import com.maiora.lms.api.model.QuestionsAndAnswers;

@Service
public class QuestionsAndAnsewersServiceImpl implements QuestionsAndAnsewersService{

	@Autowired
	private QuestionsandAnswersDao questionsandAnswerDao;

	@Override
	public List<QuestionsAndAnswers> readAllQuestionsAndAnswers(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return questionsandAnswerDao.readAllQuestionsAndAnswers(from,  pagesize,  filtertext);
	}

	@Override
	public QuestionsAndAnswers addQuestionsAndAnswers(QuestionsAndAnswers questionAndAnswrModel) {
		// TODO Auto-generated method stub
		return questionsandAnswerDao.addQuestionsAndAnswers(questionAndAnswrModel);
	}

	@Override
	public QuestionsAndAnswers updateTheExistingQuestionsAndAnswers(QuestionsAndAnswers questionAndAnswrModel) {
		// TODO Auto-generated method stub
		return questionsandAnswerDao.updateTheExistingQuestionsAndAnswers(questionAndAnswrModel);
	}

	@Override
	public List<QuestionsAndAnswers> getAllData() {
		// TODO Auto-generated method stub
		return questionsandAnswerDao.getAllData();
	}
}
