package com.uniyaz.sakila.rest.address;

import com.uniyaz.sakila.core.address.domain.Address;
import com.uniyaz.sakila.core.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "address")
public class AddressContorller {
    @Autowired
    AddressService addressService;

    @PostMapping(path= "save")
    public ResponseEntity save(@RequestBody Address address){
        return addressService.save(address);
    }

    @GetMapping(path = "findAll")
    public ResponseEntity findAll(){
        return addressService.findAll();
    }

    @DeleteMapping(path = "delete")
    public ResponseEntity delete(@RequestParam Long id){
        return addressService.delete(id);
    }
}
