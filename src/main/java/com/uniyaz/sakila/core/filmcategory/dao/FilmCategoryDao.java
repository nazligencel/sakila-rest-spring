package com.uniyaz.sakila.core.filmcategory.dao;

import com.uniyaz.sakila.core.common.BaseRepository;
import com.uniyaz.sakila.core.filmcategory.domain.FilmCategory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmCategoryDao extends BaseRepository<FilmCategory> {
    @Query(
            "Select filmcategory " +
                    "From FilmCategory filmcategory " +
                    "Left Join fetch filmcategory.category categoryName" +
                    "Left Join fetch filmcategory.film title" + " " +
                    "where filmcategory.category.categoryName  = :categoryName "
    )
    List<FilmCategory> searchCategory(String categoryName);

}
