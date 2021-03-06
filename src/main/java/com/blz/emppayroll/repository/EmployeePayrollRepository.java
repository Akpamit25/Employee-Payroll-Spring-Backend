package com.blz.emppayroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blz.emppayroll.model.EmployeePayroll;

@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Long> {

}
