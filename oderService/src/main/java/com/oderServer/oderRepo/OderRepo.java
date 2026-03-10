package com.oderServer.oderRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oderServer.entity.OderEntity;

@Repository
public interface OderRepo extends JpaRepository<OderEntity, Integer> {

}
