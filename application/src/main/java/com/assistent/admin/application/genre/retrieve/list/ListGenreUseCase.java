package com.assistent.admin.application.genre.retrieve.list;

import com.assistent.admin.application.UseCase;
import com.assistent.admin.domain.pagination.Pagination;
import com.assistent.admin.domain.pagination.SearchQuery;

public abstract class ListGenreUseCase
        extends UseCase<SearchQuery, Pagination<GenreListOutput>> {
}
