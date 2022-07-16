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
@Table(name = "questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "index")
	private int index;

	@Column(name = "description")
	private String description;

	@Column(name = "type")
	private String type;

	@Column(name = "answer")
	private String answer;

	@Column(name = "answer_explaination")
	private String answer_explaination;

	@Column(name = "user_answered")
	private String user_answered;

	@Column(name = "show_answer_explanation")
	private Boolean show_answer_explanation;

	@ManyToOne
	@JoinColumn(name = "readinglesson_id", nullable = false)
	private IELTSReadingLesson readinglesson;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer_explaination() {
		return answer_explaination;
	}

	public void setAnswer_explaination(String answer_explaination) {
		this.answer_explaination = answer_explaination;
	}

	public String getUser_answered() {
		return user_answered;
	}

	public void setUser_answered(String user_answered) {
		this.user_answered = user_answered;
	}

	public Boolean getShow_answer_explanation() {
		return show_answer_explanation;
	}

	public void setShow_answer_explanation(Boolean show_answer_explanation) {
		this.show_answer_explanation = show_answer_explanation;
	}

	public void setLm_readinglesson(IELTSReadingLesson lm_readinglesson) {
		this.readinglesson = lm_readinglesson;
	}

	@Override
	public String toString() {
		return "Questions [index=" + index + ", description=" + description + ", type=" + type + ", answer=" + answer
				+ ", answer_explaination=" + answer_explaination + ", user_answered=" + user_answered
				+ ", show_answer_explanation=" + show_answer_explanation + ", readinglesson=" + readinglesson
				+ "]";
	}

	

}


//CREATE TABLE `lmsystem-dev`.`questions` (
//`index` int(11) NOT NULL AUTO_INCREMENT,
//`description` varchar(255) DEFAULT NULL,
//`name` varchar(255) DEFAULT NULL,
//`type` varchar(255) DEFAULT NULL,
//`answer` varchar(255) DEFAULT NULL,
//`answerExplaination` varchar(255) DEFAULT NULL,
//`userAnswered` varchar(255) DEFAULT NULL,
//`showAnswerExplanation` TINYINT(1),
//`readinglesson_id` int(11) DEFAULT NULL,  
// PRIMARY KEY (`index`)
//);


//ALTER TABLE `lmsystem-dev`.`questions` ADD FOREIGN KEY (readinglesson_id) REFERENCES `lm_readinglesson` (`readinglesson_id`);

