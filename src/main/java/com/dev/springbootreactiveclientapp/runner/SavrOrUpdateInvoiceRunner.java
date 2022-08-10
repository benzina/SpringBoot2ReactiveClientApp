package com.dev.springbootreactiveclientapp.runner;

import com.dev.springbootreactiveclientapp.model.Invoice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class SavrOrUpdateInvoiceRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        WebClient client = WebClient.create("http://localhost:8080");
        Mono<Invoice> mono= client
                .post()
                .uri("/invoice/save")
                .body(Mono.just(new Invoice(1, "Invoice2", "INV002", 1345.75)),Invoice.class)
                .retrieve().bodyToMono(Invoice.class);
        mono.subscribe(System.out::println);
    }
}
