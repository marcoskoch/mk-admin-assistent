package com.assistent.admin.domain.event;

@FunctionalInterface
public interface DomainEventPublisher {
    <T extends DomainEvent> void publishEvent(T event);
}
