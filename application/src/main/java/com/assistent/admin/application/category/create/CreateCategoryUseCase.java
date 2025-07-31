package com.assistent.admin.application.category.create;

import com.assistent.admin.application.UseCase;
import com.assistent.admin.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
