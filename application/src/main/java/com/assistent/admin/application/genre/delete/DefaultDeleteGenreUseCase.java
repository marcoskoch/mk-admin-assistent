package com.assistent.admin.application.genre.delete;

import com.assistent.admin.domain.genre.GenreGateway;
import com.assistent.admin.domain.genre.GenreID;

import java.util.Objects;

public class DefaultDeleteGenreUseCase extends DeleteGenreUseCase {

    private final GenreGateway genreGateway;

    public DefaultDeleteGenreUseCase(final GenreGateway genreGateway) {
        this.genreGateway = Objects.requireNonNull(genreGateway);
    }

    @Override
    public void execute(final String anIn) {
        this.genreGateway.deleteById(GenreID.from(anIn));
    }
}
