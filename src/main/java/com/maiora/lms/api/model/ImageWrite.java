package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "imagewrite")
public class ImageWrite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "image_id")
	private long image_id;

	@Column(name = "image")
	private String image;

	@ManyToOne
	@JoinColumn(name = "lessonwrite_id", nullable = false)
	private LessonWrite lessonWrite;

	public long getImage_id() {
		return image_id;
	}

	public void setImage_id(long image_id) {
		this.image_id = image_id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LessonWrite getLessonWrite() {
		return lessonWrite;
	}

	public void setLessonWrite(LessonWrite lessonWrite) {
		this.lessonWrite = lessonWrite;
	}

	@Override
	public String toString() {
		return "ImageWrite [image_id=" + image_id + ", image=" + image + ", lessonWrite=" + lessonWrite + "]";
	}
	
	
	

}
