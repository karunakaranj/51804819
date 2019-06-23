package com.oxbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oxbank.entity.Customer;
import com.oxbank.entity.LoanDetails;
import com.oxbank.service.CustomerService;
import com.oxbank.service.LoanDetailsService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	LoanDetailsService loanDetailsService;

	@PostMapping("/addingcustomerDetails")
	public String addingcustomerDetails(@RequestBody Customer customer) {

		return customerService.customerAccount(customer);

	}

	@PostMapping("/applyingForLoan")
	public String applyingLoan(@RequestBody LoanDetails loanDetails) {

		return loanDetailsService.applyingForLoan(loanDetails);

	}

}
