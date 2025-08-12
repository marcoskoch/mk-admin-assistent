package com.assistent.admin.application.category.update;

import com.assistent.admin.domain.category.Category;
import com.assistent.admin.domain.category.CategoryID;

public record UpdateCategoryOutput(
        String id
) {

    public static UpdateCategoryOutput from(final String anId) {
        return new UpdateCategoryOutput(anId);
    }

    public static UpdateCategoryOutput from(final Category aCategory) {
        return new UpdateCategoryOutput(aCategory.getId().getValue());
    }
}