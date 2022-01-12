package com.cloud.stream.controller;

import com.cloud.stream.dtos.SkinnyEventDTO;
import com.cloud.stream.service.SkinnyEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Sink.class)
public class SkinnyEventListener {

    private Logger logger = LoggerFactory.getLogger(SkinnyEventListener.class);

    @Autowired
    private SkinnyEventService SkinnyEventService;
    @Autowired
    private SkinnyEventDTO skinnyEventDTO;

    @StreamListener("input")
    public void skinnyEventLitener(SkinnyEventDTO dto) {

        skinnyEventDTO.setTitle(dto.getTitle());
        skinnyEventDTO.setQuoteNum(dto.getQuoteNum());
        skinnyEventDTO.setEffectiveDate(dto.getEffectiveDate());
        skinnyEventDTO.setPolicyNumber(dto.getPolicyNumber());
        String message = SkinnyEventService.saveSkinnyEventDTO(skinnyEventDTO);

        logger.info("Consume payload : " + message);
    }
}
