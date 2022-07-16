package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.UsersDao;
import com.maiora.lms.api.model.Users;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersdao;

	@Override
	public List<Users> readAllUsers(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return usersdao.readAllUsers(from,  pagesize,  filtertext);
	}

	@Override
	public Users addUsers(Users usersModel) {
		// TODO Auto-generated method stub
		return usersdao.addUsers(usersModel);
	}

	@Override
	public Users updateTheExistingUsers(Users usersModel) {
		// TODO Auto-generated method stub
		return usersdao.updateTheExistingUsers(usersModel);
	}

	@Override
	public List<Users> getAllData() {
		// TODO Auto-generated method stub
		return usersdao.getAllData();
	}
	
}
