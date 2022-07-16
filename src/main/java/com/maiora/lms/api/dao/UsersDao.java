package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Users;

public interface UsersDao {

	public List<Users> readAllUsers(int from, int pagesize, String filtertext);

	public Users addUsers(Users usersModel);

	public Users updateTheExistingUsers(Users usersModel);

	public List<Users> getAllData();

}
