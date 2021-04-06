package com.vamsi.customer.dal.repo;

import org.springframework.data.repository.CrudRepository;

import com.vamsi.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
