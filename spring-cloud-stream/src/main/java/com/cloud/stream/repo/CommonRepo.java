package com.cloud.stream.repo;

import com.cloud.stream.entity.CommonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CommonRepo extends JpaRepository<CommonEntity, Serializable> {
}
