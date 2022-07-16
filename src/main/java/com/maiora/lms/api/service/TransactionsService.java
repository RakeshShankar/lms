package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.Transactions;

public interface TransactionsService {

	public List<Transactions> readAllTransactions(int from, int pagesize, String filtertext);

	public Transactions addTransactions(Transactions transactionsModel);

	public Transactions updateTheExistingTransactions(Transactions transactionsModel);

	public List<Transactions> getAllData();

}
