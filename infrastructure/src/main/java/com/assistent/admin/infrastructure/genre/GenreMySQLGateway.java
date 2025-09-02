package com.assistent.admin.infrastructure.genre;

import com.assistent.admin.domain.genre.Genre;
import com.assistent.admin.domain.genre.GenreGateway;
import com.assistent.admin.domain.genre.GenreID;
import com.assistent.admin.domain.pagination.Pagination;
import com.assistent.admin.domain.pagination.SearchQuery;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GenreMySQLGateway implements GenreGateway {

    @Override
    public Genre create(Genre aGenre) {
        return null;
    }

    @Override
    public void deleteById(GenreID anId) {

    }

    @Override
    public Optional<Genre> findById(GenreID anId) {
        return Optional.empty();
    }

    @Override
    public Genre update(Genre aGenre) {
        return null;
    }

    @Override
    public Pagination<Genre> findAll(SearchQuery aQuery) {
        return null;
    }
}
