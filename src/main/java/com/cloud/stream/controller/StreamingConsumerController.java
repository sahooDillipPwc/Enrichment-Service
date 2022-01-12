package com.cloud.stream.controller;

import com.cloud.stream.dtos.CommonDTO;
import com.cloud.stream.entity.CommonEntity;
import com.cloud.stream.service.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableBinding(Sink.class)
public class StreamingConsumerController {

    private Logger logger = LoggerFactory.getLogger(StreamingConsumerController.class);

    @Autowired
    private CommonService service;

    CommonEntity entity = new CommonEntity();

//    @StreamListener("input")
    public void consumeMessage(CommonDTO dto) {

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        String message = service.saveCommonData(entity);

        logger.info("Consume payload : " + message);

    }


}
