package com.assistent.admin.domain.video;

import com.assistent.admin.domain.castmember.CastMemberID;
import com.assistent.admin.domain.category.CategoryID;
import com.assistent.admin.domain.genre.GenreID;

import java.util.Set;

public record VideoSearchQuery(
        int page,
        int perPage,
        String terms,
        String sort,
        String direction,
        Set<CastMemberID> castMembers,
        Set<CategoryID> categories,
        Set<GenreID> genres
) {
}
