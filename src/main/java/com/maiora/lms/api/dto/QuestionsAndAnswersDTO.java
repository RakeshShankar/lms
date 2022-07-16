package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class QuestionsAndAnswersDTO {

	private int question_answer_id;
	private String quetion;
	private String answer;
	private int is_deleted;
	private String is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getQuestion_answer_id() {
		return question_answer_id;
	}
	public String getQuetion() {
		return quetion;
	}
	public String getAnswer() {
		return answer;
	}
	public int getIs_deleted() {
		return is_deleted;
	}
	public String getIs_active() {
		return is_active;
	}
	public String getCreated_by() {
		return created_by;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public Timestamp getCreated_on() {
		return created_on;
	}
	public Timestamp getUpdated_on() {
		return updated_on;
	}
	public void setQuestion_answer_id(int question_answer_id) {
		this.question_answer_id = question_answer_id;
	}
	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}
	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}
	
	
}
