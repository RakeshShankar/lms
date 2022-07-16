package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.IELTSAbout;
import com.maiora.lms.api.model.IELTSTest;

public interface IELTSAboutDao {

	public IELTSAbout addAboutInfo(IELTSAbout ieltsAbout);

	public List<IELTSAbout> getAllData();

	public IELTSTest CreatEtest(IELTSTest iELTSAbout);

}
