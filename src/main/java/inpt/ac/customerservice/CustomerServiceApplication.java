package inpt.ac.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import inpt.ac.customerservice.entities.Customer;
import inpt.ac.customerservice.repositories.CustomerRepo;

@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepo customerepo;

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		customerepo.save(new Customer(null, "amine", "abdel@gmail.com"));
		customerepo.save(new Customer(null, "hassan", "has@gmail.com"));
		customerepo.save(new Customer(null, "hommad", "ahmed@gmail.com"));
		customerepo.save(new Customer(null, "akram", "akram@gmail.com"));
		customerepo.save(new Customer(null, "akram", "abdel@gmail.com"));
		customerepo.save(new Customer(null, "ana", "anas@gmail.com"));

	}

}
