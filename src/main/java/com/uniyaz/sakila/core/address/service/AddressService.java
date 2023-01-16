package com.uniyaz.sakila.core.address.service;

import com.uniyaz.sakila.core.address.dao.AddressDao;
import com.uniyaz.sakila.core.address.domain.Address;
import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.utils.REnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class AddressService extends BaseService<Address,AddressDao> {

}
