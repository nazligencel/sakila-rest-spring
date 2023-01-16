package com.uniyaz.sakila.core.category.dao;

import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.common.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoryDao extends BaseRepository<Category> {
    @Query("select category from Category category where category.categoryName = :countryName")
    public List<Category> findAllByName(@Param("countryName") String countryName);
}