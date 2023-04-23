package io.study.deneb.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SignUpEvent implements Event {

  private static final Logger log = LoggerFactory.getLogger(SignUpEvent.class);

  @Override
  public void conduct() {
    log.info("===== sign up event conduct =====");
  }
}
