package ir.cactus.cactusnewbankaacount.web;

import ir.cactus.cactusnewbankaacount.exception.RecordeNotFoundException;
import ir.cactus.cactusnewbankaacount.model.CustomersEntity;
import ir.cactus.cactusnewbankaacount.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RequestMapping("/Customers")
public class CustomerController {

    private List<CustomersEntity> customers;

    @Autowired
    private CustomerService customerService;
    @GetMapping("/FindAllCustomers")
    public ResponseEntity<List<CustomersEntity>>FindAllCustomers()throws RecordeNotFoundException {
       customers=customerService.getAllCustomer();
        if (customers.size()>0)
        return new ResponseEntity<>(customers,new HttpHeaders(), HttpStatus.OK);
        else throw new RecordeNotFoundException("no customers found ");
    }

    @GetMapping("/FindCustomerById/{customer_id}")
    public ResponseEntity<List<CustomersEntity>>getCustomerEntityById(@PathVariable("customer_id") int customer_id)
    throws  RecordeNotFoundException{
        customers = customerService.getCustomerEntityById(customer_id);
        if (customers.size()>0)
        return new ResponseEntity<>(customers, new HttpHeaders(), HttpStatus.OK);
        else throw new RecordeNotFoundException("not found");
    }
}
