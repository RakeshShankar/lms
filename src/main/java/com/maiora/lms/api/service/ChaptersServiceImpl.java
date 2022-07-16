package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.ChaptersDao;
import com.maiora.lms.api.model.Chapters;

@Service
public class ChaptersServiceImpl implements ChaptersService {

	@Autowired
	private ChaptersDao chaptersDao;

	@Override
	public List<Chapters> readAllChapters(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return chaptersDao.readAllChapters(from,  pagesize,  filtertext);
	}

	@Override
	public Chapters addChapters(Chapters chaptersModel) {
		// TODO Auto-generated method stub
		return chaptersDao.addChapters(chaptersModel);
	}

	@Override
	public Chapters updateTheExistingChapters(Chapters chaptersModel) {
		// TODO Auto-generated method stub
		return chaptersDao.updateTheExistingChapters(chaptersModel);
	}

	@Override
	public List<Chapters> getAllData() {
		// TODO Auto-generated method stub
		return chaptersDao.getAllData();
	}
}
