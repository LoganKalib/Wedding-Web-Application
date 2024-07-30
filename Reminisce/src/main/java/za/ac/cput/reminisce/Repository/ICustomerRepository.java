package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.reminisce.Models.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {

    public Customer findByEmailAndPassword(String email, String password);
}
