package com.htc.SpringJDBCDemotx.service;

import com.htc.SpringJDBCDemotx.dao.exception.InsufficientAccountBalanceException;
import com.htc.SpringJDBCDemotx.model.Account;

public interface BankService {
	public abstract void transferFund(Account fromAccount,Account toAccount,Double amount)throws InsufficientAccountBalanceException;
}
