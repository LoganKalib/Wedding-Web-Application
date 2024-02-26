package za.ac.cput.reminisce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("za.ac.cput")
public class ReminisceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReminisceApplication.class, args);
    }

}
