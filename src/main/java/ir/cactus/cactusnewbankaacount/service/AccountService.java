package ir.cactus.cactusnewbankaacount.service;

import ir.cactus.cactusnewbankaacount.exception.RecordeNotFoundException;
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
    @Autowired
    private Repository repository;


    public List<BankAccountEntity> getAllAccounts()throws RecordeNotFoundException {
        List<BankAccountEntity>accounts= accountRepository.findAll();
        if (accounts.size()>0){
            return accounts;
        }
        else throw new RecordeNotFoundException("no account found !");
    }



    public List<BankAccountEntity>getAccountByAccountCustomerId(int accountCustomerId)throws RecordeNotFoundException{
        List<BankAccountEntity>accounts=accountRepository.getBankAccountEntitiesByAccountCustomerId(accountCustomerId);
        if (accounts.size()>0) return accounts;
        else throw new RecordeNotFoundException("account not found with this id ");
    }


}
