package com.uniyaz.sakila.rest.category;

import com.uniyaz.sakila.core.category.CategoryConverter;
import com.uniyaz.sakila.core.category.CategoryDto;
import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.category.service.CategoryService;
import com.uniyaz.sakila.core.common.BaseController;
import com.uniyaz.sakila.core.country.CountryDto;
import com.uniyaz.sakila.core.country.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "category")
public class CategoryController extends BaseController<Category,CategoryService> {

    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoryConverter categoryConverter;

    @GetMapping(path = "findAllByNameCategory", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findAllByNameCategory(String name) {

        List<Category> categoryList = categoryService.findAllByName(name);
        List<CategoryDto> categoryDtoList = categoryConverter.convertToCategoryDtoList(categoryList);
        if (!categoryDtoList.isEmpty()) {
            ResponseEntity responseEntity = new ResponseEntity(categoryDtoList, HttpStatus.OK);
            return responseEntity;
        } else {
            ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NO_CONTENT);
            return responseEntity;
        }
    }

}
