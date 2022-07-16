package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lessonintro")
public class LessonIntro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lessonintroid")
	private long lessonintroid;
	
	@Column(name = "section")
	private String section;
	
	@OneToOne
	@JoinColumn(name = "l_id")
	private ListenIntrod listening;
	
	@OneToOne
	@JoinColumn(name = "r_id")
	private ListenIntrod reading;
	
	@OneToOne
	@JoinColumn(name = "s_id")
	private ListenIntrod speaking;
	
	@OneToOne
	@JoinColumn(name = "w_id")
	private ListenIntrod writing;

	public long getLessonintroid() {
		return lessonintroid;
	}

	public void setLessonintroid(long lessonintroid) {
		this.lessonintroid = lessonintroid;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public ListenIntrod getListening() {
		return listening;
	}

	public void setListening(ListenIntrod listening) {
		this.listening = listening;
	}

	public ListenIntrod getReading() {
		return reading;
	}

	public void setReading(ListenIntrod reading) {
		this.reading = reading;
	}

	public ListenIntrod getSpeaking() {
		return speaking;
	}

	public void setSpeaking(ListenIntrod speaking) {
		this.speaking = speaking;
	}

	public ListenIntrod getWriting() {
		return writing;
	}

	public void setWriting(ListenIntrod writing) {
		this.writing = writing;
	}
	
}

//create table lessonintro {
//	 `lessonintroid` int(11) NOT NULL AUTO_INCREMENT,
//	  `section` varchar(255) DEFAULT NULL,
//	  `l_id` int(11) DEFAULT NULL,
//	  `r_id` int(11) DEFAULT NULL,
//	  `s_id` int(11) DEFAULT NULL,
//	  `w_id` int(11) DEFAULT NULL,
//	   PRIMARY KEY (`lessonintroid`)
//}