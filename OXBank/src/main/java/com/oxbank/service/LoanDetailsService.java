package com.oxbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxbank.entity.Customer;
import com.oxbank.entity.LoanDetails;
import com.oxbank.repository.CustomerRepository;
import com.oxbank.repository.LoanRepository;

@Service
public class LoanDetailsService {

	@Autowired
	LoanRepository loanRepository;

	@Autowired
	CustomerRepository customerRepository;

	public String applyingForLoan(LoanDetails loanDetails) {

		Customer customerId = loanDetails.getCustomer();

		Customer customerEntity = customerRepository.findById(customerId.getCustomerId()).get();

		if (customerEntity.getCreditScore() > 600 && customerEntity.getAge() > 24 && customerEntity.getAge() < 60) {

			if (loanRepository.save(loanDetails) != null)

				return "Applied For loan Successfully";

			else

				return "Please enter all  the details";

		}

		else
			return "You are not Eligible for the loan";

	}

}
