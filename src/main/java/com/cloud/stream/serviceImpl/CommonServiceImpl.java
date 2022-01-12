package com.cloud.stream.serviceImpl;

import com.cloud.stream.entity.CommonEntity;
import com.cloud.stream.repo.CommonRepo;
import com.cloud.stream.service.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {
    private Logger logger = LoggerFactory.getLogger(CommonServiceImpl.class);
    @Autowired
    private CommonRepo commonRepo;


    @Override
    public String saveCommonData(CommonEntity entity) {
        CommonEntity save = commonRepo.save(entity);
        logger.info("Data Inserted successfully into Database");
        return "Inserted";
    }
}
