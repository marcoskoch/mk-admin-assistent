package com.assistent.admin.application.castmember.retrieve.get;

import com.assistent.admin.application.UseCase;

public sealed abstract class GetCastMemberByIdUseCase
        extends UseCase<String, CastMemberOutput>
        permits DefaultGetCastMemberByIdUseCase {
}
