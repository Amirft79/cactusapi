package ir.cactus.cactusnewbankaacount.repository;

import ir.cactus.cactusnewbankaacount.model.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<CustomersEntity,Integer> {

}
