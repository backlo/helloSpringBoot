package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{ // interface 실제 클래스를 알아서 구현
	
	List<Customer> findByLastName(String lastName);

}