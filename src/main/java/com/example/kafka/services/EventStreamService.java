package com.example.kafka.services;

import com.example.kafka.models.Message;
import com.example.kafka.streams.EventStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
public class EventStreamService {
    @Autowired
    private EventStream eventStream;

    public Boolean produceEvent(Message message){
        System.out.println("Producing events --> id: "+ message.getId() +" name: "+message.getName()+" Actual message: "+ message.getData());
        message.setBytePayload(message.getData().getBytes());

        MessageChannel messageChannel = eventStream.producer();
        return messageChannel.send(
                MessageBuilder
                        .withPayload(message)
                        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                        .build()
        );
    }
}
