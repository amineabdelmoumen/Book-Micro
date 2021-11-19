package inpt.ac.customerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import inpt.ac.customerservice.entities.Customer;

@RepositoryRestResource
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
