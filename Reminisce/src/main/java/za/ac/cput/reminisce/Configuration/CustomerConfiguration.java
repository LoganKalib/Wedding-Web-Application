package za.ac.cput.reminisce.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.reminisce.Factory.CustomerFactory;
import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Services.CustomerService;

//@Configuration
//public class CustomerConfiguration {
//
//    @Bean
//    CommandLineRunner commandLineRunner(CustomerService customerService){
//        return args -> {
//            Customer customer = CustomerFactory.buildCustomer(5L,"yuji.itadori@gmail.com", "yuji"
//                    , "Yuji", "Itadori");
//
//            customerService.create(customer);
//        };
//    }
//
//}
