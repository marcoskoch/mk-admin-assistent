package com.assistent.admin.infrastructure.category;

import com.assistent.admin.domain.category.Category;
import com.assistent.admin.domain.category.CategoryGateway;
import com.assistent.admin.domain.category.CategoryID;
import com.assistent.admin.domain.category.CategorySearchQuery;
import com.assistent.admin.domain.pagination.Pagination;
import com.assistent.admin.infrastructure.category.persistence.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryMySQLGateway implements CategoryGateway {

    private final CategoryRepository repository;

    public CategoryMySQLGateway(final CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category create(Category aCategory) {
        return null;
    }

    @Override
    public void deleteById(CategoryID anId) {

    }

    @Override
    public Optional<Category> findById(CategoryID anId) {
        return Optional.empty();
    }

    @Override
    public Category update(Category aCategory) {
        return null;
    }

    @Override
    public Pagination<Category> findAll(CategorySearchQuery aQuery) {
        return null;
    }
}
