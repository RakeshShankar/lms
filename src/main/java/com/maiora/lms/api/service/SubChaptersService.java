package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.SubChapters;

public interface SubChaptersService {

	public List<SubChapters> readAllSubChapters(int from, int pagesize, String filtertext);

	public SubChapters addSubChapters(SubChapters subChapterModel);

	public SubChapters updateTheExistingSubChapters(SubChapters subChapterModel);

	public List<SubChapters> getAllData();

}
