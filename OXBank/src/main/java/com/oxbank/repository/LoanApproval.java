package com.oxbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.oxbank.entity.Manager;


@Repository
public interface LoanApproval extends JpaRepository<Manager, Integer> {
	
	//@Query(value="select * from oxbank.loan_details where loan_status=?1",nativeQuery=true)
	
	public void loanApproval(String loanStatus);


}
