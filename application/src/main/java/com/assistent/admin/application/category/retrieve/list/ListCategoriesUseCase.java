package com.assistent.admin.application.category.retrieve.list;

import com.assistent.admin.application.UseCase;
import com.assistent.admin.domain.category.CategorySearchQuery;
import com.assistent.admin.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}