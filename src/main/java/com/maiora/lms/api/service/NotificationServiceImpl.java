package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.NotificationDao;
import com.maiora.lms.api.model.Notification;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationDao notifyDao;

	@Override
	public List<Notification> readAllNotification(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return notifyDao.readAllNotification(from,  pagesize,  filtertext);
	}

	@Override
	public Notification addNotification(Notification notifyModel) {
		// TODO Auto-generated method stub
		return notifyDao.addNotification(notifyModel);
	}

	@Override
	public Notification updateTheExistingNotification(Notification notifyModel) {
		// TODO Auto-generated method stub
		return notifyDao.updateTheExistingNotification(notifyModel);
	}

	@Override
	public List<Notification> getAllData() {
		// TODO Auto-generated method stub
		return notifyDao.getAllData();
	}
}
