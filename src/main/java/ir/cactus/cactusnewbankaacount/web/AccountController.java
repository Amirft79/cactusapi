package ir.cactus.cactusnewbankaacount.web;

import ir.cactus.cactusnewbankaacount.exception.RecordeNotFoundException;
import ir.cactus.cactusnewbankaacount.model.BankAccountEntity;
import ir.cactus.cactusnewbankaacount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    private List<BankAccountEntity>accounts;


    @GetMapping("/FindAllAccounts")
    public ResponseEntity<List<BankAccountEntity>>getAllAccounts()throws RecordeNotFoundException {
        accounts=accountService.getAllAccounts();
        if (accounts.size()>0)
        return new ResponseEntity<>(accounts,new HttpHeaders(), HttpStatus.OK);
        else throw new RecordeNotFoundException("account with this id not found");
    }



    @GetMapping("/FindAccountByAccountCustomerId/{AccountCustomerId}")
    public ResponseEntity<List<BankAccountEntity>>getAccountByAccountCustomerId(@PathVariable("AccountCustomerId") int accountCustomerId)
    throws RecordeNotFoundException{
      accounts=accountService.getAccountByAccountCustomerId(accountCustomerId);
        if(accounts.size()>0) return new ResponseEntity<>(accounts,new HttpHeaders(),HttpStatus.OK);
        else throw new RecordeNotFoundException("no account found from this id ");
    }

    @GetMapping("/FindAccountsByAccountNumber/{AccountNumber}")
    public ResponseEntity<List<BankAccountEntity>>getAccountsByAccountNumber(@PathVariable("AccountNumber")String AccountNumber)throws RecordeNotFoundException{
        accounts=accountService.getAccountByAccountNumber(AccountNumber);
        if (accounts.size()>0){
            return new ResponseEntity<>(accounts,new HttpHeaders(),HttpStatus.OK);
        }else{
            throw new RecordeNotFoundException("this account not found by account number ");
        }
    }





}
