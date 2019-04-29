package io.github.ustmico.m3msgaggregator;

import com.fasterxml.jackson.databind.JsonNode;
import io.cloudevents.CloudEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
@Slf4j
public class AggregatorMessageListener {

    @KafkaListener(topics = "${kafka.inputTopic}")
    public void receive(CloudEvent<JsonNode> cloudEvent) {
        log.info("Recivec CloudEvent:"+cloudEvent.toString());

    }
}
