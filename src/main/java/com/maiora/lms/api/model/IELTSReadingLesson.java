package com.maiora.lms.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lm_readinglesson")
public class IELTSReadingLesson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "readinglesson_id")
	private int readinglesson_id;

	@Column(name = "lesson_name")
	private String lesson_name;

	@Column(name = "name")
	private String name;

	@Column(name = "src_url")
	private String src_url;

	@Column(name = "main_question")
	private String main_question;

	@Column(name = "main_question_content")
	private String main_question_content;

	@Column(name = "main_sub_question")
	private String main_sub_question;

	@OneToMany(mappedBy = "readinglesson")
	private List<Questions> questions;

	public String getLesson_name() {
		return lesson_name;
	}

	public void setLesson_name(String lesson_name) {
		this.lesson_name = lesson_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSrc_url() {
		return src_url;
	}

	public void setSrc_url(String src_url) {
		this.src_url = src_url;
	}

	public String getMain_question() {
		return main_question;
	}

	public void setMain_question(String main_question) {
		this.main_question = main_question;
	}

	public String getMain_question_content() {
		return main_question_content;
	}

	public void setMain_question_content(String main_question_content) {
		this.main_question_content = main_question_content;
	}

	public String getMain_sub_question() {
		return main_sub_question;
	}

	public void setMain_sub_question(String main_sub_question) {
		this.main_sub_question = main_sub_question;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "IELTSReadingLesson [readinglesson_id=" + readinglesson_id + ", lesson_name=" + lesson_name + ", name="
				+ name + ", src_url=" + src_url + ", main_question=" + main_question + ", main_question_content="
				+ main_question_content + ", main_sub_question=" + main_sub_question + ", questions=" + questions + "]";
	}
	
	
}

//CREATE TABLE `lmsystem-dev`.`lm_readinglesson` (
//		  `readinglesson_id` int(11) NOT NULL AUTO_INCREMENT,
//		  `lesson_name` varchar(255) DEFAULT NULL,
//		  `name` varchar(255) DEFAULT NULL,
//		  `src_url` varchar(255) DEFAULT NULL,
//		  `main_question` varchar(255) DEFAULT NULL,
//		  `main_question_content` varchar(255) DEFAULT NULL,
//		  `main_sub_question` varchar(255) DEFAULT NULL,
//		   PRIMARY KEY (`readinglesson_id`)
//		  );
