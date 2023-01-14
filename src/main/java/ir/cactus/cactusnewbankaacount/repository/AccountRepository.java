package ir.cactus.cactusnewbankaacount.repository;

import ir.cactus.cactusnewbankaacount.model.BankAccountEntity;
import ir.cactus.cactusnewbankaacount.model.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<BankAccountEntity,Integer> {


   @Query("from BankAccountEntity where accountCustomerId=?1")
    public List<BankAccountEntity>getBankAccountEntitiesByAccountCustomerId(int accountCustomerId);








}
