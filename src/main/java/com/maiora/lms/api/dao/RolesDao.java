package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Role;

public interface RolesDao {

	public List<Role> readAllAssignments(int from, int pagesize, String filtertext);

	public Role addAssignments(Role rolesModel);

	public Role updateTheExistingAssignment(Role rolesModel);

	public List<Role> getAllData();

}
