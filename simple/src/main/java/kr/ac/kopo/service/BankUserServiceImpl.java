package kr.ac.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.BankUserDao;
import kr.ac.kopo.dto.BankUser;

@Service("bankUserService")
public class BankUserServiceImpl implements BankUserService{

	@Autowired
	BankUserDao bankUserDao;
	
	@Override
	public List<BankUser> selectBankUserList() {
		
		List<BankUser> a = bankUserDao.selectBankUserList();
				
		return a;
	}

}