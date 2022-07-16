package com.maiora.lms.api.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ieltsabout")
public class IELTSAbout {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aboutid")
	private Long aboutid;
	
	@Column(name = "academic_desc")
	private String academicDesc;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bandimgid")
	private BandImg bandImg;

	@Column(name = "desc1")
	private String desc1;

	@Column(name = "desc2")
	private String desc2;

	@Column(name = "desc3")
	private String desc3;

	@Column(name = "general_desc")
	private String generalDesc;
	
	@Column(name = "listening_desc")
	private String listeningDesc;
	
	@Column(name = "reading_desc")
	private String readingDesc;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "resid")
	private ResImg resImg;

	@Column(name = "result_desc")
	private String resultDesc;

	@Column(name = "speaking_desc")
	private String speakingDesc;

	@Column(name = "videourl")
	private String videoURL;

	@Column(name = "writing_desc")
	private String writingDesc;

	@Column(name = "band_desc")
	private String bandDesc;

	public String getListeningDesc() {
		return listeningDesc;
	}

	public void setListeningDesc(String listeningDesc) {
		this.listeningDesc = listeningDesc;
	}

	public String getReadingDesc() {
		return readingDesc;
	}

	public void setReadingDesc(String readingDesc) {
		this.readingDesc = readingDesc;
	}

	public long getAboutid() {
		return aboutid;
	}

	public void setAboutid(long aboutid) {
		this.aboutid = aboutid;
	}

	public String getAcademicDesc() {
		return academicDesc;
	}

	public void setAcademicDesc(String academicDesc) {
		this.academicDesc = academicDesc;
	}

	

	public BandImg getBandImg() {
		return bandImg;
	}

	public void setBandImg(BandImg bandImg) {
		this.bandImg = bandImg;
	}

	public String getDesc1() {
		return desc1;
	}

	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}

	public String getDesc2() {
		return desc2;
	}

	public void setDesc2(String desc2) {
		this.desc2 = desc2;
	}

	public String getDesc3() {
		return desc3;
	}

	public void setDesc3(String desc3) {
		this.desc3 = desc3;
	}

	

	public ResImg getResImg() {
		return resImg;
	}

	public void setResImg(ResImg resImg) {
		this.resImg = resImg;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public String getGeneralDesc() {
		return generalDesc;
	}

	public void setGeneralDesc(String generalDesc) {
		this.generalDesc = generalDesc;
	}

	public String getSpeakingDesc() {
		return speakingDesc;
	}

	public void setSpeakingDesc(String speakingDesc) {
		this.speakingDesc = speakingDesc;
	}

	public String getWritingDesc() {
		return writingDesc;
	}

	public void setWritingDesc(String writingDesc) {
		this.writingDesc = writingDesc;
	}

	public String getBandDesc() {
		return bandDesc;
	}

	public void setBandDesc(String bandDesc) {
		this.bandDesc = bandDesc;
	}

	@Override
	public String toString() {
		return "IELTSAbout [aboutid=" + aboutid + ", academicDesc=" + academicDesc + ", bandImg=" + bandImg + ", desc1="
				+ desc1 + ", desc2=" + desc2 + ", desc3=" + desc3 + ", generalDesc=" + generalDesc + ", listeningDesc="
				+ listeningDesc + ", readingDesc=" + readingDesc + ", resImg=" + resImg + ", resultDesc=" + resultDesc
				+ ", speakingDesc=" + speakingDesc + ", videoURL=" + videoURL + ", writingDesc=" + writingDesc
				+ ", bandDesc=" + bandDesc + "]";
	}



	

	
}
