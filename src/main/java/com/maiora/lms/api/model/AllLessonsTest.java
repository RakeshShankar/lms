package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alllessonstest")
public class AllLessonsTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToMany(targetEntity = LessonTest.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ilt_fk", referencedColumnName = "id")
	private List<LessonTest> allLessonsTest = new ArrayList<>();

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<LessonTest> getAllLessonsTest() {
		return allLessonsTest;
	}

	public void setAllLessonsTest(List<LessonTest> allLessonsTest) {
		this.allLessonsTest = allLessonsTest;
	}

	@Override
	public String toString() {
		return "AllLessonsTest [id=" + id + ", allLessonsTest=" + allLessonsTest + "]";
	}

}
