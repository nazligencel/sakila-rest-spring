package com.uniyaz.sakila.core.country.dao;

import com.uniyaz.sakila.core.common.BaseRepository;
import com.uniyaz.sakila.core.country.domain.Country;
import com.uniyaz.sakila.core.country.dto.CountryCityCountDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryDao extends BaseRepository<Country> {

    @Query("select country from Country country where country.country = :countryName")
    public List<Country> findAllByName(@Param("countryName") String countryName);

    @Query(
            "select country.country as countryName, " +
            "       (" +
            "           select  count(*) " +
            "           from    City city " +
            "           where   city.country.id = country.id" +
            "       )   as      cityCount " +
            " from Country country ")
    public List<CountryCityCountDto> findCountryCityCountDto();

}