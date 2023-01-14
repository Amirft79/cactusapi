package ir.cactus.cactusnewbankaacount.service;

import ir.cactus.cactusnewbankaacount.model.BankAccountEntity;
import ir.cactus.cactusnewbankaacount.repository.AccountRepository;
import ir.cactus.cactusnewbankaacount.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;



    public List<BankAccountEntity> getAllAccounts(){
        List<BankAccountEntity>accounts= accountRepository.findAll();
        if (accounts.size()>0){
            return accounts;
        }
        return new ArrayList<>();
    }


}
