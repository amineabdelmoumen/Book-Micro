package inpt.ac.billingservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import inpt.ac.billingservice.entities.Bill;

public interface BillRepo extends JpaRepository<Bill, Long> {

}
