package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Repository.ICustomerRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class CustomerService implements IService<Customer, Long> {

    private ICustomerRepository customerRepository;

    @Autowired
    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer create(Customer obj) {
        return customerRepository.save(obj);
    }

    @Override
    public List<Customer> read(List<Long> id) {
        return (List<Customer>) customerRepository.findAllById(id);
    }

    @Override
    public boolean delete(Customer obj) {
        if(customerRepository.findById(obj.getCustId()).isPresent()){
            customerRepository.delete(obj);
            return true;
        }
        return false;
    }

    public Customer validateLogin(String email, String password){
        return customerRepository.findByEmailAndPassword(email, password);
    }

    public Customer findByEmail(String email){
        return customerRepository.findByEmail(email);
    }
}
