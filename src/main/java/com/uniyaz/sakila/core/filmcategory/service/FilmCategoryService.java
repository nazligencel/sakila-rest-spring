package com.uniyaz.sakila.core.filmcategory.service;

import com.uniyaz.sakila.core.filmcategory.dao.FilmCategoryDao;
import com.uniyaz.sakila.utils.REnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class FilmCategoryService {

    @Autowired
    FilmCategoryDao filmCategoryDao;

    public ResponseEntity<Map<REnum,Object>> search(String categoryName) {
        Map<REnum,Object> categoryList=new LinkedHashMap<>();
        categoryList.put(REnum.result, filmCategoryDao.searchCategory(categoryName));
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }
}