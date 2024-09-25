package com.amjath.employee_management_api.repository;

import com.amjath.employee_management_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{


    Optional<Employee> findEmployeeById(Long id);
}
