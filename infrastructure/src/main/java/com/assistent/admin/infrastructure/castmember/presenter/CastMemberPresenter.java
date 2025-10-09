package com.assistent.admin.infrastructure.castmember.presenter;

import com.assistent.admin.application.castmember.retrieve.get.CastMemberOutput;
import com.assistent.admin.infrastructure.castmember.models.CastMemberResponse;

public interface CastMemberPresenter {

    static CastMemberResponse present(final CastMemberOutput aMember) {
        return new CastMemberResponse(
                aMember.id(),
                aMember.name(),
                aMember.type().name(),
                aMember.createdAt().toString(),
                aMember.updatedAt().toString()
        );
    }
}
