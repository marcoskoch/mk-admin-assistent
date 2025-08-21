package com.assistent.admin.domain.genre;

import com.assistent.admin.domain.pagination.Pagination;
import com.assistent.admin.domain.pagination.SearchQuery;

import java.util.Optional;

public interface GenreGateway {

    Genre create(Genre aGenre);

    void deleteById(GenreID anId);

    Optional<Genre> findById(GenreID anId);

    Genre update(Genre aGenre);

    Pagination<Genre> findAll(SearchQuery aQuery);
}
