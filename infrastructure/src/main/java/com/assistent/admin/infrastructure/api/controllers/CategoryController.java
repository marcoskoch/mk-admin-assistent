package com.assistent.admin.infrastructure.api.controllers;

import com.assistent.admin.domain.pagination.Pagination;
import com.assistent.admin.infrastructure.api.CategoryAPI;
import org.springframework.http.ResponseEntity;

public class CategoryController implements CategoryAPI {

    @Override
    public ResponseEntity<?> createCategory() {
        return null;
    }

    @Override
    public Pagination<?> listCategories(String search, int page, int perPage, String sort, String direction) {
        return null;
    }
}
