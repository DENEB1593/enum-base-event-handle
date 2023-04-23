package io.study.deneb.event;

import io.study.deneb.event.impl.LeaveEvent;
import io.study.deneb.event.impl.PurchaseEvent;
import io.study.deneb.event.impl.SignUpEvent;

public enum EventType {
  SIGN_UP("sign_up", SignUpEvent.class),
  PURCHASE("purchase", PurchaseEvent.class),
  LEAVE("leave", LeaveEvent.class);

  private final String code;
  private final Class<? extends Event> type;

  EventType(String code,
            Class<? extends Event> type) {
    this.code = code;
    this.type = type;
  }

  public String getCode() {
    return code;
  }

  public Class<? extends Event> getType() {
    return type;
  }
}
