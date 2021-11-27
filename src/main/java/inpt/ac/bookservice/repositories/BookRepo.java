package inpt.ac.bookservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import inpt.ac.bookservice.entities.Book;

@RepositoryRestResource
public interface BookRepo extends JpaRepository<Book, Long> {

}
