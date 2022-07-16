package com.maiora.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Table(name = "transcript")
@Entity
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int transcriptid;

	private String dialog;

	public int getTranscriptid() {
		return transcriptid;
	}

	public void setTranscriptid(int transcriptid) {
		this.transcriptid = transcriptid;
	}

	public String getDialog() {
		return dialog;
	}

	public void setDialog(String dialog) {
		this.dialog = dialog;
	}

	@Override
	public String toString() {
		return "Transcript [transcriptid=" + transcriptid + ", dialog=" + dialog + "]";
	}

}
