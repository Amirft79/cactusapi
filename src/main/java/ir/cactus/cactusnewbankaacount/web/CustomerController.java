package ir.cactus.cactusnewbankaacount.web;

import ir.cactus.cactusnewbankaacount.exception.RecordeNotFoundException;
import ir.cactus.cactusnewbankaacount.model.CustomersEntity;
import ir.cactus.cactusnewbankaacount.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/Customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/FindAllCustomers")
    public ResponseEntity<List<CustomersEntity>>FindAllCustomers()throws RecordeNotFoundException {
        List<CustomersEntity>customers=customerService.getAllCustomer();
        if (customers.size()>0)
        return new ResponseEntity<>(customers,new HttpHeaders(), HttpStatus.OK);
        else throw new RecordeNotFoundException("no customers found ");
    }
}
