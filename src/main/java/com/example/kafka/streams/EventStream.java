package com.example.kafka.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface EventStream {
    String INPUT = "input";
    String OUTPUT = "output";

    @Input(INPUT)
    SubscribableChannel consumer();

    @Output(OUTPUT)
    MessageChannel producer();
}
