package com.assistent.admin.application.castmember.retrieve.list;

import com.assistent.admin.application.UseCase;
import com.assistent.admin.domain.pagination.Pagination;
import com.assistent.admin.domain.pagination.SearchQuery;

public sealed abstract class ListCastMembersUseCase
        extends UseCase<SearchQuery, Pagination<CastMemberListOutput>>
        permits DefaultListCastMembersUseCase {
}
