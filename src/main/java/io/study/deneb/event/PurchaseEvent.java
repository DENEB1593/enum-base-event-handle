package io.study.deneb.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PurchaseEvent implements Event {

  private static final Logger log = LoggerFactory.getLogger(PurchaseEvent.class);

  @Override
  public void conduct() {
    log.info("===== purchase event conduct =====");
  }
}
