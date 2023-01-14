package ir.cactus.cactusnewbankaacount.repository;

import ir.cactus.cactusnewbankaacount.model.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<BankAccountEntity,Integer> {





}
