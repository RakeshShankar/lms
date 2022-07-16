package com.maiora.lms.api.dto;

import java.util.List;

public class IntroDto {
	
	private String description1;
	private String description2;
	private List<ImageDTO> images;
	
	public String getDescription1() {
		return description1;
	}
	public void setDescription1(String description1) {
		this.description1 = description1;
	}
	public String getDescription2() {
		return description2;
	}
	public void setDescription2(String description2) {
		this.description2 = description2;
	}
	public List<ImageDTO> getImages() {
		return images;
	}
	public void setImages(List<ImageDTO> images) {
		this.images = images;
	}
	@Override
	public String toString() {
		return "IntroDto [description1=" + description1 + ", description2=" + description2 + ", images=" + images + "]";
	}
	
	

}
