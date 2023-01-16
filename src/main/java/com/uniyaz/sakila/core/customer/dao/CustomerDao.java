package com.uniyaz.sakila.core.customer.dao;

import com.uniyaz.sakila.core.actor.domain.Actor;
import com.uniyaz.sakila.core.city.domain.City;
import com.uniyaz.sakila.core.customer.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Long> {

    @Query(
            "Select             customer " +
                    "from               Customer customer " +
                    "Left Join fetch    customer.address address"+
                    "Left Join fetch    customer.store store")
    List<Customer> findAll();


}
