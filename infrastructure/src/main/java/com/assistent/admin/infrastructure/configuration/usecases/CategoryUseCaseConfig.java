package com.assistent.admin.infrastructure.configuration.usecases;

import com.assistent.admin.application.category.create.CreateCategoryUseCase;
import com.assistent.admin.application.category.create.DefaultCreateCategoryUseCase;
import com.assistent.admin.application.category.delete.DefaultDeleteCategoryUseCase;
import com.assistent.admin.application.category.delete.DeleteCategoryUseCase;
import com.assistent.admin.application.category.retrieve.get.DefaultGetCategoryByIdUseCase;
import com.assistent.admin.application.category.retrieve.get.GetCategoryByIdUseCase;
import com.assistent.admin.application.category.retrieve.list.DefaultListCategoriesUseCase;
import com.assistent.admin.application.category.retrieve.list.ListCategoriesUseCase;
import com.assistent.admin.application.category.update.DefaultUpdateCategoryUseCase;
import com.assistent.admin.application.category.update.UpdateCategoryUseCase;
import com.assistent.admin.domain.category.CategoryGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryUseCaseConfig {

    private final CategoryGateway categoryGateway;

    public CategoryUseCaseConfig(final CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Bean
    public CreateCategoryUseCase createCategoryUseCase() {
        return new DefaultCreateCategoryUseCase(categoryGateway);
    }

    @Bean
    public UpdateCategoryUseCase updateCategoryUseCase() {
        return new DefaultUpdateCategoryUseCase(categoryGateway);
    }

    @Bean
    public GetCategoryByIdUseCase getCategoryByIdUseCase() {
        return new DefaultGetCategoryByIdUseCase(categoryGateway);
    }

    @Bean
    public ListCategoriesUseCase listCategoriesUseCase() {
        return new DefaultListCategoriesUseCase(categoryGateway);
    }

    @Bean
    public DeleteCategoryUseCase deleteCategoryUseCase() {
        return new DefaultDeleteCategoryUseCase(categoryGateway);
    }
}