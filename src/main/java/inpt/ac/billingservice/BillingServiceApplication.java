package inpt.ac.billingservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import inpt.ac.billingservice.feignClients.BookRestClient;
import inpt.ac.billingservice.feignClients.CustomerRestClient;
import inpt.ac.billingservice.repositories.BillRepo;
import inpt.ac.billingservice.repositories.BookItemRepo;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication implements CommandLineRunner {
	@Autowired
	private BillRepo billrepo;
	@Autowired
	private BookItemRepo bookitemrepo;
	@Autowired
	private BookRestClient bookrestclients;

	@Autowired
	private CustomerRestClient customerRestClient;

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
