package com.uniyaz.sakila.core.address.dao;


import com.uniyaz.sakila.core.address.domain.Address;
import com.uniyaz.sakila.core.common.BaseRepository;
import com.uniyaz.sakila.core.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AddressDao extends BaseRepository<Address> {
    @Query(
            "Select             address " +
                    "from               Address address " +
                    "Left Join fetch    address.city city "+
                    "Left Join fetch    city.country country ")
    List<Address> findAll();
}
