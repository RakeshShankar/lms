package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.TransactionsDao;
import com.maiora.lms.api.model.Transactions;

@Service
public class TransactionsServiceImpl implements TransactionsService{

	@Autowired
	private TransactionsDao transactionDao;

	@Override
	public List<Transactions> readAllTransactions(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return transactionDao.readAllTransactions(from,  pagesize,  filtertext);
	}

	@Override
	public Transactions addTransactions(Transactions transactionsModel) {
		// TODO Auto-generated method stub
		return transactionDao.addTransactions(transactionsModel);
	}

	@Override
	public Transactions updateTheExistingTransactions(Transactions transactionsModel) {
		// TODO Auto-generated method stub
		return transactionDao.updateTheExistingTransactions(transactionsModel);
	}

	@Override
	public List<Transactions> getAllData() {
		// TODO Auto-generated method stub
		return transactionDao.getAllData();
	}
}
