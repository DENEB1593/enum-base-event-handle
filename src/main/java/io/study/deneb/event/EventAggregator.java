package io.study.deneb.event;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventAggregator {

  private final List<? extends Event> events;

  EventAggregator(List<? extends Event> events) {
    this.events = events;
  }

  public Event serve(EventType type) {
    return events.stream()
        .filter(policy -> policy.getClass().isAssignableFrom(type.getType()))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("there's no event matching"));
  }

}
