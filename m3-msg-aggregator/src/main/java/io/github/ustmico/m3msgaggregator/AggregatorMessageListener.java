package io.github.ustmico.m3msgaggregator;

import com.fasterxml.jackson.databind.JsonNode;
import io.cloudevents.CloudEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.LinkedList;
import java.util.List;

@Slf4j
public class AggregatorMessageListener {

    /**
     * At the moment the list of open aggregates (incomplete set of messages)
     * are stored in memory. TODO Implement a database variant
     */
    List<List<CloudEvent<JsonNode>>> activeAggregate = new LinkedList<>();

    @KafkaListener(topics = "${kafka.inputTopic}")
    public void receive(CloudEvent<JsonNode> cloudEvent) {
        log.info("Recivec CloudEvent:"+cloudEvent.toString());

    }
}
