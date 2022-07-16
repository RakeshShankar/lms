

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;

import javax.persistence.*;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: QuestionsAndAnswers
 *
 */
@Entity
@Table(name="lm_qna")
public class QuestionsAndAnswers implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_answer_id")
	private int question_answer_id;
	@Column(name = "quetion")
	private String quetion;
	@Column(name = "answer")
	private String answer;
	@Column(name = "is_deleted")
	private int is_deleted;
	@Column(name = "is_active")
	private String is_active;
	@Column(name = "created_by")
	private String created_by;
	@Column(name = "updated_by")
	private String updated_by;
	@Column(name = "created_on")
	private Timestamp created_on;
	@Column(name = "updated_on")
	private Timestamp updated_on;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private courses lm_courses;
	
	public courses getLm_courses() {
		return lm_courses;
	}
	public void setLm_courses(courses lm_courses) {
		this.lm_courses = lm_courses;
	}
	public QuestionsAndAnswers() {
		super();
	}   
	public int getQuestion_answer_id() {
		return this.question_answer_id;
	}

	public void setQuestion_answer_id(int question_answer_id) {
		this.question_answer_id = question_answer_id;
	}   
	public String getQuetion() {
		return this.quetion;
	}

	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}   
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}   
	public int getIs_deleted() {
		return this.is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}   
	public String getIs_active() {
		return this.is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}   
	public String getCreated_by() {
		return this.created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}   
	public String getUpdated_by() {
		return this.updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}   
	public Timestamp getCreated_on() {
		return this.created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}   
	public Timestamp getUpdated_on() {
		return this.updated_on;
	}

	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}
   
}
