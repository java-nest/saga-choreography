package com.javatechie;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;

@SpringBootTest
@EmbeddedKafka(partitions = 1, topics = {"movie-booking-events-topic", "payment-events-topic", "seat-reserved-topic"})
class SeatInventoryServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
