package com.oderServer.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.oderServer.entity.OderEntity;
import com.oderServer.kafakProducer.KafkaProducerService;
import com.oderServer.oderRepo.OderRepo;
import com.oderServer.request.RequestPojo;
import com.oderServer.serviceinterface.IOrderServiceInterface;

@Service
public class OderService implements IOrderServiceInterface {

    @Autowired
    private OderRepo oderrepo;

    @Autowired
    private KafkaProducerService producerService;   //  Inject here

    @Override
    public String placingOderService(RequestPojo requestpojo ) {

        OderEntity entity = new OderEntity();

        entity.setNaem(requestpojo.getName());
        entity.setPrice(requestpojo.getPrice());

        oderrepo.save(entity);
        
        for(int i=0;i<100;i++) {

        // SEND TO KAFKA HERE
        producerService.sendOrderEvent(requestpojo);

        System.out.println(" Message sent to Kafka");
        }

        return "done";
    }
    
    
   
    
    
}