package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}
