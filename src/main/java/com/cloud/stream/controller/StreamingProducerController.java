package com.cloud.stream.controller;

import com.cloud.stream.dtos.CommonDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableBinding(Source.class)
public class StreamingProducerController {

    private Logger logger = LoggerFactory.getLogger(StreamingProducerController.class);

    @Autowired
    private MessageChannel output;

    @PostMapping("/publish")
    public CommonDTO publishEvent(@RequestBody CommonDTO dto) {
        output.send(MessageBuilder.withPayload(dto).build());
        return dto;
    }
}
