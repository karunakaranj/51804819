package com.oxbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oxbank.entity.LoanDetails;

@Repository
public interface LoanRepository extends JpaRepository<LoanDetails, Integer> {

}
