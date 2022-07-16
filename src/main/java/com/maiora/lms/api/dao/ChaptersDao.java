package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Chapters;

public interface ChaptersDao {

	public List<Chapters> readAllChapters(int from, int pagesize, String filtertext);

	public Chapters addChapters(Chapters chaptersModel);

	public Chapters updateTheExistingChapters(Chapters chaptersModel);

	public List<Chapters> getAllData();

}
