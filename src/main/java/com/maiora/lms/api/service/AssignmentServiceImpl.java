package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.AssignmentsDao;
import com.maiora.lms.api.model.Assignments;

@Service
public class AssignmentServiceImpl implements AssignmentService {

	@Autowired
	private AssignmentsDao assignmentDao;

	@Override
	public List<Assignments> readAllAssignments(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return assignmentDao.readAllAssignments(from,  pagesize,  filtertext);
	}

	@Override
	public Assignments addAssignments(Assignments assignmentModel) {
		// TODO Auto-generated method stub
		return assignmentDao.addAssignments(assignmentModel);
	}

	@Override
	public Assignments updateTheExistingAssignment(Assignments assignmentModel) {
		// TODO Auto-generated method stub
		return assignmentDao.updateTheExistingAssignment(assignmentModel);
	}

	@Override
	public List<Assignments> getAllData() {
		// TODO Auto-generated method stub
		return assignmentDao.getAllData();
	}
}
