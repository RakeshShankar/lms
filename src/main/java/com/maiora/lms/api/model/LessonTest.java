package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lesson_test")
public class LessonTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Integer index;

	@Column(name = "lesson_name")
	private String lessonName;

	private String name;

	private String description;

	@Column(name = "src_url")
	private String srcUrl;

	@Column(name = "main_question")
	private String mainQuestion;

	@Column(name = "main_question_content")
	private String mainQuestionContent;

	@Column(name = "main_s_question")
	private String mainSQuestion;

	@OneToMany(targetEntity = QuestionAssessment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "index")
	private List<QuestionAssessment> questions = new ArrayList<>();

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSrcUrl() {
		return srcUrl;
	}

	public void setSrcUrl(String srcUrl) {
		this.srcUrl = srcUrl;
	}

	public String getMainQuestion() {
		return mainQuestion;
	}

	public void setMainQuestion(String mainQuestion) {
		this.mainQuestion = mainQuestion;
	}

	public String getMainQuestionContent() {
		return mainQuestionContent;
	}

	public void setMainQuestionContent(String mainQuestionContent) {
		this.mainQuestionContent = mainQuestionContent;
	}

	public String getMainSQuestion() {
		return mainSQuestion;
	}

	public void setMainSQuestion(String mainSQuestion) {
		this.mainSQuestion = mainSQuestion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<QuestionAssessment> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionAssessment> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "LessonTest [id=" + id + ", index=" + index + ", lessonName=" + lessonName + ", name=" + name
				+ ", description=" + description + ", srcUrl=" + srcUrl + ", mainQuestion=" + mainQuestion
				+ ", mainQuestionContent=" + mainQuestionContent + ", mainSQuestion=" + mainSQuestion + ", questions="
				+ questions + "]";
	}

}
