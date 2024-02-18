package SpringBoot.SpringDataJPA.dao;

import SpringBoot.SpringDataJPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>
{
    
}
