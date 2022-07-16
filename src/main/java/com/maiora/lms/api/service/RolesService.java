package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.Role;

public interface RolesService {

	public List<Role> readAllAssignments(int from, int pagesize, String filtertext);

	public Role addAssignments(Role rolesModel);

	public Role updateTheExistingAssignment(Role rolesModel);

	public List<Role> getAllData();

}
