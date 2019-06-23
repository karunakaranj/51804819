package com.oxbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxbank.entity.LoanDetails;



@Service
public class LoanApproval {

	@Autowired
	LoanApproval  loanApprovals;
	
	public LoanDetails loanApproving(String loanStatus) {
		
		LoanDetails loanDetails =	loanApprovals.loanApproving(loanStatus);
		loanDetails.setLoanStatus("approved");
		
		return null;
	}
	
	
	
}
