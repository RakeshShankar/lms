package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.Notification;

public interface NotificationService {

	public List<Notification> readAllNotification(int from, int pagesize, String filtertext);

	public Notification addNotification(Notification notifyModel);

	public Notification updateTheExistingNotification(Notification notifyModel);

	public List<Notification> getAllData();

}
