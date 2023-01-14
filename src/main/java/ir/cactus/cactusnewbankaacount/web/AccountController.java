package ir.cactus.cactusnewbankaacount.web;

import ir.cactus.cactusnewbankaacount.model.BankAccountEntity;
import ir.cactus.cactusnewbankaacount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Accounts")
public class AccountController {

    @Autowired
    AccountService accountService;


    @GetMapping("/FindAllAccounts")
    public ResponseEntity<List<BankAccountEntity>>getAllAccounts(){
        List<BankAccountEntity>accounts=accountService.getAllAccounts();
        return new ResponseEntity<>(accounts,new HttpHeaders(), HttpStatus.OK);
    }





}
