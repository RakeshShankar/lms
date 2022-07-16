package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Assignments;

public interface AssignmentsDao {

	public List<Assignments> readAllAssignments(int from, int pagesize, String filtertext);

	public Assignments addAssignments(Assignments assignmentModel);

	public Assignments updateTheExistingAssignment(Assignments assignmentModel);

	public List<Assignments> getAllData();

}
