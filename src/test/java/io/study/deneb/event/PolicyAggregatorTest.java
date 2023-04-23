package io.study.deneb.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PolicyAggregatorTest {

  @Autowired
  EventAggregator aggregator;

  @Test
  void findPolicy() {

    Event signUp = aggregator.serve(EventType.SIGN_UP);
    Event leave = aggregator.serve(EventType.LEAVE);
    Event purchase = aggregator.serve(EventType.PURCHASE);

    signUp.conduct();
    leave.conduct();
    purchase.conduct();
  }

}