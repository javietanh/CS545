package edu.mum.lab10.repository;

import edu.mum.lab10.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    public List<Employee> getEmployeeByNumber(String number);

    @Query("select e from Employee e where number = :number")
    public List<Employee> locateEmployeeByHisNumber(String number);
}
