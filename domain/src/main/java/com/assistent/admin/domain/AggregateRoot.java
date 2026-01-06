package com.assistent.admin.domain;

import com.assistent.admin.domain.event.DomainEvent;

import java.util.Collections;
import java.util.List;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    protected AggregateRoot(final ID id) {
        this(id, Collections.emptyList());
    }

    protected AggregateRoot(final ID id, final List<DomainEvent> events) {
        super(id, events);
    }
}
