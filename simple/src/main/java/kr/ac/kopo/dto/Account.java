package kr.ac.kopo.dto;

public class Account {

	private Long accountIdx; 
	private String accountNumber;
	private String accountRemains;
	private String accountBank;
	private String accountInputDate;
	private String accountUpdateDate;
	private Long userIdx;
	
	public Account() {
	}
	
	

	public Account(Long accountIdx, String accountNumber, String accountRemains, String accountBank,
			String accountInputDate, String accountUpdateDate, Long userIdx) {
		super();
		this.accountIdx = accountIdx;
		this.accountNumber = accountNumber;
		this.accountRemains = accountRemains;
		this.accountBank = accountBank;
		this.accountInputDate = accountInputDate;
		this.accountUpdateDate = accountUpdateDate;
		this.userIdx = userIdx;
	}



	public Long getAccountIdx() {
		return accountIdx;
	}

	public void setAccountIdx(Long accountIdx) {
		this.accountIdx = accountIdx;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountRemains() {
		return accountRemains;
	}

	public void setAccountRemains(String accountRemains) {
		this.accountRemains = accountRemains;
	}

	public String getAccountBank() {
		return accountBank;
	}

	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}

	public String getAccountInputDate() {
		return accountInputDate;
	}

	public void setAccountInputDate(String accountInputDate) {
		this.accountInputDate = accountInputDate;
	}

	public String getAccountUpdateDate() {
		return accountUpdateDate;
	}

	public void setAccountUpdateDate(String accountUpdateDate) {
		this.accountUpdateDate = accountUpdateDate;
	}

	public Long getUserIdx() {
		return userIdx;
	}

	public void setUserIdx(Long userIdx) {
		this.userIdx = userIdx;
	}

	
	
	
	
}
