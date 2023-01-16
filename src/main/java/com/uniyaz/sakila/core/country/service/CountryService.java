package com.uniyaz.sakila.core.country.service;

import com.uniyaz.sakila.core.actor.domain.Actor;
import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.core.country.dao.CountryDao;
import com.uniyaz.sakila.core.country.domain.Country;
import com.uniyaz.sakila.core.country.dto.CountryCityCountDto;
import com.uniyaz.sakila.utils.REnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CountryService extends BaseService<Country, CountryDao> {

    @Autowired
    CountryDao countryDao;


    public List<Country> findAllByName(String countryName) {
        return countryDao.findAllByName(countryName);
    }

    public Country findById(Long countryId) {
        return countryDao.findById(countryId).get();
    }

    public List<CountryCityCountDto> findCountryCityCountDto() {
        return countryDao.findCountryCityCountDto();
    }


}