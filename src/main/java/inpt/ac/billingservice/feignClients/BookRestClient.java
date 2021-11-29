package inpt.ac.billingservice.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import inpt.ac.billingservice.entities.Book;

@FeignClient(name = "BOOK-SERVICE")
public interface BookRestClient {
    @GetMapping(path = "/books")
    public PagedModel<Book> getBooks(@RequestParam(name = "page") int page, @RequestParam(name = "page") int size);

    @GetMapping(path = "/books/{id}")
    public Book getBook(@PathVariable(name = "id") Long id);
}
