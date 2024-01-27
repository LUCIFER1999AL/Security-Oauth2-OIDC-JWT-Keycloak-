package ma.security.customerfrontthymeleafapp;

import ma.security.customerfrontthymeleafapp.entities.Customer;
import ma.security.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Mohamed").email("mohamedbhajy23@gmail.com").build());
            customerRepository.save(Customer.builder().name("Mohamed").email("mohamedbhajy23@gmail.com").build());
            customerRepository.save(Customer.builder().name("Mohamed").email("mohamedbhajy23@gmail.com").build());
        };
    }
}
