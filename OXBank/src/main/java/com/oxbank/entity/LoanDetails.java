package com.oxbank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan_details")
public class LoanDetails {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private long loanAccountNumber;
	private String securityAddress;
	private String loanStatus;
	private long loanAmount;
	private int approvingManagerId;
	
	@ManyToOne
	Customer customer;

	
	  public Customer getCustomer() { return customer; }
	  
	  public void setCustomer(Customer customer) { this.customer = customer; }
	 

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getSecurityAddress() {
		return securityAddress;
	}

	public void setSecurityAddress(String securityAddress) {
		this.securityAddress = securityAddress;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getApprovingManagerId() {
		return approvingManagerId;
	}

	public void setApprovingManagerId(int approvingManagerId) {
		this.approvingManagerId = approvingManagerId;
	}

	@Override
	public String toString() {
		return "LoanDetails [loanId=" + loanId + ", loanAccountNumber=" + loanAccountNumber + ", securityAddress="
				+ securityAddress + ", loanStatus=" + loanStatus + ", loanAmount=" + loanAmount
				+ ", approvingManagerId=" + approvingManagerId + "]";
	}

}
