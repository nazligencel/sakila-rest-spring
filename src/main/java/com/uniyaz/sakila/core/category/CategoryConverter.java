package com.uniyaz.sakila.core.category;

import com.uniyaz.sakila.core.category.domain.Category;
import com.uniyaz.sakila.core.country.CountryDto;
import com.uniyaz.sakila.core.country.domain.Country;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryConverter {

    public CategoryDto convertToCategoryDto(Category category){
        CategoryDto categoryDto=new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getCategoryName());
        return categoryDto;
    }

    public List<CategoryDto> convertToCategoryDtoList(List<Category> categoryList){
        List<CategoryDto> categoryDtoList=new ArrayList<>();
        for (Category category: categoryList){
            CategoryDto categoryDto=convertToCategoryDto(category);
            categoryDtoList.add(categoryDto);
        }
        return categoryDtoList;
    }

}
