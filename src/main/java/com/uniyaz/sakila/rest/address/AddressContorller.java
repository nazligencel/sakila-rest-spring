package com.uniyaz.sakila.rest.address;

import com.uniyaz.sakila.core.address.domain.Address;
import com.uniyaz.sakila.core.address.service.AddressService;
import com.uniyaz.sakila.core.common.BaseController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "address")
public class AddressContorller extends BaseController<Address,AddressService> {

}
