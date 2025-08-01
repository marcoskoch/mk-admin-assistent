package com.assistent.admin.application.category.update;

import com.assistent.admin.application.UseCase;
import com.assistent.admin.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase
        extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
