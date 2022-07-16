package com.maiora.lms.api.dto;

import java.util.List;

public class IntroReadDTO {

	private IntroDto introduction;
	private List<LessonsReadDTO> lessons;
	
	public IntroDto getIntroduction() {
		return introduction;
	}
	public void setIntroduction(IntroDto introduction) {
		this.introduction = introduction;
	}
	public List<LessonsReadDTO> getLessons() {
		return lessons;
	}
	public void setLessons(List<LessonsReadDTO> lessons) {
		this.lessons = lessons;
	}
	@Override
	public String toString() {
		return "IntroReadDTO [introduction=" + introduction + ", lessons=" + lessons + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	

	
	
}
