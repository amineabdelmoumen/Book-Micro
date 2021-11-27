package inpt.ac.bookservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import inpt.ac.bookservice.entities.Book;
import inpt.ac.bookservice.repositories.BookRepo;

@SpringBootApplication
public class BookServiceApplication implements CommandLineRunner {
	@Autowired
	private BookRepo bookrepo;

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookrepo.save(new Book(null, "cracking the coding interview", "Excellent BOOK"));
		bookrepo.save(new Book(null, "cracking the System Design interview", "Excellent BOOK"));
		bookrepo.save(new Book(null, "Database Internals", "Good book"));
		bookrepo.save(new Book(null, "Compiler engineerng", "expert Book"));

	}

}
