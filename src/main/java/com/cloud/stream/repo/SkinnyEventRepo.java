package com.cloud.stream.repo;

import com.cloud.stream.entity.SkinnyEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface SkinnyEventRepo extends JpaRepository<SkinnyEvent, Serializable> {
}
