package ir.cactus.cactusnewbankaacount.repository;

import ir.cactus.cactusnewbankaacount.model.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<CustomersEntity,Integer> {

    @Query("from CustomersEntity where customerId=?1")
    public List<CustomersEntity> getCustomersEntitiesByCustomerId(int customer_id);

}
