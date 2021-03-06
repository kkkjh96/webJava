package com.spring.account.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.account.dao.AccountDAOImpl;

@Service("AccountService")
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDAOImpl accDAO;

//	public void setAccDAO(AccountDAOImpl accDAO) {
//		this.accDAO = accDAO;
//	}

	@Override
	public void sendMoney() throws Exception {
		accDAO.updateBalance1();
		accDAO.updateBalance2();
	}
}
