package ir.cactus.cactusnewbankaacount.service;

import ir.cactus.cactusnewbankaacount.exception.RecordeNotFoundException;
import ir.cactus.cactusnewbankaacount.model.CustomersEntity;
import ir.cactus.cactusnewbankaacount.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private Repository repository;



    public List<CustomersEntity>getAllCustomer() throws RecordeNotFoundException {
        List<CustomersEntity>customers=repository.findAll();
        if (customers.size()>0){
            return customers;
        }
        else{
            throw  new RecordeNotFoundException("no customer find ");
        }
    }
}
