package com.htc.SpringJDBCDemotx.dao;

import com.htc.SpringJDBCDemotx.dao.exception.InsufficientAccountBalanceException;
import com.htc.SpringJDBCDemotx.model.Account;

public interface BankDao {
	public abstract void deposit(Account fromAccount,Account toAccount,Double amount);
	public abstract void withdraw(Account fromAccount,Account toAccount,Double amount) throws InsufficientAccountBalanceException;
}
