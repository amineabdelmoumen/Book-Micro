package inpt.ac.billingservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import inpt.ac.billingservice.entities.BookItem;

public interface BookItemRepo extends JpaRepository<BookItem, Long> {

    public List<BookItem> findByBillID(Long id);

}
