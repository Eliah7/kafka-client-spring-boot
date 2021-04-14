package com.example.kafka.configs;

import com.example.kafka.streams.EventStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(EventStream.class)
public class EventStreamConfig {
}
