package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dto.BankUser;

public interface BankUserService {
	
	List<BankUser> selectBankUserList();
}
