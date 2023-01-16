package com.uniyaz.sakila.core.category.service;


import com.uniyaz.sakila.core.actor.domain.Actor;
import com.uniyaz.sakila.core.category.dao.CategoryDao;
import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.core.country.domain.Country;
import com.uniyaz.sakila.utils.REnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryService extends BaseService<Category,CategoryDao> {

    @Autowired
    CategoryDao categoryDao;

    public List<Category> findAllByName(String categoryName) {
        return categoryDao.findAllByName(categoryName);
    }
}
