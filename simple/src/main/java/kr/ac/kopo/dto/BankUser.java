package kr.ac.kopo.dto;

public class BankUser {

	private Long userIdx;
	private String userId;
	private String userPwd;
	private String userPhone;
	private String userInputDate;
	private String userUpdateDate;
	
	
	public BankUser() {
	}


	public BankUser(Long userIdx, String userId, String userPwd, String userPhone, String userInputDate,
			String userUpdateDate) {
		super();
		this.userIdx = userIdx;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userPhone = userPhone;
		this.userInputDate = userInputDate;
		this.userUpdateDate = userUpdateDate;
	}


	public Long getUserIdx() {
		return userIdx;
	}


	public void setUserIdx(Long userIdx) {
		this.userIdx = userIdx;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	public String getUserPhone() {
		return userPhone;
	}


	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}


	public String getUserInputDate() {
		return userInputDate;
	}


	public void setUserInputDate(String userInputDate) {
		this.userInputDate = userInputDate;
	}


	public String getUserUpdateDate() {
		return userUpdateDate;
	}


	public void setUserUpdateDate(String userUpdateDate) {
		this.userUpdateDate = userUpdateDate;
	}


	
	
	
}
