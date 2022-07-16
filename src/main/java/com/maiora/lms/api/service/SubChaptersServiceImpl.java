package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.SubChaptersDao;
import com.maiora.lms.api.model.SubChapters;

@Service
public class SubChaptersServiceImpl implements SubChaptersService{

	@Autowired
	private SubChaptersDao subChaptersDao;

	@Override
	public List<SubChapters> readAllSubChapters(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return subChaptersDao.readAllSubChapters(from,pagesize,filtertext);
	}

	@Override
	public SubChapters addSubChapters(SubChapters subChapterModel) {
		// TODO Auto-generated method stub
		return subChaptersDao.addSubChapters(subChapterModel);
	}

	@Override
	public SubChapters updateTheExistingSubChapters(SubChapters subChapterModel) {
		// TODO Auto-generated method stub
		return subChaptersDao.updateTheExistingSubChapters(subChapterModel);
	}

	@Override
	public List<SubChapters> getAllData() {
		// TODO Auto-generated method stub
		return subChaptersDao.getAllData();
	}
}
