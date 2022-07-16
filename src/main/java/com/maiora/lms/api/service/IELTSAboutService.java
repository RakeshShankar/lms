package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.IELTSAbout;
import com.maiora.lms.api.model.IELTSTest;

public interface IELTSAboutService {
	
	public IELTSAbout addAbout(IELTSAbout ieltsAbout);

	public List<IELTSAbout> getAllData();

	public IELTSTest addTest(IELTSTest iELTSAbout);

}
