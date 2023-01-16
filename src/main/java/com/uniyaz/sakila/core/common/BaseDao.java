package com.uniyaz.sakila.core.common;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class BaseDao<T extends BaseEntity> {

    public Class<T> t;

    @Autowired
    EntityManager entityManager;

    public BaseDao(Class<T> t) {
        this.t = t;
    }


    public List<T> findAll() {
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = builder.createQuery(t);
        Root<T> root = cq.from(t);
        cq.select(root);
        return this.entityManager.createQuery(cq).getResultList();
    }




}
