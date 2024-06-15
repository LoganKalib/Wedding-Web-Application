package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Repository.ICustomerRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class OrganizerService implements IService<Customer,Long> {
    @Autowired
    private ICustomerRepository organizerRepository;

    @Override
    public Customer create(Customer obj) {
        try{
            return organizerRepository.save(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Customer> read(List<Long> id) {
        try{
            return (List<Customer>) organizerRepository.findAllById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Customer obj) {
        try{
            if(organizerRepository.existsById(obj.getCustId()))
                organizerRepository.delete(obj);
            return !organizerRepository.existsById(obj.getCustId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Customer findbyLogin(String email, String password){
        try{
            List<Customer> orgList = (List<Customer>) organizerRepository.findAll();
            for(Customer item: orgList){
                if(item.getEmail().equalsIgnoreCase(email)
                        && item.getPassword().equals(password))
                    return item;
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
