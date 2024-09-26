package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Models.Wedding;

import java.util.List;

@Repository
public interface IWeddingRepository extends CrudRepository<Wedding, Long> {

    public Wedding findByOrgId(Customer orgId);
}
