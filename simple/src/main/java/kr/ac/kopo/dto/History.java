package kr.ac.kopo.dto;

public class History {

	private Long historyIdx; 
	private String historyMoney; 
	private String historyReceiver;
	private String historyInputDate;
	private Long accountIdx;
	
	
	public History() {
	}


	public History(Long historyIdx, String historyMoney, String historyReceiver, String historyInputDate,
			Long accountIdx) {
		super();
		this.historyIdx = historyIdx;
		this.historyMoney = historyMoney;
		this.historyReceiver = historyReceiver;
		this.historyInputDate = historyInputDate;
		this.accountIdx = accountIdx;
	}


	public Long getHistoryIdx() {
		return historyIdx;
	}


	public void setHistoryIdx(Long historyIdx) {
		this.historyIdx = historyIdx;
	}


	public String getHistoryMoney() {
		return historyMoney;
	}


	public void setHistoryMoney(String historyMoney) {
		this.historyMoney = historyMoney;
	}


	public String getHistoryReceiver() {
		return historyReceiver;
	}


	public void setHistoryReceiver(String historyReceiver) {
		this.historyReceiver = historyReceiver;
	}


	public String getHistoryInputDate() {
		return historyInputDate;
	}


	public void setHistoryInputDate(String historyInputDate) {
		this.historyInputDate = historyInputDate;
	}


	public Long getAccountIdx() {
		return accountIdx;
	}


	public void setAccountIdx(Long accountIdx) {
		this.accountIdx = accountIdx;
	}

	
	
	
}
