package com.uniyaz.sakila.rest.filmcategory;

import com.uniyaz.sakila.core.filmcategory.service.FilmCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/filmcategory")
public class FilmCategoryController {

    @Autowired
    FilmCategoryService filmCategoryService;

    @GetMapping(path = "/search")
    public ResponseEntity search(@RequestParam String categoryName) {
        return filmCategoryService.search(categoryName);
    }
}
