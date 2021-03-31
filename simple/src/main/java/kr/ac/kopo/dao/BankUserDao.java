package kr.ac.kopo.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import kr.ac.kopo.dto.BankUser;

@MapperScan
public interface BankUserDao {

	List<BankUser> selectBankUserList();
	
}
