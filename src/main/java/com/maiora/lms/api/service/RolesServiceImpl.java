package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.RolesDao;
import com.maiora.lms.api.model.Role;

@Service
public class RolesServiceImpl implements RolesService{

	@Autowired
	private RolesDao rolesDao;

	@Override
	public List<Role> readAllAssignments(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return rolesDao.readAllAssignments(from,  pagesize,  filtertext);
	}

	@Override
	public Role addAssignments(Role rolesModel) {
		// TODO Auto-generated method stub
		return rolesDao.addAssignments(rolesModel);
	}

	@Override
	public Role updateTheExistingAssignment(Role rolesModel) {
		// TODO Auto-generated method stub
		return rolesDao.updateTheExistingAssignment(rolesModel);
	}

	@Override
	public List<Role> getAllData() {
		// TODO Auto-generated method stub
		return rolesDao.getAllData();
	}
}
