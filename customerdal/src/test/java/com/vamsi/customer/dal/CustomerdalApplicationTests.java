package com.vamsi.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vamsi.customer.dal.entities.Customer;
import com.vamsi.customer.dal.repo.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository repo;
	
	@Test
	void testCreateCustomer() {
		
		Customer customer = new Customer();
		customer.setName("Rakesh");
		customer.setEmail("pavan.naidu66@gmail.com");
		repo.save(customer);
	}

	@Test
	void testFindCustomerById() {
		
		Customer customer = repo.findById(1).get();
		System.out.println(customer);
	}
	
	@Test
	void testUpdateCustomer() {
		
		Customer customer = repo.findById(3).get();
		customer.setEmail("rakeshk@gmail.com");
		repo.save(customer);
	}
	
	@Test
	void testDeleteCustomer() {
		
		repo.deleteById(3);
		
	}
}
