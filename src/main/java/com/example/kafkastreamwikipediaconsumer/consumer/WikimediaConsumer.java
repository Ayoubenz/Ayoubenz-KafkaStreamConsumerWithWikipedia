package com.example.kafkastreamwikipediaconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikiStreamTopic", groupId = "myGroup")
    public void consumeJsonMessage(String message) {
        log.info(String.format("Consuming the message from wikiStreamTopic :: %s", message));
    }
}

