package com.cloud.stream.serviceImpl;

import com.cloud.stream.dtos.SkinnyEventDTO;
import com.cloud.stream.entity.SkinnyEvent;
import com.cloud.stream.repo.SkinnyEventRepo;
import com.cloud.stream.service.SkinnyEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkinnyEventServiceImpl implements SkinnyEventService {

    @Autowired
    private SkinnyEventRepo skinnyEventRepo;
    @Autowired
    private SkinnyEvent skinnyEvent;


    @Override
    public String saveSkinnyEventDTO(SkinnyEventDTO dto) {
        //we need to convert DTO to Entity for Persisting into Database
        skinnyEvent.setEffectivedate(dto.getEffectiveDate());
        skinnyEvent.setPolicynumber(dto.getPolicyNumber());
        skinnyEvent.setQuotenum(dto.getQuoteNum());
        skinnyEvent.setTitle(dto.getTitle());
        skinnyEventRepo.save(skinnyEvent);
        return "SkinnyEventDTO data Inserted successfully";
    }
}
