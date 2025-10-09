package com.assistent.admin.infrastructure.castmember.models;

import com.assistent.admin.domain.castmember.CastMemberType;

public record UpdateCastMemberRequest(String name, CastMemberType type) {
}
