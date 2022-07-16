package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Transactions;

public interface TransactionsDao {

	public List<Transactions> readAllTransactions(int from, int pagesize, String filtertext);

	public Transactions updateTheExistingTransactions(Transactions transactionsModel);

	public Transactions addTransactions(Transactions transactionsModel);

	public List<Transactions> getAllData();

}
