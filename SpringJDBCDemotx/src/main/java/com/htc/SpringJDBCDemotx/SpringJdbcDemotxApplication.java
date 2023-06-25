package com.htc.SpringJDBCDemotx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.htc.SpringJDBCDemotx.dao.exception.InsufficientAccountBalanceException;
import com.htc.SpringJDBCDemotx.model.Account;
import com.htc.SpringJDBCDemotx.service.BankService;
import com.htc.SpringJDBCDemotx.service.Impl.BankServiceImpl;

@SpringBootApplication
public class SpringJdbcDemotxApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringJdbcDemotxApplication.class, args);
		
		BankService bankService = ctx.getBean("bankServiceImpl", BankServiceImpl.class);
		Account fromAccount = new Account();
		fromAccount.setAccountNumber( 9876835861L);

		Account toAccount = new Account();
		toAccount.setAccountNumber(9876598791L);

		try {
			bankService.transferFund(fromAccount, toAccount, 1000.00);
		} catch (InsufficientAccountBalanceException e) {
			e.printStackTrace();
		}
		ctx.close();
	}

}
